pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url=uri("https://jitpack.io") }
    }
}

rootProject.name = "WeatherApp"
include(":app")
include(":core")
include(":core:domain")
include(":core:data")
include(":core:design-system")
include(":core:domain:repository")
include(":core:domain:model")
include(":core:domain:usecase")
include(":core:data:data-source")
include(":core:data:repository")
include(":core:data:dto")
include(":feature")
include(":feature:main")
include(":feature:home")
