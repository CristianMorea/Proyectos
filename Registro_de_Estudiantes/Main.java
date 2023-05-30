package Registro_de_Estudiantes;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		RegistroEstudiantes<Estudiante> registro = new RegistroEstudiantes<>();
		   //CREANDO OBJETOS DE TIPO ESTUDIANTE
		    Estudiante estudiante1 = new Estudiante("Juan", 20, 85.5);
	        Estudiante estudiante2 = new Estudiante("María", 22, 90.2);
	        Estudiante estudiante3 = new Estudiante("Pedro", 21, 75.8);
	        
	        
	        
           // REGISTRANDO ESTUDIANTES
            registro.Registrar(estudiante1);
            registro.Registrar(estudiante2);
            registro.Registrar(estudiante3);
            
            // IMPRIMIR ESTUDIANTES REGISTRADOS
            System.out.println("/nLOS ESTUDIANTES REGISTRADOS SON:");
            registro.mostrarEstudiantes();
            
            
            
            //OBTENER PROMEDIO ESTUDIANTES
            double promedioEstudiantes = registro.obtenerPromedioPromedios();
            System.out.println("EL PROMEDIO DE LOS ESTUDIANTES ES:"+promedioEstudiantes);
            
            //BUSCAR ESTUDIANTE POR EDAD
            int edadBuscada = 20;
            //CREAMOS UN ARRAY LIST PARA GUARDAR EL ESTUDIANTE ENCONTRADO POR EDAD
            ArrayList<Estudiante> estudiantePorEdad = new ArrayList<>();
            System.out.println("ESTUDIANTES CON EDAD: "+edadBuscada +" ;");
            
            for (Estudiante estudiante : estudiantePorEdad)
            {
            	System.out.println(registro.buscarEstudiantesPorEdad(edadBuscada));
            }
            
            
            
            
	}

}
