import java.util.Scanner;

public class Sonido {

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    byte num;
    String res;
  do{
      System.out.println("Selecione un numero y tendrás una representación de un sonido:");
      System.out.println("Selecione un numero de 1 - 5:");
      System.out.println("Perro");
      System.out.println("Bomba");
      System.out.println("Gato");
      System.out.println("Pajaro");
      System.out.println("Burbujas de Agua!");
      num = scn.nextByte();
        switch (num) {
          case 1:
            System.out.println("Au AU !!!");
            break;
          case 2:
            System.out.println("BOOOM !!!:");
            break;
          case 3:
            System.out.println("Miiiau!!!");
            break;
          case 4:
            System.out.println("Piu Piu!!!");
            break;
          case 5:
            System.out.println("Blu Blu Blu !!!");
            break;
          default:
            System.out.println("Daaaahhhh este numero no te he pedido!!!");
            break;
        }
        System.out.println("Quieres jugar de nuevo ?");
        res = scn.nextLine();
      } while(!res == "si");
      scn.close();
  }
}