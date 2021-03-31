plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(Versions.Sdk.compile)
    buildToolsVersion(Versions.Sdk.buildTools)

    defaultConfig {
        minSdkVersion(Versions.Sdk.minimum)
        targetSdkVersion(Versions.Sdk.target)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    implementation(Dependencies.hilt)

    kapt(Dependencies.hiltCompiler)

    testImplementation(Dependencies.junit)

    androidTestImplementation(Dependencies.AndroidX.junitExtensions)
    androidTestImplementation(Dependencies.AndroidX.espresso)
}