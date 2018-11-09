
package examen1_stephaniemartinez;

import java.util.ArrayList;
import java.util.Date;


public class Acceso {
    String nombre;
    String contrasena;
    Date fecha;
    String num;
    String correo;
    String nombre_completo;
    String genero;
    ArrayList<Libro> lista = new ArrayList();

    public Acceso() {
    }

    public Acceso(String nombre, String contrasena, Date fecha, String num, String correo, String nombre_completo, String genero) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fecha = fecha;
        this.num = num;
        this.correo = correo;
        this.nombre_completo = nombre_completo;
        this.genero = genero;
    }
    
}
