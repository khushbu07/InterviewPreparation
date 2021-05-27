package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		
		USBank b=new HSBCBank();
		
		//new HSBCBank();==child class object
		//b=parent interface reference variable
		
		b.credit();
		
		System.out.println(USBank.minbal);
		
		//Interface variable like b static nature so called by class name and can not change the value of the variable
		
		
	}

}
