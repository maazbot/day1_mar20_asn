
public class day1_20march_110967_asn2 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		letterGenerate();
	}
 
	public static void letterGenerate()
	{
		String[] sarray = new String[7];
		sarray[0] = "M   M    SSS ";
		sarray[1] = "MM MM   S   S";
		sarray[2] = "MM MM   S    ";
		sarray[3] = "M M M    SSS ";
		sarray[4] = "M   M       S";
		sarray[5] = "M   M   S   S";
		sarray[6] = "M   M    SSS ";
 
		for(String s: sarray)
		{
			System.out.println(s);
		}
	}
 
}