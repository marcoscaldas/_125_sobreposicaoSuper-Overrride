package entities;

//public final class SavingsAccount extends Account{

public class SavingsAccount extends Account{ 
//	para evitar que seja criada subclasse acrescenta  "final"

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;		
	}
	
	@Override// override sobrepoe o metodo da classe super ideal é colocar o finnal no metodo
	
	//public final void withdraw(double amount) {  // final nao deixa otra classe chamar o metodo
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
}

