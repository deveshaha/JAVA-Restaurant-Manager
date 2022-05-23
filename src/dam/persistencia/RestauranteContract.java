package dam.persistencia;

public class RestauranteContract {
	
	public static final String NOMBRE_TABLA = "RESTAURANTES";
    public static final String COLUMN_NOMBRE = "NOMBRE";
    public static final String COLUMN_REGION = "REGION";
    public static final String COLUMN_CIUDAD = "CIUDAD";
    public static final String COLUMN_DISTIN = "DISTINCION";
    public static final String COLUMN_DIREC = "DIRECCION";
    public static final String COLUMN_PREC_MIN = "PRECIO_MIN";
    public static final String COLUMN_PREC_MAX = "PRECIO_MAX";
    public static final String COLUMN_COCINA = "COCINA";
    public static final String COLUMN_TELEF = "TELEFONO";
    public static final String COLUMN_WEB = "WEB";
    
    public static final String [] REGIONES = {"Andaluc�a", "Arag�n", "Asturias", "Islas Baleares", 
    		"Cantabria", "Castilla - La Mancha", "Castilla y Le�n", "Catalu�a", "Galicia", 
    		"Extremadura", "Madrid", "Murcia", "Navarra", "Pa�s Vasco", 
    		"La Rioja", "Comunidad Valenciana"};
    
    public static final String [] COCINA = {"Creativa", "Moderna", "Tradicional", "Regional", "Fusi�n"};
    
    public static final String[] DISTINCION = {"TODAS", "1", "2", "3"};

}
