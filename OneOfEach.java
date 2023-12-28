
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean girl = false;
		boolean boy = false;
		String child = "";
		int children = 0;
		while (!boy || !girl){
			double rand = Math.random();
			if (rand <= 0.5){
				child += "g ";
				girl = true;
			} else {
				child += "b ";
				boy = true;
			}
			children ++;
		}
		System.out.println(child);
		System.out.println("You made it... and you now have " + children + " children.");
	}
}
