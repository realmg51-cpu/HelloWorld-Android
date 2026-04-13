
# Hello Android - 你好安卓

[![Build APK](https://github.com/realmg51-cpu/HelloWorld-Android/actions/workflows/release.yml/badge.svg)](https://github.com/realmg51-cpu/HelloWorld-Android/actions/workflows/release.yml)

一个简单的 Android 应用示例，使用 Kotlin 编写，展示 "Hi" 消息。  
A simple Android app written in Kotlin that displays a "Hi" message.

---

## 🚀 功能 | Features

- ✅ 显示欢迎消息 | Display welcome message
- ✅ 支持 ViewBinding | ViewBinding support
- ✅ 自动构建 APK (GitHub Actions) | Auto build APK via GitHub Actions
- ✅ 支持 Android TV | Android TV compatible

---

## 📦 下载 | Download

从 GitHub Actions 下载最新 APK：  
Download the latest APK from GitHub Actions:

1. 进入 **Actions** → 选择最新的 workflow → **Artifacts** → `app-debug.zip`
2. 解压并安装 `app-debug.apk`

---

## 🛠️ 技术栈 | Tech Stack

| 技术 | 说明 |
|------|------|
| Kotlin | 主要编程语言 |
| Android Gradle Plugin 8.2.0 | 构建工具 |
| ViewBinding | 视图绑定 |
| GitHub Actions | CI/CD 自动构建 |

---

## 📁 项目结构 | Project Structure

```
HelloWorld-Android/
├── .github/workflows/
│   └── build.yml          # CI 构建脚本
├── app/
│   ├── src/main/java/.../MainActivity.kt
│   ├── src/main/res/layout/activity_main.xml
│   └── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

## 🏗️ 本地构建 | Build Locally

```bash
# 克隆仓库
git clone https://github.com/yourusername/HelloWorld-Android.git
cd HelloWorld-Android

# 构建 Debug APK
./gradlew :app:assembleDebug

# APK 输出位置
# app/build/outputs/apk/debug/app-debug.apk
```

---

## 📝 许可证 | License

MIT License

---

## 👨‍💻 作者 | Author

Your Name

---

## 🙏 致谢 | Thanks

- [BetterAndroid](https://github.com/HighCapable/BetterAndroid) (已移除，但感谢灵感 | Removed but thanks for inspiration)
- [SweetDependency](https://github.com/HighCapable/SweetDependency) (已移除 | Removed)


Xong! README của bạn trông rất chuyên nghiệp rồi! 🎉
