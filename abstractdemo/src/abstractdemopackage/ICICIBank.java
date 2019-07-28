package abstractdemopackage;

public class ICICIBank extends RBIBank {
	
	void DepositRull() {
		System.out.println("ICICI DepositRull---1");
		System.out.println("ICICI DepositRull---1");
		System.out.println("ICICI DepositRull---1");
		
	}
	
	void DepositRate() {
		System.out.println("ICICI DepositeRate---10");
		System.out.println("ICICI DepositeRate---20");
		
	}
	
	void ICICIDepost()
	{
		System.out.println("ICICI Deposit");
	}
	void ICICIWithdrew()
	{
		System.out.println("ICICI Withdrew");
	}
	public static void main(String[] args) {
		ICICIBank icici= new ICICIBank();
		icici.CreatebankAccount();
		icici.ICICIDepost();
		icici.ICICIWithdrew();
		icici.DepositRate();
	}
}