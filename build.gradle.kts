plugins {
    id("java")
}

group = "me.ahung"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/io.rest-assured/rest-assured
    implementation("io.rest-assured:rest-assured:5.1.1")
    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation("org.testng:testng:7.6.0")
}

tasks.test {
    testLogging {
        showStandardStreams = true;
    }
    useTestNG()
}