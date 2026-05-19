package Recursividad;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = -1;
		do {
			try {
				System.out.print("Ingrese un numero entero positivo: ");
				n = entrada.nextInt();
				if (isValidNumber(n)) {
					System.out.println("Fibonacci de " + n + " es: " + fibonacci(n));
				} else {
					System.out.println("El numero debe ser positivo.");
				}
			} catch (Exception e) {
				System.out.println("Entrada no valida. Por favor ingrese un numero entero.");
				entrada.next();
			}
		} while (n < 0);
	}

	public static int fibonacci(int n) {
		return n == 0 || n == 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static boolean isValidNumber(int n) {
		return n >= 0 ? true : false; 
	}
}
