package ����֪ʶ;

import java.util.Scanner;

/*�������ٰ�λ�ַ� length>=8
 * ������ܰ������ֺ���ĸ isDigitAndLetter()
 * ������������������	computeLetter()
 * 
 * 
 */
public class Exercise0618 {
	public static void main(String[] args) { 
		System.out.print("Enter your password:");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if(str.length()>=8&&isDigitAndLetter(str)&&computeDigit(str)>=2) {
			System.out.println("�����ʽ��ȷ");
		}
		else {
			System.out.println("�����ʽ����ȷ");
		}
		input.close();
	}
	
	public static boolean isDigitAndLetter(String str) {
		int countDigit = 0;
		int countLetter = 0;
		char[] array1 = new char[str.length()];
		array1 = str.toCharArray();
		for(char i : array1) {
			if('a'<=i && i<='z') {
				countLetter+=1;
			}
			if('0'<=i && i<='9') {
				countDigit+=1;
			}
		}
		return countDigit+countLetter==str.length()?true:false;
	}
	
	public static int computeDigit(String str) {
		char[] array1 = new char[str.length()];
		array1 = str.toCharArray();
		int countDigit = 0;
		for(char i:array1) {
			if('0'<=i && i<='9') {
				countDigit+=1;
			}
		}
		return countDigit;
	}
	
}
