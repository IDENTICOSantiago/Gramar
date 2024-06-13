plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    kotlin("plugin.serialization") version "1.5.0"

}

android {
    namespace = "com.example.gramarmvil"
    compileSdk = 34
    buildFeatures {
        dataBinding = true
    }

    defaultConfig {
        applicationId = "com.example.gramarmvil"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}


dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.fragment)
    implementation (libs.material.v190)
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation(fileTree(mapOf(
        "dir" to "C:\\Users\\davidherrera\\Downloads\\Android_ScannerSDK_v2.6.19.0\\Android_ScannerSDK_v2.6.19.0",
        "include" to listOf("*.aar", "*.jar"),
    )))
    implementation(libs.firebase.inappmessaging)
    implementation(files("libs\\ksoap2-android-assembly-3.4.0-jar-with-dependencies.jar"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation (libs.volley)
    implementation(libs.kotlinx.serialization.json)
    //EMDK Implementation
    implementation (libs.emdk)
    implementation ("com.symbol:emdk:9.1.1")
    compileOnly("com.symbol:emdk:9.1.1")
    implementation(fileTree("libs") {
        include("*.jar")
    })

}