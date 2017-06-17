package matrixMultiplication;
public class MatrixMult {
	static int[][] mult(int[][] a, int[][] b){
		int [][] c = new int[a.length][(b[0].length)];
		for(int row =0; row < c.length; row++){ //go through all of the rows
			for(int col = 0; col < c[row].length; col++){ //go though all of the columns 
				for(int count =0; count <b.length; count++){ //go through each index and add up the values
					c[row][col] = c[row][col] + (a[row][count]) * b[count][col];
				}
			}
		}
		return c;
	}
}
