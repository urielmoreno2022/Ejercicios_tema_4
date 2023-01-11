
package ejercicios_tema_4;

/**
 *
 * @author Uriel
 */
public class Ejercicios_tema_4 {

    
    public static void main(String[] args) {
        int numeroIf = 2;
        if (numeroIf > 0){
            System.out.println("el numero es positivo");
        } else if (numeroIf < 0)  {
            System.out.println("el numero es negativo");
        }
        else {
        System.out.println("el numero es cero(neutro)");
        }
        System.out.println("*************************");
        int numeroWhile = 0;
        while (numeroWhile <3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("*************************");
        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);
        System.out.println("*************************");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("*************************");
        var estacion = "invierno";
        switch (estacion){
            case "verano" -> System.out.println("Estamos en verano");
            case "otoño" -> System.out.println("Estamos en otoño");
            case "primvavera" -> System.out.println("Estamos en primvavera");
            case "invierno" -> System.out.println("Estamos en invierno");
            default -> System.out.println("Lo siento, No es una estacion");
        }
    }
    
}
