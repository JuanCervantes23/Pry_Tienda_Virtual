plugins {
    alias(libs.plugins.android.application)
    kotlin("plugin.serialization") version "1.9.24"
}

android {
    namespace = "com.example.pry_tienda_virtual"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.pry_tienda_virtual"
        minSdk = 28
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.viewpager2)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    // 1. Librería principal de Kotlinx Serialization Json
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    // 2. Convertidor oficial de Retrofit para Kotlinx Serialization
    implementation("com.squareup.retrofit2:converter-kotlinx-serialization:2.11.0")
    // 3. Retrofit & OkHttp para conexión en red
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    // 4. Glide para mostrar las imágenes de los productos
    implementation("com.github.bumptech.glide:glide:4.16.0")
}