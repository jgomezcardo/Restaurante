package tercerTrim;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurante {

	public static void main(String args[]) {// Parte de JuanGomezCardo

		Scanner ent = new Scanner(System.in);
		int elec = 0;

		System.out.println("//////////////////////////////////////////////////////////////////////////\r\n"
				+ "// Bienvenido a nuestro restaurante, estaremos encantados de atenderle 	//\r\n"
				+ "// ___________________________________________________________________  //\r\n"
				+ "// ¿Qué desea hacer?						       	//\r\n"
				+ "// 1.Reservar una mesa						   	//\r\n"
				+ "// 2.Realizar pedido						   	//\r\n"
				+ "// 3.Proceder con el pago					   	// \r\n"
				+ "//////////////////////////////////////////////////////////////////////////");

		elec = ent.nextInt();

		switch (elec) {

		case 1:
			// parte del codigo correspondiente a ReservaMesa();

			break;
		case 2:
			RealizarPedido();

			break;
		case 3:
			// parte del codigo correspondiente a cobroCliente()$;

			break;
		}

	}

	public static void RealizarPedido() {// Parte de CarlosAntonyMoscosoPalacios
		Scanner ent = new Scanner(System.in);
		
		System.out.println("¿Cuantas personas van a pedir?");
		int el = ent.nextInt();
		int cont =1;
		
		
		// Primer Menu
		int Menu = 1;
		String Primero = "Lentejas con chorizo", Segundo = "Chuleton con patatas", Postre = "Tarta de queso";
		float precio = 15;
		// Segundo Menu
		int Menu2 = 2;
		String Primero2 = "Cocido Montañes", Segundo2 = "Pescado con ensalada", Postre2 = "Natillas";
		float precio2 = 12;
		//Tercer menu
		int Menu3 = 3;
		String Primero3 = "Macarrones con queso", Segundo3 = "Hamburguesa con patatas", Postre3 = "Helado";
		float precio3 = 13.50f;
		
		
		System.out.println("******LA CARTA******");
		 
		 System.out.println("*************************" +"\n"+"Menu: "  + Menu + "\n" + "Primer Plato: " + Primero + "\n" + "Segundo Plato: " + Segundo + "\n" + 
				 "Postre: " + Postre + "\n" + "Precio: " + precio + "\n" + "*************************");
		 
		 System.out.println("Menu: "  + Menu2 + "\n" + "Primer Plato: " + Primero2 + "\n" + "Segundo Plato: " + Segundo2 + "\n" + 
				 "Postre: " + Postre2 + "\n" + "Precio: " + precio2 + "\n" + "*************************");
		 
		 System.out.println("Menu: "  + Menu3 + "\n" + "Primer Plato: " + Primero3 + "\n" + "Segundo Plato: " + Segundo3 + "\n" + 
				 "Postre: " + Postre3 + "\n" + "Precio: " + precio3 + "\n" + "*************************");
		 do {
		 System.out.println("Que menu desea escoger :" + "\n");
		 int el2 = ent.nextInt();
		 
		 switch(el2) {
		 
		 case 1:
			 System.out.println("*************************" +"\n"+"Menu: "  + Menu + "\n" + "Primer Plato :" + Primero + "\n" + "Segundo Plato :" + Segundo + "\n" + 
					 "Postre :" + Postre + "\n" + "Precio :" + precio + "\n" + "*************************");
			 break;
		 case 2:
			 System.out.println("Menu: "  + Menu2 + "\n" + "Primer Plato :" + Primero2 + "\n" + "Segundo Plato :" + Segundo2 + "\n" + 
					 "Postre :" + Postre2 + "\n" + "Precio :" + precio2 + "\n" + "*************************");
			 break;
		 case 3:
			 System.out.println("Menu: "  + Menu3 + "\n" + "Primer Plato :" + Primero3 + "\n" + "Segundo Plato :" + Segundo3 + "\n" + 
					 "Postre :" + Postre3 + "\n" + "Precio :" + precio3 + "\n" + "*************************");
			 break;
		
		 }
		 cont++;
		}while(cont <= el);
	}

}
