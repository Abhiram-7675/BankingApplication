package BankingApp;
import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		
		BankAccount obj1= new BankAccount("Abhiram", "123");
		obj1.showMenu();

	}
}	

	class BankAccount
	{
		int balance;
		int previousTransaction;
		String customerName;
		String customerId;
		
		BankAccount(String cname, String cid)
		{
			customerName=cname;
			customerId=cid;
		}
		
		
		void deposit(int amount)
		{
			if(amount !=0)
			{
				balance=balance+amount;
				previousTransaction=amount;
			}
		}
		
		void withdraw(int amount)
		{
			if(amount!=0)
			{
				balance=balance-amount;
				previousTransaction=-amount;
			}
		}
		
		void getPreviousTransaction()
		{
			if(previousTransaction > 0)
			{
				System.out.println("Deposited : "+ previousTransaction);
	
			}
			else if( previousTransaction <0)
			{
				System.out.println("WithDrawn : "+ Math.abs(previousTransaction));
			}
			else
			{
				System.out.println("No Transaction Occurred");
			}
		}
		
		void showMenu()
		{
			char option='\0';
			Scanner input= new Scanner(System.in);
			
			System.out.println("Welcome "+customerName);
			System.out.println("Your Id is "+customerId);
			System.out.println("\n");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("D. Previous Transaction");
			System.out.println("E. Exit");
			
			do
			{
				System.out.println("----------------------------------------------");
				System.out.println("Enter an option");
				System.out.println("-----------------------------------------------");
				option=input.next().charAt(0);
				System.out.println("\n");
				
				switch(option)
				{
				  
				case 'A':
					System.out.println("-------------------------------------------");
					System.out.println("Balance= "+balance);
					System.out.println("-------------------------------------------");
					System.out.println("\n");
					break;
				case 'B':
					System.out.println("--------------------------------------------");
					System.out.println("Enter an amount to deposit");
					int amount=input.nextInt();
					deposit(amount);
					System.out.println("--------------------------------------------");
					System.out.println("\n");
					break;
				case 'C':
					System.out.println("--------------------------------------------");
					System.out.println("Enter an amount to withdraw");
					System.out.println("--------------------------------------------");
					int amount2=input.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("----------------------------------------------");
					getPreviousTransaction();
					System.out.println("----------------------------------------------");
					System.out.println("\n");
					break;
				
				default:
					System.out.println("Invalid option! Try again");
					break;
					
				}
			}while (option !='E');
			{
				System.out.println("Thankyou for using our services");
			}
			
			
		}
		
	}

