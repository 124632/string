import java.util.Scanner;

class Grades
{
	public static void main(String[] args)
	{
		System.out.println("main method Started...");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Grades: ");
		double perc=sc.nextDouble();
	
		if(perc>=71){
			System.out.println("First Class with Distriction");
		}
		else if(perc>=60 && perc<=70){
			System.out.println("First Class");
		}
		else if(perc>=50 && perc<60){
			System.out.println("Second Class");
		}
		else if(perc>=35 && perc<50){
			System.out.println("PASS");
		}
		else {
			System.out.println("Fail");
		}

		System.out.println("main method ended...");
	}
}