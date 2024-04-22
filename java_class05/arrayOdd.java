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
    
  }
}
