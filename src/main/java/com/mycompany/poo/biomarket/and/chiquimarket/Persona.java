
package com.mycompany.poo.biomarket.and.chiquimarket;


public class Persona {
    private String nombreP;
    private String apellidoP;
    private String apellidoM;
    
    public Persona(String n,String ap,String am){
        this.nombreP=n;
        this.apellidoP=ap;
        this.apellidoM=am;
    }
    
    public void mostrarPersona(){
        System.out.println("Nombre: "+this.nombreP);
        System.out.println("Apellido Paterno: "+this.apellidoP);
        System.out.println("Apellido Materno: "+this.apellidoM);
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }
    
    
}
