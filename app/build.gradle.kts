plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(Versions.Sdk.compile)
    buildToolsVersion(Versions.Sdk.buildTools)

    defaultConfig {
        applicationId = "com.learning.parkingmeter"
        minSdkVersion(Versions.Sdk.minimum)
        targetSdkVersion(Versions.Sdk.target)
        versionCode = Versions.App.code
        versionName = Versions.App.name
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(path = ":core"))

    implementation(Dependencies.kotlin)
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.appCompat)
    implementation(Dependencies.AndroidX.material)
    implementation(Dependencies.AndroidX.constraintLayout)
    implementation(Dependencies.hilt)
    implementation(Dependencies.AndroidX.navigationFragment)
    implementation(Dependencies.AndroidX.navigationUI)
    implementation(Dependencies.coroutines)

    kapt(Dependencies.hiltCompiler)

    testImplementation(Dependencies.junit)

    androidTestImplementation(Dependencies.AndroidX.junitExtensions)
    androidTestImplementation(Dependencies.AndroidX.espresso)
}