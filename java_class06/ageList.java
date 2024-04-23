import java.util.ArrayList;

public class ageList {

  public static void main(String[] args){
    ArrayList<Integer> listOfAge = new ArrayList<>();
    for (int i = 20; i <= 50; i++){
      listOfAge.add(i);
    }
    for (Integer e : listOfAge){
      System.out.print(e+" | ");
    }
    System.out.println();
  }
}