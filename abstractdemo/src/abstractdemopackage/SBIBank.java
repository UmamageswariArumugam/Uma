package abstractdemopackage;

public class SBIBank extends RBIBank{
	void SBIDepost()
	{
		System.out.println("SBI Deposit");
	}
	
	void SBIWithdrew()
	{
		System.out.println("SBI Withdrew");
	}
	public static void main(String[] args) {
		SBIBank sbi= new SBIBank();
		sbi.SBIDepost();
		sbi.SBIWithdrew();
	}

	@Override
	void DepositRull() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void DepositRate() {
		// TODO Auto-generated method stub
		
	}



}
