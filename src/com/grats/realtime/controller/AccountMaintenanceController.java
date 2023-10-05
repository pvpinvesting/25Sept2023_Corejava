package com.grats.realtime.controller;

import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import com.grats.realtime.bean.AccountDetails;
import com.grats.realtime.service.AccountMaintenanceService;

public class AccountMaintenanceController {

	private static AccountMaintenanceService accManService=new AccountMaintenanceService();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Boolean flag=true;
		Integer option=5;
		String accNo="";
		String openingBal="";
		AccountDetails accDetl ;
		String errMsg = "";
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("***************Welcome to Account Management *******************");
		do{
			System.out.println("1. Account Creation");
			System.out.println("2. Account Balance");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Transfer");
			System.out.println("5. Exit");
			System.out.print("Please choose an option:");
			option = Integer.parseInt(scanner.next());
			switch(option) {
				case 1: System.out.print("1:Please enter an Account No:");
						accNo=scanner.next();
						accDetl = new AccountDetails();
						accDetl.setAccNo(accNo);
						System.out.print(":Please enter Opening Balance:");
						openingBal=scanner.next();
						accDetl.setBalance(openingBal);
						errMsg = accManService.createAccount(accDetl);
						if("".equals(errMsg)) {
							System.out.println(":Account Creation is successfull:");
						}
						break;
				case 2:
						System.out.print("2:Please enter an Account No:");
						accNo=scanner.next();
						accDetl = accManService.findAccountDetl(accNo);
						System.out.println(":Balance is:"+accDetl.getBalance());
						break;
				case 3:
						System.out.print("2:Please enter an Account No:");
						accNo=scanner.next();
						System.out.print(":Please enter an amount to deposit:");
						openingBal=scanner.next();
						accDetl = new AccountDetails();
						accDetl.setAccNo(accNo);
						accDetl.setBalance(openingBal);
						try {
							accManService.depositAmount(accDetl);
						} catch (AccountNotFoundException e) {
							System.err.println(e.getMessage());
						}
						break;
				case 5:
						flag=false;
						break;
				default:
						flag=false;
						break;
			}
		}while(flag);
		System.out.println("*************** Thanks for using the service *******************");
		}catch(Exception e) {
			System.err.println(""+e.getMessage());
			e.printStackTrace();
		}
	}

}
