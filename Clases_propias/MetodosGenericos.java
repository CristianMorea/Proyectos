package Clases_propias;

import java.util.Arrays;
public class MetodosGenericos {

	public static void main(String[] args) {
		
		String nombres[] = { "jose","maria", "ana","pamela","isabela", "daniela"};
        String elementos=MisMatrices.getElementos(nombres);
        System.out.println( elementos );
        System.out.println(MisMatrices.MostrarDatos(nombres));
        System.out.println(MisMatrices.ElementoMenor(nombres));
        
        
        Empleado ListaEmpleados[]= 
        	   {new Empleado ("ana",25,3200),
        		new Empleado ("pedro",25,3200),
        		new Empleado ("cmila",25,3200),
        		new Empleado ("diana",25,3200)
        		};
        System.out.println(MisMatrices.getElementos(ListaEmpleados));
        System.out.println(MisMatrices.MostrarDatos(ListaEmpleados));
        
        Programa ListaProgramas[]= 
        	    {new Programa("ingenieria",32,2300),
        		new Programa("derecho",32,4300),
        		new Programa("medicina",32,2300),
        		new Programa("microbiologia",32,2700),
        		new Programa("comunicacion",32,2300)
        		};
        System.out.println(MisMatrices.getElementos(ListaProgramas));
        System.out.println( MisMatrices.MostrarDatos(ListaProgramas));
       
     
	}
}


class MisMatrices
{
	//NUMERO DE ELEMENTOS EN EL ARRAY
	public static<T> String getElementos(T[]a)
	{
		return "El array tiene "+ a.length +" elementos: ";
	}
	//MOSTRAR DATOS Y NUMERO DE ELEMENTOS
	
	
	 public static <T> String MostrarDatos(T[] a) {
	        StringBuilder sb = new StringBuilder();
	        sb.append("El array tiene ").append(a.length).append(" elementos:\n");
	        
	        for (T elemento : a) {
	            sb.append(elemento.toString()).append("\n");
	        }
	        
	        return sb.toString();
	    }
	
	 public static <T> T[] EliminarDadaPosicion(T[] a, int posicion) {
		    if (posicion < 0 || posicion >= a.length) {
		        throw new IllegalArgumentException("LA POSICION ESTA FUERA DE RANGO");
		    }
		    
		    int nuevaLongitud = a.length - 1;
		    T[] nuevoArreglo = (T[]) new Object[nuevaLongitud]; // Crear nuevo arreglo con la nueva longitud
		    
		    int j = 0;
		    for (int i = 0; i < a.length; i++) {
		        if (i != posicion) {
		            nuevoArreglo[j] = a[i]; // Copiar elementos excepto el elemento en la posición dada
		            j++;
		        }
		    }
		    
		    return nuevoArreglo;
		}
		
     public static <T extends Comparable> T ElementoMenor(T[]a)
    {
    	if(a== null || a.length == 0)
    	{
    		return null;
    	}
    	//EL METODO COMPARETO SIRVE SOLO PARA STRING, DATE, GREGORIANCALENDAR NO SIRVE PARA OBJETOS
    	T elementoMenor =a[0];
    	for(int i=1; i<a.length;i++)
    	{
    		if(elementoMenor.compareTo(a[i])>0)
    		{
    			elementoMenor=a[i];
    		}
    	}
    	return elementoMenor;
    }




}