class StringDemo {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("java");
		String s3 = "java";
		String s4 = "sql";
		String s5 = "sql";
		String s6 = new String("java");

		boolean res = (s1==s2);
		System.out.println(res);

		res = (s2==s6);
		System.out.println(res);

		res = (s6==s3);
		System.out.println(res);

		res = (s1==s3);
		System.out.println(res);
	}
}