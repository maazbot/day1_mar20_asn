
public class day1_20march_110967_asn3
{
public static void main( String[] args )
	{
		//he is counting his chickens
		System.out.println( "I will now count my chickens:" );

		//divides 30 by 6, and then adds 25 to it
		System.out.println( "Hens " + ( 25 + (double)30 / 6 ) );

		//multiplies 25 by 3, and then modulos by 4 to get 3, 100 - 3 = 97
		System.out.println( "Roosters " + ( 100 - 25 * (double)3 % 4 ) );

		//he is now counting his eggs
		System.out.println( "Now I will count the eggs:" );

		//4 % 2 = 0, 1 / 4 = 0, the remaining addition/subtraction adds up to 7
		System.out.println( 3 + 2 + 1 - 5 + (double)4 % 2 - 1 / (double)4 + 6 );

		//he is asking the user a question
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

		//submits a mathematical expression as a boolean test, comes out false.
		System.out.println( (double)3 + 2 < (double)5 - 7 );

		//asks a question, and combines the print statement with a math expression
		System.out.println( "What is 3 + 2? " + ( (double)3 + 2 ) );

		//see previous line
		System.out.println( "What is 5 - 7? " + ( (double)5 - 7 ) );

		//he has an epiphany
		System.out.println( "Oh, that's why it's false." );

		//he doesn't know when to quit
		System.out.println( "How about some more." );

		//asks a question, combines the print statment with a conditional expression
		System.out.println( "Is it greater? " + ( (double)5 > -2 ) );

		//see prevous line
		System.out.println( "Is it greater or equal? " + ( (double)5 >= -2 ));

		//see previous 2 lines
		System.out.println( "Is it less or equal? " + ( (double)5 <= -2 ) );
	}
}
