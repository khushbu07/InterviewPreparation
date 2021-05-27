package InterfaceConcept;

public class HSBCBank implements USBank {
	
	public void credit() {
		
		System.out.println("HSBC-Credit");
	}
	
	public void debit() {
		
		System.out.println("HSBC-debit");
	}
	
	public void transferMoney() {
	
		System.out.println("HSBC-transferMoney");
		}
		
}
