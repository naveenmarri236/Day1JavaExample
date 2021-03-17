package handson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Sample {

}

public class day8handson4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> hm = new HashMap<>();

		List<String> employees = new ArrayList<String>();

		System.out.println("enter the number of employees :");

		int names = sc.nextInt();

		while (names > hm.size()) {
			String a = sc.next();
			String b = sc.next();
			hm.put(a, b);
		}
		

		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			System.out.println(key + " ===>  " + hm.get(key));
		}

		System.out.println("enter the employees design:");

		String design = sc.next();

		if (hm.containsValue(design)) {
			System.out.println("Employe with design  : " + design);
			for (String key : keySet) {
				if (design.equals(hm.get(key))) {
					
					System.out.println(key);
				}
			}
		} 
		else {
			System.out.println("No Employe with design  : " + design);
		}

	}

}
