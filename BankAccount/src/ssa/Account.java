package ssa;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Account {

	int checkAccountID;
	int savingsAccountID;
	String checkDescrip;
	String savingsDescrip;
	double checkingBalance;
	double savingsBalance;
	
	
	
	
	
	public void setChecking(int id, String description, double bal) {

		checkAccountID = id;
		checkDescrip = description;
		checkingBalance = bal;
	}

	public void setSavings(int id, String description, double bal) {

		savingsAccountID = id;
		savingsDescrip = description;
		savingsBalance = bal;
	}

	public void printChecking() {

		System.out.println("**************************************************************");
		System.out.println("AccountID \t\t Description \t\t Balance");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("  " + checkAccountID + "\t\t" + checkDescrip +"\t  " + "$" + String.format("%.2f", checkingBalance));
		System.out.println("**************************************************************");
		
	}

	public void printSavings() {

		System.out.println("**************************************************************");
		System.out.println("AccountID \t\t Description \t\t Balance");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("  " + savingsAccountID + "\t\t" + savingsDescrip +"\t  " + "$" + String.format("%.2f", savingsBalance));
		System.out.println("**************************************************************");
	}

	public double checkingDeposit(double deposit) {

		System.out.println("\nYou have successfully made a deposit of $" + String.format("%.2f", deposit));

		return checkingBalance += deposit;

	}

	public double checkingWD(double wd) {

		if (wd > checkingBalance) {
			System.out.println("Insufficient funds:: You attempted to make a withrdawal of $"
					+ String.format("%.2f", wd) + ".  Your account balance of $"
					+ String.format("%.2f", checkingBalance) + " is not enough to cover the withdrawal.");
			return checkingBalance;
		} else {
			System.out.println("\nYou have successfully made a withdrawal of $" + String.format("%.2f", wd));
			return checkingBalance -= wd;
		}

	}

	public double savingsDeposit(double deposit) {

		System.out.println("\nYou have made a deposit of " + String.format("%.2f", deposit));

		return savingsBalance += deposit;
	}

	public double savingsWD(double wd) {

		if (wd > savingsBalance) {
			System.out.println("Insufficient funds:: You attempted to make a withrdawal of $"
					+ String.format("%.2f", wd) + ".  Your account balance of $"
					+ String.format("%.2f", savingsBalance) + " is not enough to cover the withdrawal.");
			return savingsBalance;
		} else {
			System.out.println("\nYou have successfully made a withdrawal of $" + String.format("%.2f", wd));
			return savingsBalance -= wd;
		}

	}
	public double savTrans(double transAmt, double chkBal){
		
		if(savingsBalance >= transAmt){
		savingsBalance -= transAmt;
				
		 chkBal += transAmt;
		System.out.println("\n***You have successfully transferred  $" +String.format("%.2f", transAmt) + " from your Savings to your Checking account***\n");
		}
		else{
			System.out.println("\n***You do not have sufficient funds to make this transfer**\n");
		}
		return chkBal;
		
	}
	
	public void runText(String verbiage){
		int width = 100;
		int height = 20;

		// BufferedImage image = ImageIO.read(new
		// File("/Users/mkyong/Desktop/logo.jpg"));
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("SansSerif", Font.BOLD, 14));

		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString(verbiage, 0, 20);

		// save this image
		// ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));

		for (int y = 0; y < height; y++) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < width; x++) {

				sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

			}

			if (sb.toString().trim().isEmpty()) {
				continue;
			}

			System.out.println(sb);
		}

	}

		
	}



