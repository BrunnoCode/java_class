import java.util.*;

public class StringRev {
  public static void main(String[] args){
    Scanner usr = new Scanner(System.in);
    System.out.println("Escriba una palabra...");
    String word = usr.nextLine();
    for (int i = word.length()-1; i >= 0; i--){
      System.out.print(word.charAt(i));
    }
    System.out.println();
    usr.close();
  }
}