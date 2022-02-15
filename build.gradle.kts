import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10-RC"
    application
}

group = "me.spand"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project("ui-module"))
    implementation(project("db-module"))
//    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

kotlin {
    sourceSets["main"].kotlin.filter.apply {
        includes.clear()
        include("**/Main.kt")
    }
}

application {
    mainClass.set("MainKt")
}