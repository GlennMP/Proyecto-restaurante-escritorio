package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clases.Mesa;
import clases.Platos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.TextArea;
import javax.swing.JList;
import javax.swing.JTable;
import java.awt.Color;

public class frmPedidos extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frmPedidos frame = new frmPedidos();
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
	

	
	private JTextField TfMesas;
	private JEditorPane txtCodigo;
	public VerPedido Vp= new VerPedido();
	public int NumMesa=0;

	public int Creacion=0;
	
	
	public frmPedidos(){
		NumMesa=frmMesas.NumeroMesa;
		Creacion=frmMesas.Crea;
		if(Creacion>1){
			
			frmPedidoHecho();
		}
		
		else{
			
			
			PrimerfrmPedido();
		}
		
		
	}
	public void PrimerfrmPedido(){
		
		Mesa M = new Mesa(("MESA "+NumMesa),null, 0, false); 
		
		setBounds(100, 100, 455, 240);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(266, 177, 65, 23);
		btnOk.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Creacion+=3;
				M.setEstado(true);
				M.setNombre(NombreMesa());
				frmMesas.Mesas.set(NumMesa-1, M);
				Vp.doDefaultCloseAction();
				
				frmMesas.Verificacion(NumMesa-1);
				dispose();
				
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(341, 177, 93, 23);
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Vp!=null){
					Vp.dispose();
				}
				
				dispose();
			
			}
		});
		getContentPane().add(btnCancel);
		
		JButton btnEliminarpedido = new JButton("Eliminar Pedido ");
		btnEliminarpedido.setBounds(78, 177, 178, 23);
		getContentPane().add(btnEliminarpedido);
		btnEliminarpedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Vp.txtPedido.setText(null);
				M.setPedido(null);
				M.setEstado(false);
				frmMesas.Mesas.set(NumMesa-1, M);
				frmMesas.Verificacion(NumMesa-1);
				
					Vp.isClosable();
				
				dispose();
				
			}
		});
		btnEliminarpedido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtCodigo = new JEditorPane();
		txtCodigo.setBounds(11, 73, 422, 63);
		getContentPane().add(txtCodigo);
		txtCodigo.setText(M.getPedido());
		
		JLabel label = new JLabel("Coloque los c\u00F3digos:");
		label.setBounds(11, 53, 150, 14);
		getContentPane().add(label);
		
		TfMesas = new JTextField();
		TfMesas.setForeground(Color.BLACK);
		TfMesas.setBounds(150, 11, 130, 31);
		TfMesas.setText(NombreMesa());
		TfMesas.setHorizontalAlignment(SwingConstants.CENTER);
		TfMesas.setFont(new Font("Times New Roman", Font.BOLD, 17));
		TfMesas.setEnabled(false);
		TfMesas.setEditable(false);
		TfMesas.setColumns(10);
		getContentPane().add(TfMesas);
		
		JButton btnVerPedido = new JButton("Ver Pedido");
		btnVerPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
					Vp.txtPedido.setText(null);
					Vp.isClosable();
					Ver();
					if (txtCodigo.getText()!=null) {
						
						
						Agregar(txtCodigo.getText());
						
							
						
					
					}
					else{					
						Vp.txtPedido.setText("AGREGUE UN PEDIDO");
						Ver();
					}
			
			}
		});
		btnVerPedido.setBounds(231, 144, 198, 23);
		getContentPane().add(btnVerPedido);

		JButton btnAgregar = new JButton("Agregar Pedido");
		btnAgregar.setBounds(11, 144, 198, 23);
		getContentPane().add(btnAgregar);
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Vp.txtPedido.setText(null);
				Vp.isClosable();
				Ver();
				if (txtCodigo.getText()!=null) {
					
					M.setPedido(txtCodigo.getText());
					Agregar(txtCodigo.getText());
					
						
					
				
				}
				else{					
					Vp.txtPedido.setText("AGREGUE UN PEDIDO");
					Ver();
				}
				
				Vp.txtPedido.append("\n\n"+"Total A Pagar: "+TotalPagar);
				
				
				
			}
		});
	}
	public void frmPedidoHecho() {
			
		Mesa M = frmMesas.Mesas.get(NumMesa-1);
		Ver();
		setBounds(100, 100, 455, 240);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(266, 177, 65, 23);
		btnOk.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				M.setEstado(true);
				frmMesas.Mesas.set(NumMesa-1, M);
				Vp.doDefaultCloseAction();
				frmMesas.Verificacion(NumMesa-1);
				dispose();
				
			}
		});
		getContentPane().setLayout(null);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(341, 177, 93, 23);
		btnCancel.setFont(new Font("Arial", Font.PLAIN, 11));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Vp!=null){
					Vp.isClosable();
				}
				
				dispose();
			
			}
		});
		getContentPane().add(btnCancel);
		
		
		
		JButton btnEliminarpedido = new JButton("Eliminar Pedido ");
		btnEliminarpedido.setBounds(78, 177, 178, 23);
		getContentPane().add(btnEliminarpedido);
		btnEliminarpedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Vp.txtPedido.setText(null);
				M.setPedido(null);
				M.setEstado(false);
				frmMesas.Mesas.set(NumMesa-1, M);
				frmMesas.Verificacion(NumMesa-1);
				Vp.isClosable();
				dispose();
			}
		});
		btnEliminarpedido.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtCodigo = new JEditorPane();
		txtCodigo.setBounds(11, 73, 422, 63);
		getContentPane().add(txtCodigo);
		txtCodigo.setText(null);
		txtCodigo.setText(M.getPedido());
		
		
		JLabel label = new JLabel("Coloque los c\u00F3digos:");
		label.setBounds(11, 53, 150, 14);
		getContentPane().add(label);
		
		TfMesas = new JTextField();
		TfMesas.setForeground(Color.BLACK);
		TfMesas.setBounds(150, 11, 130, 31);
		TfMesas.setText(M.getNombre());
		TfMesas.setHorizontalAlignment(SwingConstants.CENTER);
		TfMesas.setFont(new Font("Times New Roman", Font.BOLD, 17));
		TfMesas.setEnabled(false);
		TfMesas.setEditable(false);
		TfMesas.setColumns(10);
		getContentPane().add(TfMesas);
		
		JButton btnVerPedido = new JButton("Ver Pedido");
		btnVerPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				Vp.txtPedido.setText(null);
				Vp.doDefaultCloseAction();
				Ver();
				if (txtCodigo.getText()!=null) {
					
					
					Agregar(txtCodigo.getText());
					
						
					
				
				}
				else{					
					Vp.txtPedido.setText("AGREGUE UN PEDIDO");
					Ver();
				}
				Vp.txtPedido.append("\n\n"+"Total A Pagar: "+TotalPagar);
			
			}
		});
		btnVerPedido.setBounds(231, 144, 198, 23);
		getContentPane().add(btnVerPedido);
		
		JButton btnAgregar = new JButton("Agregar Pedido");
		btnAgregar.setBounds(11, 144, 198, 23);
		getContentPane().add(btnAgregar);
		
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vp.txtPedido.setText(null);
				Vp.isClosable();
				Ver();
				if (txtCodigo.getText()!=null) {
					M.setPedido(txtCodigo.getText());
					Agregar(M.getPedido());		
					
						
				}
				else{					
					Vp.txtPedido.setText("AGREGUE UN PEDIDO");
				}
				Vp.txtPedido.append("\n\n"+"Total A Pagar: "+TotalPagar);			
			}
		});

	}
	
	public static int ContPedidos;
	public static double TotalPagar;

	
		void Ver(){
			Vp.doDefaultCloseAction();
			Vp= new VerPedido();
			Principal.PanelPrincipal.add(Vp);
			Vp.show();
			Vp.move(460,2);
		}
	
	
	
	public void Agregar(String Ped){
		ContPedidos=0;
		TotalPagar=0.0;
		String [] p;
		p=Ped.split(",");
		for(int i=0;i<p.length;i++){
			AgregarPedido(Integer.parseInt(p[i]));
			
		}
		
		
	}
	
	public void AgregarPedido(int p){
	
		if(p>300){
			Vp.Imprimir(frmRealMenu.Beb.get(p-301),p);
			TotalPagar=TotalPagar+frmRealMenu.Beb.get(p-301).getPrecio();
			ContPedidos++;
		}
		else if(p>200){
			Vp.Imprimir(frmRealMenu.Piq.get(p-201),p);
			TotalPagar=TotalPagar+frmRealMenu.Piq.get(p-201).getPrecio();
			ContPedidos++;
		}		
		else{
			Vp.Imprimir(frmRealMenu.Pl.get(p-101),p);
			TotalPagar=TotalPagar+frmRealMenu.Pl.get(p-101).getPrecio();
			ContPedidos++;
				
		}
			}
						
			
		
		
		
	
	
	public String NombreMesa(){
		if (NumMesa<10){
			return ("MESA 0"+NumMesa);
		}
		else
			return ("MESA "+NumMesa);
	}
	String[]Pedido=new String[100];
	int Pe=0;
	public void Imprimir(Platos P,int i){
		Pedido[Pe]=(P.getCodigo()+". "+P.getNombre()+"\t\t\t"+P.getPrecio()+"\n  "+P.getContenido()+"\n");

	}
	
}
