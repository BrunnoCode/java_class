import java.util.Scanner;

public class CacatuaCacahuete{
  public static void main(String[] args){
    Scanner scan = new  Scanner(System.in);
    System.out.println("Hola, Tienes una Cacatua, cuide bién de ella!");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    int comida = 0;
    int cantidad = 0;
    do {
      comida = askForFood(scan);
      if (comida > 0){
        System.out.println("Esto si es cacahuete\uD83D\uDE00, cúantos hay?");
        cantidad = scan.nextInt();
        if (cantidad < 10){
          System.out.println("Miserable, esto es muy poco, pero dormiré y breve me despertaré\uD83E\uDD26️!!!");
          dormindo(cantidad);
        } else {
            System.out.println("dormiendo feli\uD83D\uDCA4...");
            dormindo(cantidad);
          }
      } 
      if(comida == 0) {
            System.out.println("Esto no es cacahuete, DAME CACAHUETE!!! o escriba salir y dejame en paz con hambre \uD83D\uDE21");
            times(1000);
      }
      comida = askForFood(scan);
    } while(comida != 2);
    scan.close();
  }
  public static void times(int t){
    try{
          Thread.sleep(t);
  } catch(InterruptedException e) {
    e.printStackTrace();
  }
}
  public static int askForFood(Scanner scan){
    int res = 0;
    String usr;
    System.out.println("Qué comida me das\uD83D\uDE05?");
    usr = scan.nextLine();
    if(usr.equalsIgnoreCase("cacahuete"))
      res = 1;
    if (!usr.equalsIgnoreCase("cacahuete"))
      res = 0;
    if(usr.equalsIgnoreCase("salir"))
      res = 2;
    return res;
  }
  public static void dormindo(int t){
    try{
      for (int i = 0; i < 10; i++){
        System.out.print("zZ");
        Thread.sleep((t*100));
      }
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("\nhe despertado, tengo hambre de nuevo\uD83D\uDE0B");
  }
}