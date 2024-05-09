package com.mobile_programing.white_bus_demo

import android.app.Application
import com.kakao.sdk.common.KakaoSdk
class MyApplication() : Application() {
    override fun onCreate() {
        super.onCreate()

        // Kakao SDK 초기화
        KakaoSdk.init(this, "c6af6f6b7cc180956afa6ef8188c931e")
    }
}