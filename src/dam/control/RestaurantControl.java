package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.view.POConsultaRest;
import dam.view.POModificarRest;
import dam.view.PORegistroRest;
import dam.view.VMain;

public class RestaurantControl implements ActionListener {
	
	private VMain vMain;
	private POConsultaRest poConsultaRest;
	private PORegistroRest poRegistroRest;
	private POModificarRest pomodificarRest;
	
	public RestaurantControl(VMain vMain, POConsultaRest poConsultaRest, PORegistroRest poRegistroRest,
			POModificarRest pomodificarRest) {
		this.vMain = vMain;
		this.poConsultaRest = poConsultaRest;
		this.poRegistroRest = poRegistroRest;
		this.pomodificarRest = pomodificarRest;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VMain.MNTM_CONSULTA)) {
				vMain.cargarPanel(poConsultaRest);
				
			} else if (e.getActionCommand().equals(VMain.MNTM_REGISTRO)) {
				vMain.cargarPanel(poRegistroRest);
			} else if (e.getActionCommand().equals(VMain.MN_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(vMain, "Se va a cerrar la aplicacion ¿Desea Continuar?", "Confirmar Salida", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			}
		}
		
	}

}
