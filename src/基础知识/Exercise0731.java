package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0731 {
	public static void main(String[] args) {
		System.out.println("Enter the list1:");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] list1 = new int[length];
		initlist(list1,input);
		System.out.println("Enter the list2:");
		length = input.nextInt();
		int[] list2 = new int[length];
		initlist(list2,input);
		int[] list3 = new int[list1.length+list2.length];
		list3 = merge(list1, list2);
		System.out.print("The merge list:");
		for(int i:list3) {
			System.out.print(i+" ");
		}
		input.close();
		
	}
	
	public static void initlist(int[] list,Scanner input) {
		for(int i=0;i<list.length;i++) {
			list[i] = input.nextInt();
		}
		//input.close();
	}
	
	public static int[] merge(int[] list1,int[] list2) {
		
		int[] list3 = new int[list1.length+list2.length];
	//	int maxLength = list1.length>list2.length?list1.length:list2.length;
	//	int minLength = list1.length<list2.length?list1.length:list2.length;
		int i,j,count;
		for(i=0,j=0,count=0;i<list1.length && j< list2.length;) {
			if(list1[i]<list2[j]) {
				list3[count] = list1[i];
				i++;
				count++;
			}
			else {
				list3[count] = list2[j];
				j++;
				count++;
			}
		}
		if(i==list1.length) {
			for(;j<list2.length;j++) {
				list3[count] = list2[j];
				count++;
			}
		}
		if(j==list2.length) {
			for(;i<list1.length;i++) {
				list3[count] = list1[i];
				count++;
			}
		}
		return list3;
	}
}
