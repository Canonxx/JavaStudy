package »ù´¡ÖªÊ¶;

import java.util.ArrayList;
import java.util.Scanner;


public class Exercise0814 {
	public static void main(String[] args) {
		int length;
		System.out.print("Enter the size for the matrix: ");
		Scanner input = new Scanner(System.in);
		length = input.nextInt();
		char[][] matrix =new char[length][length];
		initMatrix(matrix, input);
		searchMatrix(matrix);
		
	}
	
	public static void initMatrix(char[][] matrix,Scanner input) {
		for(int i=0;i<matrix.length;i++) {
			String s = input.next();
			for(int j=0;j<s.length();j++) {
				matrix[i][j] = s.charAt(j);
			}
		}
	}
	
	public static void searchMatrix(char[][] matrix) {
		ArrayList<int[]> rows = inRow(matrix);
		ArrayList<int[]> columns = inColumns(matrix);
		ArrayList<int[]> diaOrSubdia = inDiaOrSubdia(matrix);
		int i;
		for(i=0;i<rows.size();i++) {
			System.out.println("All "+rows.get(i)[0]+"s "+"on row "+rows.get(i)[1]);
		}
		if(i==0) {
			System.out.println("No same numbers on a row");
		}
		for(i = 0;i<columns.size();i++) {
			System.out.println("All "+columns.get(i)[0]+"s "+"on column "+columns.get(i)[1]);
		}
		if(i==0) {
			System.out.println("No same numbers on a column");
		}
		int m=0,n=0;
		for(i=0;i<diaOrSubdia.size();i++) {
			if(diaOrSubdia.get(i)[0]==0) {
				System.out.println("All "+diaOrSubdia.get(i)[1]+"s "+"on the major diagonal ");
				m++;
			}
			else {
				System.out.println("All "+diaOrSubdia.get(i)[1]+"s "+"on the sub-diagonal ");
				n++;
			}
		}
		if(i==0) {
			System.out.println("No same numbers on the major diagonal");
			System.out.println("No same numbers on the sub-diagonal");
		}
		else if (m==1&&n==0) {
			System.out.println("No same numbers on the sub-diagonal");
		}
		else if (m==0&&n==1) {
			System.out.println("No same numbers on the major diagonal");
		}
	}
	
	public static ArrayList<int[]> inRow(char[][] matrix) {
		ArrayList<int[]> rows = new ArrayList<int[]>();
	//	int[] temp = new int[2]; 
		for(int i=0;i<matrix.length;i++) {
			int j;
			for(j=0;j<matrix[i].length-1;j++) {
				if(matrix[i][j]!=matrix[i][j+1]) {
					break;
				}
			}
			if(j==matrix[i].length-1) {
			//	temp[0] = matrix[i][j]-'0';
			//	temp[1] = i;
				rows.add(new int[] {matrix[i][j]-'0',i});
			}	
		}
		return rows;
	}
	
	public static ArrayList<int[]> inColumns(char[][] matrix){
		ArrayList<int[]> columns = new ArrayList<int[]>();
		//int[] temp = new int[2]; 
		for(int i=0;i<matrix.length;i++) {
			int j;
			for(j=0;j<matrix[i].length-1;j++) {
				if(matrix[j][i]!=matrix[j+1][i]) {
					break;
				}
			}
			if(j==matrix[i].length-1) {
			//	temp[0] = matrix[j][i]-'0';
			//	temp[1] = i;
				columns.add(new int[] {matrix[j][i]-'0',i});
			}	
		}
		return columns;
	}
	
	public static ArrayList<int[]> inDiaOrSubdia(char[][] matrix){
		ArrayList<int[]> diaOrSubdia = new ArrayList<int[]>();
		//int[] temp = new int[2];
 		int i;
		for(i=0;i<matrix.length-1;i++) {
			if(matrix[i][i]!=matrix[i+1][i+1]) {
				break;
			}
		}
		
		if(i==matrix.length-1) {
			//temp[0] = 0;
			//temp[1] = matrix[i][i]-'0';
			diaOrSubdia.add(new int[] {0,matrix[i][i]-'0'});
		}
		
		for(i=0;i<matrix.length-1;i++) {
			if(matrix[i][matrix.length-1-i]!=matrix[i+1][matrix.length-1-i-1]) {
				break;
			}
		}
		if(i==matrix.length-1) {
			
			//temp[0] = 1;
			//temp[1] = matrix[i][matrix.length-1]-'0';
			diaOrSubdia.add(new int[] {1,matrix[i][matrix.length-1]-'0'});
		}
		return diaOrSubdia;
	
		
	}
	
	
}
