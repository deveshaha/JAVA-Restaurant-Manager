package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import dam.control.RestaurantControl;
import dam.model.Restaurante;
import dam.persistencia.RestauranteContract;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class PORegistroRest extends JPanel {

	private static final long serialVersionUID = 8533829144766932461L;
	
	private static final int RESTA_ANCHO = VMain.ANCHO -15;
	private static final int RESTA_ALTO = VMain.ALTO -15;
	private JTextField txtNombre;
	private JTextField txtCocina;
	private JTextField txtCiudad;
	private JTextField txtDireccion;
	private JComboBox<String> cmbxRegiones;
	private JSpinner spnDistincion;
	private JTextField txtPrecioMinimo;
	private JTextField txtPrecioMax;
	private JTextField txtTelefono;
	private JTextField txtWeb;
	private JButton btnGuardar;
	private JButton btnLimpiar;
	
	public static final String BTN_GUARDAR = "Guardar Datos";
	public static final String BTN_LIMPIAR = "Limpiar Datos";
	
	
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
		txtNombre.setBounds(229, 142, 225, 20);
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
		
		cmbxRegiones = new JComboBox<String>();
		cmbxRegiones.setModel(new DefaultComboBoxModel<String>(RestauranteContract.REGIONES));
		cmbxRegiones.setBounds(229, 219, 179, 22);
		add(cmbxRegiones);
		
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
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(229, 304, 453, 20);
		add(txtDireccion);
		
		JLabel lblDistincion = new JLabel("Distincion:");
		lblDistincion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDistincion.setBounds(96, 376, 99, 21);
		add(lblDistincion);
		
		spnDistincion = new JSpinner();
		spnDistincion.setModel(new SpinnerNumberModel(1, 1, 3, 1));
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
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setBounds(372, 539, 119, 35);
		add(btnGuardar);
		
		btnLimpiar = new JButton(BTN_LIMPIAR);
		btnLimpiar.setBounds(533, 539, 119, 35);
		add(btnLimpiar);
	}
	
	public Restaurante registrarRestaurante() {
		Restaurante restaurante = null;
		
		String telefono = "";
		
		String nombre = txtNombre.getText();
		if (nombre.isBlank()) {
			mostrarError("Debe introducir un nombre");
		} else {
			String cocina = txtCocina.getText();
			if (cocina.isBlank()) {
				mostrarError("Debe introducir un tipo de cocina");
			} else {
				String region = (String) cmbxRegiones.getSelectedItem();
				String ciudad = txtCiudad.getText();
				if (ciudad.isBlank()) {
					mostrarError("Debe introducir una ciudad");
				} else {
					String direccion = txtDireccion.getText();
					if (direccion.isBlank()) {
						mostrarError("Debe introducir una direccion");
					} else {
						int distincion = (int) spnDistincion.getValue();
						Double precioMin = getPrecio();
						Double precioMax = getPrecio();

						telefono = getTelefono();
						
						String web = txtWeb.getText();
						
						if (web.isBlank()) {
							mostrarError("Debe introducir una pagina web");
						} else {
							restaurante = new Restaurante(nombre, region, ciudad, distincion, direccion, precioMin, precioMax, cocina, telefono, web);
						}
					}
				}
			}
		}
		
		
		
		return restaurante;
	}
	private String getTelefono() {
		String telefono;
		telefono = txtTelefono.getText();
		
		if (telefono.isBlank()) {
			mostrarError("Debe introducir un teelfono");
		} else if (!telefono.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {
			mostrarError("El numero de telefono no es correcto");
		}
		return telefono;
	}
	
	private Double getPrecio() {
		
		
		
		
		return 0.0;
	}
	
	public void setControlador(RestaurantControl c) {
		btnGuardar.addActionListener(c);
		btnLimpiar.addActionListener(c);
	}
	
	public void limpiarDatos() {
		txtNombre.setText("");
		txtCiudad.setText("");
		txtCocina.setText("");
		txtDireccion.setText("");
		spnDistincion.setValue("1");
		txtPrecioMax.setText("");
		txtPrecioMinimo.setText("");
		txtTelefono.setText("");
		cmbxRegiones.setSelectedItem(0);
		txtWeb.setText("");
		
	}
	
	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(this , mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
