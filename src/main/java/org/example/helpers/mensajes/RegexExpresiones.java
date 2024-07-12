package org.example.helpers.mensajes;

public enum RegexExpresiones {

    VALIDAR_SOLO_LETRAS_Y_ESPACIOS("^[a-zA-Z\\s]*$"),
    VALIDAR_LETRAS_SIN_ESPACIOS("^[a-zA-Z]+$"),
    VALIDAR_FECHA("^(0[1-9]|1[0-2])[-/](\\d{2})$")
    ;


    private String expresionRegular;

    RegexExpresiones() {
    }

    RegexExpresiones(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }

    public String getExpresionRegular() {
        return expresionRegular;
    }

    public void setExpresionRegular(String expresionRegular) {
        this.expresionRegular = expresionRegular;
    }
}
