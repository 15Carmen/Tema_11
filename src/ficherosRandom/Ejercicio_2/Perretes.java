package ficherosRandom.Ejercicio_2;

import java.io.Serializable;

public class Perretes implements Serializable {

   //Declaramos los atributos o características de nuestro objeto perrete
   int id;
   String nombre;
   String raza;
   boolean conChapa;
   String color;
   int edad;

   //constructores

   public Perretes(){}

   public Perretes(int id, String nombre, boolean conChapa, String color, int edad, String raza) {
      this.id = id;
      this.nombre = nombre;
      this.conChapa = conChapa;
      this.color = color;
      this.edad = edad;
      this.raza = raza;
   }

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

   public String getRaza() {
      return raza;
   }

   public void setRaza(String raza) {
      this.raza = raza;
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
      return "El perrete con el id "+this.id+" se llama "+this.nombre+" y es de la raza "+this.raza+".\n"
              +"Tiene chapa? "+this.conChapa+"\n"
              +"De que color es? Es "+this.color+"\n"
              +"Cuantos anios tiene? Tiene "+this.edad+" anios\n"+"\n";
   }
}
