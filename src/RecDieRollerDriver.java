
public class RecDieRollerDriver extends RecDieRoller{

	

		public static void main(String[] args) {
			
			roll();
			System.out.println();
			
			System.out.println("rollCount prints 1000 rolls of the dice marking each each time a 2 is rolled");
			rollCount();
			System.out.println();
			System.out.println("Rolled a 2: "+count3+" times out of 1000.");
			
			double avg = count3/1000.0;
			System.out.println("Average: "+avg+"%");
		
	}//end main method

}//end class
