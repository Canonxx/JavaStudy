package ����֪ʶ.Exercise1108;

import java.util.ArrayList;
import java.util.Date;


public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreateDate ;
	private String name; 
	private ArrayList<Transaction> transactions = new ArrayList<>();
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Account() {
		dateCreateDate = new java.util.Date();
	}
	
	public Account(String name,int id,double balance) {
		this.id = id;
		this.balance = balance;
		this.setName(name);
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
		transactions.add(new Transaction('W', count, balance, "ȡ�"+count+"������Ϊ��"+balance));
	}
	
	public void deposit(double count) {
		balance+=count;
		transactions.add(new Transaction('D', count, balance, "��"+count+"������Ϊ��"+balance));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
