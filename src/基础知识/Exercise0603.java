package ����֪ʶ;

import java.util.Scanner;


/*��������
 * reverse����
 * �Ƚ��Ƿ����
 * 
 * 
 * 
 */
public class Exercise0603 {
	public static void main(String[] args) {
		System.out.print("Enter an integer:");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
	//	System.out.print(reverse(integer));
		System.out.println(isPalindrome(integer)?"�ǻ�����":"���ǻ�����");
		input.close();
	}
	
	public static boolean isPalindrome(int integer) {
		return integer==reverse(integer)?true:false;
	}

	public static int reverse(int integer) {
		int reInt = 0;
		while (true) {
			reInt =reInt* 10 + integer%10;
			if(integer/10==0) {
				break;
			}
			else {
				integer/=10;
			}
		}
		return reInt;
	}
}
