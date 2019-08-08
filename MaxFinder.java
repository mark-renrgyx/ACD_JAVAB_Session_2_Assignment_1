package week1.day2;

// Assignment 2.1

public class MaxFinder {

	public static void main (String[] args) {
		
		int a = 9, b = 6, c = 7;
		
//		alternate method
//		System.out.println("Max is " + Math.max(Math.max(a,b), c));
		
		if (a < b) {
			if (b < c)
				System.out.println("c largest");
			else
				System.out.println("b largest");
		}
		else {
			if (a < c)
				System.out.println("c largest");
			else
				System.out.println("a largest");
		}
		
//		// Part 2: Print even / odd
//		int x = 5;
//		if (x % 2 == 0)
//			System.out.println("Even");
//		else
//			System.out.println("Odd");
	}
}
