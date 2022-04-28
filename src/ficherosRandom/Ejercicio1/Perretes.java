package ficherosRandom.Ejercicio1;

public class Perretes {

   //atributos
   int id;
   String nombre;
   enum Raza{CORGI, POMERANIAN, PODENCO, PASTOR_ALEMAN, LABRADOR}
   boolean conChapa;
   String color;
   int edad;

   //constructor
   public Perretes(int id, String nombre, boolean conChapa, String color, int edad) {
      this.id = id;
      this.nombre = nombre;
      this.conChapa = conChapa;
      this.color = color;
      this.edad = edad;
   }

   //getter y setter

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public boolean isConChapa() {
      return conChapa;
   }

   public void setConChapa(boolean conChapa) {
      this.conChapa = conChapa;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   //Reescribimos el metodo toString y estructuramos lo que queremos que aparezca por pantalla
   @Override
   public String toString() {
      return "Perrete{" +
              "id: " + id +
              ", nombre: " + nombre + '\'' +
              ", conChapa: " + conChapa +
              ", color: " + color + '\'' +
              ", edad: " + edad +
              '}';
   }
}
