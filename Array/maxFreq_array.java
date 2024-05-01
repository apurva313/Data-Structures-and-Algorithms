public class maxFreq_array {

	public static int mostFrequent(int[] arr, int n) {
		int maxcount = 0;
		int element_having_max_freq = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}

			if (count > maxcount) {
				maxcount = count;
				element_having_max_freq = arr[i];
			}
		}

		return element_having_max_freq;
	}

	// Driver program
	public static void main(String[] args) {
		int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
		int n = arr.length;
		System.out.print(mostFrequent(arr, n));
	}
}

