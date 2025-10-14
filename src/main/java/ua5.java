import java.util.Scanner;
public class ua5 {
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        System.out.print("Dime un número de 6 cifras: ");
        int num = skanner.nextInt();
        String Snum = String.valueOf(num);

        int suma = (Snum.length()>6&&Snum.length()<=5)?(num<500000)?izqDerech(num):derechIzq(num):0;
        //int suma =(num<500000)?izqDerech(num):derechIzq(num);



    }

    public static int    izqDerech(int n1){
        String num1 = String.valueOf(n1);
        num1 = num1.substring(0,2);
        return n1;
    }

    public static int derechIzq(int n1){
        int Fahrenheit = (n1 * 9/5) + 32;
        return Fahrenheit;
    }


}