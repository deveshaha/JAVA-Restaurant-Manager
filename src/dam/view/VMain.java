package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JScrollPane;

import dam.control.RestaurantControl;

import java.awt.BorderLayout;

public class VMain extends JFrame {
	private static final long serialVersionUID = -3316608643557707196L;
	
	public static final int ANCHO = 1000;
	public static final int ALTO = 850;
	
	public static final String MNTM_CONSULTA = "Consulta de restaurantes";
	public static final String MNTM_REGISTRO = "Registro de restaurantes";
	public static final String MNTM_MODIFCACION = "Modificacion de Restaurantes";
	public static final String MN_MANTENIMIENTO = "Mantenimiento de Restaurantes";
	public static final String MN_SALIR = "Salir";
	
	private JMenuItem mntmConsulta;
	private JMenuItem mntmRegistro;
	private JScrollPane scrpContenedor;
	private JMenuItem mntmModificacion;
	private JMenu mnMantenimiento;
	private JMenuItem mntmSalir;
	
	
	public VMain() {
		
		setTitle("GUIA MICHELIN");
		setSize(ANCHO, ALTO);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnMantenimiento = new JMenu(MN_MANTENIMIENTO);
		menuBar.add(mnMantenimiento);
		
		mntmConsulta = new JMenuItem(MNTM_CONSULTA);
		mnMantenimiento.add(mntmConsulta);
		
		mntmRegistro = new JMenuItem(MNTM_REGISTRO);
		mnMantenimiento.add(mntmRegistro);
		
		mntmModificacion = new JMenuItem(MNTM_MODIFCACION);
		mnMantenimiento.add(mntmModificacion);
		
		mntmSalir = new JMenuItem(MN_SALIR);
		menuBar.add(mntmSalir);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);
		
		
		
//		Container frame = new Container();
//		frame.add(new JLabel(new ImageIcon("/Actividad UF10_2(Guia Michellin)/img/logo.png")));
		
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
	
	public void cargarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
		
	}
	
	public void setControlador(RestaurantControl c) {
		mntmConsulta.addActionListener(c);
		mntmModificacion.addActionListener(c);
		mntmRegistro.addActionListener(c);
		mntmSalir.addActionListener(c);

		mnMantenimiento.addActionListener(c);
	}
}
