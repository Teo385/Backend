package org.example.helpers.mensajes;

public enum MensajesMercancia {
    ID_MERCANCIA_ERRONEO("Revisa, no aceptamos id negativos"),
    CARACTERES_INVALIDOS("Revise los caracteres ingresados"),
    LONGITUD("Error en la longitud de los caracteres"),
    VALOR_NEGATIVO("El valor ingresado no puede ser menor de 0"),
    VOLUMEN_OCUPADO_MAYOR("El volumen ocupado no puede ser mayor a 100"),
    PESO_MAYOR("El peso no puede ser mayor a 1.000")
    ;
    private String mensajeError;

    MensajesMercancia(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
