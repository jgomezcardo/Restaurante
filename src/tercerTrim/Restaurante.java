package tercerTrim;

import java.util.Arrays;
import java.util.Scanner;

public class Restaurante {

	public static void main(String args[]) {// Parte de JuanGomezCardo
		Pedidos MenusRestaurante = new Pedidos();
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
			
				for (int i =0; i < MenusRestaurante.ListaMenu.size(); i++) {
					System.out.println(MenusRestaurante.ListaMenu.get(i));
				}
			

			break;
		case 3:
			// parte del codigo correspondiente a cobroCliente()$;

			break;
		}

	}

	///public static void RealizarPedido() {// Parte de CarlosAntonyMoscosoPalacios
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	String[] Primeros = new String[] {"Lentajas con chorizo","Cocido montañes","Arroz a la cubana"};
		String Segundos[] = new String[] {"Chuleta con patatas","Pescado","Pisto"};
		String Postre[] = new String[] {"Tarta de queso","Natilla","Yogur"};
		
		
		Scanner ent = new Scanner(System.in);
		System.out.println("A continuacion le mostraremos el menu" + "\n" + "\n" +
		"Primeros platos " +"\n" + Arrays.toString(Primeros)
		);
		
		
		System.out.println("Elija el primer plato :");
			String sel = ent.next();
		if(sel.equals(Primeros)) {
			System.out.println();
		}
		}*/
	
}
