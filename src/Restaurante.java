
import java.io.*;

public class Restaurante {
	
	private double precio,plato,cliente,resultado;
	BufferedReader PagoRestaurante=new BufferedReader(new InputStreamReader (System.in));
	
	public void Leer()
	{
		try {
		System.out.println("Dame el precio del plato");
		precio=Double.parseDouble(PagoRestaurante.readLine());
		System.out.println("Cuanto dinero trae el cliente");
		cliente=Double.parseDouble(PagoRestaurante.readLine());
		
		}catch(IOException e)
		{
			System.out.println("Error de lectura...");
		}catch(NumberFormatException e)
		{
			System.out.println("Solo datos numericos...");
		}
	}
	
	public void Calcular()
	{
		resultado=(cliente*1000)/precio;
	}
	
	public void Visualizar()
	{
		System.out.println("Le debes de dar" +resultado+);
	}

}
