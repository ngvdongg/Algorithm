package Algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
	private static int binarySearch(int a[], int l, int r, int x) {
		if (l <= r) {
//			int mid = l + (r - 1) / 2;
			int mid = (l + r) / 2;
			if (x == a[mid]) {
				return mid;
			}
			if (a[mid] > x) {
				return binarySearch(a, l, mid - 1, x);
			}
			if (a[mid] < x) {
				return binarySearch(a, mid + 1, r, x);
			}
		}
		return -1;

	}

	public static void main(String[] args) {
//		int a[] = { 4, 7, 8, 9, 10, 15, 20 };
		Random rand = new Random();
		int size = 1000000;
		int a[] = new int[size];

		for (int i = 0; i < size - 1; i++) {
			a[i] = rand.nextInt(size - 1);
//			a[i]=i;
		}
		Arrays.sort(a);
//		for (int i : a) {
//			System.out.println(a[i]);
//		}
		System.out.println(a[50000]);
		int x;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();

		int result = BinarySearch.binarySearch(a, 0, a.length - 1, x);
		System.out.println(result);
	}
}
