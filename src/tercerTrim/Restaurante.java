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
			
			System.out.println("¿Que mesa desea reservar? \n"
					+ "1º: Mesa para 2 = 0.25€ \n"
					+ "2º: Mesa para 4 = 0.50€ \n"
					+ "3º: Mesa para 6 = 0.75€ \n"
					+ "4º: Mesa para 8 = 1.00€ \n"
					+ "5º: Mesa para 10 o más = 1.25€");
			
			
			int cont = 1;
			float preciom1 = 0.35f, preciom2 = 0.50f, preciom3 = 0.75f, preciom4 = 1.00f, preciom5 = 1.25f; 
			
			
			do {
				
				int mesa = ent.nextInt();
				if(mesa == 1 || mesa == 2 || mesa == 3 || mesa == 4 || mesa == 5) {
					
				
				switch(mesa) {
				
				case 1: 
					System.out.println("Mesa para 2 = " + preciom1 + "€");
					break;
				case 2:
					System.out.println("Mesa para 4 = " + preciom2 + "0€");
					break;
				case 3:
					System.out.println("Mesa para 6 = " + preciom3 + "€");
					break;
				case 4:
					System.out.println("Mesa para 8 = " + preciom4 + "0€");
					break;
				case 5:
					System.out.println("Mesa para 10 o más = " + preciom5 + "€");
					break;
					
				}
				cont++;
				
				}else {
					
					System.out.println("Porfavor seleccione una opcion para reservar alguna mesa");
					
				}
			}while(cont > 5);
			
			
			
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
