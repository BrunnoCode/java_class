import java.util.Scanner;

public class Saludar2{
  public static void main(String[] args){
    //Parte 2 con parametros y sin return
    System.out.print("Digame tu nombre? ");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.print("Escriba un saludo: ");
    String salutation = scan.nextLine();
    // Llamando la funcion hola2 con parametros
    hola2(salutation, name);
    scan.close();
  }
    public static void hola2(String salutacion, String nombre){
      System.out.println(salutacion+" "+nombre);
  }
  
}