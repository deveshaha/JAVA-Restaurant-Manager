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
    
    public static final String [] REGIONES = {"Andalucía", "Aragón", "Asturias", "Islas Baleares", 
    		"Cantabria", "Castilla - La Mancha", "Castilla y León", "Cataluña", "Galicia", 
    		"Extremadura", "Madrid", "Murcia", "Navarra", "País Vasco", 
    		"La Rioja", "Comunidad Valenciana"};
    
    public static final String [] COCINA = {"Creativa", "Moderna", "Tradicional", "Regional", "Fusión"};
    
    public static final String[] DISTINCION = {"TODAS", "1", "2", "3"};

}
