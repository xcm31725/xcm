package com.itheima.utils;

import sun.misc.BASE64Encoder;

public class DownloadUtils {
	public static String base64EncodeFileName(String fileName) {
		BASE64Encoder base64Encoder = new BASE64Encoder();
		try {
			return "=?UTF-8?B?" + new String(base64Encoder.encode(fileName.getBytes("utf-8"))) + "?=";
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
