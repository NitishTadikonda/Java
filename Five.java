/*
 To print
 * * * * 
  * * * 
    * * 
      * 
    * * 
  * * * 
* * * * 

 */
class Five 
{

	public static void main(String args[])
	{
		int k=4;
		int l=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=k;j++)
			{
				System.out.print("  ");
			}
			for(int z =1;z<=l;z++)
			{
				System.out.print(i+" ");
			}
			k--;
			l+=2;
			System.out.println();
		}
	}
}
