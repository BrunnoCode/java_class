import java.util.*;

public class StrChar {

  public static void main(String[] args)
  {
    System.out.println("Digite algun contacto de telefono");
    Scanner scan = new Scanner(System.in);
    String text = scan.nextLine();
    text = text.replaceAll("[\\s-./]", "");
    System.out.println(text);
    scan.close();
  }
}