package desafio_time;

public class Time {
	
 private String name;
 private int playersQuantity;
 private double accountBalance;
 
 public Time(String name, int playersQuantity,double accountBalance) {
	 this.name = name;
	 this.playersQuantity = playersQuantity;
	 this.accountBalance = accountBalance;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPlayersQuantity() {
	return playersQuantity;
}

public void setPlayersQuantity(int playersQuantity) {
	this.playersQuantity = playersQuantity;
}

public double getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
 
public void buyPlayer(double valueToBuy) {
	if(this.accountBalance > valueToBuy) {
		this.accountBalance -= valueToBuy;
		this.playersQuantity += 1;
	}
		
}
 

}
