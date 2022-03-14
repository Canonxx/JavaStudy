package »ù´¡ÖªÊ¶;

import java.util.Scanner;

public class Exercise0625 {
	public static void main(String[] args) { 
		System.out.println("Enter the number of millis:");
		Scanner input = new Scanner(System.in);
		long millis = input.nextLong();
		System.out.println(convertMillis(millis));
		input.close();
	}
	
	public static String convertMillis(long millis) {
		String str = "";
		long  hour = (int)(millis/3600000);
		long minutes = (int)(millis%360000/60000);
		long seconds = (int)(millis%360000%60000/1000);
		str += hour+":"+minutes+":"+seconds;
		return str;
	}
}
