public class QuestionRunner {
	public static void main(String[] args) {
		int[] values1 = {1,2,3,4};
		int[] values2 = {4,3,2,1};
		int[] values3 = {1,2,3,5};
		System.out.println(arePermutations(values1,values2));
		System.out.println(arePermutations(values1,values3));
		// System.out.println(flip());
		// System.out.println(flip());
		// System.out.println(flip());
	}

	public static boolean arePermutations(int[] a, int[] b) {
		int correct = 0;
		for(int j = 0; j < a.length; j ++) {
			for(int k = 0; k < b.length; k ++) {
				if (a[j] == b[k]) {
					correct ++;
				}
			}
		}
		
		return correct == a.length;
	}

	public static String flip() {
		double prob = Math.random();
		if (prob > 0.66) {
			return "tails";
		}
		return "heads";
	}
}