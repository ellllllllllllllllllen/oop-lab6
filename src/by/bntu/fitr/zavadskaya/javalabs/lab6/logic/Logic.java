package by.bntu.fitr.zavadskaya.javalabs.lab6.logic;

public class Logic {

	public static boolean equalityÑheck(int a, int b, int c) {
		return a == b && b == c;
	}

	public static boolean atLeastOnePairOfEqualNumbersCheck(int a, int b, int c) {
		return a == b || b == c || a == c;
	}

	public static boolean signÑheck(int a, int b, int c) {
		return a > 0 && b > 0 && c > 0;
	}

	public static boolean atLeastOnePositiveNumberCheck(int a, int b, int c) {
		return a > 0 || b > 0 || a > 0;
	}

	public static boolean onePositiveNumberCheck(int a, int b, int c) {
		return (a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0) || (a <= 0 && b <= 0 && c > 0);
	}

	public static boolean twoPositiveNumberCheck(int a, int b, int c) {
		return (a > 0 && b > 0 && c <= 0) || (a <= 0 && b > 0 && c > 0) || (a > 0 && b <= 0 && c > 0);
	}

	public static boolean evenNumbersCheck(int a, int b, int c) {
		return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
	}

	public static boolean atLeastOneEvenNumberCheck(int a, int b, int c) {
		return a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
	}

	public static boolean oneEvenNumberCheck(int a, int b, int c) {
		return (a % 2 == 0 && b % 2 != 0 && c % 2 != 0) || (a % 2 != 0 && b % 2 == 0 && c % 2 != 0)
				|| (a % 2 != 0 && b % 2 != 0 && c % 2 == 0);
	}

	public static boolean equalEvenNumberCheck(int a, int b, int c) {
		return (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) || (a % 2 != 0 && b % 2 != 0 && c % 2 != 0);
	}

	public static boolean twoEvenNumberCheck(int a, int b, int c) {
		return (a % 2 == 0 && b % 2 == 0 && c % 2 != 0) || (a % 2 == 0 && b % 2 != 0 && c % 2 == 0)
				|| (a % 2 != 0 && b % 2 == 0 && c % 2 == 0);
	}

	public static boolean sequenceCheck(int number) { // 1234
		int firstNumber = number % 10; // 4
		int changedNumber = number / 10; // 123
		int secondNumber = changedNumber % 10; // 3
		changedNumber /= 10; // 12
		int thirdNumber = changedNumber % 10; // 2
		changedNumber /= 10; // 1
		int fouthNumber = changedNumber; // 3
		return (firstNumber > secondNumber && secondNumber > thirdNumber && thirdNumber > fouthNumber)
				|| (firstNumber < secondNumber && secondNumber < thirdNumber && thirdNumber < fouthNumber);
	}

	public static boolean palindromeCheck(int number) { // 1234
		int firstNumber = number % 10; // 4
		int changedNumber = number / 10; // 123
		int secondNumber = changedNumber % 10; // 3
		changedNumber /= 10; // 12
		int thirdNumber = changedNumber % 10; // 2
		changedNumber /= 10; // 1
		int fouthNumber = changedNumber; // 3
		return firstNumber == fouthNumber && secondNumber == thirdNumber;
	}

	public static boolean firstQuarterCheck(int x, int y) {
		return x > 0 && y > 0;
	}

	public static boolean isTriangleCheck(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}

	public static boolean isEquilateralTriangleCheck(int a, int b, int c) {
		return a == b && b == c;
	}

	public static boolean isIsoscelesTriangleCheck(int a, int b, int c) {
		return isTriangleCheck(a, b, c) && (a == b || b == c || a == c);
	}

	public static boolean isRightTriangleCheck(int a, int b, int c) {
		return isTriangleCheck(a, b, c)
				&& ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a));
	}

	public static boolean isRightAndIsoscelesCheck(int a, int b, int c) {
		return isRightTriangleCheck(a, b, c) && isIsoscelesTriangleCheck(a, b, c);
	}

	public static boolean pointCheck(int x, int y, int x1, int y1, int x2, int y2) {
		return x <= x2 && x >= x1 && y >= y2 && y <= y1;
	}

}
