package Inheritance_type_Examples;

public class super_this_1 {
static int p=111;
int r=222;

public void wayal() {
	int p=333;
	int r=444;
	int q=p+r;
	
	System.out.println(this.p);
	System.out.println(this.r);
	System.out.println(p);
	System.out.println(r);
	System.out.println(q);
}
public static void main(String[] args) {
	
	super_this_1 X= new super_this_1();
	
	X.wayal();
	System.out.println(X.p);
	System.out.println(X.r);
	
}
	
	
}

