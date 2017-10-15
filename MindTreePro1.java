import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n =sc.nextInt();
		int k=1;
		int m = n*2+1;
		int l = n*(n-1)+1;
		for(int i =1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n)
				{
					System.out.print(k+" ");
					k++;
				}
				else if(i % 2 == 0)
				{
					System.out.print(m+" ");
					m++;
				}
				else
				{
					System.out.print(l+" ");
					l++;
				}
			}
			System.out.println();
		}
		}
		}