package model;

public class registramesa {

	private int id_mesa,numero_mesa,precio_producto;
	private String codigo_producto,num_producto;
	public int getId_mesa() {
		return id_mesa;
	}
	public void setId_mesa(int id_mesa) {
		this.id_mesa = id_mesa;
	}
	public int getNumero_mesa() {
		return numero_mesa;
	}
	public void setNumero_mesa(int numero_mesa) {
		this.numero_mesa = numero_mesa;
	}
	public int getPrecio_producto() {
		return precio_producto;
	}
	public void setPrecio_producto(int precio_producto) {
		this.precio_producto = precio_producto;
	}
	public String getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(String codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getNum_producto() {
		return num_producto;
	}
	public void setNum_producto(String num_producto) {
		this.num_producto = num_producto;
	}
	@Override
	public String toString() {
		return String.valueOf(numero_mesa);
	}
	
	
	
	
}
