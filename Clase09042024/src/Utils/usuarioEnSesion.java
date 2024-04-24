package Utils;

import Usuarios.Usuario;

public class usuarioEnSesion {
    private static usuarioEnSesion instancia;
    private Usuario usuario;
    private usuarioEnSesion() {}
    public static usuarioEnSesion getInstancia() {
        if (instancia == null) {
            instancia = new usuarioEnSesion();
        }return instancia;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public boolean hayUsuarioEnSesion(){
        return usuario != null;

    }
}
