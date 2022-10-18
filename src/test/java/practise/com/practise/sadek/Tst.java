package practise.com.practise.sadek;

import java.util.ArrayList;
import java.util.List;

public class Tst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char c = '0'; c<='9'; c++ ) {
			System.out.println("Aschi value of " + c +  " : "+( int)c);
			
		}
		//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		for(int i = 1; i<=10; i++) {
			
			
			 {
				 for(int k = 1; k<=10; k++) {
					 System.out.println(i + "*" + k + " : "+ (i*k));
				 }
			
			}
			 System.out.println( "------------------");
		if( i == 7) {
			System.out.println("bye, see you tomorrow.");
			break;
		}
		
		}
		
		System.out.println( "------------------");
		
		for(int score = 0; score<=100; score++) {
			
			
		if(score == 0) 
		 System.out.println( "Zero - duck");
		if(score == 25) 
			 System.out.println( "good job");
		if(score == 50) 
			 System.out.println( "good job - half century");
		if(score == 100) 
			 System.out.println( "good job - century");
		
			}
		
		//print all odd and even numbers between 1 to 100
		
		int [] evenNumber = new int[50];	
		int [] oddNumber = new int[50];
		for(int numbers = 1; numbers<=100; numbers++) {
			if(numbers % 2 == 0) {
				System.out.println( numbers + " is even number");
			}
			else {
				System.out.println( numbers + " is odd number");
				
			}
		}
		
		ArrayList<String> names = new ArrayList<String>();
		int m1 = 0;
		
		while( m1< 5) {
			names.add("Sadek Ahmed" + m1);
			m1++;
		}
		
		List<String> vipNames = new ArrayList<String>();
		vipNames = names.subList(0,2);
		
		for(String e : vipNames) {
			System.out.println(e);
		}
		
		System.out.println(names.contains("Ema"));
		
			

}

}