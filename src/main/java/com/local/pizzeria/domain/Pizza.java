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
public class Pizza {
    double precio;
    String ingredientes;
    String name;
    TamPizza tamano;

    public Pizza(double precio, String ingredientes, String name, TamPizza tamano) {
        this.precio = precio;
        this.ingredientes = ingredientes;
        this.name = name;
        this.tamano = tamano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TamPizza getTamano() {
        return tamano;
    }

    public void setTamano(TamPizza tamano) {
        this.tamano = tamano;
    }
    
}
