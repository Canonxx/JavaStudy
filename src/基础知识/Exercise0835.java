package 基础知识;

import java.util.Scanner;

/*最大块
 * 
 * 
 */
public class Exercise0835 {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows in the matrix: ");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[][] matrix = new int[length][length];
		initMatrix(matrix, input);
		int[] positionAndSize = findLargestBlock(matrix);
		System.out.println("The maximum square is at "
				+ "("+positionAndSize[0]+","+positionAndSize[1]+") with size "+positionAndSize[2]);
		
		input.close();
	}
	
	public static void initMatrix(int[][] matrix,Scanner input) {
	//	Scanner input = new Scanner(System.in);
		System.out.println("Enter the matrix row by row:");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=input.nextInt();
			}
		}
		//input.close();
	}
	
	public static int[] findLargestBlock(int[][] matrix) {
		int size =2;
		int[] positionAndSize = new int[3];
		positionAndSize[0]=0;positionAndSize[1]=0;positionAndSize[2]=1;
		while(size<6) {
			int[][] subMatrix = new int[size][size];
			for(int i=0;i<matrix[i].length-size+1;i++) {
				for(int j=0;j<matrix.length-size+1;j++) {
					initSubMatrix(subMatrix, matrix[i][j]);
					if(isEqual(matrix, i, j, subMatrix)) {
						positionAndSize[0]=i;
						positionAndSize[1]=j;
						positionAndSize[2]=size;
					}
				}
			}
			size++;
		}
		return positionAndSize;
	}
	
	public static boolean isEqual(int[][] matrix,int row,int column,int[][] submatrix) {
		int i=0,j=0;
		int flag = 0;
		for(;i<submatrix.length;i++) {
			for(;j<submatrix[i].length;j++) {
				if(matrix[row+i][column+j]!=submatrix[i][j]) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
		return (i==submatrix.length && j==submatrix[0].length)?true:false;
	}
	
	public static void initSubMatrix(int[][] submatrix,int flag) {
		for(int i=0;i<submatrix.length;i++) {
			for(int j=0;j<submatrix[i].length;j++) {
				submatrix[i][j]=flag==0?0:1;
			}
		}
	}
	
	
	
	
}