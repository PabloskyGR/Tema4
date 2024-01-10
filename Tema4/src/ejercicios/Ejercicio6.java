package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable donde guardaremos los números que vaya introduciendo el usuario
		int num;

		// Creamos una tabla de tipo entero y con una longitud de 8
		int tabla[] = new int[8];

		// Bucle for donde iremos recorriendo la tabla y añadiendo el número introducido
		// por teclado a las posiciones de la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Dime un número:");
			num = sc.nextInt();
			tabla[i] = num;
		}

		// Otro bucle for donde recorremos la tabla comprobando si es par o impar los
		// valores de la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Si el valor de la posición escogida al dividirlo entre 2 da como resultado 0,
			// signidica que es par
			if (tabla[i] % 2 == 0) {
				System.out.println(tabla[i] + " --> Par");

				// En caso contrario, sería impar
			} else {
				System.out.println(tabla[i] + " --> Impar");
			}
		}

		// Cerramos el scanner
		sc.close();
	}

}
