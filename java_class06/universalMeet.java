import java.util.Scanner;
import java.lang.InterruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.System;

public class universalMeet{
	
   public static void main(String[] args){
  
    writingStr("\nHola! terraquios, esta será una lista de invitados muy importate, asi que a elegir con cuidado!", 15);
    writingStr("Por la primera vez, tendremos contacto con otra raza universal!, Los Alienígenas. Vamos hacer ya la lista ?. Ya puedes elegir los nombres:\n", 15);
    Scanner scan = new Scanner(System.in);
    ArrayList<String> guestList = new ArrayList<>();
    do {
      writingStr("selecione un invitado: ", 5);
      guestList.add(scan.nextLine());
    } while (guestList.size() < 5);
      System.out.println("\n-----------------------------\n");
      writingStr("\nTu lista de invitados son: \n", 15);
      Collections.sort(guestList);
      System.out.println(guestList);
      times(1000);
      System.out.println("\n-----------------------------\n");
      writingStr("Tenemos una mala noticia!!! los invitados 2 y 3 se han cagado encima y no vendrán, deberás elegir 2 para ocupar sus puestos!\n", 25);
      guestList.remove(1);
      guestList.remove(2);
      System.out.println("\nElegir nuevos invitados: ");
      guestList.add(1, scan.nextLine());
      guestList.add(2, scan.nextLine());
      System.out.println("\n-----------------------------\n");
      writingStr("Nueva lista de invitados:", 35);
      times(2000);
      System.out.println("\nTu lista actualizada de invitados son: ");
      System.out.println(guestList);
      times(2000);
      writingStr("Otra persona no va a venir, la persona del final de la lista, no se encuentra muy bien. Sustituirla ok, a quién pondrás?\n", 15);
      guestList.remove(guestList.size()-1);
      guestList.add(guestList.size(), scan.nextLine());
      System.out.print("\nAtualizando lista\n");
      writingStr(".....", 300);
      System.out.println("\nLista Atualizada!");
      System.out.println(guestList);
      times(1000);
      writingStr("Parece que el tercer de la lista no vendrá, vendrá su hermano. Ya he añadido a Ezequiel\n", 15);
      guestList.remove(2);
      guestList.add(2, "Ezequiel");
      times(2000);
      System.out.println("\nLista Atualizada!");
      System.out.println(guestList);
      scan.close();
  }

  public static void times(int t){
      try{
            Thread.sleep(t);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void writingStr(String str, int t){
      try{
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            Thread.sleep(t);
        }
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
  }

}
