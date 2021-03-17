package handson1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day7handson1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter the number of games:");
		
		int games = sc.nextInt();
		System.out.println("Enter the score of "+games+" games ");
		while(games> l.size()) {
			l.add(sc.nextInt());	
		}
		
		double total =0;
		
		for(Integer game:l){
			total+=game;
			
		}
		System.out.println(total);
		System.out.println((total)/l.size());
	}

}
