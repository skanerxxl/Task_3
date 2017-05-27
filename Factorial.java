package ru.rambler.skanerxxl;

import java.math.BigInteger;

public class Factorial {
	private BigInteger bigInteger;

	public Factorial() {
	}

	/**
	 * вычисл€ем факториал из полученного числа
	 */
	public void generateFactorial(int f) {
		BigInteger bi = new BigInteger(Integer.toString(f));
		this.bigInteger = fact(bi);
	}

	/**
	 * рекурсивный метод получени€ факториала
	 */
	private BigInteger fact(BigInteger bigInteger) {
		return (bigInteger.equals(new BigInteger("0"))) ? new BigInteger("1")
				: bigInteger.multiply(fact(bigInteger.subtract(new BigInteger("1"))));
	}

	/**
	 * вычисл€ем сумму цифр дл€ полученного факториала
	 */
	public int sumOfDigitsOfFactorial() {
		String stringBigInteger = bigInteger.toString();
		int sum = 0;
		for (int i = 0; i < stringBigInteger.length(); i++) {
			sum += Character.getNumericValue((stringBigInteger.charAt(i)));
		}
		return sum;
	}

	@Override
	public String toString() {
		return bigInteger.toString();
	}

}
