package tercerTrim;

import java.util.Scanner;

public class GestorPedidos {

	private float cuenta = 0;

	public void agregarCuenta(float deuda) {
		cuenta += deuda;
	}

	public void pagar() {
		Scanner ent = new Scanner(System.in);
		boolean op = true;
		System.out.println("//////////////////////////\r\n" + "//Procederemos al pago //\r\n" + "//Total factura: "
				+ cuenta + "€ //\r\n" + "/////////////////////////");

		System.out.println("Introduzca el dinero: ");

		do {
			float pago = ent.nextFloat();
			if (pago >= cuenta) {

				System.out.println(
						"LA DEVOLUCION DE SU PAGO ES: " + (pago - cuenta) + "€ \n" + "****GRACIAS POR SU VISITA****");
				op = false;
			} else {
				System.out.println("Por favor no intente engañarnos introduzca el importe de: " + cuenta + "€");
			}
		} while (op);

	}

	public static float RealizarPedido() {
		float total = 0.00f;
		float total2 = 0.00f;
		float total3 = 0.00f;
		Scanner ent = new Scanner(System.in);

		System.out.println("/////////////////////////////////////\r\n" + "// ¿Cuantas personas van a pedir? // \r\n"
				+ "////////////////////////////////////");
		int el = ent.nextInt();
		int cont = 1;

		// Primer Menu
		int Menu = 1;
		String Primero = "Lentejas con chorizo", Segundo = "Chuleton con patatas", Postre = "Tarta de queso";
		float precio = 15;
		// Segundo Menu
		int Menu2 = 2;
		String Primero2 = "Cocido Montañes", Segundo2 = "Pescado con ensalada", Postre2 = "Natillas";
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
							+ "Precio: " + precio + "€" + "\n" + "*************************");
					total += precio;
					break;
				case 2:
					System.out.println("Menu: " + Menu2 + "\n" + "Primer Plato: " + Primero2 + "\n" + "Segundo Plato: "
							+ Segundo2 + "\n" + "Postre: " + Postre2 + "\n" + "Precio: " + precio2 + "€" + "\n"
							+ "*************************");
					total2 += precio2;
					break;
				case 3:
					System.out.println("Menu: " + Menu3 + "\n" + "Primer Plato: " + Primero3 + "\n" + "Segundo Plato: "
							+ Segundo3 + "\n" + "Postre: " + Postre3 + "\n" + "Precio: " + precio3 + "€" + "\n"
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
