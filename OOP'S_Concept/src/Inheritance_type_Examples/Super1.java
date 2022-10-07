package Inheritance_type_Examples;

public class Super1 extends Super{
	int a=90; // global variable
	public void Test() {
		int a=80;  // local variable
		System.out.println(a);  // local varirable from same class
		System.out.println(this.a); // globale varibale from same class
		System.out.println(super.a); // global variable from super class or diff class
	}
	public static void main(String[] args) {
		Super1 K=new Super1();
		K.Test();
	}

}
