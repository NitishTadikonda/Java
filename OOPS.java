class Snake
{
	int position;
	Snake(int position)
	{
		this.position = position;
	}
	public void bite()
	{
		System.out.println("Snake Bites");
	}
}
class Ladder
{
	int position;
	Ladder(int position)
	{
		this.position = position;
	}
	public void climbs()
	{
		System.out.println("climb the ladder");
	}
}
class Pawn
{
	int n;
	String color1;
	String color2;
	Pawn(int n,String color1,String color2)
	{
		this.color1 = color1;
		this.color2 = color2;
		this.n = n;
	}
	public void move1()
	{
		if(color1!=null)
		{
		System.out.println("Move the "+color1+" color pawn");
		}
	}
	public void move2()
	{
		if(color2!=null)
		{
		System.out.println("Move the "+color2+" color pawn");
		}
	}
}
class Dice
{
	int n;
	int b;
	Dice(int n,int b)
	{
		this.n = n;
		this.b = b;
	}
	public void rotate()
	{
		System.out.println("die Rotates");
	}
	public void displaySource1()
	{
		System.out.println("Score "+n);
	}
	public void displaySource2()
	{
		System.out.println("Score "+b);
	}
}
class Board
{
	int rows;
	int colums;
	Snake s1;
	Ladder l1;
	Pawn p1;
	Board(int rows,int colums,Snake s1,Ladder l1,Pawn p1)
	{
		this.rows = rows;
		this.colums = colums;
		this.s1 = s1;
		this.l1 = l1;
		this.p1 = p1;
	}
	public void display()
	{
		System.out.println("**********************");
		System.out.println("Rows " +rows);
		System.out.println("COlumns "+colums);
		System.out.println("Snake position "+s1.position);
		System.out.println("Ladder position "+l1.position);
		System.out.println("No of Pawns "+p1.n);
		/*for(int i = 1;i<=rows;i++)
		{
			for(int j =1;j<=colums;j++)
			{
				if(i ==1 || i == rows|| j==1 || j == colums)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		System.out.println("**********************");
	}

}
class Player
{
	int n;
	Board b1;
	Dice d1;
	Player(int n,Board b1,Dice d1)
	{
		this.n = n;
		this.b1 = b1;
		this.d1 = d1;
	}
	public void play()
	{
		b1.display();
		d1.rotate();
		d1.displaySource1();
		b1.p1.move1();
		if(d1.n == b1.s1.position)
		{
			b1.s1.bite();
		}
		if(d1.n == b1.l1.position)
		{
			b1.l1.climbs();
		}
		d1.rotate();
		d1.displaySource2();
		b1.p1.move2();
		if(d1.b == b1.s1.position)
		{
			b1.s1.bite();
		}
		if(d1.b == b1.l1.position)
		{
			b1.l1.climbs();
		}
	}
}
class Game
{
	public static void main (String []args)
	{
		Player p1 = new Player(2,new Board(12,12,new Snake(10),new Ladder(5), new Pawn(2,"Blue","RED")),new Dice(1,5));
		p1.play();
	}
}