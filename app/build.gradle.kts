plugins {
    id("com.android.application")
    // ✅ ĐÃ XÓA: id("org.jetbrains.kotlin.android") - Không cần từ AGP 9.0
}

android {
    namespace = "com.cotlin.helloandroid"
    compileSdk = 37  // Nên lên 35 cho mới

    defaultConfig {
        applicationId = "com.cotlin.helloandroid"
        minSdk = 30
        targetSdk = 37  // Cập nhật luôn targetSdk
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // ✅ ĐÃ XÓA: kotlinOptions { jvmTarget = "17" } - Không dùng nữa
}

// ✅ THÊM KHỐI NÀY - Cấu hình Kotlin toolchain mới
kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("androidx.core:core-ktx:1.18.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.13.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
}
