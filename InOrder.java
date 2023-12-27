/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
    int random1 = (int)(10 * Math.random());
	System.out.println(random1);
	int random2 = (int)(10 * Math.random());
	while (random2 >= random1){
			System.out.println(random2);
			random2 = (int)(10 * Math.random());
			if (random1 > random2){System.out.println("out");}
	}
	}
}

