package ru.unlimit;

public class Simple {

	public static boolean main(long n) {
		for (long i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
}
