package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.PopupMenu;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.xml.ws.handler.MessageContext;

import com.jgoodies.common.internal.Messages;

import clases.Platos;
import mantenimiento.gestionmenu;
import model.registromenu;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.Popup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class frmRealMenu extends JInternalFrame {
	public static JTextField txtFRestaurant;
	private JTextField txtFPlatos;
	private JTextField txtFPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRealMenu frame = new frmRealMenu();
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
	
	public static String NombreRestaurant="(COLOQUE UN NOMBRE)";
	public static int Nplatos=0,Npiqueos=0,Nbebidas=0;
	private JTextPane txtFContenido;
	public static ArrayList<Platos> Pl= new ArrayList<Platos>();
	public static ArrayList<Platos> Piq= new ArrayList<Platos>();
	public static ArrayList<Platos> Beb= new ArrayList<Platos>();
	private JComboBox comboBox;
	
	
	public frmRealMenu() {
		setClosable(true);
		setBounds(100, 100, 455, 305);
		getContentPane().setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione","Platos", "Piqueos", "Bebidas"}));
		comboBox.setBounds(10, 78, 265, 20);
		getContentPane().add(comboBox);
		
		
		JLabel lblRestaurant = new JLabel("RESTAURANT :");
		lblRestaurant.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRestaurant.setBounds(10, 11, 139, 31);
		getContentPane().add(lblRestaurant);
		
		txtFRestaurant = new JTextField();
		txtFRestaurant.setHorizontalAlignment(SwingConstants.CENTER);
		txtFRestaurant.setText(NombreRestaurant);
		txtFRestaurant.setEnabled(false);
		txtFRestaurant.setBounds(134, 13, 185, 31);
		getContentPane().add(txtFRestaurant);
		txtFRestaurant.setColumns(10);
		
		JLabel lblDatosQueDesee = new JLabel("Elija los Datos que desee agregar :");
		lblDatosQueDesee.setBounds(10, 53, 265, 14);
		getContentPane().add(lblDatosQueDesee);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
		panel.setBounds(10, 109, 414, 160);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(10, 23, 58, 20);
		panel.add(lblNombre);
		
		txtFPlatos = new JTextField();
		txtFPlatos.setText(null);
		txtFPlatos.setBorder(new LineBorder(SystemColor.desktop));
		txtFPlatos.setColumns(10);
		txtFPlatos.setBounds(78, 23, 186, 20);
		panel.add(txtFPlatos);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecio.setBounds(274, 27, 50, 14);
		panel.add(lblPrecio);
		
		txtFPrecio = new JTextField();
		txtFPrecio.setText(null);
		txtFPrecio.setBorder(new LineBorder(SystemColor.desktop));
		txtFPrecio.setBounds(334, 24, 70, 20);
		panel.add(txtFPrecio);
		txtFPrecio.setColumns(10);
		
		JLabel lblContenido = new JLabel("Contenido:");
		lblContenido.setBounds(10, 54, 70, 20);
		panel.add(lblContenido);
		
		JButton btnAgregar = new JButton("AGREGAR");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
				registrar();

				
				/*int cod;
				double Precio;
				String Nombre,Contenido;
				cod=comboBox.getSelectedIndex();
				
				try{
					Nombre=txtFPlatos.getText();
					Precio=Double.parseDouble(txtFPrecio.getText());
					Contenido=txtFContenido.getText();
					switch (cod) {			
						case 0:
							Nplatos++;
							Pl.add(new Platos(Nombre, Precio, Contenido));
							break;
						case 1:
							Npiqueos++;
							Piq.add(new Platos(Nombre, Precio, Contenido));
							break;
						case 2:
							Nbebidas++;
							Beb.add(new Platos(Nombre, Precio, Contenido));
							break;
					}
		
					txtFPlatos.setText(null);
					txtFPrecio.setText(null);
					txtFContenido.setText(null);
				
				}catch(Exception e){
					JOptionPane.showInternalMessageDialog(Principal.contentPane,"No puede dejar en blanco las casillas","ERROR",JOptionPane.ERROR_MESSAGE);
				}*/
			}
		});
		btnAgregar.setBounds(88, 121, 112, 23);
		panel.add(btnAgregar);
		
		JButton btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				dispose();
			}
		});
		btnFinalizar.setBounds(231, 121, 103, 23);
		panel.add(btnFinalizar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 54, 326, 57);
		panel.add(scrollPane);
		
		txtFContenido = new JTextPane();
		txtFContenido.setText(null);
		txtFContenido.setFont(new Font("Tahoma", Font.PLAIN, 10));
		scrollPane.setViewportView(txtFContenido);
		
		JButton btnCambiar = new JButton("CAMBIAR");
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtFRestaurant.isEnabled()==false)
				txtFRestaurant.setEnabled(true);
				else txtFRestaurant.setEnabled(false);
				NombreRestaurant=txtFRestaurant.getText();
			}
		});
		btnCambiar.setBounds(329, 13, 89, 31);
		getContentPane().add(btnCambiar);

	}
	
	void registrar(){
		String nombre,descripcion,pre;
		int idcategoria,precio;
		
		nombre=txtFPlatos.getText();
		if(!nombre.matches("[a-z]+")){
			JOptionPane.showMessageDialog(Principal.contentPane,"Dato incorrecto en nombre, solo se permiten letras","Error",JOptionPane.WARNING_MESSAGE);
			return;	
		}
		
		descripcion=txtFContenido.getText();
		
		pre=txtFPrecio.getText();
		if(!pre.matches("[0-9]+")){
			JOptionPane.showMessageDialog(Principal.contentPane,"Dato incorrecto en precio, solo se permiten numeros","Error",JOptionPane.WARNING_MESSAGE);
			return;	
		}
		
		precio=Integer.parseInt(pre);
		
		if(!pre.matches("[0-9]+")){
			JOptionPane.showMessageDialog(Principal.contentPane,"Dato incorrecto en precio, solo se permiten numeros","Error",JOptionPane.WARNING_MESSAGE);
			return;	
		}
		
		idcategoria=comboBox.getSelectedIndex();
		
		
		
        if(idcategoria<=0){
			
        	JOptionPane.showMessageDialog(Principal.contentPane,"No selecciono Datos que desee agregar","Error",JOptionPane.WARNING_MESSAGE);
			return;
			
		}
		
		
		
		
		
		
		
		
		
		registromenu r=new registromenu();
		r.setIdcategoria(idcategoria);
		r.setNombre(nombre);
		r.setPrecio(precio);
		r.setDescripcion(descripcion);
		
		gestionmenu gm=new gestionmenu();
		int ok=gm.registrar(r);
		
		if(ok==0){
			System.out.println("Error en la operacion");
	       }else{
	    	   
	    	   limpiar();
	    	   System.out.println("Registrado correctamente");
	       }
		
		
	}
	
	void limpiar(){
		
		txtFPlatos.setText(null);
		txtFContenido.setText(null);
		txtFPrecio.setText(null);
		
	}

}
