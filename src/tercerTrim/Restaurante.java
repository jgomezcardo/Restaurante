package tercerTrim;

import java.util.Scanner;

public class Restaurante {

	public static void main (String args[]) {
		
		Scanner ent = new Scanner(System.in);
		int elec = 0;
		 
		System.out.println("//////////////////////////////////////////////////////////////////////////\r\n" + 
				"// Bienvenido a nuestro restaurante, estaremos encantados de atenderle 	//\r\n" + 
				"// ___________________________________________________________________  //\r\n" + 
				"// ¿Qué desea hacer?						       	//\r\n" + 
				"// 1.Reservar una mesa						   	//\r\n" + 
				"// 2.Realizar pedido						   	//\r\n" + 
				"// 3.Proceder con el pago					   	// \r\n" + 
				"//////////////////////////////////////////////////////////////////////////");
		
		elec = ent.nextInt();
		
		switch (elec) {
		
		case 1:
			//parte del codigo correspondiente a ReservaMesa();
			
			break;
		case 2:
			//parte del codigo correspondiente a RealizarPedido().;
			
			break;
		case 3:
			//parte del codigo correspondiente a cobroCliente()$;
			
			break;
		}
		
	}
}
