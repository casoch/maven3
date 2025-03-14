package es.gimbernat.maven3;

public class Empleado {
	String nombre;
	String dni;
	
	public Empleado()
	{
		nombre ="";
		dni="";
	}
	
	public Empleado(String nombre, String dni)
	{
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
}
