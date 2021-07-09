public class Chikorita {
	public static void main(String[] args) {
		double[] heads = { 50.8, 54.1, 53.7, 50.1, 57.5, 59.1, 55.9, 55.1, 54.2, 56.2, 58.2, 55.9, 53.2, 55.9, 56.5,
				58.4, 53.5, 56.2, 56.1, 56.5, 53.3, 55.1, 57.1, 55.1, 55.9, 57.1, 57.2, 55.3, 57.9 };
		final double MEAN = 55.5551724138;
		final double STDEV = 2.09686606407;
		int headCount = 0;
		for (double head : heads) {
			if (head > MEAN - (2 * STDEV) && head < MEAN + (2 * STDEV)) {
				// customization here
				headCount++;
			}
		}
		System.out.println(headCount);
	}
}
