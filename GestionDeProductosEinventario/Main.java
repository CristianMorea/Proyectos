package GestionDeProductosEinventario;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) 
	{   
		
		Inventario<Producto> RegistroProductos = new Inventario();
		
		Producto producto = new Producto ("A1","leche",200.4,100 );
		Producto producto1 = new Producto ("A12","lechuga",24.4,23 );
		Producto producto2 = new Producto ("A123","huevos",34.4,50 );
		Producto producto3 = new Producto ("B1","atun",23,60 );
		Producto producto4 = new Producto ("B12","azucar",45.4,45 );
		Producto producto5 = new Producto ("B123","chocolate",74.4,12 );
		Producto producto6 = new Producto ("C12","leche",94.4,23);
		
		
		RegistroProductos.agregarProducot(producto);
		RegistroProductos.agregarProducot(producto1);
		RegistroProductos.agregarProducot(producto2);
		RegistroProductos.agregarProducot(producto3);
		RegistroProductos.agregarProducot(producto4);
		RegistroProductos.agregarProducot(producto5);
		RegistroProductos.agregarProducot(producto6);
		
		System.out.println("LOS PRODUCTOS SON: ");
		RegistroProductos.mostrarProductos();
		
		System.out.println("ELIMINAR PRODUCTO:");
		RegistroProductos.eliminarProducto(producto);
        RegistroProductos.mostrarProductos();
        
        String nombreBusqueda = "leche";
        System.out.println("BUSCANDO PRODUCTOS CON: " + nombreBusqueda);
        ArrayList<Producto> productosEncontrados = RegistroProductos.buscarPorNombre(nombreBusqueda);
        if (productosEncontrados.isEmpty()) 
        {
            System.out.println("No se encontraron productos con ese nombre.");
        } else {
            for (Producto elemento : productosEncontrados)
            {
                System.out.println(elemento);
            }
        }
        System.out.println();
        
        double ValorTotal = RegistroProductos.calcularValorTotalInventario();
        System.out.println("EL VALOR TOTAL DEL INVENTARIO ES:"+ValorTotal);
        
        Producto p2Actualizado = new Producto("C12","leche",10,10);
        System.out.println("Actualizando producto:");
        RegistroProductos.actualizarProducto(p2Actualizado);
        System.out.println();

        // Mostrar productos actualizados
        System.out.println("Productos en el inventario después de la actualización:");
        RegistroProductos.mostrarProductos();
        System.out.println();
	}
	
	
	
	
}
