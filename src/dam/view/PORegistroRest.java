package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class PORegistroRest extends JPanel {

	private static final long serialVersionUID = 8533829144766932461L;
	
	private static final int RESTA_ANCHO = VMain.ANCHO -15;
	private static final int RESTA_ALTO = VMain.ALTO -15;
	private JTextField txtNombre;
	private JTextField txtCocina;
	private JTextField txtCiudad;
	private JTextField textField;
	private JComboBox comboBox;
	private JSpinner spnDistincion;
	private JTextField txtPrecioMinimo;
	private JTextField txtPrecioMax;
	private JTextField txtTelefono;
	private JTextField txtWeb;
	
	
	public PORegistroRest() {
		initComponents();
		
	}
	private void initComponents() {
		setLayout(null);
		setSize(RESTA_ANCHO, RESTA_ALTO);
		setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro de Restaurantes");
		lblRegistro.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblRegistro.setBounds(57, 45, 281, 52);
		add(lblRegistro);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(96, 142, 99, 14);
		add(lblNombre);
		
		JLabel lblCocina = new JLabel("Cocina:");
		lblCocina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCocina.setBounds(539, 142, 72, 14);
		add(lblCocina);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(264, 139, 179, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCocina = new JTextField();
		txtCocina.setColumns(10);
		txtCocina.setBounds(707, 139, 179, 20);
		add(txtCocina);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n:");
		lblRegion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegion.setBounds(96, 220, 99, 21);
		add(lblRegion);
		
		comboBox = new JComboBox();
		comboBox.setBounds(229, 219, 179, 22);
		add(comboBox);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCiudad.setBounds(539, 226, 99, 21);
		add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(707, 223, 179, 20);
		add(txtCiudad);
		
		JLabel lblDIreccion = new JLabel("Direccion: ");
		lblDIreccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDIreccion.setBounds(96, 304, 99, 21);
		add(lblDIreccion);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(229, 304, 453, 20);
		add(textField);
		
		JLabel lblDistincion = new JLabel("Distincion:");
		lblDistincion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDistincion.setBounds(96, 376, 99, 21);
		add(lblDistincion);
		
		spnDistincion = new JSpinner();
		spnDistincion.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spnDistincion.setBounds(229, 379, 72, 20);
		add(spnDistincion);
		
		JLabel lblPrecioMinimo = new JLabel("Precio Minimo:");
		lblPrecioMinimo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMinimo.setBounds(436, 376, 136, 21);
		add(lblPrecioMinimo);
		
		txtPrecioMinimo = new JTextField();
		txtPrecioMinimo.setBounds(582, 379, 86, 20);
		add(txtPrecioMinimo);
		txtPrecioMinimo.setColumns(10);
		
		JLabel lblPrecioMax = new JLabel("Precio M\u00E1ximo: ");
		lblPrecioMax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMax.setBounds(707, 376, 136, 21);
		add(lblPrecioMax);
		
		txtPrecioMax = new JTextField();
		txtPrecioMax.setColumns(10);
		txtPrecioMax.setBounds(853, 379, 86, 20);
		add(txtPrecioMax);
		
		JLabel lblTelefono = new JLabel("Telefono: ");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefono.setBounds(96, 439, 99, 21);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(229, 439, 179, 20);
		add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWeb.setBounds(472, 439, 99, 21);
		add(lblWeb);
		
		txtWeb = new JTextField();
		txtWeb.setColumns(10);
		txtWeb.setBounds(582, 439, 357, 20);
		add(txtWeb);
		
		JButton btnGuardar = new JButton("Guardar Datos");
		btnGuardar.setBounds(372, 539, 119, 35);
		add(btnGuardar);
		
		JButton btnLimpiar = new JButton("Limpiar Datos");
		btnLimpiar.setBounds(533, 539, 119, 35);
		add(btnLimpiar);
	}
}
