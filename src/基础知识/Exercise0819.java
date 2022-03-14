package 基础知识;

import java.util.Scanner;

/*连续四个相等的数
 * 
 * 
 */
public class Exercise0819 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the row: ");
		int row = input.nextInt();
		System.out.print("Enter the column: ");
		int column = input.nextInt();
		int[][] values = new int[row][column];
		System.out.println("Enter the vaules: ");
		initValues(values, input);
		System.out.println(isConsecutiveFour(values));
	}
	
	public static void initValues(int[][] values,Scanner input) {
		//input = new Scanner(System.in);
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				values[i][j] = input.nextInt();
			}
		}
		//input.close();
	}
	
	public static boolean isConsecutiveFour(int[][] values) {
		boolean state = false;
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				int[] flag = {j+3<values[i].length?1:0,
							  i+3<values.length?1:0,
							  j-3>=0?1:0};
				state = (flag[0]==1?searchRight(values, i, j):false) || 
						(flag[1]==1?searchBelow(values, i, j):false) ||
						(flag[0]==1 && flag[1]==1?searchDiagonal(values, i, j):false) ||
						(flag[1]==1 && flag[2]==1?searchSubDiagonal(values, i, j):false);
				if(state==true) {
					break;
				}
			}
			if(state==true) {
				break;
			}
		}
		return state;
	}
	
	public static boolean searchRight(int[][] values,int row,int column) {
		int j;
		for(j=1;j<4;j++) {
			if(values[row][column]!=values[row][j+column]) {
				break;
			}
		}
		return j==4?true:false;
	}
	
	public static boolean searchBelow(int[][] values,int row,int column) {
		int i;
		for(i=1;i<4;i++) {
			if(values[row][column]!=values[row+i][column]) {
				break;
			}
		}
		return i==4?true:false;
	}
	
	public static boolean searchDiagonal(int[][] values,int row,int column) {
		int k ;
		for(k=1;k<4;k++) {
			if(values[row][column]!=values[row+k][column+k] ) {
				break;
			}
		}
		return k==4?true:false;
	}
	
	public static boolean searchSubDiagonal(int[][] values,int row,int column) {
		int k;
		for(k=1;k<4;k++) {
			if(values[row][column]!=values[row+k][column-k]) {
				break;
			}
		}
		return k==4?true:false;
	}
}
