package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Win Chance");
		double winChance = in.nextDouble();
		int startAmount=10;
		int winLimit;
		winLimit = startAmount;
		
		while (winLimit == 0 || winLimit < 20)
		{
			if(winLimit <= 20 && winChance > 0.5)
			{
			winLimit = startAmount += 2;
			System.out.println(" You win" + winLimit);
			
			
			}
		
			else 
		{
			winLimit = startAmount -=5;
			
			if(winLimit==0 )
			{
				System.out.println("You lose" + winLimit);
			}
			
		}
		
		}
		
	}

}
