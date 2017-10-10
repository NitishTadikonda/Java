import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{ 
		int status =1;
		System.out.println("Welcome to calulator program");
		Scanner sc = new Scanner(System.in);
		//while(true)
		while(status==1)
		{
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for division");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("You have choosen addition");
			System.out.println("Enter First Number");
			int a = sc.nextInt();
			System.out.println("Enter Second Number");
			int b = sc.nextInt();
			int c = a+b;
			System.out.println("Your addition is:"+c);
			break;
		case 2:
			System.out.println("You have choosen Subtraction");
			System.out.println("Enter First Number");
			int d = sc.nextInt();
			System.out.println("Enter Second Number");
			int e = sc.nextInt();
			int f = d-e;
			System.out.println("Your Subtraction is:"+f);
			break;
		case 3:
			System.out.println("You have choosen Multiplication");
			System.out.println("Enter First Number");
			int g = sc.nextInt();
			System.out.println("Enter Second Number");
			int h = sc.nextInt();
			int i = g*h;
			System.out.println("Your Multiplication is:"+i);
			break;
		case 4:
			System.out.println("You have choosen Division");
			System.out.println("Enter First Number");
			int x = sc.nextInt();
			System.out.println("Enter Second Number");
			int y = sc.nextInt();
			int z = x/y;
			System.out.println("Your Division is:"+z);
			break;
			default:
				System.out.println("Invalid choice");
			}
		 System.out.println("Do you want to continue");
		 System.out.println("enter Your choice 0 for stop  or 1 for continue");
		 int i = sc.nextInt();
		 if(i ==0)
		 {
			 System.out.println("Thank you");
			 break;
		 }
		}
		}
	}
				
			