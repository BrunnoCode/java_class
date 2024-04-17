import java.util.Scanner;

import javax.lang.model.type.NullType;

public class asociacion {

  public static void main(String[] args) {
    System.out.println("Ayudando asociación.");
    Scanner scan = new Scanner(System.in);
    int personasDonantes = 0;
    int cantidad = 0;
    int cuantia = 0;
    System.out.println("Quieres donar para ayudar la asociación ?");
    String respuesta = scan.nextLine();
    int entero = 0;
   do {
      System.out.println("Qué cantidad quieres donar?");
      cuantia = scan.nextInt();
      scan.nextLine();
      System.out.println("Quieres donar para ayudar la asociación ?");
      respuesta = scan.nextLine();
      cantidad += cuantia;
      personasDonantes++;
    } while(!respuesta.equalsIgnoreCase("no"));
    if (respuesta.equalsIgnoreCase("no"))
      System.out.println("Me voy, esta vida de pedir es una mierda :(");
    System.out.println("Personas Donantes: " + personasDonantes);
    System.out.println("Valor recaudado: " + cantidad);
    scan.close();
  }
}