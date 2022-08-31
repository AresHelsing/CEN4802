
 
import java.util.Scanner;

public class Nguyen_Fibonacci {
	
	static int n;

	public static long Fibonacci(int n) {
		if((n==0) || (n==1)) 
			return n;
		else
			return Fibonacci(n-1) + Fibonacci(n-2);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		n = scanner.nextInt();
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + Fibonacci(n));
		
		
		

	}

}
