package archivosBinariosCP;
import java.io.Serializable;


public class Alumnos implements Serializable{

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    private float notas[];

    //Constructores

    public Alumnos(String nombre,String apellidos, int edad,String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni=dni;
    }

    //Getter y setter

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }


    //Reescribimos el método toString
    @Override
    public String toString() {
        return "Su dni del Alumno es:" +this.dni+"\n"+
                "El nombre del Alumno es: "+this.nombre+"\n"+
                "El apellido del Alumno es: "+this.apellidos+"\n"+
                "Su edad del Alumno es: "+this.edad;
    }
}