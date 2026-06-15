
package com.mycompany.poo.biomarket.and.chiquimarket;


public class GrupoVenta {
    private String nombreGV;
    private Estudiante e[]=new Estudiante[10];
    private Docente d;
    private String nomFacultad;
    private String nomCarrera;
    
    public GrupoVenta(){
        this.nombreGV="grupo 1";
        this.nomFacultad="Agronomia";
        this.nomCarrera="AgroIndustrial";
        this.d=new Docente("Eloy","Guzman","Flores",123654,"Ingeniero");
        this.e[0] = new Estudiante("Thiago", "Quispe", "Flores", 14651, "Tercer");
        this.e[1] = new Estudiante("Maria", "Lopez", "Perez", 11952, "Primer");
        this.e[2] = new Estudiante("Juan", "Mamani", "Choque", 17983, "Segundo");
        this.e[3] = new Estudiante("Ana", "Rojas", "Gutierrez", 14654, "Cuarto");
        this.e[4] = new Estudiante("Carlos", "Vargas", "Torrez", 1185, "Quinto");
        this.e[5] = new Estudiante("Lucia", "Fernandez", "Suarez", 1852366, "Segundo");
        this.e[6] = new Estudiante("Pedro", "Condori", "Apaza", 10067, "Sexto");
        this.e[7] = new Estudiante("Sofia", "Mendoza", "Salazar", 100218, "Primer");
        this.e[8] = new Estudiante("Diego", "Castro", "Flores", 11009, "Tercer");
        this.e[9] = new Estudiante("Valeria", "Paredes", "Ramos", 200, "Cuarto");
    }
    
    public void mostrarGrupoVenta(){
        System.out.println("Nombre del Grupo: "+this.nombreGV);
        System.out.println("Facultad: "+this.nomFacultad);
        System.out.println("Carrera: "+this.nomCarrera);
        this.d.mostrarDocente();
        this.e[0].mostrarEstudiante();
        this.e[1].mostrarEstudiante();
        this.e[2].mostrarEstudiante();
        this.e[3].mostrarEstudiante();
        this.e[4].mostrarEstudiante();
        this.e[5].mostrarEstudiante();
        this.e[6].mostrarEstudiante();
        this.e[7].mostrarEstudiante();
        this.e[8].mostrarEstudiante();
        this.e[9].mostrarEstudiante();
    }

    public String getNombreGV() {
        return nombreGV;
    }

    public void setNombreGV(String nombreGV) {
        this.nombreGV = nombreGV;
    }

    public Estudiante[] getE() {
        return e;
    }

    public void setE(Estudiante[] e) {
        this.e = e;
    }

    public Docente getD() {
        return d;
    }

    public void setD(Docente d) {
        this.d = d;
    }

    public String getNomFacultad() {
        return nomFacultad;
    }

    public void setNomFacultad(String nomFacultad) {
        this.nomFacultad = nomFacultad;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }
    
    
}
