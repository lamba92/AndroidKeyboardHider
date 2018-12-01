val androidGradlePluginVersion: String by settings
val kotlinVersion: String by settings

pluginManagement {

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jcenter()
    }

    resolutionStrategy {
        eachPlugin {
            when(requested.id.id){
                "com.android.library" ->
                    useModule("com.android.tools.build:gradle:$androidGradlePluginVersion")
                "org.jetbrains.kotlin.android", "org.jetbrains.kotlin.android.extensions" ->
                    useModule(kotlin("gradle-plugin", kotlinVersion))
                "android-maven" ->
                    useModule("com.github.dcendents:android-maven-gradle-plugin:2.1")
            }
        }
    }
}

fun PluginResolveDetails.kotlin(module: String, version: String? = null) =
"org.jetbrains.kotlin:kotlin-$module${version?.let { ":$version" } ?: ""}"

rootProject.name = "AndroidKeyboardHider"
