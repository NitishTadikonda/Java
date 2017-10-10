/*
 To print all the prime numbers in between 1-50 
 */
import java.util.Scanner;
class Seven 
{
	public static void main(String args[])
	{
		int status;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Lower limit");
		int m = sc.nextInt();
		
		System.out.println("Enter Upper Limit");
		int n = sc.nextInt();
		
		for(int i =m;i<=n;i++)
		{
			  status =0; 
			  if(i>1)
			  {
	          for(int num =2; num <= i-1; num++)
		     {
	             if( i % num == 0)
		        {
					status =1;	
				}

	             
			}
			if(status == 0)
			{
				int p =i;
				System.out.print(p+" ");
				
			}
			  }
		}
		
}
}