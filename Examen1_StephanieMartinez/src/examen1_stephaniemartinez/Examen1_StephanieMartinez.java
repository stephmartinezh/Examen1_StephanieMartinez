package examen1_stephaniemartinez;

import javax.swing.JOptionPane;

public class Examen1_StephanieMartinez {

    public static void main(String[] args) {
        char resp = Acceso();
        if(resp == 's' || resp == 'S'){
            Usuario p = new Usuario();
            p.main(null);
        } else if(resp == 'a' || resp=='A' ){
            Almacenamiento_Libros l = new Almacenamiento_Libros();
            l.main(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "No puede ingresar a la biblioteca virtual.");
        }
    }

    public static char Acceso() {
        char resp = 'a';
        String usuario1 = "usuario", contrasena = "contrasena1";
        String us = JOptionPane.showInputDialog(null, "Ingrese su usuario");
        String con = JOptionPane.showInputDialog(null, "Ingrese la contraseña");
        if (us.equalsIgnoreCase(usuario1) && con.equalsIgnoreCase(contrasena)) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido!");
        } else {
            String respuesta = JOptionPane.showInputDialog(null, "El usuario o la contraseña no son correctos.\nDesea crear una cuenta[S/N]");
            resp = respuesta.charAt(0);
        }
        return resp;
    }
}
