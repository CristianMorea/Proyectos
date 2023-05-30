package AgendaDeContactos;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

public class AgendaContactos <T>
{
	ArrayList<T> listaContactos = new ArrayList<>();
	
	
	public void agregarContacto(T objeto)
	{
		listaContactos.add(objeto);
	}
	
	public void mostrarContactos()
	{
		for (T contacto : listaContactos)
		{
			System.out.println("LOS CONTACTOS SON: "+ contacto);
			
		}
	}
	
	
	public void eliminarContacto(T objeto)
	{
		listaContactos.remove(objeto);
	}

	public ArrayList<T> buscarPorNombre(String nombre) {
	    ArrayList<T> contactosEncontrados = new ArrayList<>();
	    
	    for (T contacto : listaContactos) {
	        if (contacto instanceof Contacto) {
	            Contacto c = (Contacto) contacto;
	            if (c.getNombre().equals(nombre)) {
	                contactosEncontrados.add(contacto);
	            }
	        }
	    }
	    
	    return contactosEncontrados;
	}
} 
