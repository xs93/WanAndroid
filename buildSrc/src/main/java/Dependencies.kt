/**
 * 依赖配置
 *
 * @author XuShuai
 * @version v1.0
 * @date 2020/7/3
 */

object AndroidVersion {
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.2"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    const val kotlin_version = "1.3.72"
}

object Plugins {
    const val gradle = "com.android.tools.build:gradle:4.0.0"
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
}

object Libs {
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"

    const val androidx_appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val androidx_core_ktx = "androidx.core:core-ktx:1.3.0"
    const val androidx_constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val junit = "junit:junit:4.12"
    const val test_junit = "androidx.test.ext:junit:1.1.1"
    const val test_espresso_core = "androidx.test.espresso:espresso-core:3.2.0"
}