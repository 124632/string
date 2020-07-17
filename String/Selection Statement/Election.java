import java.util.Scanner;

class Election
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
	
		if(age>=18){
			System.out.println("Eligible for voting...");
		}
		else{
			System.out.println("Sorry! You are Not Eligible for voting...");
		}
	}
}