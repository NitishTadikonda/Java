/*
Multiplication Table From 2-8
 */
class Sample
{
	public static void main(String args[])
	{
		
		for(int i=2;i<=8;i++)
		{
			for(int j=1;j<=10;j++)
			{
				int k = i*j;
				System.out.println(i+ "x" + j+ "=" + k);
			}
			System.out.println();
		}
}
}