package GUIs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mantenimiento.gestionmenu;
import mantenimiento.gestionusuario;
import model.registramesa;
import model.usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmLoginMesas extends JInternalFrame {

	private JPanel contentPane;
	public static String user;
	private JPasswordField txtClave;
	private JComboBox combousuarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLoginMesas frame = new frmLoginMesas();
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
	public frmLoginMesas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 210);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_1 = new JLabel("Usuario");
		label_1.setBounds(35, 34, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setBounds(35, 86, 58, 14);
		contentPane.add(label_2);
		
		txtClave = new JPasswordField();
		txtClave.setBounds(103, 83, 123, 20);
		contentPane.add(txtClave);
		
		combousuarios = new JComboBox();
		combousuarios.setBounds(103, 31, 123, 20);
		contentPane.add(combousuarios);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				validaAcceso();
				
			}
		});
		button.setIcon(new ImageIcon(frmLoginMesas.class.getResource("/iconos22x22/dialog-accept.png")));
		button.setActionCommand("OK");
		button.setBounds(10, 140, 117, 31);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancel");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				
			}
		});
		button_1.setIcon(new ImageIcon(frmLoginMesas.class.getResource("/iconos22x22/dialog-cancel-3.png")));
		button_1.setActionCommand("Cancel");
		button_1.setBounds(180, 140, 113, 31);
		contentPane.add(button_1);
		
		listarusuario();
		
	}
	

	void listarusuario(){
		gestionmenu gm=new gestionmenu();
		ArrayList<usuario> lista=gm.muestrausuario();
		for(usuario usu:lista){
			combousuarios.addItem(usu);
		}
	}
	
	private void aviso(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	private String leerClave(){
		return txtClave.getText();
	}
	
	void validaAcceso(){
		String usuario,clave;
		
		usuario=((usuario)combousuarios.getSelectedItem()).getUsuario();
		clave=leerClave();
		user=usuario;
		
		gestionusuario gu=new gestionusuario();
		usuario u=gu.validaAcceso(usuario, clave);
		
		if(u ==null){
			aviso("Clave incorrecta");
		}
		else{
			
			frmRealMenu1 f=new frmRealMenu1();
			Principal.PanelPrincipal.add(f);
			f.toFront();
			f.setVisible(true);
			dispose();
			
		}
		
	}
	
	
	
}
