import java.util.*;
import java.util.Arrays;

public class fiesta{
  
  public static void main(String[] args){
   
    ArrayList<String> listguests = new ArrayList<>(Arrays.asList("Michael", "Eva", "Ana", "Carlos", "Maria", "Laura", "Juan", "Guillem", "Anna", "Wen"));
    writingStr("\nLa fiesta em mi casa será esta noche, y esta es mi lista oficial\n\n",0);
    System.out.println("Lista de Invitados: "+listguests);
    times(5000);
    writingStr("\nMichael, que estaba el primero de la lista, resulta que está de viaje y no puede venir\n", 15);
    listguests.remove(0);
    System.out.print("OK, actualizando lista");
    writingStr("......\n", 500);
    System.out.println("Michael removido!");
    System.out.println("Lista de Invitados Actualizada: "+listguests);
    times(5000);
    writingStr("\n\nTe llama la Pepi que se apunta con su novio Silvester\n\n", 50);
    System.out.print("OK, actualizando lista");
    writingStr("......\n", 500);
    listguests.add("Pepi");
    listguests.add("Silvester");
    times(5000);
    System.out.println("Lista de Invitados Actualizada: "+listguests);
    writingStr("\n\nTe encuentras a Eva, que dice que le cueles la tercera\n", 50);
    System.out.print("OK, actualizando lista");
    writingStr("......\n", 500);
    if(listguests.contains("Eva")){
      int index = listguests.indexOf("Eva");
      listguests.remove(index);
      String replace = listguests.get(2);
      listguests.remove(2);
      listguests.add(index, replace);
      listguests.add(2, "Eva");
      System.out.println("Lista de Invitados Actualizada: "+listguests);
    } else
        System.out.println("\nOhh Eva no estaba en la lista, vaya que lío!");
    times(5000);
    writingStr("\nHay 10 personas más que vienen de la fiesta del vecino, debido a que nuestra musica mola bastante!\n", 80);
    ArrayList<String> guestList = new ArrayList<>(Arrays.asList("Lucas, Vanessa, Adriana, Manuel, José Luis, Leonis, Layane, Geovanna, Pierre, Julio"));
    System.out.println();
    System.out.println("Estos son los recién llegados de la fiesta al lado, vamos añadirles:");
    System.out.println(guestList);
    System.out.print("OK, actualizando lista y ordenando en orden Alfabetica");
    writingStr("......\n", 500);
    times(3000);
    listguests.addAll(guestList);
    Collections.sort(listguests);
    System.out.println("\nLista de Invitados Actualizada: "+listguests);
    writingStr("Ultimo de la lista: " + (listguests.size()-1), 25);
    System.out.println();
    writingStr("No se ha olvidado de tu amigo Pedro verdad? \n\nVamos a ver si está en la Lista!.", 80);
    times(3000);
    System.out.println("Buscando a Pedro en la lista");
    writingStr(".........", 80);
    if(listguests.contains("Pedro"))
      System.out.println("Sí, Pedro está en la lista!");
    else
      System.out.println("Pedro no está en la lista!");

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
