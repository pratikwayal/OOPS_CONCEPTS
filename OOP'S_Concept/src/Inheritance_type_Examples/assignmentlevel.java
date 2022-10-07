package Inheritance_type_Examples;

public abstract class assignmentlevel {
int a=2;
static int b=9;
int c=a+b;
public void add() {    // complete method
	System.out.println(c);
}
public abstract void multi();
public abstract void div();   // incomplete method

}
