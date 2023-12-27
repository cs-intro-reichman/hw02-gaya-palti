/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int divisors = 1;
		while (divisors < x){
		//System.out.println("d " + d);
		if ( x % divisors == 0) {System.out.println(divisors);}
        divisors++;
	}
  }
}
