package handson1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class UserMainCode1{
	private static Map<Integer, String> m1 = new HashMap<>();
	UserMainCode1(){
	
	}
	UserMainCode1(Map<Integer,String> m1){
		this.m1=m1;
	}

	public static void getMaxvalue(Integer i) {
		Map<Integer, String> map = new UserMainCode1().m1;

		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			if(key%3==0) {
				boolean map1=map.remove(key, keySet);
								
				
			}
			System.out.println(map1.size());

		}
	

	
	}
}

public class day8handson2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> m1=new HashMap<>();
		System.out.println("Enter the number of elements :");
		int num=sc.nextInt();
		while(num>m1.size()) {
			Integer a=sc.nextInt();
			String b=sc.next();
			m1.put(a,b);
		}
		System.out.println(m1);
		UserMainCode1 umc=new UserMainCode1(m1);
		

		UserMainCode1.getMaxvalue(10);
		
		
		

	}

}
