package mantenimiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import interfaces.registromenuinterface;
import interfaces.usuariointeface;
import model.cargo;
import model.mostrarproducto;
import model.registramesa;
import model.registromenu;
import model.tarjeta;
import model.usuario;
import utils.MySQLConexion;

public class gestionmenu implements registromenuinterface{

	@Override
	public int registrar(registromenu r) {
		
		int rs=0;
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="insert into producto values (null,?,?,?,?)";
			pst=con.prepareStatement(sql);
			pst.setString(1, r.getNombre());
			pst.setString(2, r.getDescripcion());
			pst.setInt(3, r.getPrecio());
			pst.setInt(4, r.getIdcategoria());
			
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
	public ArrayList<mostrarproducto> listadodeproducto(int codigo) {
		
		ArrayList<mostrarproducto> lista=new ArrayList<mostrarproducto>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			con=MySQLConexion.getConexion();
			String sql=" SELECT * FROM producto p where p.CODIGO_PRODUCTO=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1,codigo);
			rs=pst.executeQuery();
			while(rs.next()){
				mostrarproducto u=new mostrarproducto();
				u.setCodigo(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setPrecio(rs.getInt(4));
				lista.add(u);
				
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
	public int registrarenmesa(registramesa r) {

		
		int rs=0;
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="INSERT INTO mesas VALUES(NULL,?,?,?,?);";
			pst=con.prepareStatement(sql);
			pst.setInt(1, r.getNumero_mesa());
			pst.setString(2, r.getCodigo_producto());
			pst.setString(3, r.getNum_producto());
			pst.setInt(4, r.getPrecio_producto());
			
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
	public ArrayList<registramesa> muestraproductos(int codigo) {
		

		
		ArrayList<registramesa> lista=new ArrayList<registramesa>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			con=MySQLConexion.getConexion();
			String sql=" select* from mesas  WHERE numero_mesa=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1,codigo);
			rs=pst.executeQuery();
			while(rs.next()){
				
				
				registramesa u=new registramesa();
				u.setCodigo_producto(rs.getString(3));
				u.setNum_producto(rs.getString(4));
				u.setPrecio_producto(rs.getInt(5));
				lista.add(u);
				
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
	public ArrayList<registramesa> muestramesa() {
		
		ArrayList<registramesa>lista=new ArrayList<>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con=MySQLConexion.getConexion();
			String sql="select numero_mesa from mesas group by numero_mesa ;";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				registramesa r=new registramesa();
				r.setNumero_mesa(rs.getInt(1));
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
	public ArrayList<registramesa> muestramesapornumero(int numero) {
		

		
		ArrayList<registramesa>lista=new ArrayList<>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con=MySQLConexion.getConexion();
			String sql="select * from mesas where NUMERO_MESA=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1,numero);
			
			rs=pst.executeQuery();
			
			while(rs.next()){
				registramesa r=new registramesa();
				r.setCodigo_producto(rs.getString(3));
				r.setNum_producto(rs.getString(4));
				r.setPrecio_producto(rs.getInt(5));
				
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
	public int registrartarjeta(tarjeta r) {

		
		int rs=0;
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="INSERT INTO ventadias VALUES(NULL,?,?,?,?);";
			pst=con.prepareStatement(sql);
			pst.setString(1, r.getEmpleado());
			pst.setInt(2, r.getNumero_mesa());
			pst.setString(3, r.getFecha());
			pst.setInt(4, r.getTotal_venta());
			
			
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


	public ArrayList<usuario> muestrausuario() {
		
		ArrayList<usuario>lista=new ArrayList<>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con=MySQLConexion.getConexion();
			String sql="select USUARIO from empleado group by USUARIO ;";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				usuario r=new usuario();
				//r.setNumero_mesa(rs.getInt(1));
				r.setUsuario(rs.getString(1));
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
	
	
	
    public ArrayList<cargo> muestracargo() {
		
		ArrayList<cargo>lista=new ArrayList<>();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try{
			con=MySQLConexion.getConexion();
			String sql="select NOMBRE_CARGO from CARGO order by ID_CARGO;";
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			
			while(rs.next()){
				cargo r=new cargo();
				r.setNombre_cargo(rs.getString(1));
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
    
    

	
	
	
    /*@Override
	public int eliminamesa(documentos el) {
		
		int rs=0;
		Connection con =null;
		PreparedStatement pst=null;
		
		try {
			con=MySQLConexion.getConexion();
			String sql="delete from documento where codigo_documento=? ;";
			pst=con.prepareStatement(sql);
			pst.setInt(1, el.getCodigo_documento());
			
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
		
		
	}*/
	
	
	
}


