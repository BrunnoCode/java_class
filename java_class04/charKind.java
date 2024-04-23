import java.util.*;

public class charKind {

  public static void main(String[] args){
    System.out.println("Escriba una frase:");
    Scanner scan = new Scanner(System.in);
    String textUsr = scan.nextLine();
    String text = textUsr.replaceAll(" ", "");
    if (text.matches("[a-z]+") && !text.matches("[A-Z]+"))
      System.out.println("Tu frase contiene solo caracteres lower-case.");
    else if(text.matches("[A-Z]+") && !text.matches("[a-z]+"))
      System.out.println("Tu frase solo contiene uppercase.");
    else
      System.out.println("Tu frase está compuesta por ambos formatos uppercase y lowercase.");
    scan.close();
  }
}