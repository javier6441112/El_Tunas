/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.el_tunas;

/**
 *
 * @author lestu
 */
public class DetalleProducto {
    private double precio;
    private String Codigo;
    private String detallePersonalizacion;
    private String estadoProducto;

    public DetalleProducto() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDetallePersonalizacion() {
        return detallePersonalizacion;
    }

    public void setDetallePersonalizacion(String detallePersonalizacion) {
        this.detallePersonalizacion = detallePersonalizacion;
    }

    public String getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        this.estadoProducto = estadoProducto;
    }
    
    
}
