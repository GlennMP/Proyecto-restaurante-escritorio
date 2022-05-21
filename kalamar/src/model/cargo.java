package model;

public class cargo {
	
	private int codigo;
	private String nombre_cargo;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre_cargo() {
		return nombre_cargo;
	}
	public void setNombre_cargo(String nombre_cargo) {
		this.nombre_cargo = nombre_cargo;
	}
	@Override
	public String toString() {
		return String.valueOf(nombre_cargo);
	}
	
	
	
	

	
}
