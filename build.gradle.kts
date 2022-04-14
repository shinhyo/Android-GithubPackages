buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dep.androidGradlePlugin)
        classpath(Dep.Kotlin.gradlePlugin)
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}