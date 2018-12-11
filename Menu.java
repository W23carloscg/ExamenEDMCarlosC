package calculoareas; // Paquete Java

import java.util.Scanner; // Importar la clase Scanner

/**
 * Menu para calcular el area de figuras
 * @author Carlos Castillo
 * @version 1.0
 */


public class Menu {

	public static void main (String[] args){ 	
		int res = 1;		
		MenuPrincipal(res);
	}
package calculoareas; // Paquete Java

import java.util.Scanner; // Importar la clase Scanner

/**
 * Menu para calcular el area de figuras
 * @author Carlos Castillo
 * @version 1.0
 */


public class Menu {

	public static void main (String[] args){ 	
		int res = 1;		
		MenuPrincipal(res);
	}

	// Metodo del menu principal
	public static void MenuPrincipal(int respuesta){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("  ");
		System.out.println(" CALCULO DE AREAS ");
		System.out.println("  ");
		System.out.println("=====================================");
		System.out.println(" 1 Calcular el área de un triángulo  ");
		System.out.println(" 2 Calcular el área de un trapecio   ");
		System.out.println(" 3 Calcular el área de un rectángulo ");
		System.out.println(" 4 Salir                             ");
		
		respuesta = entrada.nextInt();
	
		// Estructura de control con las opciones validas
		switch (respuesta) {
		
		case 1:
			System.out.println(" 1 Calcular el área de un triángulo ");
			Triangulo.CalcuAreaTriangulo(respuesta);
			break;
			
		case 2:
			System.out.println(" 2 Calcular el área de un trapecio   ");	
			Trapecio.CalcuAreaTrapecio(respuesta);
			break;
			
		case 3:
			System.out.println(" 3 Calcular el área de un rectángulo ");
			Rectangulo.CalcuAreaRectangulo(respuesta);
			break;
			
		case 4:
			System.out.println(" 4 Salir ");
			break;
			
		default:
			System.out.println("No existe la opcion marcada");
			Menu.MenuPrincipal(respuesta);
			break;
		}
	}
}


