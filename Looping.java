public class Looping
{
	public static void main(String args[])
	{
		for(int number = 1; number <= 10; number++){
			System.out.print(" "+number);
			for(int p = 1; p <= number; p++)
		{
			System.out.print(" "+p);
		}
		System.out.println("");
		}
		
	}
}