import java.util.Random;
import java.util.random.*;
/**
 * 
 * @author johnpaulthomas
 * roll method is recursive and calls upon itself until a 2 is rolled
 * 
 * rollCount rolls the full 1,0000 rolls and prints a statement each time a 2 is rolled
 * rollCount is used to find average
 */
public class RecDieRoller {
	
static int count = 0;
static int count2 = 0;
static int count3 = 0;

	public static void roll() {
		
	Random randNum = new Random();	
	int integer = randNum.nextInt(6)+1;
	
	
	if (count <= 1000) {
		
		if (integer ==2) {
		
		count++;
		System.out.println("Roll number: "+count);
		System.out.println(integer);
		System.out.println("You rolled a 2 in: "+count+" rolls");
		return;
		}
		
			count++;
			System.out.println("Roll number: "+count);
			System.out.println(integer);
			
			roll();

	}//end 
}//end roll method
	public static void rollCount() {
		
		Random randNum = new Random();	
		int integer = randNum.nextInt(6)+1;
		
	
		while (count2 <= 1000) {
			
			if (integer ==2) {
				
			//System.out.println("Roll number: "+count++);
			
			System.out.println("You rolled a 2 on the : "+count2+"th"+" roll");
			count3++;
			return;
			}
			//if (integer != 2) {
			
				count2++;
				
				rollCount();
		
		
		
		}//end while loop
	}//end roll method
				
	}//end class
	
	
	
	
