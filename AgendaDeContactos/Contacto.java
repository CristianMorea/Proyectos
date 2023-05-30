package AgendaDeContactos;

public class Contacto 
{
   private String nombre;
   private String Telefono;
   private String correoElectronico;

   public Contacto(String nombre, String telefono, String correoElectronico)
   {
	this.nombre = nombre;
	Telefono = telefono;
	this.correoElectronico = correoElectronico;
   }

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTelefono() {
	return Telefono;
}

public void setTelefono(String telefono) {
	Telefono = telefono;
}

public String getCorreoElectronico() {
	return correoElectronico;
}

public void setCorreoElectronico(String correoElectronico) {
	this.correoElectronico = correoElectronico;
}

@Override
public String toString() {
	return "Contacto [nombre=" + nombre + ", Telefono=" + Telefono + ", correoElectronico=" + correoElectronico + "]";
}
   
  
   
   
   
   
}
