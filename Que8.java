//By: Parth Panjwani      
import java.util.*;

public class Que8 {
    public static void main(String args) {

        Scanner choice = new Scanner(System.in);
        int sc = choice.nextInt();
        switch (sc) {
            case 12:
            case 1:
            case 2:
                System.out.println("WINTER");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("SPRING");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("SUMMER");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("AUTUMN");
                break;
            default:

                System.out.println("Invalid Month number");
                break;
        }
        System.out.println("For Month number: "
                + sc);
    }

}