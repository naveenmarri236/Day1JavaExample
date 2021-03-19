package com.day9;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) throws IOException {
		String source="Now is the time for all good end to come their country and pay their taxex";
		byte[] buf=source.getBytes();
		FileOutputStream f0=new FileOutputStream("text1.txt");
		for(int i=0;i<buf.length;i+=2) {
			f0.write(i);			
		}
		f0.close();
		
		FileOutputStream f1=new FileOutputStream("text2.txt");
		f1.write(buf);
		f1.close();
		
		FileOutputStream f2=new FileOutputStream("text3.txt");
		f2.write(buf,0,15);
		f2.close();
	}

}
