package com.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String args[]) {
		try {
			System.out.println("Enter to Continue 'quit' to exit");
			String str = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (!"quit".equals(str = br.readLine())) {

				calculate();

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public static void calculate() {
		BigDecimal result = BigDecimal.ZERO;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		BigDecimal num1 = sc.nextBigDecimal();
		System.out.println("Enter Operator:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String operator = "";
		try {
			operator = br.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Enter second number: ");
		BigDecimal num2 = sc.nextBigDecimal();
		switch (operator) {
		case "+":
			result = num1.add(num2);
			System.out.println("Result is :" + result);
			break;
		case "-":
			result = num1.subtract(num2);
			System.out.println("Result is :" + result);
			break;
		case "/":
			result = num1.divide(num2);
			System.out.println("Result is :" + result);
			break;
		case "*":

			result = num1.multiply(num2);
			System.out.println("Result is :" + result);
			break;
		default:
			System.out.println("please provide operators from list (+,-,/,*)");

		}
	}
}