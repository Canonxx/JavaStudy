package ��ϰ�����;

import java.util.Scanner;



public class �����嵥0402 {
	public static void main(String[] args) {
		System.out.println("�����������е����֣�");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine( );
		String s2 = input.nextLine();
		System.out.println(s1.compareTo(s2)>0 ?s2+" "+s1:s1+" "+s2);
		input.close();
	}
}
