package interfacedemo;

public class ICICIBankclass implements CommonBankInterface,RBIBankInterface {

	
	void ICICIDepRule()
	{
		System.out.println("icici deposit rule");
	}
	public static void main(String[] args) {
	
		
		ICICIBankclass ic=new ICICIBankclass();
		ic.ICICIDepRule();
				ic.RBIDepRull();
	}

	
	public void RBIDepRull() {
		System.out.println("RBI deposit rule");
		
	}

	
	public void RBIDepRate() {
		System.out.println("RBIDEposit rate");
	}

	@Override
	public void ATMRequired() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CreateAccount() {
		// TODO Auto-generated method stub
		
	}

}
