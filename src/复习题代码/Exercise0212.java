package ��ϰ�����;

import java.util.Scanner;

//����������ڶ���n������ڼ�
public class Exercise0212 {
	public static void main(String[] args) {
		System.out.print("Input the days:");
		Scanner input = new Scanner(System.in);
		int days = input.nextInt();
		int  nDays = (2+days)%7;
		System.out.print(days +"���������"+ nDays );	
		input.close();
	}

}
