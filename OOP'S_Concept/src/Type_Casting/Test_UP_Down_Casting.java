package Type_Casting;

public class Test_UP_Down_Casting {

	public static void main(String[] args) {
		System.out.println("*****super class object*****");
		
		UP_Down H=new UP_Down() ;
		H.demo();
		H.set();
		H.statictest();
		
		System.out.println("*****subclass class object*****");
		Up_Down_one J= new Up_Down_one();
		J.demo();
		J.set();
		J.drop();
		J.statictest();
		
		System.out.println("*****upcasting hppen*****");
		
		UP_Down K= new Up_Down_one();
	K.demo();
	K.set();
	K.statictest();
	
	
	Up_Down_one sub = (Up_Down_one) new UP_Down();   // downcasting
	sub.demo();
	sub.set();
	
	
	
		
	}

		
	}

