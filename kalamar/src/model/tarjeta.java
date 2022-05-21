package model;

import com.mysql.fabric.xmlrpc.base.Data;

public class tarjeta {

	
	private int id_venta,total_venta,numero_mesa;
	private String empleado,fecha;
	public int getId_venta() {
		return id_venta;
	}
	public void setId_venta(int id_venta) {
		this.id_venta = id_venta;
	}
	public int getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(int total_venta) {
		this.total_venta = total_venta;
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public int getNumero_mesa() {
		return numero_mesa;
	}
	public void setNumero_mesa(int numero_mesa) {
		this.numero_mesa = numero_mesa;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
}
