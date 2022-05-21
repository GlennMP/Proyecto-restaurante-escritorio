package GUIs;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource.LineBorderUIResource;
import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.text.AttributeSet.ColorAttribute;

import clases.Mesa;
import clases.Platos;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class frmMesas extends JInternalFrame {
	
	public static JTextArea TaMesa1;
	public static JTextArea TaMesa7;
	public static JTextArea TaMesa6;
	public static JTextArea TaMesa3;
	public static JTextArea TaMesa2;
	public static JTextArea TaMesa4;
	public static JTextArea TaMesa5;
	public static JTextArea TaMesa8;
	public static JTextArea TaMesa9;
	public static JTextArea TaMesa10;
	public static JTextArea TaMesa11;
	public static JTextArea TaMesa12;
	public static JTextArea TaMesa14;
	public static JTextArea TaMesa13;
	public static JTextArea TaMesa15;
	public static JTextArea TaMesa16;
	public static JTextArea TaMesa17;
	public static JTextArea TaMesa18;
	public static JTextArea TaMesa19;
	public static JTextArea TaMesa20;
	
	 
	private static JPanel panelM1;
	private static JPanel panelM2;
	private static JPanel panelM3;
	private static JPanel panelM6;
	private static JPanel panelM7;
	private static JPanel panelM4;
	private static JPanel panelM5;
	private static JPanel panelM9;
	private static JPanel panelM12;
	private static JPanel panelM8;
	private static JPanel panelM11;
	private static JPanel panelM13;
	private static JPanel panelM14;
	private static JPanel panelM10;
	private static JPanel panelM15;
	private static JPanel panelM16;
	private static JPanel panelM17;
	private static JPanel panelM18;
	private static JPanel panelM19;
	private static JPanel panelM20;
	
	public static ArrayList<Mesa> Mesas= new ArrayList<>();
	public static int NumeroMesa=0;
	public static int Crea=0;
	
		
	public static frmPedidos M1= new frmPedidos();
	public static frmPedidos M2= new frmPedidos();
	public static frmPedidos M3= new frmPedidos();
	public static frmPedidos M4= new frmPedidos();
	public static frmPedidos M5= new frmPedidos();
	public static frmPedidos M6= new frmPedidos();
	public static frmPedidos M7= new frmPedidos();
	public static frmPedidos M8= new frmPedidos();
	public static frmPedidos M9= new frmPedidos();
	public static frmPedidos M10= new frmPedidos();
	public static frmPedidos M11= new frmPedidos();
	public static frmPedidos M12= new frmPedidos();
	public static frmPedidos M13= new frmPedidos();
	public static frmPedidos M14= new frmPedidos();
	public static frmPedidos M15= new frmPedidos();
	public static frmPedidos M16= new frmPedidos();
	public static frmPedidos M17= new frmPedidos();
	public static frmPedidos M18= new frmPedidos();
	public static frmPedidos M19= new frmPedidos();
	public static frmPedidos M20= new frmPedidos();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMesas frame = new frmMesas();
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
		
	
	public frmMesas() {
		
		CreateMesas();
		
		setClosable(true);
		setBounds(100, 100, 896, 639);
		getContentPane().setLayout(null);
		
		panelM1 = new JPanel();
		panelM1.setBorder(new LineBorder(Color.GREEN, 2));
		panelM1.setBounds(10, 11, 160, 59);
		getContentPane().add(panelM1);
		panelM1.setLayout(null);
		
		JButton MESA1 = new JButton("MESA 01");
		MESA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				VerificarStatus(panelM1, M1,TaMesa1,MESA1);
				
				 
				
			}
		});
		MESA1.setBounds(6, 5, 148, 49);
		panelM1.add(MESA1);
		
		panelM2 = new JPanel();
		panelM2.setLayout(null);
		panelM2.setBorder(new LineBorder(Color.GREEN, 2));
		panelM2.setBounds(182, 11, 160, 59);
		getContentPane().add(panelM2);
		
		JButton MESA2 = new JButton("MESA 02");
		MESA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				VerificarStatus(panelM2, M2,TaMesa2,MESA2);				
				
			}
		});
		MESA2.setBounds(6, 5, 148, 49);
		panelM2.add(MESA2);
		
		TaMesa2 = new JTextArea();
		TaMesa2.setEditable(false);
		TaMesa2.setBounds(182, 82, 160, 70);
		getContentPane().add(TaMesa2);
		
		panelM6 = new JPanel();
		panelM6.setLayout(null);
		panelM6.setBorder(new LineBorder(Color.GREEN, 2));
		panelM6.setBounds(10, 163, 160, 59);
		getContentPane().add(panelM6);
		
		JButton MESA6 = new JButton("MESA 06");
		MESA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				VerificarStatus(panelM6, M6,TaMesa6,MESA6);
				
			}
		});
		MESA6.setBounds(6, 5, 148, 49);
		panelM6.add(MESA6);
		
		TaMesa6 = new JTextArea();
		TaMesa6.setEditable(false);
		TaMesa6.setBounds(10, 234, 160, 70);
		getContentPane().add(TaMesa6);
		
		panelM7 = new JPanel();
		panelM7.setLayout(null);
		panelM7.setBorder(new LineBorder(Color.GREEN, 2));
		panelM7.setBounds(182, 163, 160, 59);
		getContentPane().add(panelM7);
		
		JButton MESA7 = new JButton("MESA 07");
		MESA7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				VerificarStatus(panelM7, M7,TaMesa7,MESA7);
				
			}
		});
		MESA7.setBounds(6, 5, 148, 49);
		panelM7.add(MESA7);
		
		TaMesa7 = new JTextArea();
		TaMesa7.setEditable(false);
		TaMesa7.setBounds(182, 234, 160, 70);
		getContentPane().add(TaMesa7);
		
		panelM3 = new JPanel();
		panelM3.setLayout(null);
		panelM3.setBorder(new LineBorder(Color.GREEN, 2));
		panelM3.setBounds(352, 11, 160, 59);
		getContentPane().add(panelM3);
		
		JButton MESA3 = new JButton("MESA 03");
		MESA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				
				VerificarStatus(panelM3, M3,TaMesa3,MESA3);
				
			}
		});
		MESA3.setBounds(6, 5, 148, 49);
		panelM3.add(MESA3);
		
		TaMesa3 = new JTextArea();
		TaMesa3.setEditable(false);
		TaMesa3.setBounds(352, 82, 160, 70);
		getContentPane().add(TaMesa3);
		
		panelM4 = new JPanel();
		panelM4.setLayout(null);
		panelM4.setBorder(new LineBorder(Color.GREEN, 2));
		panelM4.setBounds(530, 11, 160, 59);
		getContentPane().add(panelM4);
		
		JButton MESA4 = new JButton("MESA 04");
		MESA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM4, M4,TaMesa4,MESA4);
				
			}
		});
		MESA4.setBounds(6, 5, 148, 49);
		panelM4.add(MESA4);
		
		TaMesa4 = new JTextArea();
		TaMesa4.setEditable(false);
		TaMesa4.setBounds(530, 82, 160, 70);
		getContentPane().add(TaMesa4);
		
		panelM5 = new JPanel();
		panelM5.setLayout(null);
		panelM5.setBorder(new LineBorder(Color.GREEN, 2));
		panelM5.setBounds(700, 11, 160, 59);
		getContentPane().add(panelM5);
		
		JButton MESA5 = new JButton("MESA 05");
		MESA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			
				VerificarStatus(panelM5, M5,TaMesa5,MESA5);
				
			}
		});
		MESA5.setBounds(6, 5, 148, 49);
		panelM5.add(MESA5);
		
		TaMesa5 = new JTextArea();
		TaMesa5.setEditable(false);
		TaMesa5.setBounds(700, 82, 160, 70);
		getContentPane().add(TaMesa5);
		
		panelM9 = new JPanel();
		panelM9.setLayout(null);
		panelM9.setBorder(new LineBorder(Color.GREEN, 2));
		panelM9.setBounds(530, 163, 160, 59);
		getContentPane().add(panelM9);
		
		JButton MESA9 = new JButton("MESA 09");
		MESA9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM9, M9,TaMesa9,MESA9);
				
			}
		});
		MESA9.setBounds(6, 5, 148, 49);
		panelM9.add(MESA9);
		
		TaMesa9 = new JTextArea();
		TaMesa9.setEditable(false);
		TaMesa9.setBounds(530, 234, 160, 70);
		getContentPane().add(TaMesa9);
		
		panelM12 = new JPanel();
		panelM12.setLayout(null);
		panelM12.setBorder(new LineBorder(Color.GREEN, 2));
		panelM12.setBounds(182, 315, 160, 59);
		getContentPane().add(panelM12);
		
		JButton MESA12 = new JButton("MESA 12");
		MESA12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM12, M12,TaMesa12,MESA12);
				
			}
		});
		MESA12.setBounds(6, 5, 148, 49);
		panelM12.add(MESA12);
		
		TaMesa12 = new JTextArea();
		TaMesa12.setEditable(false);
		TaMesa12.setBounds(182, 386, 160, 70);
		getContentPane().add(TaMesa12);
		
		TaMesa8 = new JTextArea();
		TaMesa8.setEditable(false);
		TaMesa8.setBounds(352, 234, 160, 70);
		getContentPane().add(TaMesa8);
		
		panelM8 = new JPanel();
		panelM8.setLayout(null);
		panelM8.setBorder(new LineBorder(Color.GREEN, 2));
		panelM8.setBounds(352, 163, 160, 59);
		getContentPane().add(panelM8);
		
		JButton MESA8 = new JButton("MESA 08");
		MESA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM8, M8,TaMesa8,MESA8);
				
			}
		});
		MESA8.setBounds(6, 5, 148, 49);
		panelM8.add(MESA8);
		
		TaMesa11 = new JTextArea();
		TaMesa11.setEditable(false);
		TaMesa11.setBounds(10, 386, 160, 70);
		getContentPane().add(TaMesa11);
		
		panelM11 = new JPanel();
		panelM11.setLayout(null);
		panelM11.setBorder(new LineBorder(Color.GREEN, 2));
		panelM11.setBounds(10, 315, 160, 59);
		getContentPane().add(panelM11);
		
		JButton MESA11 = new JButton("MESA 11");
		MESA11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM11, M11,TaMesa11,MESA11);
				
			}
		});
		MESA11.setBounds(6, 5, 148, 49);
		panelM11.add(MESA11);
		
		TaMesa13 = new JTextArea();
		TaMesa13.setEditable(false);
		TaMesa13.setBounds(352, 386, 160, 70);
		getContentPane().add(TaMesa13);
		
		panelM13 = new JPanel();
		panelM13.setLayout(null);
		panelM13.setBorder(new LineBorder(Color.GREEN, 2));
		panelM13.setBounds(352, 315, 160, 59);
		getContentPane().add(panelM13);
		
		JButton MESA13 = new JButton("MESA 13");
		MESA13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		
				VerificarStatus(panelM13, M13,TaMesa13,MESA13);
				
			}
		});
		MESA13.setBounds(6, 5, 148, 49);
		panelM13.add(MESA13);
		
		TaMesa14 = new JTextArea();
		TaMesa14.setEditable(false);
		TaMesa14.setBounds(530, 386, 160, 70);
		getContentPane().add(TaMesa14);
		
		panelM14 = new JPanel();
		panelM14.setLayout(null);
		panelM14.setBorder(new LineBorder(Color.GREEN, 2));
		panelM14.setBounds(530, 315, 160, 59);
		getContentPane().add(panelM14);
		
		JButton MESA14 = new JButton("MESA 14");
		MESA14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				VerificarStatus(panelM14, M14,TaMesa14,MESA14);
				
			}
		});
		MESA14.setBounds(6, 5, 148, 49);
		panelM14.add(MESA14);
		
		TaMesa10 = new JTextArea();
		TaMesa10.setEditable(false);
		TaMesa10.setBounds(700, 234, 160, 70);
		getContentPane().add(TaMesa10);
		
		panelM10 = new JPanel();
		panelM10.setLayout(null);
		panelM10.setBorder(new LineBorder(Color.GREEN, 2));
		panelM10.setBounds(700, 163, 160, 59);
		getContentPane().add(panelM10);
		
		JButton MESA10 = new JButton("MESA 10");
		MESA10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM10, M10,TaMesa10,MESA10);
				
			}
		});
		MESA10.setBounds(6, 5, 148, 49);
		panelM10.add(MESA10);
		
		TaMesa15 = new JTextArea();
		TaMesa15.setEditable(false);
		TaMesa15.setBounds(700, 386, 160, 70);
		getContentPane().add(TaMesa15);
		
		panelM15 = new JPanel();
		panelM15.setLayout(null);
		panelM15.setBorder(new LineBorder(Color.GREEN, 2));
		panelM15.setBounds(700, 315, 160, 59);
		getContentPane().add(panelM15);
		
		JButton MESA15 = new JButton("MESA 15");
		MESA15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM15, M15,TaMesa15,MESA15);
				
			}
		});
		MESA15.setBounds(6, 5, 148, 49);
		panelM15.add(MESA15);
		
		TaMesa16 = new JTextArea();
		TaMesa16.setEditable(false);
		TaMesa16.setBounds(10, 538, 160, 70);
		getContentPane().add(TaMesa16);
		
		panelM16 = new JPanel();
		panelM16.setLayout(null);
		panelM16.setBorder(new LineBorder(Color.GREEN, 2));
		panelM16.setBounds(10, 467, 160, 59);
		getContentPane().add(panelM16);
		
		JButton MESA16 = new JButton("MESA 16");
		MESA16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM16, M16,TaMesa16,MESA16);
				
			}
		});
		MESA16.setBounds(6, 5, 148, 49);
		panelM16.add(MESA16);
		
		TaMesa17 = new JTextArea();
		TaMesa17.setEditable(false);
		TaMesa17.setBounds(182, 538, 160, 70);
		getContentPane().add(TaMesa17);
		
		panelM17 = new JPanel();
		panelM17.setLayout(null);
		panelM17.setBorder(new LineBorder(Color.GREEN, 2));
		panelM17.setBounds(182, 467, 160, 59);
		getContentPane().add(panelM17);
		
		JButton MESA17 = new JButton("MESA 17");
		MESA17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				VerificarStatus(panelM17, M17,TaMesa17,MESA17);
				
			}
		});
		MESA17.setBounds(6, 5, 148, 49);
		panelM17.add(MESA17);
		
		TaMesa18 = new JTextArea();
		TaMesa18.setEditable(false);
		TaMesa18.setBounds(352, 538, 160, 70);
		getContentPane().add(TaMesa18);
		
		panelM18 = new JPanel();
		panelM18.setLayout(null);
		panelM18.setBorder(new LineBorder(Color.GREEN, 2));
		panelM18.setBounds(352, 467, 160, 59);
		getContentPane().add(panelM18);
		
		JButton MESA18 = new JButton("MESA 18");
		MESA18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM18, M18,TaMesa18,MESA18);
				
			}
		});
		MESA18.setBounds(6, 5, 148, 49);
		panelM18.add(MESA18);
		
		TaMesa19 = new JTextArea();
		TaMesa19.setEditable(false);
		TaMesa19.setBounds(530, 538, 160, 70);
		getContentPane().add(TaMesa19);
		
		panelM19 = new JPanel();
		panelM19.setLayout(null);
		panelM19.setBorder(new LineBorder(Color.GREEN, 2));
		panelM19.setBounds(530, 467, 160, 59);
		getContentPane().add(panelM19);
		
		JButton MESA19 = new JButton("MESA 19");
		MESA19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			
				VerificarStatus(panelM19, M19,TaMesa19,MESA19);
				
			}
		});
		MESA19.setBounds(6, 5, 148, 49);
		panelM19.add(MESA19);
		
		TaMesa20 = new JTextArea();
		TaMesa20.setEditable(false);
		TaMesa20.setBounds(700, 538, 160, 70);
		getContentPane().add(TaMesa20);
		
		panelM20 = new JPanel();
		panelM20.setLayout(null);
		panelM20.setBorder(new LineBorder(Color.GREEN, 2));
		panelM20.setBounds(700, 467, 160, 59);
		getContentPane().add(panelM20);
		
		JButton MESA20 = new JButton("MESA 20");
		MESA20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				VerificarStatus(panelM20, M20,TaMesa20,MESA20);
				
			}
		});
		MESA20.setBounds(6, 5, 148, 49);
		panelM20.add(MESA20);
		
		TaMesa1 = new JTextArea();
		TaMesa1.setBounds(10, 81, 160, 71);
		getContentPane().add(TaMesa1);
		
		
		
	
		
	}
	



void CreateMesas(){
	for(int i=0;i<20;i++){
		Mesas.add(new Mesa(("MESA "+(i+1)), null, (i+1), false));
	}
}

public static int NumMesa(JButton B){
	int NM;
	String NumM;
	String Boton=B.getText();
	NumM=Boton.replaceAll("MESA","");
	Boton=NumM.replaceAll(" ","");
	NM=Integer.parseInt(Boton);
	return NM;
}

public static void Creacion(JPanel P,frmPedidos M,JTextArea Ta,JButton B){
	int NM=NumMesa(B);
	Mesas.set(NM-1,new Mesa(B.getText(), null ,NM ,false));
	M= new frmPedidos();
	Principal.PanelPrincipal.add(M);
	M.move(2,2);
	M.show();
	
	
}


public static JPanel Panel;
public static frmPedidos MesasPedido;
public static JTextArea Txtarea;


public static void VerificarStatus(JPanel P,frmPedidos M,JTextArea Ta,JButton B){
	int NM=NumMesa(B);
	Crea=M.Creacion;
	NumeroMesa=NM;
	if(Mesas.get(NM-1).getEstado()==false){
		
			Creacion(P, M, Ta, B);
			M.Creacion+=3;
			VerificarVerdeRojo(P, M, Ta);
	
	}
	else{
		
		Crea+=3;
		M= new frmPedidos();
		Principal.PanelPrincipal.add(M);
		M.move(2,2);
		M.show();
		VerificarVerdeRojo(P, M, Ta);
		
		
	}

	
}


public static void VerificarVerdeRojo(JPanel P,frmPedidos M,JTextArea Ta){
	if(Mesas.get(M.NumMesa).getEstado()==true){
		P.setBorder(null);
		P.setBorder(new LineBorder(Color.RED, 2));
		Ta.setText(null);
		Ta.append("Platos : "+M.ContPedidos+"\n");
		Ta.append("Total a Pagar : "+M.TotalPagar);
	}
			else{
				P.setBorder(null);
				P.setBorder(new LineBorder(Color.GREEN, 2));
				Ta.setText(null);
				
		}
	
}
public static void Remove(int i){
		Mesas.get(i).setPedido(null);
		Mesas.get(i).setEstado(false);
		Verificacion(i);
}

public static void Verificacion(int i){
		switch (i) {
		case 0:
			VerificarVerdeRojo(panelM1, M1,TaMesa1);
			break;
	
		case 1:
			VerificarVerdeRojo(panelM2, M2,TaMesa2);
			break;
	
		case 2:
			VerificarVerdeRojo(panelM3, M3,TaMesa3);
			break;
	
		case 3:
			VerificarVerdeRojo(panelM4, M4,TaMesa4);
			break;
	
		case 4:
			VerificarVerdeRojo(panelM5, M5,TaMesa5);	
			break;
	
		case 5:
			VerificarVerdeRojo(panelM6, M6,TaMesa6);
			break;
	
		case 6:
			VerificarVerdeRojo(panelM7, M7,TaMesa7);
			break;
	
		case 7:
			VerificarVerdeRojo(panelM8, M8,TaMesa8);
			break;
	
		case 8:
			VerificarVerdeRojo(panelM9, M9,TaMesa9);
			break;
	
		case 9:
			VerificarVerdeRojo(panelM10, M10,TaMesa10);
			break;
	
		case 10:
			VerificarVerdeRojo(panelM11, M11,TaMesa11);
			break;
	
		case 11:
			VerificarVerdeRojo(panelM12, M12,TaMesa12);
			break;
	
		case 12:
			VerificarVerdeRojo(panelM13, M13,TaMesa13);
			break;
	
		case 13:
			VerificarVerdeRojo(panelM14, M14,TaMesa14);
			break;
		case 14:
			VerificarVerdeRojo(panelM15, M15,TaMesa15);
			break;
		case 15:
			VerificarVerdeRojo(panelM16, M16,TaMesa16);
			break;
		case 16:
			VerificarVerdeRojo(panelM17, M17,TaMesa17);
			break;
		case 17:
			VerificarVerdeRojo(panelM18, M18,TaMesa18);
			break;
		case 18:
			VerificarVerdeRojo(panelM19, M19,TaMesa19);
			break;
		case 19:
			VerificarVerdeRojo(panelM20, M20,TaMesa20);
			break;

		}
	}
}