package array_programs;

/*
 * avg sub arrays of size k
 * input: arr=[2,1,5,1,3,2]
 * k=3, x=3
 * op= 1
 * average
 * [2,1,5]=8/k -> 8/3=2.6
 * [1,5,1]=2.5
 * [5,1,3]=3
 * [1,3,2]=2
 * count =1
 */

class subarr_average_greater_than_x {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 1, 3, 2 };
		System.out.println(average(arr, 3, 3));

	}

	public static int average(int[] arr, int k, int x) {
		int n = arr.length;
		int count = 0;

		// default window
		int windowSum = 0;
		for (int i = 0; i <= k; i++) {
			windowSum += arr[i];

		}
		int avg = windowSum / k;
		if (avg > x) {
			count++;
		}
		for (int i = 1; i < n - k + 1; i++) {
			windowSum = windowSum - arr[i - 1] + arr[i + k - 1];
			avg = windowSum / k;
			if (avg >= x) {
				count++;
			}
		}
		return count;
	}
}
