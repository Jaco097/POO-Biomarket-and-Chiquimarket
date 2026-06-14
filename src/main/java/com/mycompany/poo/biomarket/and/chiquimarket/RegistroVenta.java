/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo.biomarket.and.chiquimarket;

/**
 *
 * @author jacob
 */
public class RegistroVenta {
    private int IDr;
    private int cantidadRe;
    private double precioUnitario;
    private double totalV;

    public RegistroVenta(int Ir, int canRe, double preUnio, double toV) {
        this.IDr = Ir;
        this.cantidadRe = canRe;
        this.precioUnitario = preUnio;
        this.totalV = toV;
    }
    public void mostrarRegistro()
    {
        System.out.println(" ID Registro Venta"+IDr+"Cantidad Registro"+cantidadRe);
        System.out.println("Precio Unitario"+precioUnitario+"total Ventas"+totalV);
    }

    public int getIDr() {
        return IDr;
    }

    public void setIDr(int IDr) {
        this.IDr = IDr;
    }

    public int getCantidadRe() {
        return cantidadRe;
    }

    public void setCantidadRe(int cantidadRe) {
        this.cantidadRe = cantidadRe;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getTotalV() {
        return totalV;
    }

    public void setTotalV(double totalV) {
        this.totalV = totalV;
    }
    
}
