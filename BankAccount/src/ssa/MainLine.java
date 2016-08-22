package ssa;

public class MainLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account savings = new Account();
		Account checking = new Account();

		// Checking Details
		checking.runText("CHECKING");
		checking.setChecking(100, "My personal checking account", 500.00);
		checking.printChecking();
		checking.checkingDeposit(200.00);
		checking.printChecking();
		checking.checkingWD(600.00);
		checking.printChecking();
		checking.checkingDeposit(100.00);
		checking.checkingWD(300.00);
		checking.printChecking();
		checking.checkingWD(200.00);
		checking.printChecking();

		// Savings Details
		savings.runText("SAVINGS");
		savings.setSavings(200, "My personal savings account", 1000.00);
		System.out.println("\n");
		savings.printSavings();
		savings.savingsWD(750.00);
		savings.printSavings();
		savings.savingsWD(250.00);
		savings.printSavings();
		savings.savingsDeposit(200.00);
		savings.printSavings();

	    //Final Report
		savings.runText("REPORT");
		checking.printChecking();
		savings.printSavings();

	}

}
