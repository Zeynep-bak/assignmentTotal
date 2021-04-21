package day15_assignment_3;

public class Question_6 {

	public static void main(String[] args) {
		overdose(10000);

	}
  public static void overdose(int quantity) {
	   int onedose=500;
	int times= quantity/onedose;
	 System.out.println(times+ " drink it takes to kill a person");
	
	//  1 gram=1000 miligram;   
  }
}
/*Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lathel overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink
 and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lathel overdose  */