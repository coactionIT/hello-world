package Tutorial3;

public class ConditionalStatements 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int randomNumber = (int) (Math.random() * 50);
		
		if (randomNumber < 25) 
		{
			System.out.println("The random number is less than 25");
		}
		// if the above statement isn't true then in comes to the else statement, otherwise it wouldn't
		else if (randomNumber > 40) 
		{
			System.out.println("The random number is greater than 40");
		}
		else if (randomNumber == 18)
		{
			System.out.println("The random number is equal to 18");
		}
		else if (randomNumber != 40)
		{
			System.out.println("The random number is not equal to 40");
		}
		else
		{
			System.out.println("Nothing worked");
		}
		System.out.println("The random number is " + randomNumber);
		
		/* Logical Operators
		 * Java has 6
		 * ! : converts the boolean value to its right location to its opposite. Positive becomes negative.
		 * & : Returns true if boolean value on the right and left are both true but keeps checking if false
		 * && : Returns true if boolean value on the right and left are both true but doesn't keep checking if false
		 * | : Returns true if either boolean value on the right or left
		 * || : Returns true if there is 1 true statement and the other can be false
		 * ^ : Returns true if there is a 1 true and 1 false boolean value
		 */
		if (!(false))
		{
			System.out.println("\nI turned false into true");//\n breaks line
		}
		if ((true) && (true))
		{
			System.out.println("Both are true");
		}
		if ((false) | (true))
		{
			System.out.println("One is true");
		}
		if ((false) ^ (true))
		{
			System.out.println("One is true");
		}
	}

}
