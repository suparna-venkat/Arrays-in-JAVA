package array_programs;
/*
 * max sum sub arrays of size k
 * input: arr=[2,1,5,1,3,2]
 * k=3 --> n-k+1
 * op= 9
 * [2,1,5]=8
 * [1,5,1]=7
 * [5,1,3]=9
 * [1,3,2]-6
 */

public class max_sum_sub_arrays {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		int maxSum = max_sum(arr, k);
		System.out.println(maxSum);
	}

	public static int max_sum(int[] arr, int k) {
		int n = arr.length;
		if (n < k) {
			return 0;
		}

		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}

		int maxSum = windowSum;

		for (int i = k; i < n; i++) {

			windowSum += arr[i] - arr[i - k];

			if (windowSum > maxSum) {
				maxSum = windowSum;
			}
		}

		return maxSum;
	}
}