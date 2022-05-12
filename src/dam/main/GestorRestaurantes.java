package dam.main;

import java.awt.EventQueue;

import dam.control.RestaurantControl;
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
				
				RestaurantControl rescon = new RestaurantControl(vMain, poConsulta, pORegistro, poModificar);
				
				vMain.setControlador(rescon);
				
				vMain.hacerVisible();
				
				
			}
		});
	}

}
