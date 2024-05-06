import java.util.Scanner;

public class Saludar{
  public static void main(String[] args){
    System.out.println("Ejercicio 1: saludo.");
    hola();
  }
  // Parte 1 sin parametros
  public static void hola(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n\nCómo te llamas ?");
    String name = scanner.nextLine();
    System.out.print("Escriba un saludo: ");
    String Saudacion = scanner.nextLine();
    System.out.print(Saudacion + " " + name);
    scanner.close();
  }
}