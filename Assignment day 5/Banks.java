
abstract class GeneralBank{
	
	
	abstract void getSavingsInterestRate();
	abstract void getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	
	void getSavingsInterestRate() {
		
		System.out.println("Saving interest rate of ICICI is 4%");
		
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit interest rate of ICICI is 8.5%");	
	}
	
	
}

class KotMBank extends GeneralBank{
	
void getSavingsInterestRate() {
		
		System.out.println("Saving interest rate of KotMBank is 6%");
		
	}
	void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit interest rate of KotMBank is 9%");	
	}
	
}



public class Banks {

	public static void main(String[] args) {
		ICICIBank i=new ICICIBank();
            i.getSavingsInterestRate();
            i.getFixedDepositInterestRate();
		 KotMBank k=new KotMBank();
              k.getSavingsInterestRate();
              k.getFixedDepositInterestRate();
		GeneralBank g=new KotMBank();
              g.getSavingsInterestRate();
              g.getFixedDepositInterestRate();
		GeneralBank h=new ICICIBank();
        h.getSavingsInterestRate();
        h.getFixedDepositInterestRate();

	}

}
