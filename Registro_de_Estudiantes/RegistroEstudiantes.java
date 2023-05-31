package Registro_de_Estudiantes;

import java.util.ArrayList;

public class RegistroEstudiantes<T>
{
   ArrayList<Estudiante> listEstudiantes;
   
   public RegistroEstudiantes() {
       listEstudiantes = new ArrayList<>();
   }
   
   //METODO AGREGAR ESTUDIANTE A LA LISTA
   public void Registrar(Estudiante estudiante)
   {
	   listEstudiantes.add(estudiante);
   }
   
  //METODO MOSTRAR ELEMENTOS DEL ARRAY LIST
   
   public void mostrarEstudiantes() {
       for (Estudiante estudiante : listEstudiantes) 
       {
           System.out.println(estudiante);
       }
   }
     
   
   public double obtenerPromedioPromedios() {
       double sumaPromedios = 0;
       for (Estudiante estudiante : listEstudiantes) {
           sumaPromedios += ((Estudiante) estudiante).getPromedio();
       }
       return sumaPromedios / listEstudiantes.size();
   }
  
   public ArrayList<T> buscarEstudiantesPorEdad(int edad) {
       ArrayList<T> estudiantesEncontrados = new ArrayList<>();
       for (Estudiante estudiante : listEstudiantes) {
           if (((Estudiante) estudiante).getEdad() == edad) {
               estudiantesEncontrados.add((T) estudiante);
           }
       }
       return estudiantesEncontrados;
   }
  
 
 
}
    
	   

