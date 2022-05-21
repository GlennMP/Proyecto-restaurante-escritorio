package clases;

public class Mesa {

	private String Nombre;
	private String Pedido;
	private int NumMesa;
	private boolean Estado;
	
	public Mesa(String nombre, String pedido, int numMesa, boolean estado) {
		super();
		Nombre = nombre;
		Pedido = pedido;
		NumMesa = numMesa;

		Estado = estado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPedido() {
		return Pedido;
	}

	public void setPedido(String pedido) {
		Pedido = pedido;
	}

	public int getNumMesa() {
		return NumMesa;
	}

	public void setNumMesa(int numMesa) {
		NumMesa = numMesa;
	}

	public boolean getEstado() {
		return Estado;
	}

	public void setEstado(boolean estado) {
		Estado = estado;
	}
	
	
	
	
}
