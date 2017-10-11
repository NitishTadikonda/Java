/*
1 1 2 2 3 3 
1 2 2 3 3 4 
2 2 3 3 4 4 
2 3 3 4 4 5 
3 3 4 4 5 5
 */
import java.util.Scanner;
class Test
{
	public static void main(String[] args)
	{
		int c=2;
		int b=1;
		int d=2;
		int a=1;
		int x=1;
		int y=2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number of rows:");
		int n = sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		
		for(int j=1;j<=3;j++)
		{
			
			System.out.print(a+" ");
			System.out.print(b+" ");
			a++;
			b++;
		}
		if(i % 2 == 1)
		{
			a=x;
			b=y;
			x++;
			y++;
		}
		else
		{
			a =c;
			b=d;
			c++;
			d++;
		}
		System.out.println();
	}
	}
}