
package coche;

/**
 *
 * @author Fran
 */
public class Main {
    
      public static void main(String[] args) {
        Coche miCoche;
        int stockActual;
        
        miCoche = operatoriaVentaGaldeanoFernándezAlejandro2122();
        
        operatoriaCompraGaldeanoFernándezAlejandro2122(miCoche);
    }

	private static void operatoriaCompraGaldeanoFernándezAlejandro2122(Coche miCoche) {
		int stockActual;
		try
		{
			System.out.println("Compra de Coches");
			miCoche.comprar(500);
		} catch (Exception e)
		{
			System.out.print("Fallo al ingresar");
		}
		stockActual = miCoche.obtenerStock();
		System.out.println("El stock actual es"+ stockActual );
	}

	private static Coche operatoriaVentaGaldeanoFernándezAlejandro2122() {
		Coche miCoche;
		miCoche = new Coche("Opel",12000,500);
		try
		{
			System.out.println("Venta de Coches");
			miCoche.vender(300);
		} catch (Exception e)
		{
			System.out.print("Fallo al vender");
		}
		return miCoche;
	}

}
    
