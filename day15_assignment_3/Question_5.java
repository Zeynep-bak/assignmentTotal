package day15_assignment_3;

public class Question_5 {

	public static void main(String[] args) {
		inputSecond(3695);

	}
     
	public static void inputSecond(int second1) {
		 
		int hour= second1/3600;
		int minute= second1/60;
		int second2= second1%60;
		
		System.out.println(hour+" hour, "+minute+" minute, "+second2 +" second");
	}
	
	
	
	
	
}/*
Write a program that outputs the number of hours, minutes, and seconds
that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours,
minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds   */