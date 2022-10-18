package practise.com.practise.sadek;

public class Assignment {
	/*
	 * public LoginPage(String userName){
	 * this.userName = userName}
	 * Public void doLogin(String un){ 
	 * }
	 */
	
	public static void printFactorial(int number) {
		
		if(number > -1) {
			if(number >=0 && number < 2) {
				System.out.println(number + "!" + " = "+ number );
			}
			else {
				int total = 1;
				System.out.print(number + "!" + " = "); 
				for(int i = number; i>0; i--) {
					System.out.print(i);
					if(i >1) {
					System.out.print("*");}
					total = total*i;
				}
				System.out.print(" = " );
				System.out.println(total);
				
			}
		}
		else {
			System.out.println("Please Enter a number 0 or greater");
		}
		
	}
	/*
	 * Marks        Grade
91-100         AA
81-90          AB
71-80          BB﻿
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
	 */
	public static String getGrade(int number) {
		if(number < 0 || number > 100) {
			String warningMessage = "No grade associate with "+ number+ ". Please enter a number between 1 to 100.";
			return warningMessage;
		}
		else {
			if(number >90 && number <101) {
				return "AA";
			}
			else if(number >80 && number <91) {
				return "AB";
			}
			else if(number >70 && number <81) {
				return "BB";
			}
			else if(number >60 && number <71) {
				return "BC";
			}
			else if(number >50 && number <61) {
				return "CD";
			}
			else if(number >40 && number <51) {
				return "DD";
			}
			else if(number <=40) {
				return "Fail";
			}
		}
		return null;
		
	}
	
	public static void main(String[]args) {
		printFactorial(-1);
		String grade = getGrade(40);
		System.out.println(grade);
		
		
	}

}
