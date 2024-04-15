import java.util.Scanner;

public class HolaMundo {

  public static void main(String[] args)
  {
    // scanner (entrada de datos)
    Scanner teclado = new Scanner(System.in); // Equivalente al scanf de C
    System.out.println("Esto va ser muy sencillo.");
    System.out.println("En que pais estas?");
    String pais = teclado.nextLine(); // abre para tipo string
    System.out.println("cuantos habitantes hay?");
    int poblacion = teclado.nextInt(); // abre para tipos interos
    teclado.close(); // cierra para ambos
    System.out.println("Genial vives en " + pais +" Me parece que tiene " + poblacion + " millones de habitantes.");
  }
}