import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {
	
int numberOfRolls = 60000, result;
	
	@Test
	public void DiceIntervalTest() {
		
		Dice a = new Dice(); 
		
		for (int roll = 0; roll <= numberOfRolls;)
		{
			roll += 1;
			result = a.roll();
			
			if ( result > 6 || result < 1)
				break;
			
		}
		assertTrue(result >= 1 && result <= 6);
	}

	int dice1, dice2, dice3, dice4, dice5, dice6, counter;
	
	@Test
	public void valueOccur() {
				
		Dice b = new Dice();
		
		for (int i = 1; i < numberOfRolls; i++)	{
			
			counter = b.roll();
			
			switch (counter){
			case 1:
				dice1 += 1;
				break;
			case 2:
				dice2 += 1;
				break;
			case 3:
				dice3 += 1;
				break;
			case 4:
				dice4 += 1;
				break;
			case 5:
				dice5 += 1;
				break;
			case 6:
				dice6 += 1;
				break;
		}
		}
		System.out.print("Number of 1`s: " + dice1 + "\tNumber of 2`s: " + dice2 + "\tNumber of 3`s: " + dice3 + "\tNumber of 4`s: " + dice4 + "\tNumber of 5`s: " + dice5 + "\tNumber of 6`s: " + dice6);
		
		assertTrue(dice1 >= (10000-400) && dice1 <= (10000+400));
		assertTrue(dice2 >= (10000-400) && dice2 <= (10000+400));
		assertTrue(dice3 >= (10000-400) && dice3 <= (10000+400));
		assertTrue(dice4 >= (10000-400) && dice4 <= (10000+400));
		assertTrue(dice5 >= (10000-400) && dice5 <= (10000+400));
		assertTrue(dice6 >= (10000-400) && dice6 <= (10000+400));
	}
}
