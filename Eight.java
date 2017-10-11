/*
 To print
      1 1 
    3 2 2 3 
  6 5 4 4 5 6 
10 9 8 7 7 8 9 10 
 */
class Eight 
{
 public static void main(String args[])
 {
	 int k=3;
	 int a=1;
	 int b=a;
	 int c=1;
	 for(int i=1;i<=4;i++)
	 {
		 for(int j =1;j<=k;j++)
		 {
			 System.out.print("  ");
		 }
		 for(int z=1;z<=i;z++)
		 {
			System.out.print(a+" ");
			 a--;
			 b++;
		 }
		 for(int x =1;x<=i;x++)
		 {
		 System.out.print(c+" ");
		 c++;
		 }
		 a = b+i;
		 k--;
		 System.out.println();
	 }
 }
}
