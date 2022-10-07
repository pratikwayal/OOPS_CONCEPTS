package Inheritance_type_Examples;

public class Super2 extends Super1{

	int a=130; // GV
	public void demo( ) {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		Super2 P= new Super2();
		P.demo();
		P.Test();
	}
}
