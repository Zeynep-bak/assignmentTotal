package day15_assignment_3;

public class Question_3 {

	public static void main(String[] args) {
	/*	Write a Java program that displays the area of a rectangle with a width of 4.5 
		and a height of 7.9 using the following formula:

			area = width * height  */
          calculateArea(4.5,7.9);
	}
    
	   public static void calculateArea(double width, double height){
		   double area= width * height;
		   System.out.println("Area is : " +area);
		   
		   
	   }
	
	
}
