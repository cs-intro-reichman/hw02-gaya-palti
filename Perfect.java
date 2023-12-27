/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int divisors = 2; // we assume 1 is always a divisor 
		int sumDivisors = 1;
		String sumDivisorsString = n + " is a perfect number since " + n + " = " + 1 ;
		while (divisors < n){
			if ( n % divisors == 0) {
				sumDivisors += divisors;
            	sumDivisorsString += " + " + divisors;
			}
        	divisors++;
		}
		if (n == sumDivisors){System.out.println(sumDivisorsString);}
		else {System.out.println(n + " is not a perfect number");}
   }
}
