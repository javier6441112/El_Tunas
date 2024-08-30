/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDatos;

import com.mycompany.el_tunas.DetalleProducto;
import com.mycompany.el_tunas.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lestu
 */
public class Catalogos {
   public List<Producto> crearCatalogo (){
      List<Producto> productos = new ArrayList<>();
      Producto producto1 = new Producto();
      producto1.setCodigo("1");
      producto1.setEstado("bodega");
      producto1.setNombreProducto("sombria playa");
      producto1.setPrecio(100.50);
      producto1.setTipoProducto("importacion");
      productos.add(producto1);
      
        Producto producto2 = new Producto();
        producto2.setCodigo("2");
        producto2.setEstado("bodega");
        producto2.setNombreProducto("Luz del Sol");
        producto2.setPrecio(200.00);
        producto2.setTipoProducto("nacional");
        productos.add(producto2);

        Producto producto3 = new Producto();
        producto3.setCodigo("3");
        producto3.setEstado("bodega");
        producto3.setNombreProducto("Mar Azul");
        producto3.setPrecio(150.75);
        producto3.setTipoProducto("importacion");
        productos.add(producto3);

        Producto producto4 = new Producto();
        producto4.setCodigo("4");
        producto4.setEstado("bodega");
        producto4.setNombreProducto("Cielo Estrellado");
        producto4.setPrecio(120.00);
        producto4.setTipoProducto("nacional");
        productos.add(producto4);

        Producto producto5 = new Producto();
        producto5.setCodigo("5");
        producto5.setEstado("bodega");
        producto5.setNombreProducto("Brisa del Mar");
        producto5.setPrecio(180.20);
        producto5.setTipoProducto("importacion");
        productos.add(producto5);

        Producto producto6 = new Producto();
        producto6.setCodigo("6");
        producto6.setEstado("bodega");
        producto6.setNombreProducto("Oasis del Desierto");
        producto6.setPrecio(220.00);
        producto6.setTipoProducto("nacional");
        productos.add(producto6);

        Producto producto7 = new Producto();
        producto7.setCodigo("7");
        producto7.setEstado("bodega");
        producto7.setNombreProducto("Viento del Norte");
        producto7.setPrecio(130.50);
        producto7.setTipoProducto("importacion");
        productos.add(producto7);

        Producto producto8 = new Producto();
        producto8.setCodigo("8");
        producto8.setEstado("bodega");
        producto8.setNombreProducto("Niebla en el Valle");
        producto8.setPrecio(160.00);
        producto8.setTipoProducto("nacional");
        productos.add(producto8);

        Producto producto9 = new Producto();
        producto9.setCodigo("9");
        producto9.setEstado("bodega");
        producto9.setNombreProducto("Lago Serene");
        producto9.setPrecio(140.80);
        producto9.setTipoProducto("importacion");
        productos.add(producto9);

        Producto producto10 = new Producto();
        producto10.setCodigo("10");
        producto10.setEstado("bodega");
        producto10.setNombreProducto("Bosque Encantado");
        producto10.setPrecio(175.60);
        producto10.setTipoProducto("nacional");
        productos.add(producto10);

      return productos;
   }
   
}
