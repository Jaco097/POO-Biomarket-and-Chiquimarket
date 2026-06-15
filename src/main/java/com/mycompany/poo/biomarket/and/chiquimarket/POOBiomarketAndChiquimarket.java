

package com.mycompany.poo.biomarket.and.chiquimarket;

import java.io.IOException;
import java.util.Scanner;


public class POOBiomarketAndChiquimarket {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        ArchiProducto Miarch=new ArchiProducto("Producto.dat");
        ArchRegistroVenta archi=new ArchRegistroVenta("RegistroVentas.dat");
        archi.crear();
        Principal frm=new Principal();
         frm.setVisible(true);

        }
    }
