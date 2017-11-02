class Emp
{
	int id;
	String name;
	double sal;
	int yoe;
	Emp(int id,String name,double sal,int yoe)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.yoe = yoe;
	}
}
class Developer extends Emp
{
	String lang;
	Developer(int id,String name,double sal,int yoe,String lang)
	{
		super(id,name,sal,yoe);
		this.lang = lang;
	}
	public void display()
	{
		System.out.println("************************");
		System.out.println("Emp Name:"+name);
		System.out.println("Emp id :"+id);
		System.out.println("Emp sal :"+sal);
		System.out.println("Emp yoe :"+yoe);
		System.out.println("Emp lang:"+lang);
		System.out.println("************************");
	}
}
class TestEngineer extends Emp
{
	String typeOfTesting;
	TestEngineer(int id,String name,double sal,int yoe,String typeOfTesting)
	{
		super(id,name,sal,yoe);
		this.typeOfTesting = typeOfTesting;
	}
	public void display()
	{
		System.out.println("************************");
		System.out.println("Emp Name:"+name);
		System.out.println("Emp id :"+id);
		System.out.println("Emp sal :"+sal);
		System.out.println("Emp yoe :"+yoe);
		System.out.println("Emp Type of Testing:"+typeOfTesting);
		System.out.println("************************");
	}
}
class Hr extends Emp
{
	Hr(int id,String name,double sal,int yoe)
	{
		super(id,name,sal,yoe);
	}
	public void display()
	{
		System.out.println("************************");
		System.out.println("Emp Name:"+name);
		System.out.println("Emp id :"+id);
		System.out.println("Emp sal :"+sal);
		System.out.println("Emp yoe :"+yoe);
		System.out.println("************************");
	}

}
class Execute
{
	public static void main(String []args)
	{
		Developer d1 = new Developer(101,"Nitish",12000.00,2017,"JAVA");
		d1.display();
		TestEngineer t1 = new TestEngineer(102,"Tadikonda",20000.50,2016,"manual");
		t1.display();
		Hr h1 = new Hr(103,"Nitish",25000.60,2015);	
		h1.display();
	}
}