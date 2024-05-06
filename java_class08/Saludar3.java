import java.util.Scanner;

// Parte 3, con parametros y return
public class Saludar3{
  public static void main(String[] args){
    System.out.print("Digame tu nombre: ");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.print("Escriba un Saludo: ");
    String salutation = scan.nextLine();
    String respuesta = hola3(name, salutation);
    System.out.println(respuesta);
    scan.close();
  }
  public static String hola3(String name, String saludo){
    return saludo + " " + name;
  }
}