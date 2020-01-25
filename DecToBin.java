class DecToBin{

	public static void main(String[] args) {
		int whole = Integer.parseInt(args[0]);
		double fraction = Double.parseDouble(args[0]);
		int i, temp, binary[] = new int[10];
		fraction -= whole;
		for (i = 0 ; whole > 0 ; i++ ) {
			temp = whole % 2; 
			binary[i] = temp;
			whole /= 2; 
		}
		i--;
		for ( ; i>=0 ; i-- ) {					//loop to invert the order
			System.out.print(binary[i]);
		}
	}	 
}
