/*
To print
* * * * * * * * 
* * *     * * * 
* *           * * 
*                 * 
* *           * * 
* * *     * * * 
* * * * * * * * 

 */
class Six 
{
	public static void main(String args[])
	{
		int k=0;
		int l=4;
		int a =4;
		for(int i=1;i<=7;i++)
		{
			for(int z= 1;z<=a;z++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=k;j++) 
			{
				System.out.print("  ");
			}
			for(int z=1;z<=l;z++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
			if(i<4)
			{   a--;
				k+=2;
				l--;
			}
			else
			{   
				a++;
				k-=2;
				l++;
			}
		}
	}
}
