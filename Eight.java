/*
 To print
        1 1 
      3 2 2 3 
    6 4 5 5 4 6 
  10 7 9 8 8 9 7 10 
 */
class Eight 
{
 public static void main(String args[])
 {
	 int k=4;
	 int l=1;
	 int a=1;
	 int b=a;
	 int c=1;
	 for(int i=1;i<=4;i++)
	 {
		 
		 /*if(i==2)
			{
				a= b+2;
			}
			else if(i==3)
			{
				a = b+5;
				c=4;
			}
			else if(i==4)
			{
				a= b+9;
				c=7;
			}*/
		 for(int j =1;j<=k;j++)
		 {
			 System.out.print("  ");
		 }
		 for(int z=1;z<=i;z++)
		 {
			System.out.print(a+" ");
			System.out.print(c+" ");
			 a--;
			 c=c+1;
			 b++;
		 }
		 a = b+i;
		 l=l+1;
		k--;
		 System.out.println();
	 }
 }
}
