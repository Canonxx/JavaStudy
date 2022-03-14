package »ù´¡ÖªÊ¶.Exercise1108;

public class Test {
	public static void main(String[] args) {
		Account a1 = new Account("yanlong", 1001, 200);
		a1.deposit(50);
		a1.deposit(50);
		a1.withDraw(25);
		a1.withDraw(25);
		for(Transaction item:a1.getTransactions()) {
			System.out.println(item.getDescription());
		}
	}
}
