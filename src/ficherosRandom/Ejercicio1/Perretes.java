package ficherosRandom.Ejercicio1;

public class Perretes {

   //atributos
   int id;
   String nombre;
   enum Raza{CORGUI, POMERANIAN, PODENCO, PASTOR_ALEMAN, LABRADOR}
   boolean conChapa;
   String color;
   int edad;

   //constructor
   public Perretes(int id, String nombre, boolean conChapa, String color, int edad, Raza corgui) {
      this.id = id;
      this.nombre = nombre;
      this.conChapa = conChapa;
      this.color = color;
      this.edad = edad;
   }

   //getter y setter

   public String getNombre() {
      StringBuffer sb = new StringBuffer();
      sb.append(nombre);
      sb.setLength(20);
      return sb.toString();
   }

   public String getColor() {
      StringBuffer sb = new StringBuffer();
      sb.append(color);
      sb.setLength(20);
      return sb.toString();
   }

   public Raza getRaza(){
      StringBuffer sb = new StringBuffer();
      sb.append();
      sb.setLength(20);
      return sb.toString();
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
