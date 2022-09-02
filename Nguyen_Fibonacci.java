/* Name: Nguyen_Fibonacci
 * @author: Tran Nguyen
 * Description: Create the recursive fibonacci method and return the fibonacci sequence.
 */
 
import java.util.Scanner;

public class Nguyen_Fibonacci {
	
	static int n;

	/**
	 * @author Tran Nguyen
	 * @param n the value of number need to enter when the system run.
	 * @return the value of fibonacci sequence.
	 */
	public static long Fibonacci(int n) {
		if((n==0) || (n==1)) 
			return n;
		else
			return Fibonacci(n-1) + Fibonacci(n-2);
			
		}
	/**
	 * @author Tran Nguyen
	 * The main method.
	 * @param args 
	 * @return the result of fibonacci sequence.
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		n = scanner.nextInt();
		System.out.println("The " + n + "th term of the Fibonacci sequence is " + Fibonacci(n));
		
		
		

	}

}
