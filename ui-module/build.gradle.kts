plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.3")
}

kotlin {
    sourceSets["main"].kotlin.apply {
        srcDir("../src/main/kotlin")
        filter.apply {
            includes.clear()
            include("**/*.ui.kt")
        }
    }
}
