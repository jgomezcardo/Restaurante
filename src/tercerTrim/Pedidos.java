package tercerTrim;

import java.util.ArrayList;

public class Pedidos {

	public ArrayList<Productos> ListaMenu;
	
	public Pedidos() {
		ListaMenu = new ArrayList<Productos>();
	}

	public void Menus() {
		
		
		Productos ProductoNuevo = new Productos();
		
		//Primer menu
	    ProductoNuevo.setMenu(1);
	    ProductoNuevo.setPrimero("Lentajas con chorizo");
	    ProductoNuevo.setSegundo("Chuleta con patatas");
	    ProductoNuevo.setPostre("Tarta de queso");
	    ProductoNuevo.setPrecio(15);
	    
	    ListaMenu.add(ProductoNuevo);
	}
}