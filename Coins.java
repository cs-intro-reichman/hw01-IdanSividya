/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins
{
	public static void main(String[] args)
	{
		int numCents = Integer.parseInt(args[0]);
		int countQuater = 0;
		int countCents = 0;
	// check the max quarters that the user can use.
		while (numCents >= 25)
		{
			numCents = numCents - 25;
			countQuater=countQuater + 1;
		}
	// check the remainder in cents.
		while (numCents > 0)
		{
			numCents = numCents - 1;
			countCents = countCents + 1;
		}
		System.out.println("Use "+ countQuater + " quaters and "+ countCents +" cents");
	}
}