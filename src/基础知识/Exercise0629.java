package »ù´¡ÖªÊ¶;

public class Exercise0629 {
	public static void main(String[] args) {
		for(int i=1,first=1,second=0;i<1000;i++) {
			if(isPrimeNumber(i)) {
				second = i;
				if(second-first!=2) {
					first = second;
				}
				if(second-first==2) {
					System.out.printf("(%d,%d)\n",first,second);
					first = second;
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
}
