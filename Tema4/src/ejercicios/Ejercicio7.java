package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Abrimos el scanner
		Scanner sc = new Scanner(System.in);

		// Variable donde guardaremos las temperaturas que vaya ontroduciendo el usuario
		double temperatura;

		// Variable donde iremos guardando el nombre del mes
		String mes;

		// Le pedimos al usuario las medias de temperatura con un bucle for y mostramos
		// el diagrama
		for (int i = 0; i < 12; i++) {
			System.out.print("Introduce la temperatura media del mes " + (i + 1) + ": ");
			temperatura = sc.nextDouble();

			mes = NombresMes(i);
			System.out.print(mes + ": ");

			for (int j = 0; j < temperatura; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Cerramos el scanner
		sc.close();

	}

	// Metodo para devolver el nombre del mes
	public static String NombresMes(int mes) {
		String[] nombresMeses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		return nombresMeses[mes];
	}

}
