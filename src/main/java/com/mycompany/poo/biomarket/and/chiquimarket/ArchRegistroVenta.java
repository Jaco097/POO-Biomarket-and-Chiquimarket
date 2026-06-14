package com.mycompany.poo.biomarket.and.chiquimarket;

import java.io.*;
import java.util.*;

public class ArchRegistroVenta {
    private String nom;

    public ArchRegistroVenta(String n) {
        nom = n;
    }

    public void crear() throws ClassNotFoundException,
            IOException {
        Scanner sc = new Scanner(System.in);
        File archivoFisico = new File(nom);
        try {
            if (!archivoFisico.exists()) {
                ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nom));
                archi.close();
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe..!! ");
                System.out.println("Desea borrar sus datos??? s/n");
                String resp = sc.next();
                if (resp.equals("s")) {
                    ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nom));
                    archi.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Error al crear...." + e.getMessage());
        }
    }

    public void adicionar() throws ClassNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        String resp;
        ObjectOutputStream archi = null;
        try {
            if (new File(nom).exists()) {
                archi = new AddObjectOutputStream(new FileOutputStream(nom, true));
                do {
                    RegistroVenta x = new RegistroVenta();
                    x.leer();
                    archi.writeObject(x);
                    System.out.println("Desea continuar s/n");
                    resp = sc.next();
                } while (resp.equals("s"));
            } else {
                System.out.println("No existe el archivo.... debe crear!!!");
            }
        } catch (Exception e) {
            System.out.println("error de archivo");
        } finally {
            archi.close();
        }
    }

    public void listado() throws IOException, ClassNotFoundException {
        ObjectInputStream archi = null;
        try {
            archi = new ObjectInputStream(new FileInputStream(nom));
            while (true) {
                RegistroVenta x = (RegistroVenta) archi.readObject();
                x.mostrarRegistro();
            }
        } catch (Exception e) {
            System.out.println("Fin listado!!!");
        } finally {
            archi.close();
        }
    }
}

    