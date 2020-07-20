package test;

public class MatrixExampleWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat [][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//		int marks[] = new int[]{1,5,6,7,32};
		//i=0,1,2
		for(int i=0; i<3; i++) {
			//j=1,2,3
			for(int j=0; j<3; j++) {
//				System.out.println();
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();//this introduces new line
		}
		
	}

}
