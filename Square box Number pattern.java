/*
 To print 
1 2 3 4 4 3 2 1 
1 2 3     3 2 1 
1 2         2 1 
1             1 
1 2         2 1 
1 2 3     3 2 1 
1 2 3 4 4 3 2 1 

 */

class  Demo 
{
   public static void main(String[] args)
	{
		int k=0;
		int l=4;
		int a =4;
		for(int i=1;i<=7;i++)
		{
			for(int z= 1;z<=a;z++)
			{
				System.out.print(z+" ");
			}
			for(int j=1;j<=k;j++) 
			{
				System.out.print("  ");
			}
			for(int x=l;x>=1;x--)
			{
				System.out.print(x+" ");
				
			}
			System.out.println();
			if(i<4)
			{   
				a--;
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
	  

