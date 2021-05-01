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
				String razonSocial, domicilio;
				
				//Declaracion e inicializacion de las variables total y subtotal y contador referente a la compra.
				double subtotal=0;
				double total=subtotal; 
				int contador;
				
				Date fecha= new Date();		
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	}

}
