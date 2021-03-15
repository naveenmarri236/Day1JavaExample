package handson;
class X{
	static{
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	X(){
		
		System.out.println("3");
	}
	X(int a){
		System.out.println("4");
	}
	{
		System.out.println("5");
	}
	static {
		System.out.println("6");
	}
}

class Z extends X{
	static {
		System.out.println("12");
	}
	Z(){
		
		System.out.println("13");
	}
	{
		System.out.println("14");
	}
	Z(int a){
		
		System.out.println("15");
	}
	{
		System.out.println("16");
	}
	static {
		System.out.println("17");                           
	}
}
public class Laptop {
	
	
	static {
		System.out.println("19");
	}
	public static void main(String[] args) {
		System.out.println("88");
		Z z=new Z();
		System.out.println("20");

	}
	static {
		System.out.println("21");
		
	}

}
