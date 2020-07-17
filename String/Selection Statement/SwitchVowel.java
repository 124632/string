import java.util.Scanner;

class SwitchVowel
{
	public static void main(String[] args)
	{
		System.out.println("Main method started...");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Vowels froms AEIOU :");
		char ch=sc.next().charAt(0);
		
		switch(ch)
		{
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;

			case 'A':
				System.out.println("Vowel");
				break;
			case 'E':
				System.out.println("Vowel");
				break;
			case 'I':
				System.out.println("Vowel");
				break;
			case 'O':
				System.out.println("Vowel");
				break;
			case 'U':
				System.out.println("Vowel");
				break;
			default: 
				System.out.println("Entered letter is Consonant");
			
		}

		System.out.println("Main method ended...");
	}
}