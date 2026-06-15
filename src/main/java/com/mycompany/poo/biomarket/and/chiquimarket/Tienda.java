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
public class Tienda implements Serializable {
    private String nomTienda;
    private String ubicacion;
    private Producto p;
    private int numeroProVendidos;
    private GrupoVenta gv;
    private VentaProducto vp[]=new VentaProducto[10];
    
    public Tienda(){
        this.nomTienda="CHIquimarket y Biomarket";
        this.ubicacion="monoblock";
        this.gv=new GrupoVenta();
        this.numeroProVendidos=10;
        
    }
    

    
}
