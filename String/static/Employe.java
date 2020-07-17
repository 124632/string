class Employe  {
	String name;
	int empid;
	double salary;
	static String company;

	void  company() {
		System.out.println(" company");
	}

	void getEmployeDetails() {
		System.out.println(" EmployDetails");
		System.out.println(this.name+"\t"+this.empid+"\t"+this.salary+"\n"+this.company);

	}
}