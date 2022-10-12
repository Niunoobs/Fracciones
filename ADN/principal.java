package ADN;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        adnDoubleStrand Lista = new adnDoubleStrand();


        Lista.insertAtFront('A');
        Lista.insetAtPos('T',1);
        Lista.insetAtPos('C',2);
        Lista.insetAtPos('G',3);
        



        System.out.println(Lista.toString());

        Lista.ADN(0);
        Lista.ADN(2);


        System.out.println(Lista.toString());

        //Scanner teclado = new Scanner(System.in);

        //System.out.println("Dame una secuencia de ADN");
        //String adnString = (teclado.nextLine()).toUpperCase();
        //System.out.println("La cade de ADN: ")+adnString();
    }
    
}
