package binarySearchReverseOrder;

import java.util.Arrays;
import java.util.Collections;

public class Tester {
	public static void main(String args[]) {
		int i[] = { 97, 95, 89, 84, 81, 78, 67, 51, 49, 43, 22, 21, 15, -7 };
		
		System.out.println(binarySearch(i, 22)); // prints 10
		System.out.println(binarySearch(i, 89)); // prints 2
		System.out.println(binarySearch(i, -100)); // prints -1
		System.out.println(binarySearch(i, 72)); // prints -1
		System.out.println(binarySearch(i, 102)); // prints -1
	}

	// Look for srchVal in the a[] array and return the index of where it’s
	// found
	// Return –1 if not found
	private static int binarySearch(int a[], int srchVal) {
		int lb = 0;
		int ub = a.length - 1;
		while (lb <= ub) {
			int mid = (lb + ub) / 2;
			if (a[mid] == srchVal) {
				return mid;
			} else if (srchVal < a[mid]) {
				lb = mid + 1; // set a new lowerbound
			} else {
				ub = mid - 1; // set a new upper bound
			}
		}
		return -1; // srchVal not found
	}
}