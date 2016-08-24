package ssa;

public class Savings extends Account {

	double interestRate;
	boolean isBelowMin;
	double totIntPaid;

	
	public double getTotIntPaid() {
		return totIntPaid;
	}

	public Savings() {

		setBelowMin(false);

	}

	public boolean isBelowMin() {
		return isBelowMin;
	}

	public void setBelowMin(boolean isBelowMin) {
		this.isBelowMin = isBelowMin;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double CalcDepositInterest(int months) {
	
		if (isBelowMin() == false){
			double amount = (((getInterestRate())/12)*months) * this.getBalance();
			super.deposit(amount);
			totIntPaid += amount;
			return amount; ///This was added in case you would like to pass as a parameter in the deposit method directly
	   }
		else{
			return 0.00;
			}
				}
public String print(){
	
	return super.print() + " the total interest paid to date on the account is: $" + String.format("%.2f",getTotIntPaid());
}
}