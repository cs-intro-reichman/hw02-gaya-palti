/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int divisors = 1;
		int sumDivisors = 0;
		String sumDivisorsString = "";
		while (divisors < n){
		if ( n % divisors == 0) {
			System.out.println(divisors);
			sumDivisors = sumDivisors + divisors;
            sumDivisorsString = sumDivisorsString + " + " + divisors;
		}
        divisors++;
	}
	if (n == sumDivisors){System.out.println(n + " is a perfect number since " + n + " = " + sumDivisorsString);}
	else {System.out.println(n + " is not a perfect number");}
   }
}
