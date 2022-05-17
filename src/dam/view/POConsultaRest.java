package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class POConsultaRest extends JPanel {
	private static final long serialVersionUID = -5098459323820994656L;
	
	private static final int RESTA_ANCHO = VMain.ANCHO -15;
	private static final int RESTA_ALTO = VMain.ALTO -15;
	
	public static final String BTN_CONSULTAR = "CONSULTAR";
	
	private JButton btnConsultar;
	private JComboBox cmbxRegion;
	private JComboBox cmbxDistincion;
	
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
		
		cmbxRegion = new JComboBox();
		cmbxRegion.setBounds(259, 149, 174, 21);
		add(cmbxRegion);
		
		JLabel lblDistincion = new JLabel("Distinci\u00F3n:");
		lblDistincion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDistincion.setBounds(535, 150, 72, 22);
		add(lblDistincion);
		
		cmbxDistincion = new JComboBox();
		cmbxDistincion.setBounds(617, 150, 174, 22);
		add(cmbxDistincion);
		
		btnConsultar = new JButton(BTN_CONSULTAR);
		btnConsultar.setBounds(428, 215, 128, 47);
		add(btnConsultar);
		
	}
}
