
package com.mycompany.poo.biomarket.and.chiquimarket;


public class Docente extends Persona {
    private int item;
    private String titulo;
    
    public Docente(String n,String ap,String am, int it,String Titu){
        super(n,ap,am);
        this.item=it;
        this.titulo=Titu;
    }
    
    public void mostrarDocente(){
        super.mostrarPersona();
        System.out.println("Item: "+this.item);
        System.out.println("Titulo: "+this.titulo);
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
