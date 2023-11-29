package Principal;

public class Usuario{

    protected String nombreCompleto;
    protected String nombreUsuario;
    protected String contrasena;
    protected String grupoPertenece;
    //para saber si ya el usuario esta autenticado


    public Usuario(String nombreCompleto, String nombreUsuario, String contrasena, String grupoPertenece) {
        this.nombreCompleto = nombreCompleto;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.grupoPertenece = grupoPertenece;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getGrupoPertenece() {
        return grupoPertenece;
    }

    public void setGrupoPertenece(String grupoPertenece) {
        this.grupoPertenece = grupoPertenece;
    }

    public void CambiarContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String toString() {
        return
                "NombreCompleto: " + nombreCompleto + '\'' +
                ",NombreUsuario: " + nombreUsuario + '\'' +
                ",Contraseña: " + contrasena + '\'' +
                ",Grupo: " + grupoPertenece;
    }

    public void CambiarNombreUsuario(String nomC) {
        this.nombreUsuario = nomC;
    }

}
