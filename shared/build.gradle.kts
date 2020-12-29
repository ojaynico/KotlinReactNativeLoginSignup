plugins {
    id("org.jetbrains.kotlin.js") version "1.4.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    maven { url = uri("https://dl.bintray.com/ojaynico/ojaynico-kotlin-react-native") }
    maven { setUrl("https://dl.bintray.com/ojaynico/ojaynico-kotlin-react-native-navigation") }
    jcenter()
    maven { url = uri("http://dl.bintray.com/kotlin/kotlin-js-wrappers") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains:kotlin-react:17.0.0-pre.133-kotlin-1.4.21")
    implementation("org.jetbrains:kotlin-extensions:1.0.1-pre.133-kotlin-1.4.21")
    implementation("ojaynico.kotlin.react.native:ojaynico-kotlin-react-native:1.0.8")
    implementation("ojaynico.kotlin.react.native.navigation:ojaynico-kotlin-react-native-navigation:1.0.4")
    implementation(npm("react", "17.0.0"))
    implementation(npm("react-native", "0.63.4"))
    implementation(npm("react-native-navigation", "7.6.0"))
    implementation(npm("react-native-navigation-drawer-extension", "3.2.0"))
}

kotlin {
    js {
        nodejs {
        }
        useCommonJs()
    }
}

// Delete package.json in build directory to prevent jest-haste-map: Haste module naming collision error
task("deletePackages") {
    doLast {
        delete(fileTree("build").matching {
            exclude("**/node_modules")
            include("**/package.json")
        })
    }
}

// Copy resources from resources during assemble task
tasks {
    assemble {
        copy {
            from("src/main/resources")
            into("build/js/packages/shared/kotlin/resources")
        }
        finalizedBy("deletePackages")
    }
}
