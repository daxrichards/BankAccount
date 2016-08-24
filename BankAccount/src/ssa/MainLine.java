package ssa;

public class MainLine {

	public static void main(String[] args) {

               
       
    Savings newSavings = new Savings();
    newSavings.deposit(500.00);
    newSavings.deposit(-1500.00);
    newSavings.setInterestRate(.015);
    newSavings.CalcDepositInterest(4);
   
  
   // newSavings.deposit(newSavings.CalcDepositInterest(4));
  
    
    
    
   
   //System.out.println(newSavings.getBalance());
   System.out.println(newSavings.print());
	}

}
