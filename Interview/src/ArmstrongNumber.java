
public class ArmstrongNumber {

	//armstrong number
	//153=1*1*1 + 5*5*5+ 3*3*3
	public static void isArmstrong(int num) {
	
	int cube=0;
	int r;
	int t ;
	
	t=num;
	
	while(num>0) {
		r=num%10;
		num= num/10;
		cube=cube+(r*r*r);
	}
	
	if (t==cube) {
	System.out.println("this is an armstrong number");
	}
	else {
		System.out.println("this is not an armstrong number");
	}
	}
	
	
	
	public static void main(String[] args) {
		isArmstrong(153);
		isArmstrong(370);
		isArmstrong(371);
		isArmstrong(334);
	}

}
