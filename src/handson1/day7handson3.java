package handson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day7handson3 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		List<String> l=new ArrayList<>();
		System.out.println("number of matches played by the CSK team :");
		int games=sc.nextInt();
		while(games>l.size()) {
			l.add(sc.next());
		}
		String stadium;
		int i=Collections.frequency(l, sc.next());
		System.out.println(i);
		
	
		
	}

}
