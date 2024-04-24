
import java.util.Scanner;
import java.util.ArrayList;

public class santJordi{
  public static void main(String[] args){
    System.out.println("Qué elementos necesito para Sant Jordi?");
    Scanner scan = new Scanner(System.in);
    String usr;
    ArrayList<String> ingredientes = new ArrayList<>();
    
   do {
    	  usr = scan.nextLine();
      } while (ingredientes.add(usr) && !usr.equalsIgnoreCase("salir"));
     System.out.println("\n-------------Necesito------------------");
    System.out.println(ingredientes);
    scan.close();
    System.out.println();
  }
}
