class PassFail{
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int sum = num3 + num2 + num1 ;
		if( num1 >= 40 )
		if( num2 >= 40 )
		if( num3 >= 40 )
		if( sum >= 125){
			System.out.print("PASSING");
			return;
		}
		System.out.print("FAILING");
	}
}