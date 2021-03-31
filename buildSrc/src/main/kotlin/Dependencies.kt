object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val coreKtx = "androidx.core:core-ktx:1.3.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        const val junitExtensions = "androidx.test.ext:junit:1.1.2"
        const val material = "com.google.android.material:material:1.3.0"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }

    const val hilt = "com.google.dagger:hilt-android:2.28-alpha"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:2.28-alpha"
    const val junit = "junit:junit:4.+"
}