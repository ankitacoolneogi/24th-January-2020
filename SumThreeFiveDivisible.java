import java.util.Scanner;
import java.lang.*;
class SumThreeFiveDivisible{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the value of n: ");			
		int n=scan.nextInt();

		
		 System.out.println("The sum of N natural number(divisible by 3 or 5) is:  "+calculateSum(n));

		
	}

	static int calculateSum(int n){
			int sum=0;
			for(int i=1;i<=n;i++){
				if(i%3==0||i%5==0)
					sum+=i;
			}
			return sum;
	}

}