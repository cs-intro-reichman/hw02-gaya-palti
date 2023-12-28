/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		int l = s.length();
		for (int i = l-1; i >= 0; i--) {
			System.out.print(s.charAt(i));}
		if (l % 2 == 0) {
			System.out.print("\nThe middle character is " + s.charAt((l - 1) / 2));
		} else {
			System.out.print("\nThe middle character is " + s.charAt(l / 2));
		}
	}
}
