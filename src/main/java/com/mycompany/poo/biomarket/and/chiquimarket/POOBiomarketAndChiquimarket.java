

package com.mycompany.poo.biomarket.and.chiquimarket;

import java.io.IOException;
import java.util.Scanner;


public class POOBiomarketAndChiquimarket {

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        boolean sw = true;
        Scanner sc = new Scanner(System.in);
        ArchiProducto Miarch=new ArchiProducto("Producto.dat");
        
        
         while (sw) {
        System.out.println("1. Crear");
        System.out.println("2. Adicionar");
        System.out.println("3. Listar");
        System.out.println("4. Listar por tipo");
        System.out.println("5. Contar gatos");
        System.out.println("0. Salir");
        System.out.print("Elegir una opcion: ");

        String resp = sc.next();

        switch (resp) {
            case "1":
                Miarch.crear();
                break;

            case "2":
                Miarch.adicionar();
                break;

            case "3":
                Miarch.listado();
                break;

            case "4": {
                System.out.print("Tipo: ");
                String tip = sc.next();
                //Miarch.tipoX(tip);
                break;
            }

            case "5": {
                System.out.print("Tipo: ");
                String tip = sc.next();
                //Miarch.contar("gato");
                break;
            }

            default:
                sw = false;
        }
    }

        }
    }
