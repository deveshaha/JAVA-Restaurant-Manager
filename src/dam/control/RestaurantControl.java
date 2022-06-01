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
				poConsultaRest.mostrarTabla(false);
				
			} else if (e.getActionCommand().equals(VMain.MNTM_REGISTRO)) {
				vMain.cargarPanel(poRegistroRest);
				
			} else if (e.getActionCommand().equals(VMain.MNTM_MODIFCACION)) {
				vMain.cargarPanel(pomodificarRest);
				
			} else if (e.getActionCommand().equals(VMain.MN_SALIR)) {
				salirApp();
				
			}
			
		} else if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(POConsultaRest.BTN_CONSULTAR)) {
				listaRestaurantes = persistencia.consultarTabla();
				poConsultaRest.rellenarTabla(listaRestaurantes);
				poConsultaRest.mostrarTabla(true);
				
				mostrarRestaurante();
				
			} else if (e.getActionCommand().equals(PORegistroRest.BTN_GUARDAR)) {
				realizarRegistro();
				
			} else if (e.getActionCommand().equals(PORegistroRest.BTN_LIMPIAR)) {
				poRegistroRest.limpiarDatos();
				
			} else if (e.getActionCommand().equals(POConsultaRest.BTN_ELIMINAR)) {
				
				borrarRestaurante();
				
			} else if (e.getActionCommand().equals(POModificarRest.BTN_BUSCAR)) {
				buscarRestaurante();
				
			} else if (e.getActionCommand().equals(POModificarRest.BTN_GUARDAR_DATOS)) {
				modificarRestaurante();
				
			} else if (e.getActionCommand().equals(POModificarRest.BTN_CANCELAR)) {
				pomodificarRest.limpiarDatos();
				pomodificarRest.habilitarComponentes(false);
				pomodificarRest.txtNombre.setEnabled(true);
			}
		}
		
	}

	private void borrarRestaurante() {
		Restaurante restaurante = poConsultaRest.seleccionarRest();
		
		if (restaurante != null) {
			
			int resp = JOptionPane.showConfirmDialog(vMain, "Se va a borrar el restaurante seleccionado ¿Desea Continuar?", "Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if (resp == JOptionPane.YES_OPTION) {
				
				int resultado = persistencia.borrarRestaurante(restaurante.getNombre());
				listaRestaurantes = persistencia.consultarTabla();
				poConsultaRest.rellenarTabla(listaRestaurantes);
				
				if (resultado > 0) {
					pomodificarRest.mostrarInformacion("Restaurante Borrado con exito");
				} else {
					pomodificarRest.mostrarError("Error al borrar el restaurante");
				}
				
			} else {
				listaRestaurantes = persistencia.consultarTabla();
			}
			
		} else {
			pomodificarRest.mostrarError("Debes seleccionar un restaurante");
		}
	}

	private void modificarRestaurante() {
		Restaurante restaurante = pomodificarRest.modificarRestaurante();
		
		int res = persistencia.modificarRestaurante(restaurante);
		
		if (res > 0) {
			pomodificarRest.mostrarInformacion("Datos del Restaurante modificados");
			pomodificarRest.limpiarDatos();
			pomodificarRest.habilitarComponentes(false);
			pomodificarRest.txtNombre.setEnabled(true);
		} else {
			pomodificarRest.mostrarError("No se ha podido modificar el restaurante");
		}
	}

	private void buscarRestaurante() {
		String nombreRest = pomodificarRest.txtNombre.getText();
		
		
		if (nombreRest.isBlank()) {
			poRegistroRest.mostrarError("Error: Debes introdcuir el nombre del restaurante que deseas modificar");
		} else {
			Restaurante rest = persistencia.buscarRest(nombreRest);
			
			if (rest != null) {
				pomodificarRest.mostrarDatosRest(rest);
				pomodificarRest.habilitarComponentes(true);
				pomodificarRest.txtNombre.setEnabled(false);
				
			} else {
				poRegistroRest.mostrarError("Error: El restaurante no se encuentra registrado");
			}
		}
	}

	private void salirApp() {
		int resp = JOptionPane.showConfirmDialog(vMain, "Se va a cerrar la aplicacion ¿Desea Continuar?", "Confirmar Salida", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		
		if (resp == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	private void mostrarRestaurante() {
		
		if (poConsultaRest.getCmbxRegion().getSelectedIndex() == 0 && poConsultaRest.getCmbxDist().getSelectedIndex() == 0) {
			listaRestaurantes = persistencia.consultarTabla();
		} else if (poConsultaRest.getCmbxRegion().getSelectedIndex() == 0) {
			listaRestaurantes = persistencia.filtrarTabla(poConsultaRest.getCmbxDist().getSelectedIndex(), (String) poConsultaRest.getCmbxRegion().getSelectedItem());
		} else if (poConsultaRest.getCmbxDist().getSelectedIndex() == 0) {
			listaRestaurantes = persistencia.filtrarTabla(poConsultaRest.getCmbxDist().getSelectedIndex(), (String) poConsultaRest.getCmbxRegion().getSelectedItem());
		} else {
			listaRestaurantes = persistencia.filtrarTabla(poConsultaRest.getCmbxDist().getSelectedIndex(), (String) poConsultaRest.getCmbxRegion().getSelectedItem());
		}
		
		if (listaRestaurantes.isEmpty()) {
			poConsultaRest.mostrarTabla(false);
			poRegistroRest.mostrarError("Error: no hay resultados con esos filtros");
		} else {
			poConsultaRest.rellenarTabla(listaRestaurantes);
			poConsultaRest.mostrarTabla(true);
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
