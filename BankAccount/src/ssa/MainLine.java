package ssa;

public class MainLine {

	public static void main(String[] args) {

               
       
    Savings newSavings = new Savings();
    newSavings.deposit(100.00);
   
    newSavings.setInterestRate(1.0);
    newSavings.CalcDepositInterest(6);
   
  
   // newSavings.deposit(newSavings.CalcDepositInterest(4));
  
    
    
    
   
   //System.out.println(newSavings.getBalance());
   System.out.println(newSavings.print());
	}

}
