package com.cts.java;

public class PrimeNumber {
	public boolean isPrime(int x) {
		boolean flag = true;
		for (int i = 2; i < x; i++)
			if (x % i == 0) {
				flag = false;
				break;

			}
		return flag;

	}

}
