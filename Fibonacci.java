class Fibonacci{
	public static void main(String[] args) {
		int i=1, j=1, next=0;
		System.out.print(i + "  "); 
		System.out.print(j + "  ");
		while((i+j)<=89){
			System.out.print((next=i+j) + "  ");
			i=j;
			j=next;
			
		}
	}
}