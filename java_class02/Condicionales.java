
import java.util.Scanner;

public class Condicionales{
  public static void main(String[] args) {
    System.out.println("Qual es tu edad ?");
    Scanner input = new Scanner(System.in);
    int edad = input.nextInt();
    input.close();
    if(edad < 6 || edad >= 120)
      System.out.println("ERROR: edad fuera de rango!");
    if(edad >= 6 && edad <= 8)
      System.out.println("Estas en primaria!");
    else if(edad >= 9 && edad <= 17){
      if(edad >= 15 && edad <= 17)
        System.out.println("Estas en el Bachillerato!");
      else
        System.out.println("Estas en la ESO!");
    }
    else if(edad >= 18 && edad <= 26)
      System.out.println("Estas en la Universidad!");
  }
}