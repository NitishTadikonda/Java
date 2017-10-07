// sum of even numbers from 10-30
class  Demo 
{
   public static void main(String[] args)
    {	
	   int sum=0;
	   for(int i=10;i<=30;i++)
		{
		  if(i%2==0)
		  {
			  
			  sum=sum+i;
		  }
	   }
	   System.out.println(sum);
    }
}
