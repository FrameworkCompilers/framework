plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.vanniktech.maven.publish)
}

version = "1.0.0"

kotlin {
    js(IR) {
        useEsModules()
        binaries.library()
    }
}

mavenPublishing {
    publishToMavenCentral()

    signAllPublications()

    coordinates(group.toString(), "framework", version.toString())

    pom {
        name = "Framework"
        description = "Compiler backend for optimizing and code generation targeting Javascript"
        inceptionYear = "2024"
        url = ""
        licenses {
            license {
                name = ""
                url = ""
                distribution = ""
            }
        }
        developers {
            developer {
                id = ""
                name = ""
                url = ""
            }
        }
        scm {
            url = ""
            connection = ""
            developerConnection = ""
        }
    }
}
