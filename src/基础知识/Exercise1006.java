package 基础知识;


import 基础知识.Exercise1005.StackOfIntegers;
import 基础知识.Exercise1005.Test;

public class Exercise1006 {
	public static void main(String[] args) {
		StackOfIntegers s = new StackOfIntegers(120);
		for (int i = 0; i < 120; i++) {
			if(Test.isPrimeNumber(i)) {
				s.push(i);
				//System.out.print(i+" ");
			}
		}
		int size = s.getSize();
		for (int i = 0; i < size; i++) {
			System.out.print(s.pop()+" ");
		}
	}
}
