import java.util.Scanner;

public class Color {

  public static void main(String[] args)
  {
    String color = "Azul";
    Scanner user = new Scanner(System.in);
    System.out.println("Qué color es?");
    String input = user.nextLine();
    if (input.equalsIgnoreCase(color))
      System.out.println("Muy bien el color " + input + " es correcto!");
    else
      System.out.println("Sorry No has acertado!");
    user.close();
  }
}