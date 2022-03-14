package 基础知识.Exercise1005;

import java.util.Scanner;

//显示素数因子
public class Test {
	public static void main(String[] args) {
		StackOfIntegers s = new StackOfIntegers();
		System.out.println("input a num: ");
		Scanner input=new Scanner(System.in);
		input.close();
		int num = input.nextInt();
		int value = num;
		
		int i;
		for (i=1; i < value; i++) {
			//System.out.println(i);
			if (value%i==0) {
				if (i==1 && isPrimeNumber(value)) {
					s.push(value);
					break;
				} else if (isPrimeNumber(i)&&isPrimeNumber(value/i)) {
					s.push(i);
					s.push(value/i);
					break;
				} else if (isPrimeNumber(i)&&!isPrimeNumber(value/i)) {
					value=value/i;
					s.push(i);
					i=0;
				}
			}
			//System.out.println(value);
		}
		int size = s.getSize();
		for (int j = 0; j < size; j++) {
			System.out.print(s.pop()+" ");
		}
			
		
		
	}
	public static boolean isPrimeNumber(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
		return	count==2?true:false;
	}
}
