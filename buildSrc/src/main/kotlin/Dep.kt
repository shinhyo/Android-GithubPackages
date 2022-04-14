object Versions {
    const val compileSdk = 32

    const val minSdk = 26
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Dep {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.1.3"

    object AndroidX {
        const val core = "androidx.core:core-ktx:1.7.0"
        const val appcompat = "androidx.appcompat:appcompat:1.4.1"
        const val material = "com.google.android.material:material:1.5.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.3"

    }

    object Kotlin {
        private const val version = "1.6.20"
        const val coroutineVersion = "1.6.1"

        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val junitExt = "androidx.test.ext:junit:1.1.3"
        const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
    }

}