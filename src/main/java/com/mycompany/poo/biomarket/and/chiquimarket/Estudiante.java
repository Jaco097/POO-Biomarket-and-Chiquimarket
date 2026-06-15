
package com.mycompany.poo.biomarket.and.chiquimarket;


public class Estudiante extends Persona {
    private int regUniv;
    private String semestre;

    public Estudiante(String n,String ap,String am, int RegUni,String Se) {
        super(n,ap,am);
        this.regUniv=RegUni;
        this.semestre=Se;
    }
    
    public void mostrarEstudiante(){
        super.mostrarPersona();
        System.out.println("Reg. Uni.: "+this.regUniv);
        System.out.println("De: "+this.semestre+" Semestre");
    }

    public int getRefUniv() {
        return regUniv;
    }

    public void setRefUniv(int refUniv) {
        this.regUniv = refUniv;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
}
