package Compra;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

public static void main(String[] args) {
	// Ingresar los datos de una compra (2 productos),
	// y los datos del comprador, para emitir la factura de compra.
	Scanner scan = new Scanner(System.in);
	
	// Declaracion de la constante IVA
	final double IVA = 0.21;
	
	//Declaracion de variables para  Productos.
	int cantidad1, cantidad2;
	String descripcion1;
	String descripcion2;
	double valorUnitario1, valorUnitario2;		
	
	//Declaracion de variables para un Comprador.
	String razonSocial, domicilio;
	
	//Declaracion e inicializacion de las variables total y subtotal y contador referente a la compra.
	double subtotal, total, valorIVA; 
	
	DecimalFormat d = new DecimalFormat("##.00");
	
	Date fecha= new Date();		
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
	total= subtotal = 0;
	
	 System.out.println("************Datos del comprador del Comprador************"); 
     System.out.println("Ingrese la razon social del Comprador"); 
     razonSocial = scan.nextLine();			 	             
     
     System.out.println("Ingrese el domicilio del Comprador"); 
     domicilio = scan.nextLine();		
     
     System.out.println("Se procederá con la carga de productos...");
     
     System.out.println("************Datos del Producto 1 ************");
   	 System.out.println("Ingrese la descripcion del producto"); 
   	 descripcion1 = scan.nextLine();
   	 
   	 System.out.println("Ingrese la cantidad del producto"); 
   	 cantidad1 = scan.nextInt();
   	 
   	 System.out.println("Ingrese el valor unitario del producto"); 
   	 valorUnitario1 = scan.nextDouble();	               	 
   	                	            	
   	 subtotal = subtotal + (valorUnitario1 * cantidad1);
   	 
   	 System.out.println("************Datos del Producto 2 ************");
   	 System.out.println("Ingrese la descripcion del producto 2"); 
     scan.nextLine();
     descripcion2 = scan.nextLine();
     
   	 System.out.println("Ingrese la cantidad del producto 2"); 
   	 cantidad2 = scan.nextInt();
   	 
   	 System.out.println("Ingrese el valor unitario del producto"); 
   	 valorUnitario2 = scan.nextDouble();
   	 
   	 subtotal = subtotal + (valorUnitario2 * cantidad2);
   	 
   	 System.out.println("Productos agregados exitosamente");
   	 
   	 valorIVA = subtotal * IVA;
   	 
   	 System.out.println("Carga finalizada. A continuacion vera el detalle de su compra");				 
	 System.out.println("*****************************************");
	 System.out.println("Fecha: " + sdf.format(fecha));
	 System.out.println("*****************************************");
	 System.out.println("Razon Social: "+razonSocial);
	 System.out.println("Domicilio: "+domicilio);
	 System.out.println("********************************************************************************************************************");
	 System.out.println("Cant.\t|Descripcion\t|P. Unit.\t|P.Total");
	 System.out.println(cantidad1 + "\t|" + descripcion1 + "      \t|" + d.format(valorUnitario1) + "\t|" + d.format((valorUnitario1 + IVA)));
	 System.out.println(cantidad2 + "\t|" + descripcion2 + "      \t|" + d.format(valorUnitario2) + "\t|" + d.format((valorUnitario2 + IVA)));
	 System.out.println("********************************************************************************************************************");
	 System.out.println("VALOR IVA: " + d.format(valorIVA));
	 System.out.println("SUBTOTAL SIN IVA: " + d.format(subtotal));
	 System.out.println("TOTAL: " + d.format((subtotal + valorIVA)));				 
	 System.out.println("********************************************************************************************************************");
      }
}
