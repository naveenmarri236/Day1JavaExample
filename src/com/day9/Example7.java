package com.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClass implements Serializable{
	 transient String s;
	 transient int i;
	 transient double d;
	 
	public MyClass(String s, int i, double d) {
		super();
		this.s = s;
		this.i = i;
		this.d = d;
	}

	@Override
	public String toString() {
		return "MyClass [s=" + s + ", i=" + i + ", d=" + d + "]";
	}
	
	 
 }
public class Example7 {

	public static void main(String[] args) {
		try {
			MyClass object1=new MyClass("hello",7,2.45);
			System.out.println("object1 "+object1);
			
			FileOutputStream fos=new FileOutputStream("serial");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(object1);
			oos.flush();
			oos.close();
		}	
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			MyClass object2;
			FileInputStream fis=new FileInputStream("serial");
			ObjectInputStream ois=new ObjectInputStream(fis);
			object2=(MyClass)ois.readObject();
			ois.close();
			System.out.println("Object2  "+object2);
			
		}
		catch(Exception e) {
			
		}

	}

}
