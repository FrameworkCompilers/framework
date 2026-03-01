plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.vanniktech.maven.publish)
}

group = "io.github.dynamicprodbreaker"
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
        url = "https://github.com/FrameworkCompilers/framework"
        licenses {
            license {
                name = "MIT License"
                url = "https://opensource.org/licenses/MIT"
                distribution = "https://opensource.org/licenses/MIT"
            }
        }
        developers {
            developer {
                id = "DynamicProdBreaker"
                name = "Joseph Tay"
                url = "https://github.com/DynamicProdBreaker"
            }
        }
        scm {
            url = "https://github.com/FrameworkCompilers/framework"
            connection = "scm:git:git://github.com/FrameworkCompilers/framework.git"
            developerConnection = "scm:git:ssh://git@github.com/FrameworkCompilers/framework.git"
        }
    }
}
