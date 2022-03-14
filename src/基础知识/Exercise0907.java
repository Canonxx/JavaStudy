package »ù´¡ÖªÊ¶;

import java.util.Date;



public class Exercise0907 {

}

class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreateDate ;
	public Account() {
		dateCreateDate = new java.util.Date();
	}
	
	public Account(int id,double balance) {
		this.id = id;
		this.balance = balance;
		dateCreateDate = new java.util.Date();
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public Date getDate() {
		return dateCreateDate;
	}
	
	public double getMonthlyInterest() {
		return balance*(annualInterestRate/1200);
	}
	
	public void withDraw(double count) { 
		balance =balance-count;
	}
	
	public void deposit(double count) {
		balance+=count;
	}
}