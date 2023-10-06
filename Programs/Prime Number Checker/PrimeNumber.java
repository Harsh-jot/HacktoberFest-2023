import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
	
	public static boolean isPrime(int number) {
		boolean prime=true;
		int i=2;
		while (i<=Math.sqrt(number)){
			if ((number % i)==0 ){
				prime=false;
			}
			i++;
		}
    return prime;
}

	public static void main(String[] args){

		System.out.println ("Prime Number checker");
		System.out.println ("Please enter a number");
		Scanner s = new Scanner(System.in);
		String temp = s.next();
		
		try {
			Integer i = new Integer(temp);
					System.out.println ("number is an integer");
					System.out.println ("The statement 'the number is a prime' is "+isPrime(i));
		} catch (NumberFormatException i){
			System.out.println ("number is not an integer");
		}
		
		
		
	}

}
