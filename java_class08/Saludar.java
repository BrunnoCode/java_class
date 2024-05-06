import java.util.Scanner;

public class Saludar{
  public static void main(String[] args){
    System.out.println("Ejercicio 1: saludo.");
    System.out.println("\n\nComo te llamas ?");
    Scanner scan = new Scanner(System.in);
    String usr = scan.nextLine();
    hola();
    System.out.println(" "+usr);
    scan.close();
  }

  public static void hola(){
    System.out.print("Escriba un saludo: ");
    Scanner scan = new Scanner(System.in);
    String Saudacion = scan.nextLine();
    scan.close();
    System.out.print(Saudacion);
  }
}