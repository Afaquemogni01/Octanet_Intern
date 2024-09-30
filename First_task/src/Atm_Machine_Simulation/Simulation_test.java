package Atm_Machine_Simulation;

public class Simulation_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		Atm_simulation atm = new Atm_simulation(1000, 1234);
		atm.displaymenu();
		System.out.print(" enter the pin");
		int pin = Integer.parseInt(System.console().readLine());
		if(atm.validatePin(pin))
		{
			atm.displaymenu();
			int option =0;
			while(option!=5)
			{
				atm.displaymenu();
				option = Integer.parseInt(System.console().readLine());
				switch(option)
				{
				case 1:
					System.out.println("Balance"+ atm.getBalance());
					break;
				case 2:
					System.out.println("enter the amount");
					int amount =Integer.parseInt(System.console().readLine());
					atm.deposit(amount);
					break;
				case 3:
					System.out.println("enter the amount");
					amount =Integer.parseInt(System.console().readLine());
					atm.withdraw(amount);
					break;
					
				case 4:
					System.out.println("enter new pin");
					int newPin=Integer.parseInt(System.console().readLine());
					atm.changePin(newPin);
					break;
				case 5:
					System.out.println("Thank you for using the atm");
					break;
				default:
					System.out.println(" Invalid Input");
					System.exit(0);
				}
				
				
				
			}
			
		}
		else {
			System.out.println("you have entered Incorct pinc");
		}
		

	}

}
