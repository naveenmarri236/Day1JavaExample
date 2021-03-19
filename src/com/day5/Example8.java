package com.day5;
class MyException extends Exception{
	int details;
	
	public MyException(int details) {
		super();
		this.details=details;
	}

	@Override
	public String toString() {
		return "MyException [details=" + details + "]";
	}
	
}
public class Example8 {
	static void computer(int a) throws MyException{
		System.out.println("called compute" +a);
		if(a>10)
			throw new MyException(a);
		System.out.println("normal exit");
	}
	public static void main(String[] args) {
		try {
			computer(1);
			computer(20);
		}
		catch(MyException e) {
			System.out.println("Caught"+e);
		}
	
	}

}
