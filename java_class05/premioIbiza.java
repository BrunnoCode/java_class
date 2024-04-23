
import java.util.Random;
import java.util.Scanner;
import java.lang.System;

public class premioIbiza{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Vamos empezar el sorteo, si o no?");
    String user = scan.nextLine();
    if (user.equalsIgnoreCase("si"))
    {
      do {
            System.out.print("Cuantos participantes seran?: ");
            int list;
            while(!scan.hasNextInt())
            {
              System.out.println("Error: insira valores numericos!");
              scan.next();
            }
            list = scan.nextInt();
            if (list < 2){
              System.out.println("Porfavor debe haber pelo menos 2 personas!.");
              list = scan.nextInt();
            }
            System.out.println("Escriba los nombres de los " + list + " participantes del sorteo:");
            String[] candidates = new String[list];
            scan.nextLine();
            int i = -1;
            while(++i < list){
                if (i == 0)
                  System.out.print("indique el primero: ");
                else
                   System.out.print("Una persona más: ");
              candidates[i] = scan.nextLine();
            }
            System.out.println("\nLos candidatos son: \n-----------------------------\n");
            for (String element : candidates){
              System.out.print(element.toUpperCase() + " | ");
            }System.out.println();
            System.out.println("\nAhora vamos Sortear un afortunado/a aguarde\n-----------------------------\n");
            System.out.print("Loading ");
            for (int x = 0; x < 15; x++){
              try{
                Thread.sleep(500);
              } catch (InterruptedException event) {
                event.printStackTrace();
              }
              System.out.print("#");
            }
            Random random = new Random();
            System.out.println("\n\nEl ganador/a es: ");
            System.out.println("Enhorabuena!!! " + candidates[random.nextInt(list)].toUpperCase() + ", que disfrute Ibiza!!!");
            System.out.println("\nSorteamos de nuevo, si o no?");
            user = scan.nextLine();
          } while (user.equalsIgnoreCase("si"));
          if (user.equalsIgnoreCase("no"))
            System.out.println("Gracias por jugar el sorteo! sorteo terminado.");
    }else
      System.out.println("Ok hagamos otro dia!");
    scan.close();
  }
}












