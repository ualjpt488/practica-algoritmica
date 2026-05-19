package Recursividad;

import java.util.Scanner;

public class MaximoComunDivisor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean validInput = false;
		int m = 0, n = 0;
		do {
			try {
				System.out.print("Ingrese un numero entero para m: ");
				m = entrada.nextInt();
				System.out.print("Ingrese un numero entero para n: ");
				n = entrada.nextInt();

				validInput = true;
			} catch (Exception e) {
				System.out.println("Entrada no valida. Por favor ingrese numeros enteros.");
				entrada.next();
			}
		} while (!validInput);

		System.out.println("Maximo Comun Divisor: " + maximoComunDivisor(Math.abs(m), Math.abs(n)));
	}

	public static int maximoComunDivisor(int m, int n) {
		return n <= m && m % n == 0 ? n : m < n ? maximoComunDivisor(n, m) : maximoComunDivisor(n, m % n);
	}

}
