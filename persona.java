import java.util.Scanner;

public class persona{

  public static void main(String[] args)
  {
    Scanner tecla = new Scanner(System.in);
    System.out.println("Hola?, Cómo te llamas ?");
    String nombre = tecla.nextLine();
    System.out.println("Cómo es tu apellido?");
    String apellido = tecla.nextLine();
    System.out.println("Tu edad ?");
    int edad = tecla.nextInt();
    tecla.close();
    System.out.println("Encantado en conocerte " + nombre  + " " + apellido + " pareces muy joven por tener " + edad + " años.");
  }

}