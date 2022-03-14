package »ù´¡ÖªÊ¶;

public class Exercise0628 {
	public static void main(String[] args) {
		System.out.println("p\t\t2^p-1");
		System.out.println("---------------------");
		for(int i=0;i<=31;i++) {
			if(isPrimeNumber((int)Math.pow(2, i)-1)) {
				System.out.printf("%d\t\t%d\n",i,(int)(Math.pow(2, i)-1));
				//System.out.println('\n');
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
}
