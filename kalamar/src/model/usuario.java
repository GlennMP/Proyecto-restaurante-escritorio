package model;

public class usuario {
	
	private int codigo,cargo;
	private String usuario,nombre,contracena,telefono,direccion,nombrecargo,estado;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCargo() {
		return cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContracena() {
		return contracena;
	}
	public void setContracena(String contracena) {
		this.contracena = contracena;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNombrecargo() {
		return nombrecargo;
	}
	public void setNombrecargo(String nombrecargo) {
		this.nombrecargo = nombrecargo;
	}
	@Override
	public String toString() {
		return String.valueOf(usuario);
	}

	
}
