package terning;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class DiceTest {

	@Test
	public void test1() {
		Dice a = new Dice();
		int result = a.roll();
		
		assertTrue(result <=6 && result >=1);
	}

	@Test
	public void test2() {
				
		Dice b = new Dice();
			
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, counter, roller;
		
		int n = 60000;
		
		
		
		for (int i=1; i<n; i++)	{
			
			counter = b.roll();
			
			switch (counter){
			case 1:
				count1 = count1 + 1;
				break;
			case 2:
				count2 = count2 + 1;
				break;
			case 3:
				count3 = count3 + 1;
				break;
			case 4:
				count4 = count4 + 1;
				break;
			case 5:
				count5 = count5 + 1;
				break;
			case 6:
				count6 = count6 + 1;
				break;
		}
		
		
				
		
			
}}}
