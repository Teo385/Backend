package org.example.modelos;

import org.example.helpers.validaciones.MercanciaValidacion;

public class Mercancia {

    private MercanciaValidacion mercanciaValidacion = new MercanciaValidacion();

    //id (int) //solo enteros positivos
    private Integer id;
    //volumenOcupado (double)  //solo positivos y maximo 100
    private Double volumenOcupado;
    //tipo (string) //solo letras sin espacios
    private String tipo;
    //peso (double) //solo positivos maximo 1000
    private Double peso;
    //descripcion (string) //maximo 100
    private String descripcion;
    //avaluo (int) //solo positivos
    private Integer avaluo;
    //direccionRemitente (string) //maximo 200
    private String direccionRemitente;
    //direccionDestinatario (string) //maximo 200
    private  String direccionDestinatario;

    public Mercancia() {
    }

    public Mercancia(Integer id, Double volumenOcupado, String tipo, Double peso, String descripcion, Integer avaluo, String direccionRemitente, String direccionDestinatario) {
        this.id = id;
        this.volumenOcupado = volumenOcupado;
        this.tipo = tipo;
        this.peso = peso;
        this.descripcion = descripcion;
        this.avaluo = avaluo;
        this.direccionRemitente = direccionRemitente;
        this.direccionDestinatario = direccionDestinatario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        try{
            this.mercanciaValidacion.validarId(id);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getVolumenOcupado() {
        return volumenOcupado;
    }

    public void setVolumenOcupado(Double volumenOcupado) {
        try{
            this.mercanciaValidacion.validarVolumenOcupado(volumenOcupado);
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
            this.mercanciaValidacion.validarTipo(tipo);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        try{
            this.mercanciaValidacion.validarPeso(peso);
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
            this.mercanciaValidacion.validarDescripcion(descripcion);
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
            this.mercanciaValidacion.validarAvaluo(avaluo);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        try{
            this.mercanciaValidacion.validarDireccionRemitente(direccionRemitente);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        try{
            this.mercanciaValidacion.validarDireccionDestinatario(direccionDestinatario);
            System.out.println("todo bien agonia");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

}
