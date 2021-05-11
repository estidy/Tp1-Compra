package Compra;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lecturaNproductos {
	// declaracion de variables globales
	static double subtotal=0;

	static final double IVA = 0.21;

	static DecimalFormat d = new DecimalFormat("##.00");	
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	public static void main(String[] args) {
		// Ingresar los datos de una compra (con n productos),
		// y para n compradores, para emitir la factura de compra.
		
		Scanner scan = new Scanner(System.in);
		// Declaracion del comprador
		String razonSocial, domicilio;
		//Declaracion del producto
		String descripcion;
		int cantidad;
		double valorUnitario;
		
		String pregunta;
		
		//Evaluar si la caja no esta vacia
		
		pregunta = "Hay compradores en la caja? s/n.";
		boolean r = ingresarRespuesta(scan, pregunta);
		while(r) {			
			// Procesar comprador
			System.out.println("************DATOS DEL COMPRADOR************"); 
			scan.nextLine();
			razonSocial = leerRazonSocial(scan);
			domicilio = leerDomicilio(scan);
			
			//Evaluar si hay productos en la caja para iniciar la compra.

			pregunta = "Hay productos en la caja? s/n.";			
			r = ingresarRespuesta(scan, pregunta);
			String productos="";
			while(r){
				//Procesar productos
				System.out.println("************DATOS DEL PRODUCTO************"); 
				scan.nextLine();
				descripcion = leerDescripcion(scan);				
				cantidad = leerCantidad(scan);				
			    scan.nextLine();
			    valorUnitario = leerValorUnitario(scan);
			    
			    //calculo del subtotal valor sin IVA
			    calcularSubtotal(cantidad, valorUnitario);
			    
				productos += (cantidad + "\t|" + descripcion + "      \t|" + d.format(valorUnitario) + "      \t|" + d.format((valorUnitario + IVA))+"\n");
				
				r = ingresarRespuesta(scan, pregunta);
			}
			// Imprimir factura
			imprimirFactura(razonSocial, domicilio, productos);
			if(!r) {
				 System.out.println("compra finalizada");	
			}
			pregunta = "Hay compradores en la caja? s/n.";
			r = ingresarRespuesta(scan, pregunta);	
		}
		if(!r) {
			 System.out.println("No hay compradores en la caja - CAJA VACIA");
		}
				
	}
	
	//métodos
	
	private static boolean ingresarRespuesta(Scanner scan, String pregunta) {
		System.out.println("\n" + pregunta + "\n");
		char respuesta= scan.next().charAt(0);
		respuesta = Character.toLowerCase(respuesta); // Se aplica esta funcion para que, el usuario ingrese como respuesta s/S/n/N. Esta funcion pone a minúscula la respuesta del usuario.
		if(opcionValida(respuesta)) {
			return((respuesta == 's')?true:false);
		}
		else {
			System.out.println("La opcion ingresada es incorrecta(valores validos:s/n) \n vuelva a intentarlo...");
			return(ingresarRespuesta(scan,pregunta));
		}
	}
	
	private static boolean opcionValida(char respuesta) {	
			return((respuesta == 's' || respuesta == 'n')?true:false);
	}
	
	private static String leerRazonSocial(Scanner scan){
		 System.out.println("Razon Social: "); 
	     return(scan.nextLine());			 	             
	}
	
	private static String leerDomicilio(Scanner scan){
	     System.out.println("Domicilio: "); 
	    return( scan.nextLine());
	}
	
	private static String leerDescripcion(Scanner scan){				 
		 System.out.println("Descripcion: "); 
	   	 return (scan.nextLine());
	}
	private static int leerCantidad(Scanner scan){
	   	 System.out.println("Cantidad: "); 
	   	 return (scan.nextInt());
	}
	private static double leerValorUnitario(Scanner scan){  	 
	   	 System.out.println("Valor Unitario: "); 
	   	return (scan.nextDouble());
	}
	
	private static void calcularSubtotal(int cantidad, double valorUnitario){
		subtotal += (cantidad * valorUnitario);
	}
	
	private static double calcularValorIVA(){
		return (subtotal * IVA);
	}
	
	public static void imprimirFactura(String razonSocial, String domicilio, String productos) {
		 double valorIVA = calcularValorIVA();
		 System.out.println("*****************************************");
		 System.out.println("Fecha: " + sdf.format(new Date()));
		 System.out.println("*****************************************");
		 System.out.println("Razon Social: "+razonSocial);
		 System.out.println("Domicilio: "+domicilio);
		 System.out.println("********************************************************************************************************************");
		 System.out.println("Cant.\t|Descripcion\t|P. Unit.\t|P.Total");
		 System.out.println(productos);
		 System.out.println("********************************************************************************************************************");
		 System.out.println("VALOR IVA: " + d.format(valorIVA));
		 System.out.println("SUBTOTAL SIN IVA: " + d.format(subtotal));
		 System.out.println("TOTAL: " + d.format((subtotal + valorIVA)));				 
		 System.out.println("********************************************************************************************************************");
	}

	}
