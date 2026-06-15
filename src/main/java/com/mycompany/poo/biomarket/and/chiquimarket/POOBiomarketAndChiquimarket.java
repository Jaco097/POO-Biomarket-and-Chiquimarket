

package com.mycompany.poo.biomarket.and.chiquimarket;
import java.io.*;
import java.util.*;



public class POOBiomarketAndChiquimarket {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        ArchiProducto Miarch=new ArchiProducto("Producto.dat");
        ArchRegistroVenta archi=new ArchRegistroVenta("RegistroVentas.dat");
        Principal frm=new Principal();
        Tienda tienda=new Tienda();
        frm.setVisible(true);
        String textAREA=Miarch.listadoString();
        frm.productos(textAREA);
        
        }
    }
