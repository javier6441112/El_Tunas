/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.el_tunas;

/**
 *
 * @author lestu
 */
public class Vendedor {
    private String nombreVendedor;
    private String telefono;
    private OrdenProduccion ordenProduccion;
    private Cliente cliente;

    public Vendedor() {
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public OrdenProduccion getOrdenProduccion() {
        return ordenProduccion;
    }

    public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
        this.ordenProduccion = ordenProduccion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

}
