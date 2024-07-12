package org.example.helpers.mensajes;

public enum MensajesVehiculo {
    ID_VEHICULO_ERRONEO("Revisa, no aceptamos id negativos"),
    LONGITUD("Error en la longitud de los caracteres"),
    CARACTERES_INVALIDOS("Revise el caracteres ingresados"),
    VALOR_NEGATIVO("El valor ingresado no puede ser menor de 0"),
    KILOMETRAJE_MAYOR("El kilometraje no puede ser mayor a 100"),
    AUTONOMIA_MAYOR("La autonomia no puedes ser mayor a 72"),
    CAPACIDADCARGA_MAYOR("la capacidad de carga no puede ser mayor a 1.000"),
    FORMATO_FECHA("El formato de la fecha es invalido"),
    ;

    private String mensajeError;

    MensajesVehiculo(String mensajeError) {
        this.mensajeError = mensajeError;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
