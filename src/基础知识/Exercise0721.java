package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0721 {
	public static void main(String[] args) {
		System.out.println("Enter the number of balls to dorps:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] pathStrings = new String[n];
		System.out.println("Enter the number of slots in the bean machine:");
		int m = input.nextInt();
		int[] slots = new int[m];
		inputPath(pathStrings);
		initArray(slots, pathStrings);
		showPattern(slots, n);
		input.close();
	}
	
	public static void initArray(int[] slots,String[] path) {
		for(int i=0;i<path.length;i++) {
			int count = 0;
			for(char j:(path[i]).toCharArray()) {
				if(j=='R') {				
					count+=1;
				}
			}
			slots[count]+=1;
		}
	}
	
	public static void inputPath(String[] path) {
		System.out.println("Enter the path:");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<path.length;i++) {
			path[i] = input.next();
		}
		input.close();
	}
	
	public static void showPattern(int[] slots,int max) {
		for(int i=max;i>0;i--) {
			for(int j=0;j<slots.length;j++) {
				if(slots[j]>=i) {
					System.out.print("0");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
