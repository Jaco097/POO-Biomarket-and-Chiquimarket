package com.mycompany.poo.biomarket.and.chiquimarket;
public class RecepcionProducto {
    private int IDre;
    private String fechaRecepcion;
    private String observaciones;
    private int cantidadRecivida;

    public RecepcionProducto(int Ire, String feRe, String ob, int canRe) {
        this.IDre = Ire;
        this.fechaRecepcion = feRe;
        this.observaciones = ob;
        this.cantidadRecivida = canRe;
    }
    private void mostrarRecepcion()
    {
        System.out.println("ID Recepcion"+IDre+"fecha de Recepcion"+fechaRecepcion);
        System.out.println(" Cantidad Recivida"+cantidadRecivida+" Observacion "+observaciones);
    }

    public int getIDre() {
        return IDre;
    }

    public void setIDre(int IDre) {
        this.IDre = IDre;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getCantidadRecivida() {
        return cantidadRecivida;
    }

    public void setCantidadRecivida(int cantidadRecivida) {
        this.cantidadRecivida = cantidadRecivida;
    }
    
}
