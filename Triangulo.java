package calculoareas; // Paquete Java

import java.util.Scanner; // Importar la clase Scanner

/**
 * Funcion Java que calcula el área del Triángulo 
 * @author Carlos Castillo
 * @version 1.0
 */

public class Triangulo {

	public static void main (String[] args){ 	
		int res = 1;		
		CalcuAreaTriangulo(res);
	}
	
	// Metodo que calcula el area del triangulo
	public static void CalcuAreaTriangulo(int respuesta){

		int base;
		int altura;
		int areaTriangulo;
		
		System.out.println("1 Calcular área Triángulo");
		
		Scanner leerBase = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la base");
		
		base = leerBase.nextInt();

		Scanner leerAltura = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la altura");

		altura = leerAltura.nextInt();
		
		// Estructura de control if else para controlar que no entren daton negativos
		if (base <=0 | altura <=0 ) {
			
			System.out.println("Datos no admitidos");
		}
		else {
		
			areaTriangulo = base * altura / 2;
		
			System.out.println("El Triangulo con base " + base + " y altura de " + altura + " Tiene un área de " + areaTriangulo );
		}
	}
}


