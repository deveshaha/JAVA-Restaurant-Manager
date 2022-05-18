package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class POModificarRest extends JPanel{
	
	private static final int RESTA_ANCHO = VMain.ANCHO -15;
	private static final int RESTA_ALTO = VMain.ALTO -15;
	
	private static final long serialVersionUID = 1564663877344888523L;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JComboBox cmbxRegion;
	private JTextField txtDireccion;
	private JTextField txtPrecioMin;
	private JTextField txtPrecioMax;
	private JTextField txtTelefono;
	private JTextField textField;
	
	public POModificarRest() {
		initComponents();
		
	}

	private void initComponents() {
		setLayout(null);
		setSize(RESTA_ANCHO, RESTA_ALTO);
		setLayout(null);
		
		JLabel lblModificar = new JLabel("Modificar Restaurante");
		lblModificar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblModificar.setBounds(46, 67, 223, 53);
		add(lblModificar);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(106, 162, 73, 29);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(200, 169, 232, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n:");
		lblRegion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegion.setBounds(106, 228, 73, 29);
		add(lblRegion);
		
		cmbxRegion = new JComboBox();
		cmbxRegion.setBounds(200, 234, 232, 22);
		add(cmbxRegion);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCiudad.setBounds(471, 228, 73, 29);
		add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(554, 235, 232, 20);
		add(txtCiudad);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDireccion.setBounds(106, 290, 91, 29);
		add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(200, 297, 289, 20);
		add(txtDireccion);
		
		JLabel lblCocina = new JLabel("Cocina:");
		lblCocina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCocina.setBounds(517, 290, 91, 29);
		add(lblCocina);
		
		JComboBox cmbxCocina = new JComboBox();
		cmbxCocina.setBounds(588, 296, 198, 22);
		add(cmbxCocina);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(647, 160, 139, 39);
		add(btnBuscar);
		
		JLabel lblDistincion = new JLabel("Distincion:");
		lblDistincion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDistincion.setBounds(106, 356, 91, 29);
		add(lblDistincion);
		
		JSpinner spnDistincion = new JSpinner();
		spnDistincion.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spnDistincion.setBounds(200, 363, 60, 20);
		add(spnDistincion);
		
		JLabel lblPrecioMinimo = new JLabel("Precio Minimo:");
		lblPrecioMinimo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMinimo.setBounds(345, 356, 126, 29);
		add(lblPrecioMinimo);
		
		txtPrecioMin = new JTextField();
		txtPrecioMin.setBounds(471, 363, 86, 20);
		add(txtPrecioMin);
		txtPrecioMin.setColumns(10);
		
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMaximo.setBounds(575, 356, 126, 29);
		add(lblPrecioMaximo);
		
		txtPrecioMax = new JTextField();
		txtPrecioMax.setColumns(10);
		txtPrecioMax.setBounds(700, 363, 86, 20);
		add(txtPrecioMax);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefono.setBounds(106, 420, 91, 29);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(200, 427, 232, 20);
		add(txtTelefono);
		
		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWeb.setBounds(453, 420, 51, 29);
		add(lblWeb);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(504, 427, 282, 20);
		add(textField);
		
		JButton btnGuardarDatos = new JButton("Guardar Datos");
		btnGuardarDatos.setBounds(279, 549, 139, 39);
		add(btnGuardarDatos);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(504, 549, 139, 39);
		add(btnCancelar);
	}
}
