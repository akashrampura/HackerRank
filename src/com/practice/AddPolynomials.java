package com.practice;

// Theta value is n
public class AddPolynomials {

	public static void printPoly(int poly[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(poly[i]);
			if (i != 0) {
				System.out.print("x^" + i);
			}
			if (i != n - 1) {
				System.out.print(" + ");
			}
		}
	}

	public static int[] add(int poly1[], int poly2[]) {
		int size = poly1.length > poly2.length ? poly1.length : poly2.length;
		int sum[] = new int[size];
		// Initialize the polynomial
		for (int i = 0; i < poly1.length; i++) {
			sum[i] = poly1[i];
		}
		for (int i = 0; i < poly2.length; i++) {
			sum[i] += poly2[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// (x**3 + 5x**2 -3x + 3) + (4x**5 - 2x**2 + 1) -> Given Polynomial
		int poly1[] = { 3, -3, 5, 1 };
		int poly2[] = { 1, 0, -2, 0, 0, 4 };
		System.out.println("First polynomial is");
		printPoly(poly1, poly1.length);
		System.out.println("\nSecond polynomial is");
		printPoly(poly2, poly2.length);
		int sum[] = add(poly1, poly2); // Add
		int size = poly1.length > poly2.length ? poly1.length : poly2.length; // Max
		System.out.println("\nSum polynomial is");
		printPoly(sum, size);
		System.out.println("\nTest case 2: ");
		int poly3[] = { 9, -7, 0, 1 };
		int poly4[] = { 1, -2, 0 };
		System.out.println("\nFirst polynomial is");
		printPoly(poly3, poly3.length);
		System.out.println("\nSecond polynomial is");
		printPoly(poly4, poly4.length);
		int sum2[] = add(poly3, poly4); // Add
		int size2 = poly3.length > poly4.length ? poly3.length : poly4.length; // Max
		System.out.println("\nSum polynomial is");
		printPoly(sum2, size2);
		// test case 3
		System.out.println("\nTest case 3: ");
		int poly5[] = { 0, 0, 0, 1 };
		int poly6[] = { 1, -2, 0 ,-6};
		System.out.println("\nFirst polynomial is");
		printPoly(poly5, poly5.length);
		System.out.println("\nSecond polynomial is");
		printPoly(poly6, poly6.length);
		int sum3[] = add(poly5, poly6); // Add
		int size3 = poly5.length > poly6.length ? poly5.length : poly6.length; // Max
		System.out.println("\nSum polynomial is");
		printPoly(sum3, size3);
	}
}
