package com.industrias.demo.modelo;

import org.springframework.stereotype.Component;

@Component
public class Validacion {

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

    public Validacion() {
    }

    public Validacion(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
}
