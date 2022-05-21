package GUIs;
		
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import clases.Platos;
import mantenimiento.gestionusuario;
import model.mostrarproducto;

import javax.swing.JScrollPane;
		
public class frmMenu extends JInternalFrame {
	public static JTextArea textAmenu;
		
	/**	
	 * Launch the application.
	 */	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu();
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
	
	public frmMenu() {
		
		setAutoscrolls(true);
		setClosable(true);
		setBounds(100, 100, 440, 614);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 424, 584);
		getContentPane().add(scrollPane);
		
		textAmenu = new JTextArea();
		scrollPane.setViewportView(textAmenu);
		textAmenu.setWrapStyleWord(true);
		textAmenu.setEditable(false);
		
		textAmenu.append("\t"+frmRealMenu.NombreRestaurant+"\n\n");
		
		textAmenu.append("\nPLATOS A LA CARTA\n");
		textAmenu.append("----------------------------------------------------------------------------------------------\n");
		
		gestionusuario gu=new gestionusuario();
		ArrayList<mostrarproducto> lista=gu.listado();
		if(lista==null){
			textAmenu.setText("Lista vacia");
		}else{
			/*textAmenu.append("\nPLATOS A LA CARTA\n");*/
			textAmenu.append("Codigo\tPrecio\tNombre\n");
			for(mostrarproducto m:lista){
		
				if(m.getCodigo()>100 && m.getCodigo()<200){
					textAmenu.append(m.getCodigo()+"\t"+m.getPrecio()+"\t"+m.getNombre()+"\n");
				}
				
				
				/*if(m.getCodigo()>100 && m.getCodigo()<200){
					textAmenu.append(m.getCodigo()+"\t"+m.getPrecio()+"\t"+m.getNombre()+"\n");
				}*/
			}
			
			textAmenu.append("\nPIQUEOS\n");
			textAmenu.append("----------------------------------------------------------------------------------------------\n");
            for(mostrarproducto m:lista){
				
				if(m.getCodigo()>200 && m.getCodigo()<300){
					textAmenu.append(m.getCodigo()+"\t"+m.getPrecio()+"\t"+m.getNombre()+"\n");
				}
			}
            
            textAmenu.append("\nBEBIDAS\n");
    		textAmenu.append("----------------------------------------------------------------------------------------------\n");
            for(mostrarproducto m:lista){
				
				if(m.getCodigo()>300 && m.getCodigo()<400){
					textAmenu.append(m.getCodigo()+"\t"+m.getPrecio()+"\t"+m.getNombre()+"\n");
				}
			}
		}

		/*int npl=100;
		for(int i=0;i<frmRealMenu.Pl.size();i++){
			npl++;
			frmRealMenu.Pl.get(i).setCodigo(npl);
			ImprimirArrayList(frmRealMenu.Pl.get(i),textAmenu);
			
		}*/
		
		
		/*int npi=200;
		for(int i=0;i<frmRealMenu.Piq.size();i++){
			npi++;
			frmRealMenu.Piq.get(i).setCodigo(npi);
			ImprimirArrayList(frmRealMenu.Piq.get(i),textAmenu);
			
		}*/
		
	
		/*int nb=300;
		for(int i=0;i<frmRealMenu.Beb.size();i++){
			nb++;
			frmRealMenu.Beb.get(i).setCodigo(nb);
			ImprimirArrayList(frmRealMenu.Beb.get(i),textAmenu);
			
		}*/
	
	}	
					
	/*public static void ImprimirArrayList(Platos P,JTextArea ta){
		
		ta.append(P.getCodigo()+". "+P.getNombre()+"\t\t\t"+P.getPrecio()+"\n  "+P.getContenido()+"\n");
		
	}*/	

}		