/*
1 2 3 
A B C 
4 5 6 
D E F 
 */
class Four 
{
	public static void main(String[] args)
    {	
		int k =1;
		char l='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==3 || i==1)
				{
					System.out.print(k+" ");
					k++;
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
