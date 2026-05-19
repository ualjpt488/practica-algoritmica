package Recursividad;

import java.util.Scanner;

public class Legendre {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = -1;
		int x = 0;
		do {
			try {
				System.out.print("Ingrese un numero entero positivo para n: ");
				n = entrada.nextInt();
				System.out.print("Ingrese un numero entero para x: ");
				x = entrada.nextInt();
				if (isValidNumber(n)) {
					System.out.println("Polinomio de Legendre de " + n + ": " + polinomioLegendre(x, n));
				} else {
					System.out.println("El numero debe ser positivo.");
				}
			} catch (Exception e) {
				System.out.println("Entrada no valida. Por favor ingrese numeros enteros.");
				entrada.next();
			}
		} while (n < 0);
	}

	public static double polinomioLegendre(double x, int n) {
		if (n == 0)
			return 1;
		return n == 1 ? x
				: (double) (2 * n - 1) / n * x * polinomioLegendre(x, n - 1)
						- (double) (n - 1) / n * polinomioLegendre(x, n - 2);
	}

	public static boolean isValidNumber(int n) {
		return n >= 0 ? true : false;
	}

}
