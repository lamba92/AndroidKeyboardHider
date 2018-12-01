plugins{
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    maven
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

val kotlinVersion: String by project

dependencies {
    implementation(kotlin("stdlib-jdk8", kotlinVersion))
}
