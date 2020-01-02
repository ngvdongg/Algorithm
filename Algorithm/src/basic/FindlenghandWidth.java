package basic;

public class FindlenghandWidth {

	static int[] findLengthAndWidth(int x, int y) {
		int a[] = new int[2];
		boolean flag = true;
		int total = x + y;
		for (int i = 1; i < x / 2; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * j == total) {
					a[0] = i;
					a[1] = j;
					return a;

				}

			}
		}

		return a;
	}

	public static void main(String[] args) {
		int a[] = new int[2];
		a = FindlenghandWidth.findLengthAndWidth(5000, 42);
		for (int i : a) {
			System.out.println(i);
		}
	}
}
