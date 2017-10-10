import java.util.Scanner;
class Fact
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of numbers");
		int n = sc.nextInt();
		int pro;
		for(int i=1;i<=n;i++)
		{
			pro =1;
			for(int j=1;j<=i;j++)
			{
				pro = pro * j;
			}
			System.out.println(i+"!"+"="+" "+pro);
		}
		
	}
}