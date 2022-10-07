package GCV;

public class home {
	int a=99;
	static int z=11;
	public void add() {
		System.out.println("Method started");
	}
	public static void main(String[] args) {
	home D= new home();
	D.add();
	System.out.println(D.a);
	System.out.println(D.z);
	}

}
