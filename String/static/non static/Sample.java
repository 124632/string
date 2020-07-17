class Sample {
	int i;
	static int j;
	double a;
	static double b;
	static int k= 25;

	{
		i= 24;
		a=25;
		j= 100; //initialise ststic members possible, but not standard practise
		System.out.println(" non static block1....");
	}

	Sample() {
		System.out.println(" Default constructor.......");
	}

	{
		System.out.println(" non static block2....");
	}

}

class Tester {
	public static void main(String[] args) {
		System.out.println(" main method started.....");

		Sample s1= new Sample();
		System.out.println(s1.i+ " / n" +s1.a);

		Sample s2= new Sample();
		System.out.println(s2.i+ " / n " +s2.a);

		System.out.println(" main method ended.....");
	}
}

		
