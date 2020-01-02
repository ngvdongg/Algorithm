package Algorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InterpolationSearch {
	private static int binarySearch(int a[], int n,int x) {
		int low=0,hight=n-1;
		while(low<=hight && x>=a[low] && x<=a[hight]) {
			if(low==hight) {
				if(a[low]==x) return low;
				return -1;
			}
//			int pos=(int) (low+(((double)(hight-low)/(a[hight] - a[low]))*(x-a[low]))); 
			int pos = low + (((hight-low) / 
	                  (a[hight]-a[low]))*(x - a[low])); 
			if(a[pos]==x) return pos;
			if(a[pos] <x) low=pos+1;
			else hight=pos-1;
			
		}
		
		return -1;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		int size = 10000;
//		int a[] = new int[size];
		int a[]= {1,3,5,6,8,11,15,20};
//		for (int i = 0; i < size - 1; i++) {
//			a[i] = rand.nextInt(size - 1);
////			a[i]=i;
//		}
//		Arrays.sort(a);
//		for (int i : a) {
//			System.out.println(a[i]);
//		}
//		System.out.println(a[5000]);
		int x;
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();

		int result = InterpolationSearch.binarySearch(a, a.length-1, x);
		System.out.println(result);
	}
}
