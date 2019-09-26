val kotlinVersion: String by project

plugins{
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    id("android-maven")
}

group = "com.github.lamba92"

repositories {
    google()
    jcenter()
}

android {
    compileSdkVersion(29)
    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.1.4"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8", kotlinVersion))
}

tasks.create<Delete>("clear") {
    delete(rootProject.buildDir)
}
