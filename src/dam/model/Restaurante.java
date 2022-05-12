package dam.model;

public class Restaurante {
	
	private String nombre;
	private String region;
	private String ciudad;
	private int distincion;
	private String direccion;
	private double precioMin;
	private double precioMax;
	private String cocina;
	private String telefono;
	private String web;
	
	public Restaurante(String nombre, String region, String ciudad, int distincion, String direccion, double precioMin,
			double precioMax, String cocina, String telefono, String web) {
		this.nombre = nombre;
		this.region = region;
		this.ciudad = ciudad;
		this.distincion = distincion;
		this.direccion = direccion;
		this.precioMin = precioMin;
		this.precioMax = precioMax;
		this.cocina = cocina;
		this.telefono = telefono;
		this.web = web;
	}

	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", region=" + region + ", ciudad=" + ciudad + ", distincion="
				+ distincion + ", direccion=" + direccion + ", precioMin=" + precioMin + ", precioMax=" + precioMax
				+ ", cocina=" + cocina + ", telefono=" + telefono + ", web=" + web + "]";
	}
	
	

}
