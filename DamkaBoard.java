/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int row = 0; row < n; row++){
			if (row % 2 == 1) {
				System.out.print(" ");
			}
			for (int col = 0; col < n - 1; col++){
				System.out.print("* ");
			}
			if (row % 2 == 0) {
				System.out.println("* ");
			} else {
				System.out.println("*");
			}
		}
  	}
}