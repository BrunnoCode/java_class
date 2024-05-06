import java.util.Scanner;

public class Calcular{
  public static void main(String[] args){
    System.out.println("Indique que operación quieres hacer ? sumar, restar, multiplicar, dividir o resto");
    Scanner scan = new Scanner(System.in);
    String operation = scan.nextLine();
    switch (operation) {
      case "sumar":
      suma();
      break;
      case "restar":
      restar();
      break;
      case "multiplicar":
      mult();
      break;
      case "dividir":
      div();
      break;
      case "resto":
      res();
      break;
      default:
      System.out.println("Esta operación no existe o ha sido escrido incorrectamente!");
      break;
    }
    scan.close();
  }
  // SUMA
    public static void suma(){
      System.out.print("Indique el primer numero que quieras operar? ");
      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      System.out.print("Indique el segundo? ");
      int num2 = scan.nextInt();
      int res = num1 + num2;
      System.out.format("El resultado es %d\n", res);
      scan.close();
      
    }

  // RESTA
  public static void restar(){
    System.out.print("Indique el primer numero que quieras operar? ");
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    System.out.print("Indique el segundo? ");
    int num2 = scan.nextInt();
    int res = num1 - num2;
    System.out.format("El resultado es %d\n", res);
    scan.close();
    
  }
  // MULTIPLICAR
  public static void mult(){
    System.out.print("Indique el primer numero que quieras operar? ");
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    System.out.print("Indique el segundo? ");
    int num2 = scan.nextInt();
    int res = num1 * num2;
    System.out.format("El resultado es %d\n", res);
    scan.close();
    
  }
  // DIVIDIR 
  public static void div(){
    System.out.print("Indique el primer numero que quieras operar? ");
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    System.out.print("Indique el segundo? ");
    int num2 = scan.nextInt();
    int res = num1 / num2;
    System.out.format("El resultado es %d\n", res);
    scan.close();
    
  }
  // RESTO
  public static void res(){
    System.out.print("Indique el primer numero que quieras operar? ");
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    System.out.print("Indique el segundo? ");
    int num2 = scan.nextInt();
    int res = num1 % num2;
    System.out.format("El resultado es %d\n", res);
    scan.close();
    
  }

}