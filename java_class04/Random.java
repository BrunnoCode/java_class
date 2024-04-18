import java.util.Scanner;

public	class Random{

   public static void main(String[] args)
   {
      int num = (int) Math.floor(Math.random() * 10 + 1);
      Scanner scanner = new Scanner(System.in);
      int tentativas = 0;
      int random;

      do {
         System.out.println("Nuevo intento!");
         random = scanner.nextInt();
         tentativas++;

      } while(random != num);
      if (num == random)
         System.out.println("has acertado el numero :) numero de tentativas: " + tentativas);
      scanner.close();
   }
}
