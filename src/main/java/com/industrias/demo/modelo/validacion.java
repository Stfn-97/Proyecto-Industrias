package com.industrias.demo.modelo;

public class validacion {
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public validacion() {
    }

    public validacion(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
}
