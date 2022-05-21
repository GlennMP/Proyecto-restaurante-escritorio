package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.sound.sampled.Mixer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import clases.Platos;

import java.awt.SystemColor;
import java.awt.TextArea;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class frmCaja extends JInternalFrame {
	private JTextField txtFPagoTarj;
	public static JComboBox CBCaja;
	public static JTextArea TxtAreaCaja;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCaja frame = new frmCaja();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private Double TotalAPagar;
	private JTextField txtFPagoEfect;
	private int iMesaBuscada;
	int N=VerTotalPedidos();	
	String[] MDP=new String[N] ; 
	int[] NMPP=new int[N];	

	public frmCaja() {
		
		
		MDP=ExtraerNombresP(N);
		NMPP=ExtraerNumerosP(N);	
					
				
			
		
		setClosable(true);
		setBounds(100, 100, 443, 370);
		getContentPane().setLayout(null);
		
		CBCaja = new JComboBox();

		CBCaja.setModel(new DefaultComboBoxModel(MDP));
		CBCaja.setBounds(10, 40, 178, 20);
		getContentPane().add(CBCaja);
		
		
		JLabel lblCaja = new JLabel("CAJA");
		lblCaja.setBounds(187, 11, 34, 14);
		getContentPane().add(lblCaja);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "EFECTIVO", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
		panel.setBounds(10, 71, 403, 72);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblPagCon = new JLabel("Pag\u00F3 con :");
		lblPagCon.setBounds(10, 30, 98, 14);
		panel.add(lblPagCon);
		
		JButton btnCalcular = new JButton("Pagar");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NMPP[CBCaja.getSelectedIndex()]==iMesaBuscada){
					AgregarPedidos(frmMesas.Mesas.get(iMesaBuscada).getPedido());
				Double MontoDado,Vuelto=0.0;
				MontoDado=Double.parseDouble(txtFPagoEfect.getText());
				
				Vuelto=MontoDado-TotalAPagar;
				
				txtFPagoEfect.setText(null);
				TxtAreaCaja.append("\nCuenta Pagada Exitosamente");
				TxtAreaCaja.append("\nVuelto: "+Vuelto);
				frmMesas.Remove(iMesaBuscada);
				Reiniciar();
				
				
				}
				else{
					TxtAreaCaja.append("El Contenido de la mesa no concuerda"+"/ncon el numero de mesa");
				}
				
			}
		});
		btnCalcular.setBounds(275, 24, 89, 23);
		panel.add(btnCalcular);
		
		txtFPagoEfect = new JTextField();
		txtFPagoEfect.setBounds(119, 26, 146, 23);
		panel.add(txtFPagoEfect);
		txtFPagoEfect.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TARJETA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 120, 215)));
		panel_1.setBounds(10, 154, 403, 62);
		getContentPane().add(panel_1);
		
		txtFPagoTarj = new JTextField();
		txtFPagoTarj.setColumns(10);
		txtFPagoTarj.setBounds(127, 21, 139, 20);
		panel_1.add(txtFPagoTarj);
		
		JLabel lblNumeroTarjeta = new JLabel("Numero Tarjeta :");
		lblNumeroTarjeta.setBounds(10, 24, 107, 14);
		panel_1.add(lblNumeroTarjeta);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (NMPP[CBCaja.getSelectedIndex()]==iMesaBuscada){
				AgregarPedidos(frmMesas.Mesas.get(iMesaBuscada).getPedido());
				txtFPagoTarj.setText(null);
				TxtAreaCaja.append("\nPago con tarjeta exitoso");
				frmMesas.Remove(iMesaBuscada);
				Reiniciar();
				
				
			}
			else{
				TxtAreaCaja.append("El Contenido de la mesa no concuerda"+"/ncon el numero de mesa");
				
			}
			}
		});
		btnPagar.setBounds(280, 20, 89, 23);
		panel_1.add(btnPagar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Reiniciar();
				
			}
		});
		btnActualizar.setBounds(198, 39, 89, 23);
		getContentPane().add(btnActualizar);
		
		JButton btnVerContenido = new JButton("Ver Contenido");
		btnVerContenido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TxtAreaCaja.setText(null);
				BuscarPagar(NMPP[CBCaja.getSelectedIndex()]);
				
			}
		});
		btnVerContenido.setBounds(297, 39, 116, 23);
		getContentPane().add(btnVerContenido);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 227, 403, 102);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		TxtAreaCaja = new JTextArea();
		TxtAreaCaja.setBounds(0, 0, 403, 102);
		panel_2.add(TxtAreaCaja);
		
		

	}
	void Reiniciar(){
		N=VerTotalPedidos();
		MDP=ExtraerNombresP(N);
		NMPP=ExtraerNumerosP(N);
		CBCaja.setModel(new DefaultComboBoxModel(MDP));
	}
	
	
	void BuscarPagar(int i){
		iMesaBuscada=i;
		switch (i) {
		case 0:
			TxtAreaCaja.append(frmMesas.TaMesa1.getText());
			TotalAPagar=frmMesas.M1.TotalPagar;
			
			break;

		case 1:
			TxtAreaCaja.append(frmMesas.TaMesa2.getText());
			TotalAPagar=frmMesas.M2.TotalPagar;
			break;

		case 2:
			TxtAreaCaja.append(frmMesas.TaMesa3.getText());
			TotalAPagar=frmMesas.M3.TotalPagar;
			break;

		case 3:
			TxtAreaCaja.append(frmMesas.TaMesa4.getText());
			TotalAPagar=frmMesas.M4.TotalPagar;
			break;

		case 4:
			TxtAreaCaja.append(frmMesas.TaMesa5.getText());
			TotalAPagar=frmMesas.M5.TotalPagar;
			break;

		case 5:
			TxtAreaCaja.append(frmMesas.TaMesa6.getText());
			TotalAPagar=frmMesas.M6.TotalPagar;
			break;

		case 6:
			TxtAreaCaja.append(frmMesas.TaMesa7.getText());
			TotalAPagar=frmMesas.M7.TotalPagar;
			break;

		case 7:
			TxtAreaCaja.append(frmMesas.TaMesa8.getText());
			TotalAPagar=frmMesas.M8.TotalPagar;
			break;

		case 8:
			TxtAreaCaja.append(frmMesas.TaMesa9.getText());
			TotalAPagar=frmMesas.M9.TotalPagar;
			break;

		case 9:
			TxtAreaCaja.append(frmMesas.TaMesa10.getText());
			TotalAPagar=frmMesas.M10.TotalPagar;
			break;

		case 10:
			TxtAreaCaja.append(frmMesas.TaMesa11.getText());
			TotalAPagar=frmMesas.M11.TotalPagar;
			break;

		case 11:
			TxtAreaCaja.append(frmMesas.TaMesa12.getText());
			TotalAPagar=frmMesas.M12.TotalPagar;
			break;

		case 12:
			TxtAreaCaja.append(frmMesas.TaMesa13.getText());
			TotalAPagar=frmMesas.M13.TotalPagar;
			break;

			
		case 13:
			TxtAreaCaja.append(frmMesas.TaMesa14.getText());
			TotalAPagar=frmMesas.M14.TotalPagar;
			break;

			
		case 14:
			TxtAreaCaja.append(frmMesas.TaMesa15.getText());
			TotalAPagar=frmMesas.M15.TotalPagar;
			break;

		case 15:
			TxtAreaCaja.append(frmMesas.TaMesa16.getText());
			TotalAPagar=frmMesas.M16.TotalPagar;
			break;

		case 16:
			TxtAreaCaja.append(frmMesas.TaMesa17.getText());
			TotalAPagar=frmMesas.M17.TotalPagar;
			break;

		case 17:
			TxtAreaCaja.append(frmMesas.TaMesa18.getText());
			TotalAPagar=frmMesas.M18.TotalPagar;
			break;

		case 18:
			TxtAreaCaja.append(frmMesas.TaMesa19.getText());
			TotalAPagar=frmMesas.M19.TotalPagar;
			break;

		case 19:
			TxtAreaCaja.append(frmMesas.TaMesa20.getText());
			TotalAPagar=frmMesas.M20.TotalPagar;
			break;
		
				
		
		}
	}
	
	int VerTotalPedidos(){
		int N=0;
		for(int i=0;i<20;i++){
			if(frmMesas.Mesas.get(i).getPedido()!=null)
				N++;
		}
		return N;
	}
	String[] ExtraerNombresP(int N){
		String[] MDP=new String[N] ; 
		int j=0;
		for(int i=0;i<20;i++){
			if(frmMesas.Mesas.get(i).getPedido()!=null){
				MDP[j]=frmMesas.Mesas.get(i).getNombre();
				j++;
		}
		}	
		return MDP;
	}
	
	int[] ExtraerNumerosP(int N){
		int[] NMPP=new int[N];
		int j=0;
		for(int i=0;i<20;i++){
			if(frmMesas.Mesas.get(i).getPedido()!=null){
				NMPP[j]=i;
				j++;
			}
		}
		return NMPP;
	}
	
	private void AgregarPedidos(String Pedido){
		String [] p;
		p=Pedido.split(",");
		for(int i=0;i<p.length;i++){
			Agregar(Integer.parseInt(p[i]));
			
		}
	}
	private void Agregar(int p){
		if(p>300){
			Principal.GrabarBebida(frmRealMenu.Beb.get(p-301));
		}
		else if(p>200){
			Principal.GrabarPiqueo(frmRealMenu.Piq.get(p-201));
		}		
		else{
			Principal.GrabarPlato(frmRealMenu.Pl.get(p-101));	
		}
			
	}
	
}
