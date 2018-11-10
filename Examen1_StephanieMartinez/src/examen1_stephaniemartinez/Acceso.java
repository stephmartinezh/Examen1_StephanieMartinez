
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Libro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Libro> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + fecha + ", num=" + num + ", correo=" + correo + ", nombre_completo=" + nombre_completo + ", genero=" + genero + ", lista=" + lista + '}';
    }
    
    
}
