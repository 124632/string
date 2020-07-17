class EmployeTester {
	public static void main(String[] args)  {

	System.out.println(" main method started");

	Employe.company=" MARUTHI ";
	System.out.println(Employe.company);

	Employe em= new Employe();
	em.name= " asha";
	em.empid= 112;
	em.salary= 35000;
	em.getEmployeDetails();
	System.out.println(" - - - - -- - ");


	Employe em1= new Employe();
	em1.name= " kavya";
	em1.empid= 421;
	em1.salary= 42000;
	em1.getEmployeDetails();
	System.out.println(" - - - - -- - ");

	System.out.println(" main mathod ended");
	}
}