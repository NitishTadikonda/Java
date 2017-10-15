import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n =sc.nextInt();
		int a;
		int k=1;
		int l;
		if(n % 2 == 1)
		{
		 l=n;
		 a=n+1;
		}
		else
		{
			l=n+1;
			a=n+2;
		}
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=l;j++)
			{
				if(j == a/ 2)
				{
					System.out.print(k+" ");
				}
				else
				{
					System.out.print(n+" ");
				}
			}
			k++;
			System.out.println();
		}
		}
}