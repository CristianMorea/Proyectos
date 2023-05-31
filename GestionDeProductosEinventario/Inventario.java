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
			System.out.println("LOS PRODUCTOS SON: ");
			System.out.println(elementos);
		}
	}
	
	
	//METODO GENERICO PARA BUSCAR POR NOMBRE
	public <T> ArrayList<T> buscarPorNombre(String nombre, ArrayList<T> lista) {
	    ArrayList<T> encontrados = new ArrayList<>();
	    for (T elemento : lista) {
	        try {
	            // Utilizamos reflexión para obtener el método getNombre() en tiempo de ejecución
	            Method metodoGetNombre = elemento.getClass().getMethod("getNombre");
	            String nombreElemento = (String) metodoGetNombre.invoke(elemento);
	            if (nombreElemento.equals(nombre)) {
	                encontrados.add(elemento);
	            }
	        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
	            // Manejo de excepciones
	            e.printStackTrace();
	        }
	    }
	    return encontrados;
	}
	
	//CALCULAR INVENTARIO DE MANERA GENERICA
	public double calcularTotalInventario() {
	    double totalInventario = 0;
	    for (T elemento : listaProductos) {
	        try {
	            Method metodoGetValor = elemento.getClass().getMethod("getValor");
	            double valorElemento = (double) metodoGetValor.invoke(elemento);
	            totalInventario += valorElemento;
	        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
	            // Manejo de excepciones
	            e.printStackTrace();
	        }
	    }
	    return totalInventario;
	}
	
	//ACTUALIZAR DATOS DE UN PRODUCTO RECIVIENDO PARAMETRO PRODOUCTO
	
	public void ActualizarProducto(Producto producto) {
	    int indice = listaProductos.indexOf(producto);
	    if (indice != -1) {
	        listaProductos.set(indice, (T) producto);
	        System.out.println("Producto actualizado correctamente.");
	    } else {
	        System.out.println("El producto no se encuentra en la lista.");
	    }
	}
	
}
