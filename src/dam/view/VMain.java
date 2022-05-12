package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VMain extends JFrame {
	private static final long serialVersionUID = -3316608643557707196L;
	
	public static final int ANCHO = 800;
	public static final int ALTO = 800;
	
	
	public VMain() {
		setTitle("GUIA MICHELIN");
		getContentPane().setLayout(null);
		setSize(ANCHO, ALTO);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Mantenimiento Restaurantes");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Consulta de Restaurantes");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Registro de Restaurantes");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Modificacion de Restaurantes");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		menuBar.add(mntmNewMenuItem);
		
		centrarVentana();
	}
	private void centrarVentana() {
		
		// asignamos tama�o a la ventana 
		setPreferredSize(new Dimension(ANCHO, ALTO));  
		// Se obtienen las dimensiones en pixels de la pantalla.       
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               
		// Se obtienen las dimensiones en pixels de la ventana.       
		Dimension ventana = this.getPreferredSize();               
		// Una cuenta para situar la ventana en el centro de la pantalla.       
		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
