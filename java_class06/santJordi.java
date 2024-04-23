
import java.util.Scanner;
import java.util.ArrayList;

public class santJordi{
  public static void main(String[] args){
    System.out.println("Qué elementos necesito para Sant Jordi?");
    Scanner scan = new Scanner(System.in);
    int i = 0;
    String usr;
    ArrayList<String> ingredientes = new ArrayList<>();
    
   do {
    	 usr = scan.nextLine();
	 if (usr.equalsIgnoreCase("salir"))
	     break;
      } while (ingredientes.add(usr));
     System.out.println("\n-------------Necesito------------------");
     for (String e : ingredientes){
            System.out.print(e+" | ");
   	 }
    scan.close();
    System.out.println();
  }
}
