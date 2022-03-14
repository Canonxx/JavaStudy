package »ù´¡ÖªÊ¶;

import java.util.Scanner;


public class Exercise0820 {
	public static void main(String[] args) {
		char[][] values = new char[6][7];
		enterGame(values);
	}
	
	public static void enterGame(char[][] values) {
		Scanner input = new Scanner(System.in);
		initValues(values, input);
		int numChess = 0;
		char[] players = {'R','Y'};
		int index=0;
		int flag = 0;
		int row=0,column=0;
		while(numChess<42) {
			showPattern(values);
			do {
				System.out.print("Drop a "+(index==0?"red":"yello")+" disk at row (0-5),column (0-6):");
				row = input.nextInt();
				column = input.nextInt();
				if(isValid(values, row, column)) {
					numChess++;
					changeValues(values, row, column, players[index]);
					if(isWin(values)) {
						System.out.println("The "+(index==0?"red":"yello")+" player win");
						showPattern(values);
						flag =1;
						break;
					} else {
						index = (index+1)%2;
						break;
					}
					
				} else {
					System.out.println("You input the invalid position,try again");
					System.out.print("Drop a "+(index==0?"red":"yello")+" disk at row (0-5),column (0-6):");
				}
			}while(!isValid(values,row ,column ));
			if(flag==1) {
				break;
			}
		}
		if(numChess==42) {
			System.out.println("It ends with a draw");
		}
		input.close();
	}
	
	public static void initValues(char[][] values,Scanner input) {
		//input = new Scanner(System.in);
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				values[i][j] = '\u0000';
			}
		}
		//input.close();
	}
	
	public static boolean isValid(char[][] values,int row,int column) {
		return values[row][column]=='\u0000'?true:false;
	}
	
	public static void changeValues(char[][] values,int row,int column,char c) {
		values[row][column] = c;
	}
	
	public static boolean isWin(char[][] values) {
		return isConsecutiveFour(values);
	}
	
	public static void showPattern(char[][] values) {
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				System.out.print("|"+values[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("---------------");
	}
	
	public static boolean isConsecutiveFour(char[][] values) {
		boolean state = false;
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				if(!isValid(values, i, j)) {
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
			}
			if(state==true) {
				break;
			}
		}
		return state;
	}
	
	public static boolean searchRight(char[][] values,int row,int column) {
		int j;
		for(j=1;j<4;j++) {
			if(values[row][column]!=values[row][j+column]) {
				break;
			}
		}
		return j==4?true:false;
	}
	
	public static boolean searchBelow(char[][] values,int row,int column) {
		int i;
		for(i=1;i<4;i++) {
			if(values[row][column]!=values[row+i][column]) {
				break;
			}
		}
		return i==4?true:false;
	}
	
	public static boolean searchDiagonal(char[][] values,int row,int column) {
		int k ;
		for(k=1;k<4;k++) {
			if(values[row][column]!=values[row+k][column+k] ) {
				break;
			}
		}
		return k==4?true:false;
	}
	
	public static boolean searchSubDiagonal(char[][] values,int row,int column) {
		int k;
		for(k=1;k<4;k++) {
			if(values[row][column]!=values[row+k][column-k]) {
				break;
			}
		}
		return k==4?true:false;
	}
}
