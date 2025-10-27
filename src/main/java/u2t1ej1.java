import java.util.EnumSet;
import java.util.Scanner;
/*
Definir un tipo enumerado llamado DiaSemana con los valores: LUNES, MARTES,
MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO.
○ Pedir al usuari@ (por teclado) un día de la semana (si no es un día de la
semana, seguir pidiendo).
○ Según el día introducido, utilizar un switch para mostrar un mensaje
diferente:
■ De lunes a viernes: “Día de clase”.
■ Sábado: “Día de descanso activo”.
■ Domingo: “Día de relax total”
 */
public class u2t1ej1 {
    public enum laSemana {
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
        laSemana diaSemana = null;
        String dia = "";

        do {
        System.out.print("Dime un día de la semana: ");
        dia = skanner.nextLine().toUpperCase();
        diaSemana = laSemana.valueOf();
        }while (diaSemana==null);

        switch (diaSemana){
            case LUNES, MARTES, MIERCOLES, JUEVES, VIERNES:
                System.out.print("Día de clase");
                break;
            case laSemana.SABADO:
                System.out.print("Día de descanso activo");
                break;
            case laSemana.DOMINGO:
                System.out.print("Día de relax total");
        }

    }
}
