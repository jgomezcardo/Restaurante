package tercerTrim;

import java.util.Scanner;

public class GestorPedidos {

	private float cuenta = 0;
	private float com;
	public void agregarCuenta(float deuda) {
		cuenta += deuda * com;
	}

	public void emesa() {
		// parte del codigo correspondiente a ReservaMesa();
		Scanner ent = new Scanner(System.in);
		System.out.println("//////////////////////////////////////////\n" + 
				"//   �Que mesa desea reservar?		//\n" + 
				"//					//\n" + 
				"// 1. -Mesa para 2 = x0.25�		//\n" + 
				"// 2. -Mesa para 4 = x0.50�		//\n" + 
				"// 3. -Mesa para 6 = x0.75�		//\n" + 
				"// 4. -Mesa para 8 = x1.00�		//\n" + 
				"// 5. -Mesa para 10 o m�s = 1.25�	//\n" + 
				"//					//\n" + 
				"//////////////////////////////////////////");
		
		
		int cont = 1;
		float preciom1 = 1.25f, preciom2 = 1.50f, preciom3 = 1.75f, preciom4 = 2.00f, preciom5 = 2.25f; 

		
		do {
			
			int mesa = ent.nextInt();
			if(mesa == 1 || mesa == 2 || mesa == 3 || mesa == 4 || mesa == 5) {
				
			
			switch(mesa) {
			
			case 1: 
				System.out.println("Mesa para 2 = " + preciom1 + "�");
				com = preciom1;
				break;
			case 2:
				System.out.println("Mesa para 4 = " + preciom2 + "�");
				com = preciom2;
				break;
			case 3:
				System.out.println("Mesa para 6 = " + preciom3 + "�");
				com = preciom3;
				break;
			case 4:
				System.out.println("Mesa para 8 = " + preciom4 + "�");
				com = preciom4;
				break;
			case 5:
				System.out.println("Mesa para 10 o más = " + preciom5 + "�");
				com = preciom5;
				break;
				
			}
			cont++;
			
			}else {
				
				System.out.println("Porfavor seleccione una opcion para reservar alguna mesa");
				
			}
		}while(cont > 5);
		
		
		
		
	}
	public void pagar() {
		Scanner ent = new Scanner(System.in);
		boolean op = true;
		System.out.println("//////////////////////////\r\n" + "//Procederemos al pago //\r\n" + "//Total factura: "
				+ cuenta + "� //\r\n" + "/////////////////////////");

		System.out.println("Introduzca el dinero: ");

		do {
			float pago = ent.nextFloat();
			if (pago >= cuenta) {

				System.out.println(
						"LA DEVOLUCION DE SU PAGO ES: " + (pago - cuenta) + "� \n" + "****GRACIAS POR SU VISITA****");
				op = false;
			} else {
				System.out.println("Por favor no intente enga�arnos introduzca el importe de: " + cuenta + "�");
			}
		} while (op);

	}

	public static float RealizarPedido() {
		float total = 0.00f;
		float total2 = 0.00f;
		float total3 = 0.00f;
		Scanner ent = new Scanner(System.in);

		System.out.println("/////////////////////////////////////\r\n" + "// �Cuantas personas van a pedir? // \r\n"
				+ "////////////////////////////////////");
		int el = ent.nextInt();
		int cont = 1;

		// Primer Menu
		int Menu = 1;
		String Primero = "Lentejas con chorizo", Segundo = "Chuleton con patatas", Postre = "Tarta de queso";
		float precio = 15;
		// Segundo Menu
		int Menu2 = 2;
		String Primero2 = "Cocido Monta�es", Segundo2 = "Pescado con ensalada", Postre2 = "Natillas";
		float precio2 = 12;
		// Tercer menu
		int Menu3 = 3;
		String Primero3 = "Macarrones con queso", Segundo3 = "Hamburguesa con patatas", Postre3 = "Helado";
		float precio3 = 13.50f;

		System.out.println("******LA CARTA******");

		System.out.println("*************************" + "\n" + "Menu: " + Menu + "\n" + "Primer Plato: " + Primero
				+ "\n" + "Segundo Plato: " + Segundo + "\n" + "Postre: " + Postre + "\n" + "Precio: " + precio + "\n"
				+ "*************************");

		System.out.println("Menu: " + Menu2 + "\n" + "Primer Plato: " + Primero2 + "\n" + "Segundo Plato: " + Segundo2
				+ "\n" + "Postre: " + Postre2 + "\n" + "Precio: " + precio2 + "\n" + "*************************");

		System.out.println("Menu: " + Menu3 + "\n" + "Primer Plato: " + Primero3 + "\n" + "Segundo Plato: " + Segundo3
				+ "\n" + "Postre: " + Postre3 + "\n" + "Precio: " + precio3 + "\n" + "*************************");
		do {

			System.out.println("Que menu desea escoger :" + "\n" + "Elija del 1 al 3" + "\n");
			int el2 = ent.nextInt();

			if (el2 == 1 || el2 == 2 || el2 == 3 && el != 0) {
				switch (el2) {

				case 1:
					System.out.println("*************************" + "\n" + "Menu: " + Menu + "\n" + "Primer Plato: "
							+ Primero + "\n" + "Segundo Plato: " + Segundo + "\n" + "Postre: " + Postre + "\n"
							+ "Precio: " + precio + "�" + "\n" + "*************************");
					total += precio;
					break;
				case 2:
					System.out.println("Menu: " + Menu2 + "\n" + "Primer Plato: " + Primero2 + "\n" + "Segundo Plato: "
							+ Segundo2 + "\n" + "Postre: " + Postre2 + "\n" + "Precio: " + precio2 + "�" + "\n"
							+ "*************************");
					total2 += precio2;
					break;
				case 3:
					System.out.println("Menu: " + Menu3 + "\n" + "Primer Plato: " + Primero3 + "\n" + "Segundo Plato: "
							+ Segundo3 + "\n" + "Postre: " + Postre3 + "\n" + "Precio: " + precio3 + "�" + "\n"
							+ "*************************");
					total3 += precio3;
					break;

				}
				cont++;
			} else {
				System.out.println("Por favor introduce el Menu entre 1 al 3, gracias");
			}

		} while (cont <= el);

		float totalFactura = total + total2 + total3;
		return totalFactura;
	}

}
