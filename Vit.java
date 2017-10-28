import java.util.Scanner;
class Test
{
	static int n = 200;
	String stdName;
	static String branch;
	static String collegeName = "Vit";
	Test()
	{	
		n+=1;
	}
	public void inti(String stdName)
	{
		this.stdName = stdName;
	}
	public void display()
	{
		System.out.println("College Name: "+collegeName);
		System.out.println("Student Name: "+stdName);
		System.out.printf("Student Id: 13B"+branch+"%04d\n",n);
	}
}
class Execute
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Branch Name");
		Test.branch = sc.next();
		Test t1 = new Test();
		t1.inti("Nitish");
		t1.display();
		Test t2 = new Test();
		t2.inti("abc");
		t2.display();
		Test t3 = new Test();
		t3.inti("gag");
		t3.display();

	}
}