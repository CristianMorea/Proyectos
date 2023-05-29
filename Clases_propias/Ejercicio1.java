package Clases_propias;

import java.util.ArrayList;

public class Ejercicio1 {

	public static <T> void main(String[] args) 
	{
		ArrayList<Empleado> ColeccionEmpleados = new ArrayList<Empleado>();
		Empleado em1 = new Empleado("cristian", 23, 2090);
		Empleado em2 = new Empleado("david", 20, 2099);
		Empleado em3 = new Empleado("cristian", 26, 2060);
		
		ColeccionEmpleados.add(em1);
		ColeccionEmpleados.add(em2);
		ColeccionEmpleados.add(em3);
	
		System.out.println(MiList.buscarElemento(ColeccionEmpleados, em3));
		
		ArrayList<String>Nombres = new ArrayList<String>();
		Empleado e1 = new Empleado("dania");
		Empleado e12 = new Empleado("pamela");
		Empleado e13 = new Empleado("lorena");
		
		Nombres.add(e1.getNombre());
		Nombres.add(e12.getNombre());
		Nombres.add(e13.getNombre());
		
		System.out.println(MiList.buscarElemento( Nombres, e12.getNombre()));
		
		
		
       
	}
	
class MiList
{
	public static <T> boolean buscarElemento(ArrayList<T> lista, T elemento)
	{
		for(T item:lista)
		{
			if(item.equals(elemento))
			{
				System.out.println(elemento);
				return true;
			}
		}
		return false;
	}
}
	

}




