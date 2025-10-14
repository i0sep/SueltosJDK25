import java.util.Scanner;
public class ua5 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime un número de 6 cifras: ");
        int num = skanner.nextInt();
        String Snum = String.valueOf(num);

        String suma = (Snum.length()>6&&Snum.length()<=5)?(num<500000)?izqDerech(String.valueOf(num)):derechIzq(String.valueOf(num)):"El número no tiene 6 cifras";
        System.out.print(suma);
    }

    public static String izqDerech(String n1){
        n1 = n1.substring(2);

        return n1;
    }

    public static String derechIzq(String n1){
        return n1;
    }


}