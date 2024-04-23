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
    System.out.println("\n----------------------------------\n");
    System.out.println("Ahora vamos separarlo por impares y pares?, se si presione 1, no presione 0");
    int res = scan.nextInt(); System.out.println("\n----------------------------------\n");
    if (res == 1)
    { 
      int j = 0;
      int k = 0;
      for (int i = 0; i < arrayUser.length; i++){
        if (arrayUser[i] % 2 == 0)
          k++;
        else
          j++;
      }
      int evenArray[] = new int[k];
      int oddArray[] = new int[j];
      int i = 0; k = 0; j = 0;
      while(i < arrayUser.length){
        if (arrayUser[i] % 2 == 0)
          evenArray[k++] = arrayUser[i];
        else
          oddArray[j++] = arrayUser[i];
        i++;
      }

      System.out.println("Array Original");
      for (int indexUsr : arrayUser){
        System.out.print(indexUsr + "| ");
      } System.out.println("\n----------------------------------\n");
      System.out.println("Array de Pares");
      for (int indexEven : evenArray){
        System.out.print(indexEven + "| ");
      } System.out.println("\n----------------------------------\n");
      System.out.println("Array de Impares");
      for (int indexOdd : oddArray){
        System.out.print(indexOdd + "| ");
      }System.out.println("\n----------------------------------\n");
    }else {
      System.out.println("Programa finalizado");
      scan.close();
    }
  }
}
