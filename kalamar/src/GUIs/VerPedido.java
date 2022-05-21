package GUIs;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;

import clases.Platos;

public class VerPedido extends JInternalFrame {
	public static JTextArea txtPedido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerPedido frame = new VerPedido();
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
	public VerPedido() {
		
		
		setClosable(true);
		setBounds(100, 100, 437, 427);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		txtPedido = new JTextArea();
		txtPedido.setEditable(false);
		scrollPane.setViewportView(txtPedido);
		

	}
	public void Imprimir(Platos P,int i){
		txtPedido.append(i+". "+P.getNombre()+"\t\t\t"+P.getPrecio()+"\n  "+P.getContenido()+"\n");

	}
	
	
}
