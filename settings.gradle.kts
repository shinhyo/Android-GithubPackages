pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

val githubProperties = java.util.Properties().apply {
    val file = File(rootProject.projectDir, "github.properties")
    load(java.io.FileInputStream(file))
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/shinhyo/Android-GithubPackages")
            credentials {
                username = githubProperties.getProperty("github_username")
                password = githubProperties.getProperty("github_access_token")
            }
        }
    }
}
rootProject.name = "Android-GithubPackages"
include(
    ":app",
    ":lib"
)
