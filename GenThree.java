/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree
{
	public static void main(String[] args)
	{
	// get numbers from user and parse them
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
	// Generate three random numbers in the range given by user [a, b)
		int random1 = (int)(Math.random() *(b - a))+ a;
		int random2 = (int)(Math.random() *(b - a))+ a;
		int random3 = (int)(Math.random() *(b - a))+ a;
	// find the minimal number that was generated
		int randomMin = Math.min(random3, Math.min(random1, random2));
	//print outputs
		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		System.out.println("The minimal generated number was " + randomMin);
	}
}