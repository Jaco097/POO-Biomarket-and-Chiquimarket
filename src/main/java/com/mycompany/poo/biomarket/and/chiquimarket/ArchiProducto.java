/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.biomarket.and.chiquimarket;
import java.io.*;
import java.util.*;
/**
 *
 * @author jacob
 */
public class ArchiProducto {
    private String nom;
    
    public ArchiProducto(String nomArchivo){
        nom=nomArchivo;
    }
    
    public void crear() throws ClassNotFoundException, IOException {
            Scanner sc = new Scanner(System.in);
            File archivoFisico = new File(nom);

            try {
                    if (!archivoFisico.exists()) {
                        ObjectOutputStream Miarch = new ObjectOutputStream(new FileOutputStream(nom));
                     Miarch.close();
                     System.out.println("Archivo creado");
                    } else {
                        System.out.println("El archivo ya existe..!! ");
                        System.out.println("Desea borrar sus datos??? s/n");
                        String resp = sc.next();

                    if (resp.equals("s")) {
                            ObjectOutputStream Miarch = new ObjectOutputStream(new FileOutputStream(nom));
                             Miarch.close();
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al crear...." + e.getMessage());
            }
        }
    
    public void adicionar() throws ClassNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        String resp;
        ObjectOutputStream Miarch = null;

        try {
            if (new File(nom).exists()) {
                Miarch = new AddObjectOutputStream(new FileOutputStream(nom, true));

                do {
                    Producto p=new Producto();
                    p.leer();
                    Miarch.writeObject(p);

                    System.out.println("Desea continuar s/n");
                    resp = sc.next();
                } while (resp.equals("s"));
            } else {
                System.out.println("No existe el archivo.... debe crear!!!");
            }
        } catch (Exception e) {
            System.out.println("error de archivo");
        } finally {
            Miarch.close();
        }
    }
    
    public void listado() throws IOException, ClassNotFoundException {
    ObjectInputStream Miarch = null;

    try {
        Miarch = new ObjectInputStream(new FileInputStream(nom));

        while (true) {
            Producto x = (Producto) Miarch.readObject();
            x.mostrarProducto();
        }
    } catch (Exception e) {
        System.out.println("Fin listado!!!");
    } finally {
        Miarch.close();
    }
}
    
    public void eliminar(String m) throws IOException, ClassNotFoundException {
    ObjectInputStream Miarch = null;
    ObjectOutputStream temporal = null;

    try {
        Miarch = new ObjectInputStream(new FileInputStream(nom));
        temporal = new ObjectOutputStream(new FileOutputStream("temporal.dat", true));

        while (true) {
            Producto zx = (Producto) Miarch.readObject();
            if (!zx.getNombreP().equals(m)) {
                temporal.writeObject(zx);
            }
        }
    } catch (Exception e) {
        System.out.println("Fin listado!!!");
    } finally {
        temporal.close();
        Miarch.close();

        File f1 = new File(nom);
        File f2 = new File("temporal.dat");
        f1.delete();
        f2.renameTo(f1);
    }
}
    
 public String listadoString() {
    String texto = "";

    try {
        ObjectInputStream Miarch =
                new ObjectInputStream(new FileInputStream(nom));

        while (true) {
            Producto x = (Producto) Miarch.readObject();

            texto += "ID: " + x.getIDp()
                  + " Nombre: " + x.getNombreP()
                  + " Precio: " + x.getPrecio()
                  + " Cantidad: " + x.getCantidad()
                  + " Tipo: " + x.getTipo()
                  
                  + "\n";
        }

    } catch (EOFException e) {
        // Fin normal
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    return texto;
}
 
 
 
}
    
    

