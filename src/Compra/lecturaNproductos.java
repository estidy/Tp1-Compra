package Compra;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lecturaNproductos {

	public static void main(String[] args) {
		// Ingresar los datos de una compra (con n productos),
		// y para n compradores, para emitir la factura de compra.
		Scanner scan = new Scanner(System.in);
		
		//Evaluar si la caja no esta vacia
		String pregunta = "Hay compradores en la caja? s/n.";
		while(respuestaCorrecta(scan, pregunta)) {
			
			// Procesar comprador
			String comprador = leerComprador(scan);
			
			//Evaluar si hay productos en la caja para iniciar la compra.
			String productos;
			while(hayProductos) {
				//Procesar productos
				String producto = leerProducto(scan);
				productos += (producto + "-");
			}
			if(!(hayProductos(scan)))
				 System.out.println("No hay productos para iniciar la compra");
			
			// Imprimir factura
			
		}
		if(!respuestaCorrecta(scan, pregunta))
			 System.out.println("No hay compradores en la caja - CAJA VACIA");
				
	}
	
	//funciones
	
	private static boolean respuestaCorrecta(Scanner scan, String pregunta) {
		System.out.println("\n" + pregunta + "\n");
		char respuesta= scan.next().charAt(0);	
		if(opcionValida(respuesta)) {
			return((respuesta == 's')?true:false);
		}
		else {
			return respuestaCorrecta(scan, pregunta);
		}
	}
	
	private static boolean opcionValida(char respuesta) {	
			return((respuesta == 's' || respuesta == 'n')?true:false);
	}

}
