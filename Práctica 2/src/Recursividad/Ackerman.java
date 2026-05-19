package Recursividad;

import java.util.Scanner;

public class Ackerman {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = -1;
		int m = -1;
		do {
			try {
				System.out.print("Ingrese un numero entero positivo para m: ");
				m = entrada.nextInt();
				System.out.print("Ingrese un numero entero positivo para n: ");
				n = entrada.nextInt();
				if (isValidNumber(m) && isValidNumber(n)) {
					System.out.println("Ackerman de (" + m + ", " + n + ") es: " + ackerman(m, n));
				} else {
					System.out.println("Los numeros deben ser positivos.");
				}
			} catch (Exception e) {
				System.out.println("Entrada no valida. Por favor ingrese numeros enteros.");
				entrada.next();
			}
		} while (n < 0 && m < 0);
	}

	public static int ackerman(int m, int n) {
		return m == 0 ? n + 1 : n == 0 ? ackerman(m - 1, 1) : ackerman(m - 1, ackerman(m, n - 1));
	}

	public static boolean isValidNumber(int n) {
		return n >= 0 ? true : false;
	}
}
