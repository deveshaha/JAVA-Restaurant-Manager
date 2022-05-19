package dam.main;

import java.awt.EventQueue;

import dam.control.RestaurantControl;
import dam.persistencia.RestaurantePersistencia;
import dam.view.POConsultaRest;
import dam.view.POModificarRest;
import dam.view.PORegistroRest;
import dam.view.VMain;

public class GestorRestaurantes {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VMain vMain = new VMain();
				POConsultaRest poConsulta = new POConsultaRest();
				PORegistroRest pORegistro = new PORegistroRest();
				POModificarRest poModificar = new POModificarRest();
				RestaurantePersistencia persistencia = new RestaurantePersistencia();
				
				RestaurantControl rescon = new RestaurantControl(vMain, poConsulta, pORegistro, poModificar, persistencia);
				
				vMain.setControlador(rescon);
				poConsulta.setControlador(rescon);
				pORegistro.setControlador(rescon);
				poModificar.setControlador(rescon);
				
				vMain.hacerVisible();
				
				
			}
		});
	}

}
