package Recursividad;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		boolean validInput = false;

		do {
			try {
				System.out.print("Ingrese la base: ");
				int base = entrada.nextInt();
				System.out.print("Ingrese el exponente: ");
				int n = entrada.nextInt();

				System.out.println(base + " elevado a " + n + " es: " + potencia(base, n));
				validInput = true;

			} catch (Exception e) {
				System.out.println("Entrada no valida. Por favor ingrese numeros enteros.");
				entrada.next();
			}
		} while (!validInput);

	}
	
	//Tienes que arreglarlo para los números negativos y el caso de 0 elevado a 0
	public static double potencia(int base, int n) {
		if (base == 0 && n == 0) 
			return 1; 
		
		return n == 0 ? 1 : n < 0 ? 1 / potencia(base, -n) : base * potencia(base, n - 1);
	}

}
