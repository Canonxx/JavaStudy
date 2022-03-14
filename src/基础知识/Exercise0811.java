package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0811 {
	public static void main(String[] args) {
		System.out.print("Enter a number between 0 and 511 :");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		char[][] matrix = new char[3][3];
		showMatrix(binaryString(num), matrix);
		input.close();
	}
	
	public static String binaryString(int num) {
		String binaryString =  Integer.toBinaryString(num);
		int bit = binaryString.length();
		if(binaryString.length()<9) {
			for(int i = 0;i<9-bit;i++) {
				binaryString = "0"+binaryString;
				//System.out.println(binaryString);
			}
		}
		//System.out.println(binaryString.length());
		return binaryString;
	}
	
	public static void showMatrix(String num,char[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j] = num.charAt(i*3+j)=='0'?'H':'T';
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(j<matrix[i].length-1)
					System.out.print(matrix[i][j]+" ");
				else {
					System.out.print(matrix[i][j]+"\n");
				}
			}
		}
	}
}
