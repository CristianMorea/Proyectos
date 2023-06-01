package GestionDeProductosEinventario;

import java.io.CharArrayReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Inventario <T> 
{
	ArrayList<T> listaProductos = new ArrayList<>();
	
	public void agregarProducot(T obgeto)
	{
		listaProductos.add(obgeto);
	}
	
	public void eliminarProducto(T obgeto)
	{
		listaProductos.remove(obgeto);
	}
	
	
	public void mostrarProductos()
	{
		for(T elementos : listaProductos)
		{
			System.out.println(elementos);
			
		}
	}
	
	
	// BUSCAR POR NOMBRE
	 public ArrayList<T> buscarPorNombre(String nombre) {
	        ArrayList<T> productosEncontrados = new ArrayList<>();
	        for (T producto : listaProductos) {
	            if (producto instanceof Producto && ((Producto) producto).getNombre().equals(nombre)) {
	                productosEncontrados.add(producto);
	            }
	        }
	        return productosEncontrados;
	    }
	
	//CALCULAR INVENTARIO DE MANERA GENERICA
	 public double calcularValorTotalInventario() {
	        double valorTotal = 0;
	        for (T producto : listaProductos) {
	            if (producto instanceof Producto) {
	                double precio = ((Producto) producto).getPrecio();
	                int cantidad = ((Producto) producto).getCantidad();
	                valorTotal += precio * cantidad;
	            }
	        }
	        return valorTotal;
	    }
	
	//ACTUALIZAR DATOS DE UN PRODUCTO RECIBIENDO PARAMETRO PRODOUCTO
	
	 public void actualizarProducto(T productoActualizado) {
	        int indice = listaProductos.indexOf(productoActualizado);
	        if (indice != -1) {
	            listaProductos.set(indice, productoActualizado);
	            System.out.println("Producto actualizado correctamente.");
	        } else {
	            System.out.println("No se encontró el producto en el inventario.");
	        }
	    }
	
}
