package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Robot {

    private String codigo;
    private double pesoMaximo;

    List<Componente> componentes;

    public Robot(String codigo, double pesoMaximo) {
        this.codigo = codigo;
        this.pesoMaximo = pesoMaximo;
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(int id, String nombre, double peso){

        Componente componente = new Componente(id,nombre,peso);

        double pesoTotalDeComponentesAntesDeAgregarComponente
                = getPesoComponentes() + peso;

        boolean excedePesoMaximo =
                pesoTotalDeComponentesAntesDeAgregarComponente > pesoMaximo;
        if (excedePesoMaximo) {
            throw new IllegalArgumentException("Peso máximo excedido");
        }

        componentes.add(componente);

    }



    public double getPesoComponentes() {
        //Alternative
        double totalUsingFunctionalCall = componentes.stream()
                        .map(componente -> componente.getPeso())
                        .reduce(0.0d, (subtotal, peso) -> peso + subtotal);

        double total = 0;

        for (Componente c : componentes) {
            total += c.getPeso();
        }


        return total;


    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
}
