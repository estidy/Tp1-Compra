package Compra;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lecturaNproductos {
	
	public static double subtotal=0;
	
	public static void main(String[] args) {
		// Ingresar los datos de una compra (con n productos),
		// y para n compradores, para emitir la factura de compra.
		
		Scanner scan = new Scanner(System.in);
		
		// Declaracion de la constante IVA
		final double IVA = 0.21;	
						
		//Declaracion de las variables total y subtotal y valorIVA referente a la compra.
		
		double total, valorIVA; 
		
		// Declaracion de otras variables
		DecimalFormat d = new DecimalFormat("##.00");
		
		Date fecha= new Date();		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		String pregunta;
		
		//Evaluar si la caja no esta vacia
		pregunta = "Hay compradores en la caja? s/n.";
		while(respuestaCorrecta(scan, pregunta)) {
			
			// Procesar comprador
			String comprador = leerComprador(scan);
			
			//Evaluar si hay productos en la caja para iniciar la compra.

			pregunta = "Hay productos en la caja? s/n.";
			String productos="";
			
			while(respuestaCorrecta(scan, pregunta)){
				//Procesar productos
				String producto = leerProducto(scan);
				productos += producto;
			}
			if(!respuestaCorrecta(scan, pregunta))
				 System.out.println("No hay productos para iniciar la compra");
			
			// Imprimir factura
			
		}
		if(!respuestaCorrecta(scan, pregunta))
			 System.out.println("No hay compradores en la caja - CAJA VACIA");
				
	}
	
	//métodos
	
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
	
	private static String leerComprador(Scanner scan){
		 System.out.println("************DATOS DEL COMPRADOR************"); 
		 
	     System.out.println("Razon Social: "); 
	     String razonSocial = scan.nextLine();			 	             
	     
	     System.out.println("Domicilio: "); 
	     String domicilio = scan.nextLine();
	     
	     return(razonSocial + ";" + domicilio + ".");
	}
	
	private static String leerProducto(Scanner scan){
		 System.out.println("************DATOS DEL PRODUCTO************"); 
		 
		 System.out.println("Descripcion: "); 
	   	 String descripcion = scan.nextLine();
	   	 
	   	 System.out.println("Cantidad: "); 
	   	 int cantidad = scan.nextInt();
	   	 
	     scan.nextLine();
	   	 
	   	 System.out.println("Valor Unitario: "); 
	   	 double valorUnitario = scan.nextDouble();
	   	 
	     calcularSubtotal(cantidad, valorUnitario);
	     
	     return(descripcion + ";" + cantidad + ";" + valorUnitario + ".");
	}
	
	private static void calcularSubtotal(int cantidad, double valorUnitario){
		subtotal += (cantidad * valorUnitario);
	}

	}
