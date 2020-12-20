import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

java.sourceCompatibility = JavaVersion.VERSION_11
plugins {
    kotlin("jvm") version "1.3.72"
    "java-library"

}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.3")

    // kotlin support
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}
