package Recursividad;

import java.util.Scanner;

public class CambiodeBase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = -1;
		boolean validInput = false;

		do {
			try {
				System.out.print("Ingrese un número entero: ");
				numero = entrada.nextInt();
				if (numero < 0)
					System.out.println("El número debe ser positivo.");
				else
					validInput = true;

			} catch (Exception e) {
				System.out.println("Entrada no valida. Por favor ingrese un número entero positivo.");
				entrada.next();
			}
		} while (!validInput);
		
		System.out.println("El número " + numero + " en hexadecimal es: " + cambioBase(numero));
	}

	public static String cambioBase(int numero) {
		return numero < 16 ? "0123456789ABCDEF".charAt(numero) + ""
				: cambioBase(numero / 16) + "0123456789ABCDEF".charAt(numero % 16);
	}

}
