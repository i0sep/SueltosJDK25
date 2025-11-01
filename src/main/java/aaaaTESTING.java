import java.util.Scanner;
public class aaaaTESTING {
    public enum laSemana {                                         //crea la enumeracion
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        laSemana diaSemana = null;                                //crea una variable con el tipo enum
        String dia = "";                                          //crea una variable string
        boolean coincide = false;                                 //crea un check
        System.out.print("Dime un día de la semana: ");
        do {
            dia = skanner.nextLine().toUpperCase();               //recibe y cambia la variable a uppercase
            if (diaSemana == laSemana.valueOf(dia)){
                coincide = true;
            }
            if (!coincide) {                                      //Si el check es falso imprime texto de error
                System.out.print("No es un día válido. Inténtalo de nuevo: ");
            }
        }while (!coincide);                                       //Si el check es falso vuelve a hacer todo otra vez.


        switch (diaSemana){                                       //Compara la variable enum, y segun los casos hace una cosa o otra
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES:
                System.out.print("Día de clase");
                break;
            case SABADO:
                System.out.print("Día de descanso activo");
                break;
            case DOMINGO:
                System.out.print("Día de relax total");
                break;
        }

        skanner.close();                                          //Sugerencia del profesor poner al final skanner cuando no lo vayamos a usar
    }
}
