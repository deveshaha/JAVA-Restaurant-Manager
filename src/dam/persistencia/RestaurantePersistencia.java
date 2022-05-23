package dam.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dam.db.AccesoDB;
import dam.model.Restaurante;
import dam.view.POConsultaRest;
import dam.view.POModificarRest;
import dam.view.PORegistroRest;
import dam.view.VMain;

public class RestaurantePersistencia {
	
	private AccesoDB acceso;
	VMain vMain;
	POConsultaRest consultaRest;
	POModificarRest modificarRest;
	PORegistroRest registroRest;
	
	public RestaurantePersistencia() {
		acceso = new AccesoDB();
	}
	
	public ArrayList<Restaurante> consultarTabla() {
		
		ArrayList<Restaurante> listaRestaurantes  = new ArrayList<Restaurante>();
	
		String query = "SELECT * FROM " + RestauranteContract.NOMBRE_TABLA;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con = acceso.getConnection();
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
			Restaurante rest;
			
			String nombre;
			String region;
			String ciudad;
			int distincion;
			String direccion;
			double precioMin;
			double precioMax;
			String cocina;
			String telefono;
			String web;
			
			
			while(rs.next()) {
				nombre = rs.getString(2);
				region = rs.getString(3);
				ciudad = rs.getString(4);
				distincion = rs.getInt(5);
				direccion = rs.getString(6);
				precioMin = rs.getDouble(7);
				precioMax = rs.getDouble(8);
				cocina = rs.getString(9);
				telefono = rs.getString(10);
				web = rs.getString(11);
				
				rest = new Restaurante(nombre, region, ciudad, distincion, direccion, precioMin, precioMax, cocina, telefono, web);
				
				listaRestaurantes.add(rest);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
					if (stmt != null) stmt.close();
					if (con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

		}
		
		return listaRestaurantes;
	}
	
	public ArrayList<String> regionCmbx() {
		
		ArrayList<String> listaRegiones = new ArrayList<String>();
		
		String query = "SELECT DISTINCT " + RestauranteContract.COLUMN_REGION + " FROM " + RestauranteContract.NOMBRE_TABLA;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			con  = acceso.getConnection();
			con = acceso.getConnection();
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				listaRegiones.add(rs.getString(RestauranteContract.COLUMN_REGION));
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
					if (stmt != null) stmt.close();
					if (con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

		}
		
	System.out.println(listaRegiones);
	return listaRegiones;
	}

	public int registrarUsuario(Restaurante restaurante) {
		
		int resultado = 0;
		
		String query = "INSERT INTO " + RestauranteContract.NOMBRE_TABLA + " VALUES (?,?,?,?,?,?,?,?,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = acceso.getConnection();
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, restaurante.getNombre());
			pstmt.setString(2, restaurante.getRegion());
			pstmt.setString(3, restaurante.getCiudad());
			pstmt.setInt(4, restaurante.getDistincion());
			pstmt.setString(5, restaurante.getDireccion());
			pstmt.setDouble(6, restaurante.getPrecioMin());
			pstmt.setDouble(7, restaurante.getPrecioMax());
			pstmt.setString(8, restaurante.getCocina());
			pstmt.setString(9, restaurante.getTelefono());
			pstmt.setString(10, restaurante.getWeb());
			
			resultado = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		
		return resultado;
	}
	

}
