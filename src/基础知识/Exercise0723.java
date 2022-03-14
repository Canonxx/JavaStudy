package »ù´¡ÖªÊ¶;
/*
 * 
 * 
 */

public class Exercise0723 {
	public static void main(String[] args) { 
		final int NUMBEROFLOCKERS = 100;
		boolean[] lockers = new boolean[NUMBEROFLOCKERS];
		int number;
		changeLockers(lockers);
		number = countOpens(lockers);
		System.out.println(number);
		
	}
	
	public static void changeLockers(boolean[] lockers) {
		for(int i=0;i<lockers.length;i++) {
			lockers[i] = false;
		}
		for(int i=0;i<lockers.length;i++) {
			for(int j=i;j<lockers.length;j+=(i+1)) {
				lockers[j] = !lockers[j];
			}
		}
	}
	
	public static int  countOpens(boolean[] lockers) {
		int count = 0;
		for(int i=0;i<lockers.length;i++) {
			if(lockers[i] == true) {
				count++;
			}
		}
		return count;
	}
	
	
}
