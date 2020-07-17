import java.util.Scanner;

class ReadInput
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the Num:");
		byte num1=sc.nextByte();

		System.out.println("Enter the Number:");
		short num=sc.nextShort();
		
		System.out.println("Enter the Age:");
		int age=sc.nextInt();

		System.out.println("Enter the Mobile Number:");
		long mob=sc.nextLong();

		System.out.println("Enter the Percentage:");
		float per=sc.nextFloat();

		System.out.println("Enter the Average:");
		double avg=sc.nextDouble();

		System.out.println("Enter the Character:");
		char ch=sc.next().charAt(0); 

		System.out.println("Enter the boolean:");
		boolean bl=sc.nextBoolean();

		System.out.println("Enter the String:");
		String str=sc.next();

		System.out.println("Byte :"+num1);
		System.out.println("Short :"+num);
		System.out.println("Integer :"+age);
		System.out.println("long :"+mob);
		System.out.println("float :"+per);
		System.out.println("double :"+avg);
		System.out.println("char :"+ch);
		System.out.println("Boolean :"+bl);
		System.out.println("String :"+str);
		
	}
}