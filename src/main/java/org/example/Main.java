package org.example;

import org.example.modelos.Mercancia;
import org.example.modelos.Vehiculo;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Vehiculo vehiculo = new Vehiculo();
        Mercancia mercancia = new Mercancia();

        Scanner lea = new Scanner(System.in);
        System.out.print("Digite: ");
        vehiculo.setModelo(lea.next());
        System.out.println(vehiculo.getModelo());

        
    }
}