/* 
1 1 2 2 3 3 
1 2 2 3 3 4 
2 2 3 3 4 4 
2 3 3 4 4 5 

 */
class Test
{
	public static void main(String[] args)
	{
		int c=0;int b=1;int d=0;int a=1;int x=2;int y=1;
	for(int i=1;i<=4;i++)
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
			a=x-i;
			b=y+1;
			x+=3;
			y++;
		}
		else
		{
			a = c+i;
			b=d+i;
		}
		System.out.println();
	}
	}
}