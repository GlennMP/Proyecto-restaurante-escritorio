package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import interfaces.usuariointeface;
import model.mostrarproducto;
import model.registramesa;
import model.registromenu;
import model.usuario;
import utils.MySQLConexion;

public class gestionusuario implements usuariointeface{

	@Override
	public usuario validaAcceso(String usuario, String contracena) {
		
		usuario u=null;
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="select * from EMPLEADO where USUARIO=? and CONTRASEÑA_EMPLEADO=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, usuario);
			pst.setString(2, contracena);
			rs=pst.executeQuery();
			while (rs.next()) {
				u=new usuario();
				u.setUsuario(rs.getString(2));
				u.setContracena(rs.getString(4));
				u.setNombre(rs.getString(3));
				u.setCargo(rs.getInt(8));
				
				
			}
		} catch (Exception e) {
			System.out.println("Error en listadoyyyyy"+e.getMessage());
		}finally {
			try {
				if(pst !=null)
					pst.close();
				if(con !=null)
					con.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar");
			}
		}
		return u;
	}

	
	@Override
	public ArrayList<mostrarproducto> listado() {
		
		ArrayList<mostrarproducto>lista=new ArrayList<mostrarproducto>();
	
		ResultSet rs=null;
		Connection con=null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="SELECT * FROM producto ";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while (rs.next()) {
				mostrarproducto m=new mostrarproducto();
				m.setCodigo(rs.getInt(1));
				m.setNombre(rs.getString(2));
				m.setDireccion(rs.getString(3));
				m.setPrecio(rs.getInt(4));
				m.setIdcategoria(rs.getInt(5));
				lista.add(m);	
			}
		} catch (Exception e) {
			System.out.println("Error en la sentencia: "+e.getMessage());
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				System.out.println("Error al intentar cerrar conexiones");
			}
		}
		return lista;
	
	}
	
	@Override
	public int registrarusu(usuario r) {
		
		int rs=0;
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="INSERT INTO EMPLEADO VALUES (null,?,?,?,?,?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, r.getUsuario());
			pst.setString(2, r.getNombre());
			pst.setString(3, r.getContracena());
			pst.setString(4, r.getTelefono());
			pst.setString(5, r.getDireccion());
			pst.setString(6, r.getEstado());
			pst.setInt(7, r.getCargo());
			
			rs=pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error en la sentencia: "+e.getMessage());
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)pst.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}
		return rs;
	}
	
	
	
	@Override
	public ArrayList<usuario> listausuarios() {
		
		ArrayList<usuario>lista=new ArrayList<>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con=MySQLConexion.getConexion();
			String sql="call lista_usuarios;";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				usuario r=new usuario();
				r.setCodigo(rs.getInt(1));
				r.setUsuario(rs.getString(2));
				r.setNombre(rs.getString(3));
				r.setContracena(rs.getString(4));
				r.setTelefono(rs.getString(5));
				r.setDireccion(rs.getString(6));
				r.setNombrecargo(rs.getString(7));
				lista.add(r);
			}	
		}catch(Exception e){
			System.out.println("Error en la sentencia: "+e.getMessage());
			
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)pst.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}
		return lista;
		
	}
	
	
	@Override
	public ArrayList<usuario> muestrausuarioporparametro(String letra) {
		

		
		ArrayList<usuario>lista=new ArrayList<>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con=MySQLConexion.getConexion();
			String sql="select d.CODIGO_EMPLEADO,d.USUARIO,d.NOMBRE_EMPLEADO,d.CONTRASEÑA_EMPLEADO,d.TELEFONO_EMPLEADO,d.DIRECCION_EMPLEADO,v.NOMBRE_CARGO from EMPLEADO d join CARGO v on d.ID_CARGO=v.ID_CARGO where NOMBRE_EMPLEADO = ?;";
			pst=con.prepareStatement(sql);
			pst.setString(1,letra);
			
			rs=pst.executeQuery();
			
			while(rs.next()){
				usuario r=new usuario();
				r.setCodigo(rs.getInt(1));
				r.setUsuario(rs.getString(2));
				r.setNombre(rs.getString(3));
				r.setContracena(rs.getString(4));
				r.setTelefono(rs.getString(5));
				r.setDireccion(rs.getString(6));
				r.setNombrecargo(rs.getString(7));
				lista.add(r);
			}	
		}catch(Exception e){
			System.out.println("Error en la sentencia: "+e.getMessage());
			
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)pst.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}
		return lista;
		
	
		
	}
	
	
	@Override
	public int actualizarusu(usuario r) {
		
		int rs=0;
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="update EMPLEADO set USUARIO=?, NOMBRE_EMPLEADO=?,CONTRASEÑA_EMPLEADO=?,TELEFONO_EMPLEADO=?, DIRECCION_EMPLEADO=?, ID_CARGO=? where CODIGO_EMPLEADO=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, r.getUsuario());
			pst.setString(2, r.getNombre());
			pst.setString(3, r.getContracena());
			pst.setString(4, r.getTelefono());
			pst.setString(5, r.getDireccion());
			pst.setInt(6, r.getCargo());
			pst.setInt(7, r.getCodigo());
			
			rs=pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error en la sentencia: "+e.getMessage());
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)pst.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}
		return rs;
	}
	
	
	@Override
	public int eliminarusu(usuario r) {
		
		int rs=0;
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="update EMPLEADO set ESTADO_EMPLEADO=? where CODIGO_EMPLEADO=?";
			pst=con.prepareStatement(sql);
			pst.setString(1, r.getEstado());
			pst.setInt(2, r.getCodigo());
			
			rs=pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error en la sentencia: "+e.getMessage());
		}finally {
			try {
				if(pst!=null)pst.close();
				if(con!=null)pst.close();
			} catch (Exception e2) {
				System.out.println("Error al cerrar");
			}
		}
		return rs;
	}

	
}
