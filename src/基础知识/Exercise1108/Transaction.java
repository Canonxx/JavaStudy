package »ù´¡ÖªÊ¶.Exercise1108;

import java.util.Date;

public class Transaction {
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBanlance() {
		return banlance;
	}
	public void setBanlance(double banlance) {
		this.banlance = banlance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private char type;
	private double amount;
	private double banlance;
	private String description;
	public Transaction(char type,double amount,double banlance,String description) {
		this.type = type;
		this.amount = amount ;
		this.banlance = banlance ;
		this.description = description;
		this.date  = new Date();
	}
	
}
