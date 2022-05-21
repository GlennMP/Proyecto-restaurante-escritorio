package GUIs;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import mantenimiento.gestionmenu;
import model.mostrarproducto;
import model.registramesa;
import model.tarjeta;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;

public class frmRealMenu1 extends JInternalFrame {
	private JTextField txtcodigo;
	private JTable table;
	public DefaultTableModel modelo;
	public ArrayList<mostrarproducto> lista;
	private JTextField txtmontototal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRealMenu1 frame = new frmRealMenu1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmRealMenu1() {
		setBounds(100, 100, 450, 335);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Codigo de producto ");
		label.setBounds(22, 39, 118, 14);
		getContentPane().add(label);
		
		txtcodigo = new JTextField();
		txtcodigo.setColumns(10);
		txtcodigo.setBounds(134, 36, 157, 20);
		getContentPane().add(txtcodigo);
		
		JButton btnAadirPlato = new JButton("A\u00F1adir plato");
		btnAadirPlato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listar();
				txtmontototal.setText(Integer.toString(suma()));
				
			}
		});
		btnAadirPlato.setBounds(301, 35, 123, 23);
		getContentPane().add(btnAadirPlato);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 72, 414, 132);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		modelo=new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre de producto");
		modelo.addColumn("Precio de producto");
		table.setModel(modelo);
		
		JButton button_1 = new JButton("Guardar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				int mesa=frmMesas2.numeromesa;
				
				for(int i=0; i<table.getRowCount();i++){
					
					String codigo=table.getModel().getValueAt(i,0).toString();
					String nombre=table.getModel().getValueAt(i,1).toString();
					String precio=table.getModel().getValueAt(i,2).toString();
					
					
							
					
					registramesa r=new registramesa();
					r.setNumero_mesa(mesa);
					r.setCodigo_producto(codigo);
					r.setNum_producto(nombre);
					r.setPrecio_producto(Integer.parseInt(precio));
					
					gestionmenu gn=new gestionmenu();
					gn.registrarenmesa(r);
					
				}
				
				dispose();
			}
		});
		button_1.setBounds(22, 270, 89, 23);
		getContentPane().add(button_1);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(134, 270, 89, 23);
		getContentPane().add(btnCerrar);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setBounds(179, 225, 55, 14);
		getContentPane().add(lblTotal);
		
		txtmontototal = new JTextField();
		txtmontototal.setColumns(10);
		txtmontototal.setBounds(221, 222, 89, 20);
		getContentPane().add(txtmontototal);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				paga();
				dispose();
			}
		});
		btnPagar.setBounds(320, 221, 89, 23);
		getContentPane().add(btnPagar);

		
		gestionmenu gm= new gestionmenu();
		ArrayList<registramesa> lista=gm.muestraproductos(frmMesas2.numeromesa);
		
		
		for(registramesa r:lista){
			Object fila[]={
					
					r.getCodigo_producto(),
					r.getNum_producto(),
					r.getPrecio_producto()
					
			};
			modelo.addRow(fila);
			
		}
		
		 txtmontototal.setText(Integer.toString(suma()));
		
	}
	
	void listar(){
		
		
		int tipocodigo=Integer.parseInt(txtcodigo.getText());
		
		gestionmenu gm=new gestionmenu();
		lista=gm.listadodeproducto(tipocodigo);
		
		for(mostrarproducto mostrar:lista){
		  Object fila[]={
				    mostrar.getCodigo(),
					mostrar.getNombre(),
					mostrar.getPrecio()
		  };
		  modelo.addRow(fila);
		}
		
	}
	
	public int suma(){
		int contar=table.getRowCount();
		int suma=0;
		for(int i=0;i<contar;i++){
			 suma=suma+Integer.parseInt(table.getValueAt(i, 2).toString());
		}
		return suma;
	}
	
    void paga(){
		
    	frmLoginMesas f= new frmLoginMesas();
    	frmMesas2 n=new frmMesas2();
    	Date fecha = new Date();
    	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
		tarjeta t=new tarjeta();
		t.setTotal_venta(Integer.parseInt(txtmontototal.getText().toString()));
		t.setEmpleado(f.user);
		t.setNumero_mesa(n.numeromesa);
		t.setFecha(formato.format(fecha));
		gestionmenu m=new gestionmenu();
		m.registrartarjeta(t);	
	}
	
}
