package Inheritance_type_Examples;

public class super_this_2  extends super_this_1{
	int k=999;
	public void test () {
		int k=888;
		System.out.println(this.k);
		System.out.println(k);
		System.out.println(super.p);
		System.out.println(super.r);
		
	}
	public static void main(String[] args) {
		super_this_2 M = new super_this_2();
		
		M.test();
		System.out.println(M.k);
	}

}
