package GUIs;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import interfaces.registromenuinterface;
import mantenimiento.gestionmenu;
import mantenimiento.gestionusuario;
import model.registramesa;
import model.tarjeta;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class frmCaja1 extends JInternalFrame {
	private JTable table;
	private JComboBox combomesas;
	public DefaultTableModel modelo;
	private JTextField txtsuma;
	private JTextField txttarjeta;
	private JRadioButton rdbtnEfectivo;
	private JRadioButton rdbtnTarjeta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCaja1 frame = new frmCaja1();
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
	public frmCaja1() {
		setBounds(100, 100, 450, 458);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("CAJA");
		label.setBounds(201, 11, 34, 14);
		getContentPane().add(label);
		
		combomesas = new JComboBox();
		combomesas.setBounds(180, 46, 90, 20);
		getContentPane().add(combomesas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 91, 414, 118);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		modelo=new DefaultTableModel();
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre de producto");
		modelo.addColumn("Precio de producto");
		table.setModel(modelo);
		
		JLabel lblSeleccioneMesaA = new JLabel("Seleccione mesa a pagar");
		lblSeleccioneMesaA.setBounds(29, 49, 178, 14);
		getContentPane().add(lblSeleccioneMesaA);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eliminar();
				listartabla();
				
				
				

				
			}
		});
		btnAceptar.setBounds(313, 45, 89, 23);
		getContentPane().add(btnAceptar);
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(264, 231, 90, 14);
		getContentPane().add(lblTotal);
		
		txtsuma = new JTextField();
		txtsuma.setBounds(316, 228, 86, 20);
		getContentPane().add(txtsuma);
		txtsuma.setColumns(10);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				paga();
				dispose();
			}
		});
		btnPagar.setBounds(167, 386, 89, 23);
		getContentPane().add(btnPagar);
		
		JLabel lblSeleccioneLaForma = new JLabel("Seleccione la forma de pago:");
		lblSeleccioneLaForma.setBounds(10, 261, 178, 14);
		getContentPane().add(lblSeleccioneLaForma);
		
		rdbtnEfectivo = new JRadioButton("Efectivo");
		rdbtnEfectivo.setBounds(66, 282, 109, 23);
		getContentPane().add(rdbtnEfectivo);
		
		rdbtnTarjeta = new JRadioButton("Tarjeta");
		rdbtnTarjeta.setBounds(184, 282, 109, 23);
		getContentPane().add(rdbtnTarjeta);
		
		JLabel lblNumeroDeTarjeta = new JLabel("Numero de tarjeta:");
		lblNumeroDeTarjeta.setBounds(29, 330, 123, 14);
		getContentPane().add(lblNumeroDeTarjeta);
		
		txttarjeta = new JTextField();
		txttarjeta.setEnabled(false);
		txttarjeta.setBounds(143, 327, 140, 20);
		getContentPane().add(txttarjeta);
		txttarjeta.setColumns(10);
		
		JButton btnNewButton = new JButton("Forma de pago");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnTarjeta.isSelected()){
					
					
					txttarjeta.setEnabled(true);
					}
				else{
					txttarjeta.setEnabled(false);
				}
			//}
			
			
			}
		});
		btnNewButton.setBounds(299, 282, 125, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(313, 386, 89, 23);
		getContentPane().add(btnCerrar);

		listarmesa();
		
		
		
		
		if(rdbtnTarjeta.isSelected()){
			
			System.out.println("asdadadsdadasdasd");
				//txttarjeta.setEnabled(true);
			}
		
		
		
	}
	
	public void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) table.getModel();
        int a = table.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
        //cargaTicket();
    }
	
	void listarmesa(){
		gestionmenu gm=new gestionmenu();
		ArrayList<registramesa> lista=gm.muestramesa();
		for(registramesa mesa:lista){
			combomesas.addItem(mesa);
		}
	}
	
	void listartabla(){
		int mesa=((registramesa)combomesas.getSelectedItem()).getNumero_mesa();
		
		
		gestionmenu gm=new gestionmenu();
		ArrayList<registramesa>lista=gm.muestramesapornumero(mesa);
		for(registramesa r:lista){
			Object fila[]={
					r.getCodigo_producto(),
					r.getNum_producto(),
					r.getPrecio_producto()
						
			};
			modelo.addRow(fila);
			txtsuma.setText(Integer.toString(suma()));
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
		
		tarjeta t=new tarjeta();
		//t.setNumero_tarjeta(txttarjeta.getText().toString());
		t.setTotal_venta(Integer.parseInt(txtsuma.getText().toString()));
		gestionmenu m=new gestionmenu();
		m.registrartarjeta(t);
		
		
		
	}
}
