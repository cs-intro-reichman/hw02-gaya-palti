import java.util.Random;

/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int child2 = 0;	
		int child3 = 0;	
		int child4 = 0;	
		int maxChild = 0;
		double children = 0;

		for (int i = 0; i < T; i++){
			boolean girl = false;
			boolean boy = false;
			int childInFam = 0;
			while (!boy || !girl){
				double rand = Math.random();
				if (rand <= 0.5) girl = true;
				else boy = true;
				children ++;
				childInFam ++;
			}
			if (childInFam == 2) child2 ++; 
			else if (childInFam == 3) child3 ++;
			else if (childInFam == 4) child4 ++;
		}

		maxChild = (Math.max(child2 , Math.max(child3 , child4)));
		if (maxChild == child2) maxChild = 2;
		else if (maxChild == child3) maxChild = 3;
		else if (maxChild == child4) maxChild = 4;
		
		System.out.println("Average: " + (children / T) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + child2);
		System.out.println("Number of families with 3 children: " + child3);
		System.out.println("Number of families with 4 children: " + child4);
		System.out.println("The most common number of children is " + maxChild + ".");
	}
}
