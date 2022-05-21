package clases;

public class Platos {

	
	private String nombre;
	private double	precio;
	private String contenido;
	private int Codigo; 
	
	public Platos(String nombre, double precio, String contenido) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.contenido = contenido;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getCodigo() {
		return Codigo;
	}

	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	
	
}
