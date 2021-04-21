package day15_assignment_3;

public class Question_7 {

	public static void main(String[] args) {
		vendingMachine(95);

	}
  public static void vendingMachine(int cost) {
	   
		 int change=100-cost;
		 int quarter=change/15;
		 int dimes=change/10;
		 int nickles=change/5;
		  System.out.println("the change is "+quarter+" quarter, "+dimes+" dimes,"+nickles+" nickles");
	  }
  }

/*Write a program that determines the change to be dispensed from a vending machine.
 *  An item in the machine can cost between 25 cents and 1 dollar,
 *   in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100),
 *    and the machine accepts only a single dollar bill to pay for the item.
Sample output
Price in cents : 95
Your change is 0 quarters, 0 dimes, and 1 nickles*/