plugins {
    kotlin("jvm")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.exposed:exposed-core:0.37.3")
    implementation("org.jetbrains.exposed:exposed-jdbc:0.37.3")
}

kotlin {
    sourceSets["main"].kotlin.apply {
        srcDir("../src/main/kotlin")
        filter.apply {
            includes.clear()
            include("**/*.db.kt")
        }
    }
}
