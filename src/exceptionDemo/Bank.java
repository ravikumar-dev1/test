package exceptionDemo;

public class Bank {
	
	int accBalance;
	
	public void depositMoney(int amount) {
		if(amount < 0)
			try {
				throw new NegativeDepositAmountException("You cant deposit negative amount");
			} catch (NegativeDepositAmountException e) {
				System.out.println(e.getMessage());
			}
		if(amount > 50000) {
			throw new PanCardNeededException();
		}
		accBalance += amount; //accBalance = accBalance + amount
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		bank.depositMoney(-100);
	}

}
