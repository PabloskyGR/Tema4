package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Varibale donde iremos guardando el número que vaya introduciendo el usuario
		double num;

		// Creamos una tabla donde iremos guardando los números que vaya introduciendo
		// el usuario
		double tabla[] = new double[5];

		// Bucle for en el cual iremos recorriendo la tabla añadiendole a cda lugar el
		// número que haya introducido el usuario
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Dime un número decimal:");
			num = sc.nextDouble();
			tabla[i] = num;
		}

		System.out.print("[ ");

		// Otro bucle for donde iremos recorriendo la tabla y mostrando los números
		// añadidos en la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(tabla[i] + " ");
		}
		System.out.print("]");

		// Cerramnos el scanner
		sc.close();

	}

}
