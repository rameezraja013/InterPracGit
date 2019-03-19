package programBasic;

public class Arr
{
	public static void main(String[] args)
	{
	 int arr[]=new int[5];
	 System.out.println("Array length"+arr.length);
	 arr[0]=23;
	 arr[1]=34;
	 arr[2]=76;
	 arr[3]=87;
	 arr[4]=100;
	 for(int i=arr.length-1;i>=0;i--)
	 {
		 System.out.println(arr[i]);
	 }
		
	}

}
