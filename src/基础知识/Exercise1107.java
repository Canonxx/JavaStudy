package »ù´¡ÖªÊ¶;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1107 {
	public static void  main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = 1;
		int temp = m;
		for(int i=2;i<=temp;i++) {
			while(temp%i==0) {
				arrayList.add((Integer)i);
				temp/=i;
			}
		}
		for(int i=0;i<arrayList.size();i++) {
			int count = 1;
			while(i<=arrayList.size()-2 && arrayList.get(i)==arrayList.get(i+1)) {
				count++;
				i++;
			}
			if(count%2==1) {
				n*=arrayList.get(i);
			}
		}
		System.out.println(n);
		input.close();
	}
}
