package Principal;

import java.util.ArrayList;

public class

Administrador extends Usuario {

    public Administrador(String nombreCompleto, String nombreUsuario, String contrasena, String grupoPertenece) {
        super(nombreCompleto, nombreUsuario, contrasena, grupoPertenece);
    }


    public String getNombreCompleto() {
        return super.getNombreCompleto();
    }


    public String getNombreUsuario() {
        return super.getNombreUsuario();
    }


    public String getContrasena() {
        return super.getContrasena();
    }

    public String getGrupoPertenece() {
        return super.getGrupoPertenece();
    }

    public String toString() {
        return
                "NombreCompleto: " + nombreCompleto + '\'' +
                        ",NombreUsuario: " + nombreUsuario + '\'' +
                        ",Contraseña: " + contrasena + '\'' +
                        ",Grupo: " + grupoPertenece;
    }



}

