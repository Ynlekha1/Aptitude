public class Number{
	public static void main(String args[])
{

	int [] arr = {1,3,5,4,5};
	

	System.out.println("the sum is:"+ summ(arr));
	

    String value="manglore";
	char ch='a';
	System.out.println("First occurrence is:" + firstOccurance(value, ch));

	


int evencount=0;
	int oddcount=0;

	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			evencount++;

		}
		else
		{
			oddcount++;
		}
	}

System.out.println("the even value is:"+ evencount);
System.out.println("the odd value is:"+ oddcount);

}
public static int summ(int [] arr )
{
	
	int sum =0;
	for (int i=0;i<arr.length;i++)
	{
		sum = sum+arr[i];

	}

     return sum;
}
public static int firstOccurance(String value ,char ch)
 {
		char[] charArray = value.toCharArray();
		int n = charArray.length;
		for(int i=0;i<n;i++)
		{
			if(charArray[i] == ch)
			{
				
				return i;
			}

        }

         System.out.println("not found");
         return -1;
}

}