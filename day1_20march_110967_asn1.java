
public class day1_20march_110967_asn1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		printTopLine();
		printNextThreeLines();
		printAddress();
		printLastLine();
	}
 
	public static void printTopLine()
	{
		for (int i = 0; i < 75; i++)
		{
			System.out.print("-");
		}
	}
 
	public static void printNextThreeLines()
	{
		System.out.println();
		for (int j = 0; j < 3; j++)
		{
			for (int i = 0; i < 70; i++)
			{
				System.out.print(" ");
			}
			for (int k = 0; k < 4; k++)
			{
				System.out.print("#");
			}
			System.out.print(" |");
			System.out.println();
		}
	}
 
	public static void printAddress()
	{
		for (int a = 0; a < 74; a++)
			System.out.print(" ");
		System.out.print(" |");
 
		System.out.println();
		//first address line, has the recipient's name
		for (int x = 0; x < 35; x++)
		{
			System.out.print(" ");
		}
		System.out.print("Maaz Shah");
		for (int x = 0; x < 30; x++)
		{
			System.out.print(" ");
		}
		System.out.print(" |");
		//end of name line
 
		System.out.println();
 
		//second address line, has the street name
		for (int x = 0; x < 35; x++)
		{
			System.out.print(" ");
		}
		System.out.print("123 Sesame Street");
		for (int x = 0; x < 22; x++)
		{
			System.out.print(" ");
		}
		System.out.print(" |");
		//end of street name line
 
		System.out.println();
 
		//third address line, has the city, state, zip code
		for (int x = 0; x < 35; x++)
		{
			System.out.print(" ");
		}
		System.out.print("Brooklyn, New York, 11217");
		for (int x = 0; x < 14; x++)
		{
			System.out.print(" ");
		}
		System.out.print(" |");
		//end of city, state, zip code line
	}
 
	public static void printLastLine()
	{
		System.out.println();
		for (int j = 0; j < 74; j++)
		{
			System.out.print(" ");
		}
		System.out.print(" |");
		System.out.println();
		for (int i = 0; i < 74; i++)
		{
			System.out.print("-");
		}
		System.out.print(" |");
	}
}