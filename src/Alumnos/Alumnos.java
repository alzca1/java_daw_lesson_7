package Alumnos;

public class Alumnos {
    private String nombre;
    private String curso;

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }

    // public void setCurso(String curso) {
    //     this.curso = curso;
    // }

    public double evaluar(double nota) {
        nota = nota * 0.7;
        return nota;
    }

    public void Alumno (String nombre, String curso){
        this.nombre = nombre; 
        this.curso = curso; 

    }
}
