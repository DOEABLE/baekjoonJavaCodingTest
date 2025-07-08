package baekjoon;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		System.out.println(binarySearch(arr, 9));
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		int count = 0;
		while (left <= right) {

			int mid = (left + right) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				right = mid - 1;
				count++;
			} else {
				left = mid + 1;
				count++;
			}
		}
		return count;
	}
}


