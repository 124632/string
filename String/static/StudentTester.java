class StudentTester {
 	public static void main(String[] args)  {
	
	System.out.println("main method started");

	Student.univercity="VTU";
	System.out.println(Student.univercity);

	Student st= new Student();
	st.Name= "pruthvi";
	st.perc= 78.56;
	st.rollNum= 121;
	st.getStudentDetails();
	System.out.println(" -- - - - -- -");


	Student st1= new Student();
	st1.Name= "sushma";
	st1.perc= 67.79;
	st1.rollNum= 341;
	st1.getStudentDetails();
	System.out.println(" -- - - - -- -");

	System.out.println("main method ended");
	}
}