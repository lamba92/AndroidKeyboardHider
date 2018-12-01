val kotlinVersion: String by project

plugins{
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    maven
}

repositories {
    google()
    jcenter()
}

android {
    compileSdkVersion(28)
    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8", kotlinVersion))
}


tasks.create<Delete>("clear") {
    delete(rootProject.buildDir)
}
