package AgendaDeContactos;

public class Main {

	public static void main(String[] args) 
	{
	    AgendaContactos<Contacto> RegistroContactos = new AgendaContactos<Contacto>();
	    
	    Contacto contacto1 = new Contacto ("cristian","23","3127740543");
	    Contacto contacto2 = new Contacto ("cristian","29","3135640543");
	    Contacto contacto3 = new Contacto ("sergio","20","3124540543");
	    Contacto contacto4 = new Contacto ("payan","218","3178740543");
	    
	    
	   RegistroContactos.agregarContacto(contacto1);
	   RegistroContactos.agregarContacto(contacto2);
	   RegistroContactos.agregarContacto(contacto3);
	   RegistroContactos.agregarContacto(contacto4);
	   System.out.println("CONTACTOS DEL TELEFONO:");
	   RegistroContactos.mostrarContactos();
	  
	   System.out.println("NUEVA LISTA DE CONTACTOS AL ELIMINAR");
	   
	   RegistroContactos.eliminarContacto(contacto3);
       RegistroContactos.mostrarContactos();
       
       System.out.println("BUSQUEDA POR NOMBRE");
       String nombre_a_buscar ="cristian";
       System.out.println( RegistroContactos.buscarPorNombre(nombre_a_buscar)+"\n");  
     
       
       
       
	}

}
