package calculoareas; // Paquete Java

import java.util.Scanner; // Importar la clase Scanner

/**
 * Funcion Java que calcula el área del Triángulo 
 * @author Carlos Castillo
 * @version 1.0
 */

public class Rectangulo {

	public static void main (String[] args){ 	
		int res = 1;		
		CalcuAreaRectangulo(res);
	}
	
	// Metodo que calcula el area del rectangulo
	public static void CalcuAreaRectangulo(int respuesta){

		int ancho;
		int alto;
		int areaRectangulo;
		
		System.out.println("3 Calcular área Rectángulo");

		Scanner leerAncho = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la base");
		
		ancho = leerAncho.nextInt();

		Scanner leerAlto = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la altura");

		alto = leerAlto.nextInt();
		
		// Estructura de control if else para controlar que tanto la el alto y el ancho 
		// sean valores comprendidos entre 2 y 10	
		if ( (alto <3 || alto > 10) && (alto <3 || alto >10) ) {
			
			System.out.println("Datos no admitidos");
		}
		else {
			
			areaRectangulo = ancho * alto ;
			
			System.out.println("El Rectanculo con base " + ancho + " y altura de " + alto + " Tiene un área de " + areaRectangulo );
		}
	}
}


