package handson;

public class Naveen {
	
	int i=10;
	{
		m1();
		System.out.println("First Instance Block");
	}
	Naveen(){
		System.out.println("Constructor block");
	}
	public static void main(String[] args) {
		Naveen n=new Naveen();
		System.out.println("main block");
		Naveen n1=new Naveen();

	}
	{
		System.out.println("Second Instance block");
	}
	void m1(){
		System.out.println("First method");
		System.out.println(j);
	}
	int j;
	

}
