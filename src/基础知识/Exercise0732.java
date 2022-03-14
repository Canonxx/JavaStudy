package »ù´¡ÖªÊ¶;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise0732 {
	public static void main(String[] args) {
		System.out.println("Enter the numbers:");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] list = new int[length];
		initlist(list, input);
		System.out.println(partition(list));
		System.out.println(Arrays.toString(list));
		input.close();
	}
	
	public static void initlist(int[] list,Scanner input) {
		for(int i=0;i<list.length;i++) {
			list[i] = input.nextInt();
		}
		//input.close();
	}
	
	public static int partition(int[] list) {
		int first = 0;
		//int last = list.length-1;
		int low = first + 1;
		int high = list.length - 1;
		while(high > low) {
			while(list[low]<=list[first] && low<=high) {
				low++;
			}
			while(list[high]>list[first] && low<=high) {
				high--;
			}
			if(list[low]>list[high] && low<= high) {
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		while(list[high]>list[first] && high>first) {
			high--;
		}
		
		if(list[high]<list[first]) {
			int temp = list[high];
			list[high] = list[first];
			list[first] = temp;
			return high;
		} else {
		 	return first;
		}
			
		//return
	}
}
