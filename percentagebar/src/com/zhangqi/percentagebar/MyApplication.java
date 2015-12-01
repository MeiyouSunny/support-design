package com.zhangqi.percentagebar;

import android.app.Application;

public class MyApplication extends Application {
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

		// TestinAgentConfig config = new TestinAgentConfig.Builder(this)
		// .withAppKey(AppID) // 您的应用的 AppKey，如果已经在 Manifest 中配置则此处可略
		// .withAppChannel(cnl) // 发布应用的渠道，如果已经在 Manifest 中配置则此处可略
		// .withReportOnlyWifi(true) // 仅在 WiFi 下上报崩溃信息
		// .withQAMaster(true) // 开启摇一摇反馈
		// .build();
		// TestinAgent.init(config);

		// TestinAgent.checkUpdate(this);
	}
}
