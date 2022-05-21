package GUIs;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import GUIs.*;
import interfaces.registromenuinterface;
import mantenimiento.gestionmenu;
import mantenimiento.gestionusuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.mostrarproducto;
import model.registramesa;
import model.registromenu;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class hahah extends JFrame {

	private JPanel contentPane;
	public ArrayList<mostrarproducto> lista2;
	public static int numeromesa=0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hahah frame = new hahah();
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
	public hahah() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSdas = new JButton("mesa 1");
		btnSdas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
		
				numeromesa=1;
				
				
				
				/*mostrarproducto m=new mostrarproducto();
				gestionmenu gm= new gestionmenu();
				ArrayList<registramesa> lista=gm.muestraproductos(numeromesa);
				for(registramesa r:lista){
					
				}*/
				
				
				
				
					
					
					
				
				
				
				
				/*JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				if(lista2.size()>=0){
					
					RealMenu2 r=new RealMenu2();
					r.lista=lista2;
				}*/
					
			}
		});
		btnSdas.setBounds(20, 36, 99, 43);
		contentPane.add(btnSdas);
		
		JButton btnNewButton = new JButton("mesa 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				
				numeromesa=2;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnNewButton.setBounds(129, 36, 99, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("mesa 3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=3;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnNewButton_1.setBounds(238, 36, 99, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnMesa = new JButton("mesa 4");
		btnMesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=4;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa.setBounds(347, 36, 99, 43);
		contentPane.add(btnMesa);
		
		JButton btnMesa_1 = new JButton("mesa 5");
		btnMesa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=5;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_1.setBounds(456, 36, 99, 43);
		contentPane.add(btnMesa_1);
		
		JButton btnMesa_2 = new JButton("mesa 6");
		btnMesa_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=6;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_2.setBounds(20, 100, 99, 43);
		contentPane.add(btnMesa_2);
		
		JButton btnMesa_3 = new JButton("mesa 7");
		btnMesa_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=7;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_3.setBounds(129, 100, 99, 43);
		contentPane.add(btnMesa_3);
		
		JButton btnMesa_4 = new JButton("mesa 8");
		btnMesa_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=8;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_4.setBounds(238, 100, 99, 43);
		contentPane.add(btnMesa_4);
		
		JButton btnMesa_5 = new JButton("mesa 9");
		btnMesa_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=9;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_5.setBounds(347, 100, 99, 43);
		contentPane.add(btnMesa_5);
		
		JButton btnMesa_6 = new JButton("mesa 10");
		btnMesa_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=10;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_6.setBounds(456, 100, 99, 43);
		contentPane.add(btnMesa_6);
		
		JButton btnMesa_7 = new JButton("mesa 11");
		btnMesa_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=11;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_7.setBounds(20, 161, 99, 43);
		contentPane.add(btnMesa_7);
		
		JButton btnMesa_8 = new JButton("mesa 12");
		btnMesa_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=12;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_8.setBounds(129, 161, 99, 43);
		contentPane.add(btnMesa_8);
		
		JButton btnMesa_9 = new JButton("mesa 13");
		btnMesa_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=13;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_9.setBounds(238, 161, 99, 43);
		contentPane.add(btnMesa_9);
		
		JButton btnMesa_10 = new JButton("mesa 14");
		btnMesa_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=14;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_10.setBounds(347, 161, 99, 43);
		contentPane.add(btnMesa_10);
		
		JButton btnMesa_11 = new JButton("mesa 15");
		btnMesa_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=5;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_11.setBounds(456, 161, 99, 43);
		contentPane.add(btnMesa_11);
		
		JButton btnMesa_12 = new JButton("mesa 16");
		btnMesa_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=16;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_12.setBounds(20, 224, 99, 43);
		contentPane.add(btnMesa_12);
		
		JButton btnMesa_13 = new JButton("mesa 17");
		btnMesa_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=17;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_13.setBounds(129, 224, 99, 43);
		contentPane.add(btnMesa_13);
		
		JButton btnMesa_14 = new JButton("mesa 18");
		btnMesa_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=18;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_14.setBounds(238, 224, 99, 43);
		contentPane.add(btnMesa_14);
		
		JButton btnMesa_15 = new JButton("mesa 19");
		btnMesa_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=19;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_15.setBounds(347, 224, 99, 43);
		contentPane.add(btnMesa_15);
		
		JButton btnMesa_16 = new JButton("mesa 20");
		btnMesa_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=20;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_16.setBounds(456, 224, 99, 43);
		contentPane.add(btnMesa_16);
		
		JButton btnMesa_17 = new JButton("mesa 21");
		btnMesa_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=21;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_17.setBounds(20, 288, 99, 43);
		contentPane.add(btnMesa_17);
		
		JButton btnMesa_18 = new JButton("mesa 22");
		btnMesa_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=22;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_18.setBounds(129, 288, 99, 43);
		contentPane.add(btnMesa_18);
		
		JButton btnMesa_19 = new JButton("mesa 23");
		btnMesa_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=23;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_19.setBounds(238, 288, 99, 43);
		contentPane.add(btnMesa_19);
		
		JButton btnMesa_20 = new JButton("mesa 24");
		btnMesa_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=24;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_20.setBounds(347, 288, 99, 43);
		contentPane.add(btnMesa_20);
		
		JButton btnMesa_21 = new JButton("mesa 25");
		btnMesa_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame fp=new RealMenu2();
				fp.setVisible(true);
				
				numeromesa=25;
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);
			}
		});
		btnMesa_21.setBounds(456, 288, 99, 43);
		contentPane.add(btnMesa_21);
	}
}
