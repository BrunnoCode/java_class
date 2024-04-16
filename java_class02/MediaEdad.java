import java.util.Scanner;

public class MediaEdad{
   public static void main(String[] args){
		  Scanner edadPadres = new Scanner(System.in);
		  Scanner nombre = new Scanner(System.in);
		  String nMadre, nPadre;
		  System.out.println("Que edad tiene tu padre?");
		  int padre = edadPadres.nextInt();
			System.out.println("Cómo se llama tu padre ?");
			nPadre = nombre.nextLine();
			System.out.println("Que edad tiene tu madre?");
			int madre = edadPadres.nextInt();
			System.out.println("Cómo se llama tu madre ?");
			nMadre = nombre.nextLine();
			edadPadres.close();
			nombre.close();
			float mediaEdad = (padre+madre);
			System.out.println("Tu Madre se llama " + nMadre + " e tiene " + madre + " años, e tu padre se llama " + nPadre + " e tiene " + padre + " años, La media de Edad entre tus padres es: " + mediaEdad/2);
	  }
}
