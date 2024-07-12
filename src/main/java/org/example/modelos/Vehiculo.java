package org.example.modelos;

import org.example.helpers.validaciones.VehiculoValidacion;

import java.time.LocalDate;

public class Vehiculo {

    //INYECTANDO UNA DEPENDENCIA DE LA CLASE VehiculoValidacion
    private VehiculoValidacion vehiculoValidacion = new VehiculoValidacion();

    //id
    private Integer id; //solo numeros positivos

    //marca
    private String marca; //solo letras y espacios y maximo 50 caracteres sin caracteres especiales

    //modelo
    private String modelo; //CON EL PROFE

    //kilometraje
    private Double kilometraje; //solo positivos y maximo 100.000

    //color
    private String color; //solo letras y espacios y maximo 20 caracteres

    //descripcion
    private String descripcion; //maximo 100 caracteres

    //tipo
    private String tipo; //solo letras SIN ESPACIOS

    //autonomia
    private Integer autonomia; //solo numeros positivos maximo 72

    //capacidadCarga
    private Double capacidadCarga; // solo numeros positivos y maximo 1000

    //avaluo
    private Integer avaluo; //solo positivos


    public Vehiculo() {
    }

    public Vehiculo(Integer id, String marca, String modelo, Double kilometraje, String color, String descripcion, String tipo, Integer autonomia, Double capacidadCarga, Integer avaluo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.color = color;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.autonomia = autonomia;
        this.capacidadCarga = capacidadCarga;
        this.avaluo = avaluo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try{
            this.vehiculoValidacion.validarId(id);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        try{
            this.vehiculoValidacion.validarMarca(marca);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        try {
            // Validar el formato del modelo utilizando VehiculoValidacion
            this.vehiculoValidacion.validarModelo(modelo);
            this.modelo = modelo;
        } catch (Exception error) {
            System.out.println(error.getMessage());
            // Aquí podrías lanzar una excepción o manejar el error de otra manera según tu aplicación
        }
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        try{
            this.vehiculoValidacion.validarkilometraje(kilometraje);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        try{
            this.vehiculoValidacion.validarColor(color);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        try{
            this.vehiculoValidacion.validarDescripcion(descripcion);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        try{
            this.vehiculoValidacion.validarTipo(tipo);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        try{
            this.vehiculoValidacion.validarAutonomia(autonomia);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(Double capacidadCarga) {
        try{
            this.vehiculoValidacion.validarCapacidadCarga(capacidadCarga);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        try{
            this.vehiculoValidacion.validarAvaluo(avaluo);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }
}
