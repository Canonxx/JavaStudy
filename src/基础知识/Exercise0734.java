package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0734 {
	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner input = new Scanner(System.in);
		String s = new String(input.next());
	//	System.out.print(s);
		s= sort(s);
		System.out.println(s);
		input.close();
		
		
	}
	
	public static String sort(String s) {
		char[] array = new char[s.length()];
		array = s.toCharArray();
		for(int i=0;i<array.length-1;i++) {
			for(int j =i+1 ;j<array.length;j++) {
				if(array[i]>array[j]) {
					char temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		String s1 = new String(String.valueOf(array));
		return s1;
	}
}
