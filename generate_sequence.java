package array_programs;

import java.util.Arrays; // Import the Arrays utility class

class generate_sequence {

	public static void main(String[] args) {
		// Generate the sequence for n=4
		int[] arr = generate_sequence(4);

		// Print the contents of the array using Arrays.toString()
		System.out.println("Generated Sequence for n=4: " + Arrays.toString(arr));

		// Example of how to manually print the array elements
		System.out.print("Manual Print: ");
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	/**
	 * Generates an array containing the first n perfect squares.
	 * 
	 * @param n The number of squares to generate.
	 * @return An array of integers [1, 4, 9, ..., n*n].
	 */
	public static int[] generate_sequence(int n) {
		// Initialize an array of size n
		int[] arr = new int[n];

		// Loop from index 0 to n-1. 'a' represents the number being squared (1 to n).
		for (int index = 0, a = 1; index < arr.length; index++, a++) {
			arr[index] = a * a; // Assign the square of 'a' to the current index
		}
		return arr;
	}
}
