class Sample {
	int i;
	static int j;
	double a;
	static double b;
	static int k;

	static {
		j = 13;
		b = 15.78;
		k=45;
		//a=100;  non Static can  be accessed in Static blocks 
		System.out.println(" static block1....");
	}


class Tester {
public static void main(String[] args) {
		System.out.println(" main method started....");

		System.out.println(j);
		System.out.println(b);
		
		System.out.println(" main method ended....");
	}
}

}