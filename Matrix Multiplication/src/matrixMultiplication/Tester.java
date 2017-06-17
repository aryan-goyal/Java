package matrixMultiplication;
public class Tester {
	public static void main(String args[]){
		//create matrix a and b
		int a[][] = {{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
		int b[][] = {{-1,3},{0,9},{1,-11},{4,-5}};
		//create final multiplied resulting matrix d
		int [][] d = new int [a.length][b[0].length];
		//print Matrix a
		for(int row=0;row<a.length;row++){
			for(int col=0;col<a[row].length;col++){
				System.out.print(a[row][col] + "\t");
			}
			System.out.println("");
		}
		System.out.println("\n");
		//print matrix b
		for(int row=0;row<b.length;row++){
			for(int col=0;col<b[row].length;col++){
				System.out.print(b[row][col] + "\t");
			}
			System.out.println("");
		}
		//multiply matrix a and b
		d = MatrixMult.mult(a,b);
		//print matrix d (multiplied matrix)
		System.out.println("\nOutput Matrix\n============\n");
		for(int row=0;row<d.length;row++){
			for(int col=0;col<d[row].length;col++){
				System.out.print(d[row][col] + "\t");
			}
			System.out.println("");
		}
	}
}
