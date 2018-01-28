package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPhotoDemo1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c\\b\\1.jpg");
		FileOutputStream fos = new FileOutputStream("1.jpg");
		
		int len;
		byte[] byt = new byte[1024];
		while((len = fis.read(byt))!=-1){
			fos.write(byt, 0, len);
		}
		
		fis.close();
		fos.close();
	}

}
