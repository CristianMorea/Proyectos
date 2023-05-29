package Clases_propias;

public class Programa {
	private String nombreP;
	private int codigo;
	private double costo;
	
	public Programa(String nombreP, int codigo, double costo) {
		this.nombreP = nombreP;
		this.codigo = codigo;
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Programa [nombreP=" + nombreP + ", codigo=" + codigo + ", costo=" + costo + "]";
	}
	
	
	

}
