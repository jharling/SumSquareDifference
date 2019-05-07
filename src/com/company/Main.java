package com.company;

public class Main {

    public static void main(String[] args) {
        /*
			The sum of the squares of the first ten natural numbers is,

			1*2 + 2^2 + ... + 10^2 = 385
			The square of the sum of the first ten natural numbers is,

			(1 + 2 + ... + 10)^2 = 552 = 3025
			Hence the difference between the sum of the squares of the first ten
			natural numbers and the square of the sum is 3025 − 385 = 2640.

			Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		*/
        System.out.printf("%.1f", Math.pow(getSquareOfSums(100L), 2) - getSumOfSquares(100L));
    }


    private static double getSumOfSquares(long num) {
        if (num == 0) {
            return 0L;
        }
        return getSumOfSquares(num - 1) + Math.pow(num, 2);
    }

    private static double getSquareOfSums(long num) {
        if (num == 1) {
            return 1;
        }
        return getSquareOfSums(num - 1) + num;
    }
}
