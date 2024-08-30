/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.el_tunas;

import baseDatos.Catalogos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lestu
 */
public class El_Tunas {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        Integer menu = 0;
        String salir = "no";
        int i = 100;
        int nombre;
        Catalogos catalogo = new Catalogos();
        List<Producto> productosCatalogo = new ArrayList<>();
        productosCatalogo = catalogo.crearCatalogo();
        Cliente cliente = new Cliente();
        List<Cliente> listaClientes = new ArrayList<>();
        OrdenProduccion ordenProduccion = new OrdenProduccion();
        List<OrdenProduccion> ordenesProduccion = new ArrayList<>();
       
        do {
            System.out.println("____________________________________________");
            System.out.println("|                    MENU                  |");
            System.out.println("|Crear cliente                           1 |");
            System.out.println("|crear ordenProduccion                   2 |");
            System.out.println("|terminar Orden produccion               3 |");
            System.out.println("|listar clientes                         4 |");
            System.out.println("|salir                                   5 |");
            System.out.println("|__________________________________________|");
            menu = sp.nextInt();
            switch (menu) {
                case 1:
                    listaClientes.add(cliente.crearCliente());
                    break;
                case 2:
                    System.out.println("seleccione el cliete para la orden de produccion");
                    int j = 1;
                    for (Cliente cliente1 : listaClientes) {
                        
                        System.out.println(cliente1.getNombreCliente()+"         "+j);
                        j++;
                    }//debe de ingresar el numero que aparece a la par del nombre
                    nombre = sp.nextInt();
                    ordenesProduccion.add(ordenProduccion.crearOrdenProduccion(i, productosCatalogo, listaClientes.get(nombre-1)));
                    i++;
                    break;
                case 3:
                    ordenProduccion.terminarOrdenes(ordenesProduccion, productosCatalogo);
                    System.out.println("hola");
                    break;

                case 5:
                    salir = "si";
                    break;
            }
        } while (salir.equals("no"));

    }
}
