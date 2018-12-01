buildscript {

    val kotlinVersion:String by project
    val androidGradlePluginVersion: String by project

    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:$androidGradlePluginVersion")
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.create<Delete>("clear") {
    delete(rootProject.buildDir)
}
