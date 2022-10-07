package Inheritance_type_Examples;

public class assignmentlevel2 extends assignmentlevel {
	
	public void multi() {
		c=a*b;
		System.out.println(c);
	}
public void div() {
	c=a/b;
	System.out.println(c);
}
public static void main(String[] args) {
	assignmentlevel2 H=new assignmentlevel2();
	H.add();
	H.multi();
	H.div();
	System.out.println(b);
}
}
