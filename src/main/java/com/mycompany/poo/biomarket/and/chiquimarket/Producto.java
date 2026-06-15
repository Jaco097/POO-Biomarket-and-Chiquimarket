package com.mycompany.poo.biomarket.and.chiquimarket;

import java.io.*;
import java.util.*;

public class Producto implements Serializable {
    private String nombreP;
    private int precio;
    private int IDp;
    private int cantidad;
    private String tipo;
    private String Facultad;
    
    
    public void leer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("datos del Producto");
        System.out.println("nombre:  ");
        this.nombreP=sc.next();
        System.out.println("tipo:  ");
        this.tipo=sc.next();
        System.out.println("Precio:  ");
        this.precio=sc.nextInt();
        System.out.println("Cantidad:  ");
        this.cantidad=sc.nextInt();
        System.out.println("agregar una ID:  ");
        this.IDp=sc.nextInt();
    }
    
    public void mostrarProducto(){
        System.out.println("===============");
        System.out.println("Nombre del producto: " + nombreP);
        System.out.println("Precio: " + precio);
        System.out.println("ID: " + IDp);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Tipo: " + tipo);
        //  System.out.println("Facultad: " + Facultad)
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIDp() {
        return IDp;
    }

    public void setIDp(int IDp) {
        this.IDp = IDp;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }
    
    
}
