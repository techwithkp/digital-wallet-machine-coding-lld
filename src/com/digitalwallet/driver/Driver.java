package com.digitalwallet.driver;

import java.math.BigDecimal;
import java.util.Scanner;

import com.digitalwallet.service.WalletService;

public class Driver {
	public static void main(String[] args) {
		WalletService wService = new WalletService();
		Scanner sc = new Scanner(System.in);
		outer: while (true) {
			System.out.println("\nOPTIONS:");
			System.out.println("1. Create wallet");
			System.out.println("2. Transfer Amount");
			System.out.println("3. Account Statement");
			System.out.println("4. Overview");
			System.out.println("5. Exit");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("YOU SELECTED CREATE WALLET");
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter amount");
				BigDecimal amount = sc.nextBigDecimal();
				wService.createWallet(name, amount);
				break;

			case 2:
				System.out.println("YOU SELECTED TRANSFER");
				System.out.println("Enter SENDER account number");
				int from = sc.nextInt();
				System.out.println("Enter RECEIVER account number");
				int to = sc.nextInt();
				System.out.println("Enter amount");
				BigDecimal amount1 = sc.nextBigDecimal();
				wService.transfer(from, to, amount1);
				break;

			case 3:
				System.out.println("YOU SELECTED ACCOUNT STATEMENT");
				System.out.println("Enter account num");
				wService.statement(sc.nextInt());
				break;

			case 4:
				System.out.println("YOU SELECTED OVERVIEW");
				wService.overview();
				break;
				
			case 5:
				System.out.println("APPLICATION STOPPED");
				break outer;
				
			default:
				System.out.println("YOU HAVE SELECTED INVALID OPTION. PLEASE REENTER");
				break;
			}
		}
	}
}
