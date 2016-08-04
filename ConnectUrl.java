package com.example.test;

public class ConnectUrl {
	public static String connect(String url) {
		String rurl = "http://192.168.1.13:8084/WebApplication1/" + url;
		// String rurl = "http://10.0.2.2:8084/SmartAndroidProject/"+url;
		//String rurl = "http://192.168.1.3:8084/SmartAndroidProject/"+url;
		return rurl;

	}
}
