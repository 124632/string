class Tester {
	int i;
	Static int  x ;

	public satic void main(String[] args) {
		System.out.println(" main method started....");

		Tester t1 = new Tester();
		System.out.println(t1.i+"\n- - - - -");

		System.out.println(Tester.x);

		Tester t2 = new Tester();
		System.out.println(t2.i+"\n- - - - -");

		System.out.println(Tester.x);

		System.out.println(" main method ended....");
	}
	
	Tester() {
		System.out.println("Default constructor......");
	}

	Static {
		x=20;
		System.out.println(" static block1....");
	}

	{
		System.out.println(" non ststic block1..");
	}

	Static {
		System.out.println("satic block2...");
	}

	{
		i=11;
		System.out.println("non static block2....");
	}
} 
