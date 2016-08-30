package ssa;

public class Checking extends Account {
	
	private static int lastCheckNbr = 100;
	
	
	
	public int withdrawChecking(double amt){
		
		super.withdraw(amt);
		return lastCheckNbr++;
			
	}
	
	

}
