/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.el_tunas;

import java.util.List;

/**
 *
 * @author lestu
 */
public class Factura {
    private  OrdenProduccion ordenProduccion;
    private Cliente cliente ;
    private String nitEmpresa = "11255467-8";
    private String serie = "1";
    private String numero = "1";
    private double total=0;

    //para poder crear una factura tiene que crear primero la orden de produccion
    public void CrearFactura (List <DetalleProducto> detalleProductos,List<Producto> productosCatalogo, Cliente cliente){
        int i= 0;
        System.out.println("              EL TUNAS S.A.                ");
        System.out.println("");
        System.out.println("             "+this.getNitEmpresa());
        System.out.println(this.getSerie());
        System.out.println(this.getNumero());
        System.out.println("                Datos cliente               ");
        System.out.println("NIT    "+ cliente.getNitCliente());
        System.out.println("Nombre "+ cliente.getNombreCliente());
        System.out.println("Detalle de los productos");
                //imprime el detalle de los productos
        for (DetalleProducto producto :detalleProductos){
            System.out.println("---------------------------------");
            System.out.println(productosCatalogo.get(Integer.parseInt(detalleProductos.get(i).getCodigo())).getNombreProducto());
            System.out.println(producto.getDetallePersonalizacion());
            System.out.println(String.valueOf(producto.getPrecio()));
            i++;
            this.setTotal(total+producto.getPrecio());
        }
        System.out.println("el total es: "+ this.getTotal());
    }
    
    public Factura() {
    }

    public OrdenProduccion getOrdenProduccion() {
        return ordenProduccion;
    }

    public void setOrdenProduccion(OrdenProduccion ordenProduccion) {
        this.ordenProduccion = ordenProduccion;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
   
}
