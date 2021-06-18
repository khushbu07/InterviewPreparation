package SimplePractice;

public class Instance {

	public static void main(String[] args) {
		 display(); //calling without object
		
		 
		 Instance t = new Instance();
		 t.show(); //calling using object
		 }
		 static void display() {
		 System.out.println("Programming is amazing.");
		 }
		 void show(){
		 System.out.println("Java is awesome.");
		 } 
		 
}