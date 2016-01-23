public class phraseO {

	public static void main (String[] args) {

		String[] wordList1 = {"all", "100%", "cloud-based", "headless", "IRQ"};
		String[] wordList2 = {"aligned", "fully", "integerated", "multi-platform", "free and open source"};
		String[] wordList3 = {"event horizon", "application", "cold-fusion", "deadlock", "starship"};

		// get their lengths
		int len1 = wordList1.length;
		int len2 = wordList2.length;
		int len3 = wordList3.length;

		


		// build a phrase and print it

		int counter = 5;

		while (counter > 0) {
			// generate three random nums
			int rand1 = (int) (Math.random() * len1);
			int rand2 = (int) (Math.random() * len2);
			int rand3 = (int) (Math.random() * len3);

			String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordList3[rand3];

			System.out.println(phrase);

			counter--;
		}
	}
}