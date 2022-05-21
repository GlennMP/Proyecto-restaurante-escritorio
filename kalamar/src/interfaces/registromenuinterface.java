package interfaces;

import java.util.ArrayList;

import model.mostrarproducto;
import model.registramesa;
import model.registromenu;
import model.tarjeta;

public interface registromenuinterface {
	
	public int registrar(registromenu r);
	
	public ArrayList<mostrarproducto> listadodeproducto(int codigo);
	
	public int registrarenmesa(registramesa r);
	
	public ArrayList<registramesa> muestraproductos (int codigo);
	
	public ArrayList<registramesa> muestramesa ();
	
	public ArrayList<registramesa> muestramesapornumero (int numero);
	
	public int registrartarjeta (tarjeta r);
	
	
}
