package checkerBoard;

public class CheckerboardTask {
	static int startPos(int x, int y)
	{
		int r = 0;
		if(((x + y)%2) == 0) 
		{
			if(x < 3)
			{
				r = 2;
			}
			else
			{
			if(x > 4)
			{
				r = 3;
			}
			else
			{
				r = 1;
			}
			}
		}
		return r;
	}
	static int edgeFinder(int x, int y)
	{
		int z = 0; //not on edge
		if(x * y == 0 || x<=7 || y<= 7)
		{
			z = 1;
		}
		return z;
	}
	public static void main(String argh[])
	{
		System.out.println("0 = represents white tile 1 = represents black tile" + "\t 2 = red peice 3 = black peice");
		int checkerBoard[][] = new int [8][8];
		for(int row = 0; row < checkerBoard.length; row++)
		{
			for(int col =0; col < checkerBoard[row].length; col++){
				checkerBoard[row][col] = startPos(row,col);
			}
		}
		System.out.println("\n\n");
		for(int row = 0; row < checkerBoard.length; row++)
		{
			for(int col = 0; col < checkerBoard[row].length; col++){
				System.out.print(checkerBoard[row][col] + "\t");
			}
			System.out.println("\n\n");
		}	
	}
}
