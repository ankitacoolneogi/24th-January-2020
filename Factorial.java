class Factorial{
	public static void main(String[] args) {
		int fact = 1;
		for (int i = Integer.parseInt(args[0]) ; i>0 ; i-- ) {
			fact *= i;
		}
		System.out.print("THE RESULT IS :: " + fact);	
	}
}