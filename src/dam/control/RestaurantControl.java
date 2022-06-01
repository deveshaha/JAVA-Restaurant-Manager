package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.model.Restaurante;
import dam.persistencia.RestaurantePersistencia;
import dam.view.POConsultaRest;
import dam.view.POModificarRest;
import dam.view.PORegistroRest;
import dam.view.VMain;

public class RestaurantControl implements ActionListener {
	
	private static ArrayList<Restaurante> listaRestaurantes;
	private VMain vMain;
	private POConsultaRest poConsultaRest;
	private PORegistroRest poRegistroRest;
	private POModificarRest pomodificarRest;
	private RestaurantePersistencia persistencia;
	
	public RestaurantControl(VMain vMain, POConsultaRest poConsultaRest, PORegistroRest poRegistroRest,
			POModificarRest pomodificarRest, RestaurantePersistencia persistencia) {
		this.vMain = vMain;
		this.poConsultaRest = poConsultaRest;
		this.poRegistroRest = poRegistroRest;
		this.pomodificarRest = pomodificarRest;
		this.persistencia = persistencia;
		listaRestaurantes = new ArrayList<Restaurante>();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VMain.MNTM_CONSULTA)) {
				poConsultaRest.rellenarCmbx(persistencia.regionCmbx());
				vMain.cargarPanel(poConsultaRest);
				
			} else if (e.getActionCommand().equals(VMain.MNTM_REGISTRO)) {
				vMain.cargarPanel(poRegistroRest);
			} else if (e.getActionCommand().equals(VMain.MNTM_MODIFCACION)) {
				
				vMain.cargarPanel(pomodificarRest);
				
			} else if (e.getActionCommand().equals(VMain.MN_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(vMain, "Se va a cerrar la aplicacion ¿Desea Continuar?", "Confirmar Salida", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			}
		} else if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(POConsultaRest.BTN_CONSULTAR)) {
				listaRestaurantes = persistencia.consultarTabla();
				poConsultaRest.rellenarTabla(listaRestaurantes);
				poConsultaRest.mostrarTabla(true);
				
			} else if (e.getActionCommand().equals(PORegistroRest.BTN_GUARDAR)) {
				realizarRegistro();
			} else if (e.getActionCommand().equals(PORegistroRest.BTN_LIMPIAR)) {
				poRegistroRest.limpiarDatos();
			} else if (e.getActionCommand().equals(POConsultaRest.BTN_ELIMINAR)) {
				
				
			}
		}
		
	}

	private void realizarRegistro() {
		Restaurante restaurante = poRegistroRest.registrarRestaurante();
		
		if (restaurante != null) {
			
			int res = persistencia.registrarRestaurante(restaurante);
			
			if (res == 1) {
				poRegistroRest.mostrarInformacion("Registro Exitoso");
				poRegistroRest.limpiarDatos();
			} else {
				poRegistroRest.mostrarError("No se ha podido registrar el restaurante");
			}
			
		}
		
	}

}
