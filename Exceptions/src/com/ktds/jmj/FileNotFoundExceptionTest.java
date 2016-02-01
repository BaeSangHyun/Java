package com.ktds.jmj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileNotFoundExceptionTest { // 파일을 찾을 수 없을 때
	
	public void start() {
		
		File file = new File("D:\\isajkfslad.ddd");
		try {
			InputStream is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		FileNotFoundExceptionTest test = new FileNotFoundExceptionTest();
		test.start();
	}
}
