package calculoareas; // Paquete Java

import java.util.Scanner; // Importar la clase Scanner

/**
 * Funcion Java que calcula el área de un Trapecio 
 * @author Carlos Castillo
 * @version 1.0
 */

public class Trapecio {

	public static void main (String[] args){ 	
		int res = 1;		
		CalcuAreaTriangulo(res);
	}
	
	// Metodo que calcula el area del trapecio
	public static void CalcuAreaTriangulo(int respuesta){

		int base1;
		int base2;
		int mediana;
		int altura;
		int areaTrapecio;
		
		Scanner leerBase1 = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la primera base");
		
		base1 = leerBase1.nextInt();
		
		Scanner leerBase2 = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la segunda base");
		
		base2 = leerBase2.nextInt();

		Scanner leerAltura = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la altura");

		altura = leerAltura.nextInt();
		
		// Estructura de control if else para controlar...
		
		if (base1 == base2 ) {
			
			System.out.println("Datos no admitidos");
		}
		else {
		
			mediana = ( base1 * base2) / 2;
			areaTrapecio = mediana * altura;
		
			System.out.println("El Trapecio con la primera base " + base1 + " y la segunda base " + base2 + " Tiene un área de " + areaTrapecio );
		}
	}
}


