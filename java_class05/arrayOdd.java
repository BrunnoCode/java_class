import java.util.Scanner;

public class arrayOdd {
  public static  void main(String[] args){
    System.out.println("Creamos un array, elija un tamanho del array?");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int arrayUser[] = new int[size];
    System.out.println("Ponemos numeros dentro del array?");
    for (int i = 0; i < arrayUser.length; i++){
      if (i == 0)
        System.out.println("Inserte un numero?");
      else if(i > 0 && i < arrayUser.length)
        System.out.println("otro numero");
      arrayUser[i] = scan.nextInt();
    }
    System.out.println("Array completado:");
    for (int num : arrayUser){
      System.out.print(num + ", ");
    }
    System.out.println("\nPresione qualquer digito para continuar.");
    scan.nextInt();
    System.out.println("Ahora vamos separarlo por impares y pares?, se si presione 1, no presione 0");
    int res = scan.nextInt();
    if (res == 1)
    { 
      int oddArray[] = {0};
      int evenArray[] = {0};
      int j = 0;
      for (int i = 0; i < arrayUser.length; i++){
        if (arrayUser[i] % 2 == 0)
          evenArray[i] = arrayUser[i];
        else
          oddArray[j] = arrayUser[j++];
      }
      System.out.println("Array Original");
      for (int index : arrayUser){
        System.out.print(index + ", ");
      }
      System.out.println("Array de Pares");
      for (int index : evenArray){
        System.out.print(index + ", ");
      }
      System.out.println("Array de Impares");
      for (int index : oddArray){
        System.out.print(index + ", ");
      }
    }else {
      System.out.println("Programa finalizado");
      scan.close();
    }
  }
}
