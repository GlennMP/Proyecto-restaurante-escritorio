package GUIs;

import java.awt.BorderLayout;
import GUIs.*;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import mantenimiento.gestionmenu;
import model.mostrarproducto;
import model.registramesa;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RealMenu2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtcodigo;
	private JTable table;
	public DefaultTableModel modelo;
	public ArrayList<mostrarproducto> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RealMenu2 frame = new RealMenu2();
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
	public RealMenu2() {
		
		
		//mostrarproducto m=new mostrarproducto();
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Codigo de producto ");
		label.setBounds(22, 42, 118, 14);
		contentPane.add(label);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(150, 39, 86, 20);
		contentPane.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				listar();
			}
		});
		btnAgregar.setBounds(274, 38, 89, 23);
		contentPane.add(btnAgregar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 414, 169);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		modelo=new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre de producto");
		modelo.addColumn("Precio de producto");
		table.setModel(modelo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*for(int i=0; i<table.getRowCount();i++){
					for (int j=0;j<table.getColumnCount();j++){
						System.out.print(table.getValueAt(i,j));
					}
				}*/
				int mesa=hahah.numeromesa;
				
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
				
				
				
				/*hahah h = new hahah();
				h.lista2=lista;*/
				
			
				
				
				
			}
		});
		btnGuardar.setBounds(174, 261, 89, 23);
		contentPane.add(btnGuardar);
		
		gestionmenu gm= new gestionmenu();
		ArrayList<registramesa> lista=gm.muestraproductos(hahah.numeromesa);
		
		
		for(registramesa r:lista){
			Object fila[]={
					
					r.getCodigo_producto(),
					r.getNum_producto(),
					r.getPrecio_producto()
					
			};
			modelo.addRow(fila);
			
		}
		
		
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
		
		
		
		/*int row=table.getSelectedRow();
		String codigo=table.getModel().getValueAt(row,0).toString();
		
		System.out.println("codigo"+codigo);
		
		String nombre=table.getModel().getValueAt(row,1).toString();
		String precio=table.getModel().getValueAt(row,2).toString();
		
		registramesa r=new registramesa();
		r.setCodigo_producto(codigo);
		r.setNum_producto(nombre);
		r.setPrecio_producto(Integer.parseInt(precio));
		
		gestionmenu gn=new gestionmenu();
		gn.registrarenmesa(r);*/
		
		
		
	}
}
