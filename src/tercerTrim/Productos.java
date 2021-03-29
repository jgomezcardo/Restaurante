package tercerTrim;

public class Productos {

		private int Menu;
		private String Primero;
		private String Segundo;
		private String Postre;
		private float Precio;
		
		public Productos() {
			
			int Menu = 0;
			String Primero = "";
			String Segundo = "";
			String Postre = "";
			float Precio = 0.00f;
			
		}
		public Productos(int Menu, String Primero, String Segundo, String Postre, float Precio) {
			
			this.Menu = Menu;
			this.Primero = Primero;
			this.Segundo = Segundo;
			this.Postre = Postre;
			this.Precio = Precio;
		}
		public int getMenu() {
			return Menu;
		}
		public void setMenu(int menu) {
			Menu = menu;
		}
		public String getPrimero() {
			return Primero;
		}
		public void setPrimero(String primero) {
			Primero = primero;
		}
		public String getSegundo() {
			return Segundo;
		}
		public void setSegundo(String segundo) {
			Segundo = segundo;
		}
		public String getPostre() {
			return Postre;
		}
		public void setPostre(String postre) {
			Postre = postre;
		}
		public float getPrecio() {
			return Precio;
		}
		public void setPrecio(float precio) {
			Precio = precio;
		}
		@Override 
		public String toString() {
			
			return "Menus" + "\n" + "Menu " + getMenu() + "\n" + "Primer Plato :" + getPrimero() + "\n" + "Segundo Plato :" + "\n" + 
			"Postre :" + getPostre() + "\n" + "Precio :" + getPrecio() + "\n" + "*************************";
		}
}
