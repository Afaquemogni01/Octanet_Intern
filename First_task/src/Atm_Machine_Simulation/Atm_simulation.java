package Atm_Machine_Simulation;

public class Atm_simulation {
 
	private int balance;
	private int pin;
	
	public Atm_simulation(int balance ,int pin)
	{
		this.balance=balance;
		this.pin=pin;
	}
	
	public void displaymenu()
	{
		System.out.println(" 1: check balacne");
		System.out.println("2 : Deposit");
		System.out.println("3 : Withdraw");
		System.out.println(" 4 : Change Pin");
		System.out.println(" 5 : Exit");
		
	}
	public void deposit(int amount)
	{
		balance= balance+amount;
		System.out.println("Balance Deposited \n"+ "current balance"+balance);
	}
	public void withdraw(int amount)
	{
		if(balance<amount)
		{
			System.out.println("Insuffiecient balnace");
			return;
		}
		balance =balance-amount;
		System.out.println(" Amount Withdrawn"+amount);
		
	}
	
	public int getBalance()
	{
		return balance;
	}
	public boolean validatePin(int pin)
	{
		return this.pin==pin;
	}
	
	
	public void changePin(int newPin)
	{
		this.pin=newPin;
		System.out.println(" your atm pin is changed");
	}

}
