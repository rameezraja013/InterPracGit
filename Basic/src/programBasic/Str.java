package programBasic;

public class Str 
{
	public static void main(String[] args) 
	{
		String str="rameez";
		char[] str1=str.toCharArray();	
		//System.out.println("string length:" +str1.length());
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.println("reverse string:" +str1[i]);
		}
		
		
	}

}
