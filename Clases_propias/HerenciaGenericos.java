package Clases_propias;

public class HerenciaGenericos 
{

	public static void main(String[] args) 
	{
	/* Empleado administrativa =new Empleado("ana",32,32000);
     Jefe DirectorComercial = new Jefe("juan",23,90000);
     
     //YA QUE UN JEFE SIEMPRE ES UN EMPLEADO PUEDO ALMACENAR DATOS DE TIPO JEFE EN EMPLEADOS
     Empleado nuevoEmpleado= DirectorComercial;*/
		
	
		Pareja<Empleado> administrativa = new Pareja<Empleado>();
		Pareja<Jefe> DirectorComercial = new Pareja<Jefe>();
		//Pareja<Empleado> nuevoEmpleado = DirectorComercial;
		  
		 Pareja.imprimirTrabajador(administrativa);
		 Pareja.imprimirTrabajador(DirectorComercial);
		 
		 
	}

}
