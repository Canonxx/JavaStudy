package 基础知识;
/*回文素数
 * isPrimeNumber()
 */



public class Exercise0626 {
	public static void main(String[] arg) {
		int count=0;
		for(int i=1,j=0;;i++) {
			if(isPrimeNumber(i)&&isPalindrome(i)) {
				System.out.printf("%d  ",i);
				j++;
				count++;
				if(count == 100) {
					break;
				}
			}
			if(j==10) {
				System.out.println("\n");
				j=0;
			}	
		}
		
	}
	
	public static boolean isPrimeNumber(int integer) {
		int count=0;
		for(int i=1;i<=integer;i++) {
			if(integer%i==0) {
				count++;
				//break;
			}
		}
		return count==2?true:false;
	}
	
	public static boolean isPalindrome(int integer) {
		return integer==reverse(integer)?true:false;
	}

	public static int reverse(int integer) {
		int reInt = 0;
		while (true) {
			reInt =reInt* 10 + integer%10;
			if(integer/10==0) {
				break;
			}
			else {
				integer/=10;
			}
		}
		return reInt;
	}
}
