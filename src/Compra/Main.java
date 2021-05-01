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
				double subtotal, total; 
				int contador;
				
				Date fecha= new Date();		
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				double valorIVA;
				int opcion1, opcion3;
				char opcion2;
				boolean hayProductos, salir=false;
				
				do {
						System.out.println("1: para iniciar una compra");
						System.out.println("2: para salir");
						
						System.out.println("Ingrese su opcion...");
						opcion1 = scan.nextInt(); 
						
						if (opcion1 == 2) {
							 System.out.println("Gracias por utilizar el sistema"); 
							 System.exit(0);
						}
						else if(opcion1 == 1) {
							 System.out.println("Hay Productos para iniciar la venta? s/n ");
							 							 
							 System.out.println("Ingrese su opcion...");
							 opcion2 = scan.next().charAt(0); 
							 
							 while (!salir) {
								  if(opcion2 == 's') {
									 // inicializacion las variables
									 contador = 0;
									 total=subtotal = 0;
									 valorIVA = 0;
									 hayProductos=true;
									 
									 System.out.println("************Datos del comprador del Comprador************"); 
					                 System.out.println("Ingrese la razon social del Comprador"); 
					 	             razonSocial = scan.nextLine();			 	             
					 	             scan.next();
					 	             
					 	             System.out.println("Ingrese el domicilio del Comprador"); 
					 	             domicilio = scan.nextLine();		
					 	             scan.next();
					 	             
					 	             System.out.println("Se procederá con la carga de productos...");
							         
					 	             while (hayProductos) {
					 	            	 System.out.println("************Datos del comprador del Producto************");
						               	 System.out.println("Ingrese la descripcion del producto"); 
						               	 descripcion = scan.nextLine();
						               	 scan.next();
						               	 
						               	 System.out.println("Ingrese la cantidad del producto"); 
						               	 cantidad = scan.nextInt();
						               	 
						               	 System.out.println("Ingrese el valor unitario del producto"); 
						               	 valorUnitario = scan.nextDouble();	               	 
						               	
						               	 contador++;
						               	 subtotal = subtotal + (valorUnitario * cantidad);
						               	 
						               	 System.out.println("Producto agregado exitosamente");	
						               	 
						               	 System.out.println("1: para agregar un producto nuevo");
										 System.out.println("2: para finalizar con la carga");
										 
										 System.out.println("Ingrese su opcion...");
										 opcion3 = scan.nextInt(); 
										 
										 if (opcion3 == 2) {
											 System.out.println("Carga finalizada. A continuacion vera el detalle de su compra");
											 
											 System.out.println("*****************************************");
											 System.out.println("Fecha: "+sdf);
											 System.out.println("*****************************************");
											 System.out.println("Razon Social: "+razonSocial);
											 System.out.println("Domicilio: "+domicilio);
											 System.out.println("*****************************************");
											 System.out.println("Cant.     |    Descripcion     |     P. Unit.    |    P.Total");
											 for(int i=1; i<=contador; i++) {
												 
											 }
											 hayProductos = false;
										 }
					 	             }
									 salir = true;
								  }
								  else if(opcion2 == 'n'){
									  System.out.println("No hay productos para inciar la venta");
									 salir = true;
								  }
								  else{
									  System.out.println("La opcion ingresada es incorrecta");
									  System.out.println("Hay Productos? s/n ");
			 							 
									  System.out.println("Ingrese su opcion...");
									  opcion2 = scan.next().charAt(0); 
								  }		  
							 }
						}
					    else {
					            	
					            	System.out.println("La opcion ingresada es incorrecta.");
					          }
							  
				 } while (opcion1 != '2');
}
}                                   if(opcion2 == 's') {
											 System.out.println("************Datos del comprador del Comprador************"); 
							                 System.out.println("Ingrese la razon social del Comprador"); 
							 	             razonSocial = scan.nextLine();			 	             
							 	             scan.next();
							 	             
							 	             System.out.println("Ingrese el domicilio del Comprador"); 
							 	             domicilio = scan.nextLine();		
							 	             scan.next();
							 	             
							 	             System.out.println("Se procederá con la carga de productos...");
					 	             
							 	             hayProductos = true;
					                 while(hayProductos) {
					                	     System.out.println("************Datos del comprador del Producto************");
							               	 System.out.println("Ingrese la descripcion del producto"); 
							               	 descripcion = scan.nextLine();
							               	 scan.next();
							               	 
							               	 System.out.println("Ingrese la cantidad del producto"); 
							               	 cantidad = scan.nextInt();
							               	 
							               	 System.out.println("Ingrese el valor unitario del producto"); 
							               	 valorUnitario = scan.nextDouble();
							               	 
							               	 System.out.println("Producto agregado exitosamente");
							               	 
							               	 System.out.println("1: para agregar un producto nuevo");
											 System.out.println("2: para finalizar con la carga");
											 
											 System.out.println("Ingrese su opcion...");
											 opcion3 = scan.nextInt(); 
											 
											 if (opcion3 == 2) {
												 System.out.println("Carga finalizada. A continuacion vera el detalle de su compra");
												 
												 System.out.println("*****************************************");
												 System.out.println("Fecha: " +);
												 System.out.println("*****************************************");
												 
												 hayProductos = false;
											 }
									 
									 contador++;
									 
									 if (opcion3 == 2) {
										 System.out.println("Carga finalizada. A continuacion vera el detalle de su compra");
										 hayProductos = false;
									 }
									 else if(opcion3 != 1 || opcion3 != 2) {
										 System.out.println("La opcion ingresada es incorrecta");
									 }					               	 
			                   }
			                   if(contador > 0) {
			                	 
			                   }     
					    }
						else if (opcion2 == 'n') {
							System.out.println("No hay productos para efectuar la venta");
							System.exit(0);
						} 
					  }		 

				 
      }
}
