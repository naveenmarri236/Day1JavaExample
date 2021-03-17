package handson1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class UserMainCode {
	private static Map<Integer, String> m = new HashMap<>();
	UserMainCode(){
		
	}
	UserMainCode(Map<Integer,String> m){
		this.m=m;
	}

	public static String getMaxkeyvalue(String string) {
		Map<Integer, String> map = new UserMainCode().m;

		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key + " ===>  " + map.get(key));
		}
		int val=0;
		for(Integer keys:keySet) {	
			if(keys>0) {
				val=keys;
			}
			
		}
		System.out.println(m.get(val));
		
		return " ";

	}

}

public class day8handson3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> m = new HashMap<>();
		System.out.println("Enter the key&values :");
		Integer num = sc.nextInt();
		while (num > m.size()) {
			Integer a = sc.nextInt();
			String b = sc.next();
			m.put(a, b);

		}
		System.out.println(m);
		
		UserMainCode umc=new UserMainCode(m);
		
		
		UserMainCode.getMaxkeyvalue("sample");
		
		

	}

}
