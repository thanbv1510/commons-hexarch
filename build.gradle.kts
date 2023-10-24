plugins {
    java
    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"
}

group = "dev.thanbv1510.commons"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter:3.1.0")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.0.4")

    implementation("org.yaml:snakeyaml:2.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    val moduleName = project.name
    val version = project.version.toString().replace("plain", "")

    val jarFileName = "${rootProject.name}-$version.jar"
    archiveFileName.set(jarFileName)
}
