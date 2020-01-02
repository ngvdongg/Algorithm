package Algorithm;

import java.util.Random;
import java.util.Scanner;

public class Quicksort {
	public static void main(String[] args) {
		Random rand = new Random();
//		int size = 20;
//		int a[] = new int[size];
		int a[]= {17,3,5,2,8,16,15,20};
//		for (int i = 0; i < size - 1; i++) {
//			a[i] = rand.nextInt(size - 1);
//		}
		Quicksort.quick(a, 0, a.length-1);
		for (int i : a) {
			System.out.println(i);
		}
		
	}
	private static void swap(int a, int b) {
		a=a+b;
		a=a-b;
		b=a-b;
	}
	private static void quick(int[] a, int left, int right) {
		
		if(a==null && a.length==0) return;
		if(left>=right) return;
//		int mid= (left+right)/2;
		int mid=left+(right-left)/2;
		int pivot=a[mid];
		int i,j;
		i=left; j=right;
		while(i<=j) {
			while(a[i]< pivot) {
				i++;
			}
			while(a[j]> pivot) j--;
			if(i<=j) {
//				swap(a[i],a[j]);
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
				i++;
				j--;
			} 
			
		}
		if(left<j) quick(a,left,j);
		if(right>i) quick(a,i,right);
	}
}
