package Abstract_Class;

public class sample2 extends sample1 {
	public void show() {
		System.out.println("running show method");
	}
public void blank () {
	System.out.println("running blank method");
}
public static void main(String[] args) {
	sample2 D =new sample2 ();
	
	D.display();
	D.blank();
	D.show();

	
}
}
