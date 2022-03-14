package 基础知识;
/*反素数
 * 
 * 
 */
public class Exercise0627 {
	public static void main(String[] args) {
		for(int i=0,j=0,count=0;;i++) {
			if(isPrimeNumber(i)&&!isPalindrome(i)&&isPrimeNumber(reverse(i))) {
				j++;
				count++;
				System.out.print(i+"  ");
				if(j==10) {
					System.out.println("\n");
					j=0;
				}
				if(count==100) {
					break;
				}
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
