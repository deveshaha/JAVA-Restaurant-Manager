package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dam.control.RestaurantControl;
import dam.model.Restaurante;
import dam.persistencia.RestauranteContract;

public class POConsultaRest extends JPanel {
	private static final long serialVersionUID = -5098459323820994656L;
	
	private static final int RESTA_ANCHO = VMain.ANCHO -15;
	private static final int RESTA_ALTO = VMain.ALTO -15;
	
	public static final String BTN_CONSULTAR = "CONSULTAR";
	public static final String BTN_ELIMINAR = "ELIMINAR";
	public static final String REGION = "TODAS";
	
	
	private JButton btnConsultar;
	private JComboBox<String> cmbxRegion;
	private DefaultComboBoxModel<String> cmbxModelR;
	private JComboBox<String> cmbxDistincion;
	private JTable tablaRest;
	private DefaultTableModel dtm;
	private JScrollPane scrpTabla;
	private JButton btnEliminar;
	
	public POConsultaRest() {
		setSize(RESTA_ANCHO, RESTA_ALTO);
		setLayout(null);
		JLabel lblConsulta = new JLabel("Consulta de Restaurantes");
		lblConsulta.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblConsulta.setBounds(55, 48, 314, 34);
		add(lblConsulta);
		
		JLabel lblFiltro = new JLabel("Filtro");
		lblFiltro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFiltro.setBounds(55, 114, 46, 14);
		add(lblFiltro);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n:");
		lblRegion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegion.setBounds(179, 149, 55, 21);
		add(lblRegion);
		
		cmbxRegion = new JComboBox<String>();
		cmbxModelR = new DefaultComboBoxModel<String>(RestauranteContract.REGIONES);
		cmbxRegion.setBounds(259, 149, 174, 21);
		cmbxRegion.setModel(cmbxModelR);
		add(cmbxRegion);
		
		JLabel lblDistincion = new JLabel("Distinci\u00F3n:");
		lblDistincion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDistincion.setBounds(535, 150, 72, 22);
		add(lblDistincion);
		
		cmbxDistincion = new JComboBox<String>();
		cmbxDistincion.setModel(new DefaultComboBoxModel<String>(RestauranteContract.DISTINCION));
		cmbxDistincion.setBounds(617, 150, 174, 22);
		add(cmbxDistincion);
		
		btnConsultar = new JButton(BTN_CONSULTAR);
		btnConsultar.setBounds(428, 203, 128, 47);
		add(btnConsultar);
		
		scrpTabla = new JScrollPane();
		scrpTabla.setBounds(70, 273, 845, 437);
		add(scrpTabla);
		
		tablaRest = new JTable();
		scrpTabla.setViewportView(tablaRest);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBounds(768, 727, 128, 47);
		add(btnEliminar);
		
		configurarTabla();
		
	}
	
	private void configurarTabla() {
		dtm = new DefaultTableModel() {
			private static final long serialVersionUID = 2449874173807205989L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tablaRest.setModel(dtm);
		
		dtm.addColumn("Nombre");
		dtm.addColumn("Ciudad");
		dtm.addColumn("Distincion");
		dtm.addColumn("Cocina");
		dtm.addColumn("Precio");
		
	}
	
	public void rellenarTabla(ArrayList<Restaurante> listaRestaurantes) {
		dtm.setRowCount(0);
		
		Object[] fila = new Object[5];
		
		for (Restaurante res : listaRestaurantes) {
			fila[0] = res.getNombre();
			fila[1] = res.getCiudad();
			fila[2] = estrellas(res);
			fila[3] = res.getCocina();
			fila[4] = precio(res);
			
			dtm.addRow(fila);
			
		}
		
	}
	
	private Object estrellas(Restaurante res) {
		int distincion = res.getDistincion();
		String estrellas = null;
		
		if (distincion == 1) {
			estrellas = "*";
		} else if (distincion == 2) {
			estrellas = "**";
		} else if (distincion == 3) {
			estrellas = "***";
		}
		
		
		return estrellas;
	}

	private Object precio(Restaurante res) {
		Double precioMax = res.getPrecioMax();
		Double precioMin = res.getPrecioMin();
		
		String precio = String.valueOf(precioMax) + " - " + String.valueOf(precioMin);
		return precio;
	}

	public void mostrarTabla(boolean b) {
		scrpTabla.setVisible(b);
	}
	
	
	public void rellenarCmbx(ArrayList<String> listaRegiones){
		cmbxModelR.removeAllElements();
		cmbxModelR.addElement(REGION);
		cmbxModelR.addAll(listaRegiones);
	
		
	}
	
	public void setControlador(RestaurantControl c) {
		btnConsultar.addActionListener(c);
		btnEliminar.addActionListener(c);
	}
}
