import java.util.Scanner;

public class Sonido {

  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    byte num;
    boolean v = true;
  do{
      System.out.println("Selecione un numero y tendrás una representación de un sonido:");
      System.out.println("Selecione un numero de 1 - 5:");
      System.out.println("Perro");
      System.out.println("Bomba");
      System.out.println("Gato");
      System.out.println("Pajaro");
      System.out.println("Burbujas de Agua!");
      System.out.println("Salir presione 0!\n\n");
      num = scn.nextByte();
        switch (num) {
          case 1:
            System.out.println("Au AU !!!\n\n");
            break;
          case 2:
            System.out.println("BOOOM !!!:\n\n");
            break;
          case 3:
            System.out.println("Miiiau!!!\n\n");
            break;
          case 4:
            System.out.println("Piu Piu!!!\n\n");
            break;
          case 5:
            System.out.println("Blu Blu Blu !!!\n\n");
            break;
          case 0:
            v = false;
            break;
          default:
            System.out.println("Daaaahhhh este numero no te he pedido!!!\n\n");
            break;
        }
      } while(v);
      scn.close();
  }
}