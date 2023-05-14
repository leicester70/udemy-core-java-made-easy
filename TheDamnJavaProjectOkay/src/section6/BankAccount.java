package section6;

public class BankAccount {
	
	static String bankName = "Sample Bank";
	String accountHolderName;
	String accountNumber;
	float balance;
	
	public static void main(String[] args) {
		
		double loanInterestRate = 7.5;
		
		System.out.println(BankAccount.bankName);
		BankAccount ba = new BankAccount();
		
		ba.accountHolderName = "Lester";
		ba.accountNumber = "12345678";
		ba.balance = 10000.23912f;
		
		System.out.println(ba.balance);
	}
}
