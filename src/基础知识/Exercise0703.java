package ����֪ʶ;


import java.util.Scanner;

/*�������ֳ��ֵĴ���
 * ����һ������Ԫ��Ϊ�����ĸ�����
 * 
 */
public class Exercise0703 {
	public static void main(String[] args) {
		int[] array = new int[100]; 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100:");
		int a=1;
		while(true) {
			a = input.nextInt();
			if(a==0) {
				break;
			}
			array[a-1]+=1;
		}
		for (int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				System.out.printf("%d occurs %d times\n",i+1,array[i]);
			}
		}
		input.close();
	}
	
	
}
