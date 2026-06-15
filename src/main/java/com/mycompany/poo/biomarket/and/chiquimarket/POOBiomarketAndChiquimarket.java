

package com.mycompany.poo.biomarket.and.chiquimarket;

import java.io.IOException;
import java.util.Scanner;


public class POOBiomarketAndChiquimarket {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        boolean sw = true;
        Scanner sc = new Scanner(System.in);
        ArchiProducto Miarch=new ArchiProducto("Producto.dat");
        Principal frm=new Principal();
         frm.setVisible(true);

        }
    }
