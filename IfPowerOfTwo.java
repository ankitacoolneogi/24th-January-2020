import java.util.Scanner;
import java.lang.*;
class IfPowerOfTwo{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the number: ");			
		Integer n=scan.nextInt();

		if(checkNumber(n))
		 System.out.println("It is a power of two");
		else
			System.out.println("It is not a power of two");

		}

		static boolean checkNumber(Integer n){
			if(n==0)
				return false;

				if((n&(n-1))==0)
					return true;
				return false;
			}

}
