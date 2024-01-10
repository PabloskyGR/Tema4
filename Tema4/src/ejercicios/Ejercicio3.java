package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Varibale donde guardaremos los números que vaya intrdoduciendo el usuario
		int num;

		// Creamos una tabla de tipo entero y con un tamaño de 10
		int tabla[] = new int[10];

		// Bucle for para ir añadiendo los números que vaya introduciendo el usuario en
		// la tabla
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Dime un número:");
			num = sc.nextInt();
			tabla[i] = num;
		}

		System.out.print("[ ");

		// Bucle for que recorrera la tabla desde el último valor de la tabla hasta el
		// primero
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.print(tabla[i] + " ");
		}
		System.out.print("]");

		// Cerramos el scanner
		sc.close();

	}

}
