package day15_assignment_3;

public class Question_2 {

	public static void main(String[] args) {
		/*Write a program - > Declare variables for your name and birth year,
		 *  and the program will display:
		      " Hello, Ozzy! Based on your input, your age is 15 :) "*/
        
		calculateAge(2021,1981);
		
	}
         public static void calculateAge(int currentYear, int birthYear) {
         
         int age= currentYear - birthYear;
	      String name="Zeynep";
	   System.out.println("Hello, "+name +".Based in your input , your age is :"+age);
         }
	
	
}
