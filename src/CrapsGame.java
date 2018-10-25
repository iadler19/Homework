import java.util.Scanner;


public class CrapsGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		DiceProgram Dice = new DiceProgram();
		DiceProgram Dice1 = new DiceProgram();
		System.out.println("Would you like to play Craps?");
	 String answer = in.next();
		
	 
	 if(answer.equals("Yes"))
				{
			System.out.println("Press enter to roll die:");

			in.nextLine();
			
			int diceRoll = Dice.roll();
			int diceRoll1 = Dice1.roll();
			
			if((diceRoll + diceRoll1 == 7) || (diceRoll + diceRoll1 ==  11))
			
			{
				System.out.println("You Win!!");
			}
			
			else if((diceRoll + diceRoll1 == 2) ||(diceRoll + diceRoll1 == 12))
			
			{
				System.out.println("You Lose");
			}
			
			else 
			{
				System.out.println("Your  point value is:" + (diceRoll + diceRoll1));
				System.out.println("Try to roll that!");
				boolean tof = true;
				while(tof)
				{
					int diceRoll2 = Dice.roll();
					int diceRoll3 = Dice1.roll();
					 
					if(diceRoll2 + diceRoll3 == 7)
					{
						System.out.println("You Lose");
						tof = false;
					}
					else if((diceRoll2 + diceRoll3 == diceRoll + diceRoll1))
					{
						System.out.println("You Win!!");
						tof = false;
					}
					else
					{
						tof = true;
					}
					
					
					
				}
				
				
			}
			
			
			
			
			
			
			
				}

	}

}
