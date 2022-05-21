package interfaces;

import java.util.ArrayList;

import model.mostrarproducto;
import model.usuario;

public interface usuariointeface {
	
	public usuario validaAcceso(String usuario,String contracena);
	
	public ArrayList<mostrarproducto> listado();

	public int registrarusu(usuario r);

	public ArrayList<usuario> listausuarios();

	public ArrayList<usuario> muestrausuarioporparametro(String letra);

	public int actualizarusu(usuario r);

	public int eliminarusu(usuario r);

}
