package handson;

 abstract class D{
	 String name;
	 int age;
	 
	 
	 
	D(String name, int age) {

		this.name = name;
		this.age = age;
	}
 }
 class B extends D{
	 int rollno;
	 
	 B(String name,int age,int rollno){
		 super(name,age);
		 this.rollno=rollno;
	 }

	public static void main(String[] args) {
		
		B d=new B("naveen",236,21);
		
		System.out.println(d.name+" "+d.age+" "+d.rollno);
		
		
	}

}

