public class Bottles {

	public static void main (String[] args) {

		int nBottles = 99;
		String word = "bottles";

		while (nBottles > 0) {

			if (nBottles == 1) {
				word = "bottle";
			}

			System.out.println(nBottles + " " + word + " of beer on the wall");
			System.out.println(nBottles + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			nBottles--;

			if (nBottles > 0) {
				if (nBottles == 1) {
				word = "bottle";
				}
				System.out.println(nBottles + " " + word + " of beer on the wall");
			} 
			else {
				System.out.println("No more bottles of beer on the wall");
			}

		}
	}
}