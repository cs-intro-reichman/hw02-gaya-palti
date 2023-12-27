/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
    	int oldRandom = (int)(10 * Math.random());
		System.out.println(oldRandom);
		int currentRandom = (int)(10 * Math.random());
		while (currentRandom >= oldRandom){
			System.out.println(currentRandom);
			oldRandom = currentRandom;
			currentRandom = (int)(10 * Math.random());
		}
	}
}

