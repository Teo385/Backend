package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidator;
import  org.example.helpers.mensajes.MensajesVehiculo;
import org.example.helpers.mensajes.RegexExpresiones;


public class VehiculoValidacion {

    RegexValidator regexValidator = new RegexValidator();

    public boolean validarId(Integer id) throws Exception {

        if (id < 0) {
            throw new Exception(MensajesVehiculo.ID_VEHICULO_ERRONEO.getMensajeError());
        }

        return true;
    }

    public boolean validarMarca(String marca) throws Exception {

        if (!regexValidator.validarRegex(marca, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())) {
            //NO hubo coincidencia
            throw new Exception(MensajesVehiculo.CARACTERES_INVALIDOS.getMensajeError());
        }

        if (marca.length() > 50) {
            throw new Exception(MensajesVehiculo.LONGITUD.getMensajeError());
        }

        return true;

    }

    public boolean validarModelo(String modelo) throws Exception {
            if (!regexValidator.validarRegex(modelo, RegexExpresiones.VALIDAR_FECHA.getExpresionRegular())) {
                throw new Exception(MensajesVehiculo.FORMATO_FECHA.getMensajeError());
            }

            return true;

    }

    public boolean validarkilometraje(Double kilometraje) throws Exception {

        if (kilometraje < 0) {
            throw new Exception(MensajesVehiculo.VALOR_NEGATIVO.getMensajeError());
        }

        if (kilometraje > 100.000) {
            throw new Exception(MensajesVehiculo.KILOMETRAJE_MAYOR.getMensajeError());
        }
        return true;
    }

    public boolean validarColor(String color) throws Exception {

        if (!regexValidator.validarRegex(color, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())) {

            throw new Exception(MensajesVehiculo.CARACTERES_INVALIDOS.getMensajeError());
        }

        if (color.length() > 20) {
            throw new Exception(MensajesVehiculo.LONGITUD.getMensajeError());
        }

        return true;
    }

    public boolean validarDescripcion(String descripcion) throws Exception {

        if (!regexValidator.validarRegex(descripcion, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())) {

            throw new Exception(MensajesVehiculo.CARACTERES_INVALIDOS.getMensajeError());
        }

        if (descripcion.length() > 100) {
            throw new Exception(MensajesVehiculo.LONGITUD.getMensajeError());
        }

        return true;
    }

    public boolean validarTipo(String tipo) throws Exception {

        if (!regexValidator.validarRegex(tipo, RegexExpresiones.VALIDAR_LETRAS_SIN_ESPACIOS.getExpresionRegular())) {

            throw new Exception(MensajesVehiculo.CARACTERES_INVALIDOS.getMensajeError());
        }

        return true;
    }

    public boolean validarAutonomia(Integer autonomia) throws Exception {

        if (autonomia < 0) {
            throw new Exception(MensajesVehiculo.VALOR_NEGATIVO.getMensajeError());
        }

        if (autonomia > 72) {
            throw new Exception(MensajesVehiculo.AUTONOMIA_MAYOR.getMensajeError());
        }
        return true;
    }

    public boolean validarCapacidadCarga(Double capacidadCarga) throws Exception {

        if (capacidadCarga < 0) {
            throw new Exception(MensajesVehiculo.VALOR_NEGATIVO.getMensajeError());
        }

        if (capacidadCarga > 1000) {
            throw new Exception(MensajesVehiculo.CAPACIDADCARGA_MAYOR.getMensajeError());
        }
        return true;
    }

    public boolean validarAvaluo(Integer avaluo) throws Exception {

        if (avaluo < 0) {
            throw new Exception(MensajesVehiculo.VALOR_NEGATIVO.getMensajeError());
        }
        return true;
    }

}
