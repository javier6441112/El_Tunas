/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.el_tunas;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lestu
 */
public class Cliente {
    private String nombreCliente;
    private String nitCliente;
    private String direccion;

    public Cliente crearCliente (){
         Scanner sp = new Scanner (System.in);
        Cliente cliente = new Cliente ();
        System.out.println("ingrese el nombre del cliente");
        cliente.setNombreCliente(sp.nextLine());
        System.out.println("ingrese el nit del cliente");
        cliente.setNitCliente(sp.nextLine());
        System.out.println("ingrese la direccion del cliente");
        cliente.setDireccion(sp.nextLine());
        return cliente;
    }
    
    public Cliente() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
