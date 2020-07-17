class Student {
	String Name;
	int rollNum;
	double perc;
	static String univercity;

	void attendedclasses() {
		System.out.println(" Attended classes");

	}
		
	void getStudentDetails() {
		System.out.println(" StudentDetails");
		System.out.println(this.Name+"\t"+this.rollNum+"\t"+this.perc+"\t"+this.univercity);
	}
}