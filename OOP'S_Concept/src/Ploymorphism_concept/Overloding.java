package Ploymorphism_concept;

public class Overloding {    // overloding happen in same class
	
	public void add ( int a , int b) {
		System.out.println("addition =" + (a+b));
		
	}
public void add (int a, int b,int c ) {
	System.out.println("addition =" + (a+b+c));
	
}
 public static void main(String[] args) {
	Overloding H = new Overloding ();
	
	H.add(200, 300);
	H.add(310, 320, 330);
}

 }
