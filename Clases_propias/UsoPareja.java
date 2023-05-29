package Clases_propias;

public class UsoPareja {

	public static void main(String[] args)
	{
		
		Pareja <String> una = new Pareja<String>();//CREACION DE UN OBJETO PAREJA CON GENERICO DE TIPO STRIN
		una.setPrimero("juan");
		System.out.println(una.getPrimero());
		
		Persona pers1 = new Persona("ana");
		Pareja<Persona> otra =new Pareja<Persona>();
		otra.setPrimero(pers1);
		System.out.println(otra.getPrimero());
	}

}
class Persona{
	
	private String nombre;
	public Persona(String nombre)
	{
		this.nombre = nombre;
	}
}