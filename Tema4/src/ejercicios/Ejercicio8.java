package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable donde guardaremos el numero que quiere buscar el usuario
		int num;

		// Varibale que nos ayudara para saber si encontramos o no el número dentro de
		// la tabla
		boolean encontrado;

		// Creamos una tabla con una longitud de 100
		int[] tabla = new int[100];

		// Rellenamos la tabla dandole valores aleatorios entre 1 y 10 a cada posición
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (1 + Math.random() * 10);
		}

		// Le pedimos que número quiere buscar
		System.out.print("Introduce un número para buscar en la tabla (entre 1 y 10): ");
		num = sc.nextInt();

		// Mostramos en que posición se encuentra el número que hemos seleccionado
		encontrado = false;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] == num) {
				System.out.print(i + " ");
				encontrado = true;
			}
		}

		// En caso de que no mostramos un mensaje
		if (!encontrado) {
			System.out.println("El número " + num + " no se encuentra en la tabla");
		}

		// Cerramos el scanner
		sc.close();

	}

}
