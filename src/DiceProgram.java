
public class DiceProgram {


 
	
	private int numRolls;
	
	public DiceProgram()
	{
		numRolls = 0;
	}

	public int roll()
	{
		numRolls++;
		 return (int)(Math.random()*6 + 1);
	}
	public int getNumRolls()
	{
		return numRolls;
	}
	public void reset()
	{
		numRolls = 0;
	}
}


