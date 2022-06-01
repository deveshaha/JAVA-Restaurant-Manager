package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import dam.control.RestaurantControl;
import dam.model.Restaurante;
import dam.persistencia.RestauranteContract;

public class POModificarRest extends JPanel{
	
	private static final int RESTA_ANCHO = VMain.ANCHO -15;
	private static final int RESTA_ALTO = VMain.ALTO -15;
	
	private static final long serialVersionUID = 1564663877344888523L;
	public JTextField txtNombre;
	private JTextField txtCiudad;
	private JTextField txtDireccion;
	private JTextField txtPrecioMin;
	private JTextField txtPrecioMax;
	private JTextField txtTelefono;
	
	private JComboBox<String> cmbxRegiones;
	private JComboBox<String> cmbxCocina;
	
	public static final String BTN_GUARDAR_DATOS = "Guardar Datos";
	public static final String BTN_CANCELAR = "Cancelar";
	public static final String BTN_BUSCAR = "Buscar";
	private JButton btnBuscar;
	private JButton btnGuardarDatos;
	private JButton btnCancelar;
	private JSpinner spnDistincion;
	private JTextField txtWeb;
	
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
		
		cmbxRegiones = new JComboBox<String>();
		cmbxRegiones.setEnabled(false);
		cmbxRegiones.setModel(new DefaultComboBoxModel<String>(RestauranteContract.REGIONES));
		cmbxRegiones.setBounds(200, 234, 179, 22);
		add(cmbxRegiones);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCiudad.setBounds(471, 228, 73, 29);
		add(lblCiudad);
		
		txtCiudad = new JTextField();
		txtCiudad.setEnabled(false);
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(554, 235, 232, 20);
		add(txtCiudad);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDireccion.setBounds(106, 290, 91, 29);
		add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setEnabled(false);
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(200, 297, 289, 20);
		add(txtDireccion);
		
		JLabel lblCocina = new JLabel("Cocina:");
		lblCocina.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCocina.setBounds(517, 290, 91, 29);
		add(lblCocina);
		
		cmbxCocina = new JComboBox<String>(new DefaultComboBoxModel<String>(RestauranteContract.COCINA));
		cmbxCocina.setEnabled(false);
		cmbxCocina.setBounds(592, 296, 210, 22);
		add(cmbxCocina);
		
		btnBuscar = new JButton(BTN_BUSCAR);
		btnBuscar.setBounds(647, 160, 139, 39);
		add(btnBuscar);
		
		JLabel lblDistincion = new JLabel("Distincion:");
		lblDistincion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDistincion.setBounds(106, 356, 91, 29);
		add(lblDistincion);
		
		spnDistincion = new JSpinner();
		spnDistincion.setEnabled(false);
		spnDistincion.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spnDistincion.setBounds(200, 363, 60, 20);
		add(spnDistincion);
		
		JLabel lblPrecioMinimo = new JLabel("Precio Minimo:");
		lblPrecioMinimo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMinimo.setBounds(345, 356, 126, 29);
		add(lblPrecioMinimo);
		
		txtPrecioMin = new JTextField();
		txtPrecioMin.setEnabled(false);
		txtPrecioMin.setBounds(471, 363, 86, 20);
		add(txtPrecioMin);
		txtPrecioMin.setColumns(10);
		
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrecioMaximo.setBounds(575, 356, 126, 29);
		add(lblPrecioMaximo);
		
		txtPrecioMax = new JTextField();
		txtPrecioMax.setEnabled(false);
		txtPrecioMax.setColumns(10);
		txtPrecioMax.setBounds(700, 363, 86, 20);
		add(txtPrecioMax);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefono.setBounds(106, 420, 91, 29);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setEnabled(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(200, 427, 232, 20);
		add(txtTelefono);
		
		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWeb.setBounds(453, 420, 51, 29);
		add(lblWeb);
		
		txtWeb = new JTextField();
		txtWeb.setEnabled(false);
		txtWeb.setColumns(10);
		txtWeb.setBounds(504, 427, 282, 20);
		add(txtWeb);
		
		btnGuardarDatos = new JButton(BTN_GUARDAR_DATOS);
		btnGuardarDatos.setEnabled(false);
		btnGuardarDatos.setBounds(279, 549, 139, 39);
		add(btnGuardarDatos);
		
		btnCancelar = new JButton(BTN_CANCELAR);
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(504, 549, 139, 39);
		add(btnCancelar);
	}

	public void setControlador(RestaurantControl c) {
		btnBuscar.addActionListener(c);
		btnCancelar.addActionListener(c);
		btnGuardarDatos.addActionListener(c);
		
	}

	public void mostrarDatosRest(Restaurante rest) {
		txtNombre.setText(rest.getNombre());
		cmbxRegiones.setSelectedItem(rest.getRegion());
		txtCiudad.setText(rest.getCiudad());
		txtDireccion.setText(rest.getDireccion());
		cmbxCocina.setSelectedItem(rest.getCocina());
		spnDistincion.setValue(rest.getDistincion());
		txtTelefono.setText(rest.getTelefono());
		txtWeb.setText(rest.getWeb());
		
		String precioMax = String.valueOf(rest.getPrecioMax());
		String precioMin = String.valueOf(rest.getPrecioMin());
		
		txtPrecioMin.setText(precioMin);
		txtPrecioMax.setText(precioMax);
		
	}

	public void habilitarComponentes(boolean b) {
		cmbxRegiones.setEnabled(b);
		txtCiudad.setEnabled(b);
		txtDireccion.setEnabled(b);
		cmbxCocina.setEnabled(b);
		spnDistincion.setEnabled(b);
		txtPrecioMin.setEnabled(b);
		txtPrecioMax.setEnabled(b);
		txtTelefono.setEnabled(b);
		txtWeb.setEnabled(b);
		
		btnGuardarDatos.setEnabled(b);
		btnCancelar.setEnabled(b);
		
	}

	public void limpiarDatos() {
		txtNombre.setText("");
		txtCiudad.setText("");
		cmbxCocina.setSelectedIndex(0);
		txtDireccion.setText("");
		spnDistincion.setValue(1);
		txtPrecioMax.setText("");
		txtPrecioMin.setText("");
		txtTelefono.setText("");
		cmbxRegiones.setSelectedItem(0);
		txtWeb.setText("");
		
	}

	public Restaurante modificarRestaurante() {
		Restaurante restaurante = null;
		
		String telefono = "";
		
		String nombre = txtNombre.getText();

		String cocina = (String) cmbxCocina.getSelectedItem();
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
				double precioMin;
				
				precioMin = getPrecio();
				
				double precioMax = getPrecio();

				telefono = getTelefono();
				
				String web = txtWeb.getText();
				
				if (web.isBlank()) {
					mostrarError("Debe introducir una pagina web");
				} else {
					restaurante = new Restaurante(nombre, region, ciudad, distincion, direccion, precioMin, precioMax, cocina, telefono, web);
				}
			}
		}
		return restaurante;
	}
	
	private double getPrecio() {
		String precioMin;
		precioMin = txtPrecioMin.getText();
		
		if (precioMin.isBlank()) {
			mostrarError("El campo Precio no puede estar vacio");
		} else if (!precioMin.matches(".*[0-9].*")) {
			mostrarError("El precio debe de ser en numeros decimales");
		}
		return Double.parseDouble(precioMin);
	}
	
	private String getTelefono() {
		String telefono;
		telefono = txtTelefono.getText();
		
		if (telefono.isBlank()) {
			mostrarError("Debe introducir un telfono");
		} else if (!telefono.matches("(\\+34|0034|34)?[ -]*(6|7)[ -]*([0-9][ -]*){8}")) {
			mostrarError("El numero de telefono no es correcto");
		}
		return telefono;
	}

	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(this , mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Informacion", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
