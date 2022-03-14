package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise1007 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] array = new Account[10];
		for(int i=0;i<array.length;i++) {
			array[i] = new Account();
			array[i].setId(i);
			array[i].setBalance(100);
		}
		int id;
		while(true) {
			do {
				System.out.print("Enter an id: ");
				id = input.nextInt();
				if(0<=id&&id<10) {
					break;
				} else {
					System.out.println("The id is invalid\nEnter an id: ");
				}
				
			}while(true);
			System.out.println();
			while(true) {
				System.out.println("Main menu\n"
								 + "1: check balance\n"
								 + "2: withdraw\n"
								 + "3: deposit\n"
								 + "4: exit");
				System.out.print("Enter a choice: ");
				int num = input.nextInt();
				if(num==1) {
					System.out.println("The balance is "+array[id].getBalance()+"\n");
				} else if(num==2) {
					System.out.print("Enter an amount to withdraw: ");
					double money = input.nextDouble();
					System.out.println();
					array[id].withDraw(money);
				} else if(num==3) {
					System.out.print("Enter an amount to deposit: ");
					double money = input.nextDouble();
					System.out.println();
					array[id].deposit(money);
				} else {
					System.out.println();
					break;
				}
			}
		}
	}
}
