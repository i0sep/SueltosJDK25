import java.util.Scanner;
public class ua3 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime dos palabras de mas de 5 letras: ");
        String palabra1 = skanner.next();
        String palabra2 = skanner.next();

        String last2_1 = (palabra1.length()>=5&&palabra2.length()>=5)?palabra1.substring(0,2)+palabra2.substring(2):"No se puede hacer el cambio";
        String last2_2 = (palabra1.length()>=5&&palabra2.length()>=5)?palabra2.substring(0,2)+palabra1.substring(2):"";
        System.out.println(last2_1);
        System.out.print(last2_2);

    }
}