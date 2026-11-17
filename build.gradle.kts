plugins {
    id("java")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

configure<JavaApplication> {
    mainClass.set("org.example.Main")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
