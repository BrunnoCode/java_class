import java.util.Random;
import java.util.Scanner;

public class arrayRandomNum {
    public static void main(String[] args){
    System.out.println("Insert a Size of array to fill?");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    scan.close();
    int[] arr = new int[size];
    Random random = new Random();
    for (int i = 0; i < arr.length; i++){
      arr[i] = random.nextInt(20);
    }
    System.out.println();
    for (int num : arr){
      System.out.print(num + ", ");
    }
    System.out.println();
  }
}