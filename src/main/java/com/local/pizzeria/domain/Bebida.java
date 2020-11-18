/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.local.pizzeria.domain;

/**
 *
 * @author user
 */
public class Bebida {
    String sabor;
    double costo;
    TamBebida envase;

    public Bebida(String sabor, double costo, TamBebida envase) {
        this.sabor = sabor;
        this.costo = costo;
        this.envase = envase;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public TamBebida getEnvase() {
        return envase;
    }

    public void setEnvase(TamBebida envase) {
        this.envase = envase;
    }
    
    
}
