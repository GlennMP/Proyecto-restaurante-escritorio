package GUIs;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

import mantenimiento.gestionmenu;
import model.mostrarproducto;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMesas2 extends JInternalFrame {
	
	
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
					frmMesas2 frame = new frmMesas2();
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
	public frmMesas2() {
		setBounds(100, 100, 620, 388);
		getContentPane().setLayout(null);
		
		JButton btnMesa = new JButton("Mesa 1");
		btnMesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=1;
				login();
				
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
						
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa.setBounds(25, 29, 102, 46);
		getContentPane().add(btnMesa);
		
		JButton btnMesa_1 = new JButton("Mesa 2");
		btnMesa_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=2;
				
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
		
				
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_1.setBounds(137, 29, 102, 46);
		getContentPane().add(btnMesa_1);
		
		JButton btnMesa_2 = new JButton("Mesa 3");
		btnMesa_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=3;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
		
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_2.setBounds(249, 29, 102, 46);
		getContentPane().add(btnMesa_2);
		
		JButton btnMesa_3 = new JButton("Mesa 4");
		btnMesa_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=4;
				login();
			/*	frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
		
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_3.setBounds(361, 29, 102, 46);
		getContentPane().add(btnMesa_3);
		
		JButton btnMesa_4 = new JButton("Mesa 5");
		btnMesa_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=5;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
		
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_4.setBounds(473, 29, 102, 46);
		getContentPane().add(btnMesa_4);
		
		JButton btnMesa_5 = new JButton("Mesa 6");
		btnMesa_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=6;
				login();
			/*	frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
		
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_5.setBounds(25, 86, 102, 46);
		getContentPane().add(btnMesa_5);
		
		JButton btnMesa_6 = new JButton("Mesa 7");
		btnMesa_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=7;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_6.setBounds(137, 86, 102, 46);
		getContentPane().add(btnMesa_6);
		
		JButton btnMesa_7 = new JButton("Mesa 8");
		btnMesa_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=8;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_7.setBounds(249, 86, 102, 46);
		getContentPane().add(btnMesa_7);
		
		JButton btnMesa_8 = new JButton("Mesa 9");
		btnMesa_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=9;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_8.setBounds(361, 86, 102, 46);
		getContentPane().add(btnMesa_8);
		
		JButton btnMesa_9 = new JButton("Mesa 10");
		btnMesa_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=10;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_9.setBounds(473, 86, 102, 46);
		getContentPane().add(btnMesa_9);
		
		JButton btnMesa_10 = new JButton("Mesa 11");
		btnMesa_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=11;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_10.setBounds(25, 143, 102, 46);
		getContentPane().add(btnMesa_10);
		
		JButton btnMesa_11 = new JButton("Mesa 12");
		btnMesa_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=12;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_11.setBounds(137, 143, 102, 46);
		getContentPane().add(btnMesa_11);
		
		JButton btnMesa_12 = new JButton("Mesa 13");
		btnMesa_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=13;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_12.setBounds(249, 143, 102, 46);
		getContentPane().add(btnMesa_12);
		
		JButton btnMesa_13 = new JButton("Mesa 14");
		btnMesa_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=14;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_13.setBounds(361, 143, 102, 46);
		getContentPane().add(btnMesa_13);
		
		JButton btnMesa_14 = new JButton("Mesa 15");
		btnMesa_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=15;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_14.setBounds(473, 143, 102, 46);
		getContentPane().add(btnMesa_14);
		
		JButton btnMesa_15 = new JButton("Mesa 16");
		btnMesa_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=16;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_15.setBounds(25, 200, 102, 46);
		getContentPane().add(btnMesa_15);
		
		JButton btnMesa_16 = new JButton("Mesa 17");
		btnMesa_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=17;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_16.setBounds(137, 200, 102, 46);
		getContentPane().add(btnMesa_16);
		
		JButton btnMesa_17 = new JButton("Mesa 18");
		btnMesa_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=18;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_17.setBounds(249, 200, 102, 46);
		getContentPane().add(btnMesa_17);
		
		JButton btnMesa_18 = new JButton("Mesa 19");
		btnMesa_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=19;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_18.setBounds(361, 200, 102, 46);
		getContentPane().add(btnMesa_18);
		
		JButton btnMesa_19 = new JButton("Mesa 20");
		btnMesa_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=20;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_19.setBounds(473, 200, 102, 46);
		getContentPane().add(btnMesa_19);
		
		JButton btnMesa_20 = new JButton("Mesa 21");
		btnMesa_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=21;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_20.setBounds(25, 257, 102, 46);
		getContentPane().add(btnMesa_20);
		
		JButton btnMesa_21 = new JButton("Mesa 22");
		btnMesa_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=22;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_21.setBounds(137, 257, 102, 46);
		getContentPane().add(btnMesa_21);
		
		JButton btnMesa_22 = new JButton("Mesa 23");
		btnMesa_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=23;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_22.setBounds(249, 257, 102, 46);
		getContentPane().add(btnMesa_22);
		
		JButton btnMesa_23 = new JButton("Mesa 24");
		btnMesa_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=24;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_23.setBounds(361, 257, 102, 46);
		getContentPane().add(btnMesa_23);
		
		JButton btnMesa_24 = new JButton("Mesa 25");
		btnMesa_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				numeromesa=25;
				login();
				/*frmRealMenu1 f=new frmRealMenu1();
				Principal.PanelPrincipal.add(f);
				f.toFront();
				f.setVisible(true);
				
				gestionmenu g= new gestionmenu();
				g.muestraproductos(numeromesa);*/
			}
		});
		btnMesa_24.setBounds(473, 257, 102, 46);
		getContentPane().add(btnMesa_24);
		
		

	}
	
	void login() {

		frmLoginMesas fm= new frmLoginMesas();
		Principal.PanelPrincipal.add(fm);
		fm.toFront();
		fm.setVisible(true);
		
	}

}
