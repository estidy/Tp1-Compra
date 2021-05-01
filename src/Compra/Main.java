package Compra;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Ingresar los datos de una compra (2 productos),
				// y los datos del comprador, para emitir la factura de compra.
				Scanner scan = new Scanner(System.in);
				
				// Declaracion de la constante IVA
				final double IVA = 0.21;
				
				//Declaracion de variables para un Producto.
				int cantidad;
				String descripcion;
				double valorUnitario;
				
				//Declaracion de variables para un Comprador.
				String razonSocial;
				String domicilio;
				
				//Declaracion e inicializacion de las variables total y subtotal y contador referente a la compra.
				double subtotal=0;
				double total=subtotal; 
				int contador;
				
				Date fecha= new Date();		
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				char opcion;
				boolean hayProductos;
				
				do {
						System.out.println("i: para iniciar una compra");
						System.out.println("s: para salir");
						
						System.out.println("Ingrese su opcion...");
						opcion = scan.next().charAt(0); 
						
						if (opcion == 's') {
							 System.out.println("Gracias por utilizar el sistema"); 
							 System.exit(0);
						}
						else if(opcion == 'i') {							
			                 System.out.println("Ingrese la razon social del Comprador"); 
			 	             razonSocial = scan.nextLine();
			 	             
			 	             System.out.println("Ingrese el domicilio del Comprador"); 
			 	             domicilio = scan.nextLine();
			 	             
			 	             hayProductos = true;
			 	             System.out.println("Se procederá con la carga de productos...");
			                 while(hayProductos) {
					               	 System.out.println("Ingrese la descripcion del producto"); 
					               	 descripcion = scan.nextLine();
					               	 System.out.println("Ingrese la cantidad del producto"); 
					               	 cantidad = scan.nextInt();
					               	 System.out.println("Ingrese el valor unitario del producto"); 
					               	 valorUnitario = scan.nextDouble();
					               	 System.out.println("Producto agregado exitosamente");
			                 }
						}
			            else {
			            	
			            	System.out.println("El valor ingresado es incorrecto");
			            }
		               	 
				 }
				 while (opcion != 's');
      }
}
