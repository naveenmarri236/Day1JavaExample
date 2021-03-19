package handson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day7handson2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		System.out.println("enter the games played by Suresh Raina :");
		
		int games=sc.nextInt();
		while(games>l.size()) {
			l.add(sc.nextInt());
		}
		Collections.sort(l);
		for(Integer l1:l) {
			System.out.println(l1);
		}
		

	}

}
