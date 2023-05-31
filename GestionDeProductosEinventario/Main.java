package GestionDeProductosEinventario;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) 
	{
		Inventario<Producto> RegistroProductos = new Inventario();
		
		Producto producto = new Producto ("A1","cafe",234.4,56 );
		Producto producto1 = new Producto ("A12","leche",24.4,23 );
		Producto producto2 = new Producto ("A123","huevos",34.4,50 );
		Producto producto3 = new Producto ("B1","atun",23,60 );
		Producto producto4 = new Producto ("B12","azucar",45.4,45 );
		Producto producto5 = new Producto ("B123","chocolate",74.4,12 );
		Producto producto6 = new Producto ("C12","pasta",94.4,23);
		
		
		RegistroProductos.agregarProducot(producto);
		RegistroProductos.agregarProducot(producto1);
		RegistroProductos.agregarProducot(producto2);
		RegistroProductos.agregarProducot(producto3);
		RegistroProductos.agregarProducot(producto4);
		RegistroProductos.agregarProducot(producto5);
		RegistroProductos.agregarProducot(producto6);
		
		RegistroProductos.mostrarProductos();
		
		
		
	}

}
