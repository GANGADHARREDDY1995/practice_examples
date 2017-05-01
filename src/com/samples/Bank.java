package com.samples;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String bank_Name=scanner.next();
	/*//	if(bank_name==SbiBank){
			
		}
*/	}
}

interface AllBanks {
	public abstract void totalAmount();

	public abstract void deposit();

	public abstract void transfor();

	public abstract void loans();

	public abstract void withdrawal();
}

class SbiBank implements AllBanks {
	public static int sbi_Total_Amount;
	public static int sbi_Deposit_amount;
	public static int sbi_Transfor_Amount;
	public static float sbi_Intrest_Rate;
	public static int sbi_Withdrawal_amount;
	Scanner scanner;

	public void totalAmount() {
		System.out.println("total amount method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the amount");
		sbi_Total_Amount = scanner.nextInt();
		System.out.println("sbi total amount in sbi bank::::::" + sbi_Total_Amount);
	}

	public void deposit() {
		System.out.println("deposit method starting ");
		scanner = new Scanner(System.in);
		System.out.println("enter the deposite amount");
		Scanner scanner = new Scanner(System.in);
		sbi_Deposit_amount = scanner.nextInt();
		System.out.println("deposit amount is:::::::" + sbi_Deposit_amount);
		sbi_Total_Amount = sbi_Total_Amount + sbi_Deposit_amount;
		System.out.println("after deposit total sbi total amount::::::::::" + sbi_Total_Amount);
	}

	public void transfor() {
		System.out.println("transfor method starting ");
		scanner = new Scanner(System.in);
		System.out.println("enter the transfor amount");
		sbi_Transfor_Amount = scanner.nextInt();
		System.out.println("transfor amount is:::::::::::" + sbi_Transfor_Amount);
		sbi_Total_Amount = sbi_Total_Amount - sbi_Transfor_Amount;
		System.out.println(" after transfor sbi total amount is::::::::::::::" + sbi_Total_Amount);
	}

	public void loans() {
		System.out.println("loan method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the intrest rate");
		sbi_Intrest_Rate = scanner.nextFloat();
		float Sbi_Intrest_amount = (int) ((sbi_Total_Amount / 100) * sbi_Intrest_Rate);
		System.out.println("sbi intrest rate===" + Sbi_Intrest_amount);
		sbi_Total_Amount = (int) (sbi_Total_Amount + sbi_Intrest_Rate);
		System.out.println("after loan sbi total amount is:::::::::" + sbi_Total_Amount);
	}

	public void withdrawal() {
		System.out.println("enter the withdrawal amount");
		scanner = new Scanner(System.in);
		sbi_Withdrawal_amount = scanner.nextInt();
		System.out.println("wirthdrawal amount is ::::::::::::" + sbi_Withdrawal_amount);
		sbi_Total_Amount = sbi_Total_Amount - sbi_Withdrawal_amount;
		System.out.println("after withdrawal sbi total amouont is::::::::::" + sbi_Total_Amount);
	}

}

class HDFCBank implements AllBanks {
	public static int hdfc_Total_Amount;
	public static int hdfc_Deposit_amount;
	public static int hdfc_Transfor_Amount;
	public static float hdfc_Intrest_Rate;
	public static int hdfc_Withdrawal_amount;
	Scanner scanner;

	public void totalAmount() {
		System.out.println("total amount method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the amount");
		hdfc_Total_Amount = scanner.nextInt();
		System.out.println("hdfc total amount in sbi bank::::::" + hdfc_Total_Amount);
	}

	public void deposit() {
		System.out.println("hdfc deposit method starting ");
		scanner = new Scanner(System.in);
		System.out.println("enter the deposite amount");
		Scanner scanner = new Scanner(System.in);
		hdfc_Deposit_amount = scanner.nextInt();
		System.out.println("deposit amount is:::::::" + hdfc_Deposit_amount);
		hdfc_Total_Amount = hdfc_Total_Amount + hdfc_Deposit_amount;
		System.out.println("after deposit total hdfc total amount::::::::::" + hdfc_Total_Amount);
	}

	public void transfor() {
		System.out.println(" hdfctransfor method starting ");
		scanner = new Scanner(System.in);
		System.out.println("enter the transfor amount");
		hdfc_Transfor_Amount = scanner.nextInt();
		System.out.println("transfor amount is:::::::::::" + hdfc_Transfor_Amount);
		hdfc_Total_Amount = hdfc_Total_Amount - hdfc_Transfor_Amount;
		System.out.println(" after transfor hdfc total amount is::::::::::::::" + hdfc_Total_Amount);
	}

	public void loans() {
		System.out.println(" hdfc loan method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the intrest rate");
		hdfc_Intrest_Rate = scanner.nextFloat();
		float hdfc_Intrest_amount = (int) ((hdfc_Total_Amount / 100) * hdfc_Intrest_Rate);
		System.out.println("hdfc intrest rate===" + hdfc_Intrest_amount);
		hdfc_Total_Amount = (int) (hdfc_Total_Amount + hdfc_Intrest_Rate);
		System.out.println("after loan hdfc total amount is:::::::::" + hdfc_Total_Amount);
	}

	public void withdrawal() {
		System.out.println(" hdfc withdrawal method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the withdrawal amount");
		hdfc_Withdrawal_amount = scanner.nextInt();
		System.out.println("wirthdrawal amount is ::::::::::::" + hdfc_Withdrawal_amount);
		hdfc_Total_Amount = hdfc_Total_Amount - hdfc_Withdrawal_amount;
		System.out.println("after withdrawal hdfc total amouont is::::::::::" + hdfc_Total_Amount);
	}
}

class ICICIBank implements AllBanks {
	public static int icici_Total_Amount;
	public static int icici_Deposit_amount;
	public static int icici_Transfor_Amount;
	public static float icici_Intrest_Rate;
	public static int icici_Withdrawal_amount;
	Scanner scanner;

	public void totalAmount() {
		System.out.println("total amount method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the amount");
		icici_Total_Amount = scanner.nextInt();
		System.out.println(" total amount in icici bank::::::" + icici_Total_Amount);
	}

	public void deposit() {
		System.out.println("icici deposit method starting ");
		scanner = new Scanner(System.in);
		System.out.println("enter the deposite amount");
		Scanner scanner = new Scanner(System.in);
		icici_Deposit_amount = scanner.nextInt();
		System.out.println("deposit amount is:::::::" + icici_Deposit_amount);
		icici_Total_Amount = icici_Total_Amount + icici_Deposit_amount;
		System.out.println("after deposit total icici total amount::::::::::" + icici_Total_Amount);
	}

	public void transfor() {
		System.out.println("icici transfor method starting ");
		scanner = new Scanner(System.in);
		System.out.println("enter the transfor amount");
		icici_Transfor_Amount = scanner.nextInt();
		System.out.println("transfor amount is:::::::::::" + icici_Transfor_Amount);
		icici_Total_Amount = icici_Total_Amount - icici_Transfor_Amount;
		System.out.println(" after transfor icici total amount is::::::::::::::" + icici_Total_Amount);
	}

	public void loans() {
		System.out.println(" icici loan method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the intrest rate");
		icici_Intrest_Rate = scanner.nextFloat();
		float icici_Intrest_amount = (int) ((icici_Total_Amount / 100) * icici_Intrest_Rate);
		System.out.println("hdfc intrest rate===" + icici_Intrest_amount);
		icici_Total_Amount = (int) (icici_Total_Amount + icici_Intrest_Rate);
		System.out.println("after loan icici total amount is:::::::::" + icici_Total_Amount);
	}

	public void withdrawal() {
		System.out.println(" hdfc withdrawal method starting");
		scanner = new Scanner(System.in);
		System.out.println("enter the withdrawal amount");
		icici_Withdrawal_amount = scanner.nextInt();
		System.out.println("wirthdrawal amount is ::::::::::::" + icici_Withdrawal_amount);
		icici_Total_Amount = icici_Total_Amount - icici_Withdrawal_amount;
		System.out.println("after withdrawal icici total amouont is::::::::::" + icici_Total_Amount);
	}
}
