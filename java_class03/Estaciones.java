import java.util.Scanner;

public class Estaciones {
  public static void main(String[] args) {
    System.out.println("What season of the year we are?");
    Scanner whatSeason = new Scanner(System.in);
    String season = whatSeason.nextLine();
    whatSeason.close();
    switch (season) {
      case "primavera":
      System.out.println("Me encanta la primavera");
      break;
      case "outono":
      System.out.println("Nunca me he fijado como me siento en outono.");
      break;
      case "verano":
      System.out.println("Uff hace demasiada calor, no puedo con el verano.");
      break;
      case "invierno":
      System.out.println("Hace frio, pero me encanta cuado hay chocolate caliente.");
      break;
      default:
      System.out.println("You must chose some season, or are you dead?");
      break;
    }
  }

  
}