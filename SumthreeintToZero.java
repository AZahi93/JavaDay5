package day5;

public class SumthreeintToZero {

	static void ThreeIntegers(int[] arr, int n) {
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						found = true;
					}
				}
			}
		}

		if (found == false)
			System.out.println("it is not exist ");
	}

	public static void main(String[] args) {
		int arr[] = { 1, -2, 2, -4, 6 };
		int n = arr.length;
		ThreeIntegers(arr, n);
	}
}
