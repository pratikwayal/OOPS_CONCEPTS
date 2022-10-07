package Inheritance_type_Examples;

public class son extends father {   //inheritance operation
	public void Bike() {
		System.out.println("Bike");
		
	}
	public static void main(String[] args) {
		son x=new son();
		x.Bike();
		x.car();
		x.Home();
		x.Money();
	}

}
