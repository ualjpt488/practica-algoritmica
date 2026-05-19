package Recursividad;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = -1;
		do {
			try {
				System.out.print("Ingrese un numero entero positivo: ");
				n = entrada.nextInt();
				if (isValidNumber(n)) {
					System.out.println("Factorial de " + n + " es: " + factorial(n));
				} else {
					System.out.println("El numero debe ser positivo.");
				}
			} catch (Exception e) {
				System.out.println("Entrada no valida. Por favor ingrese un numero entero.");
				entrada.next();
			}
		} while (n < 0);

	}

	public static int factorial(int n) {
		return n == 0 ? 1 : n * factorial(n - 1);
	}

	public static boolean isValidNumber(int n) {
		return n >= 0 ? true : false; 
	}

}
