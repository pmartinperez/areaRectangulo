package boletin9.pkg3;

import java.util.Scanner;

/**
 * Pide un dato float y calcula area de un rectangulo
 *
 * @author Patricia
 * @version 3
 */
public class Rectangulo {

    public Rectangulo() {

    }

    /**
     * Pide un dato y comprueba si es de tipo float
     *
     * @return devuelve un numero float
     */
    public float validarFloat() {
        Scanner dato = new Scanner(System.in);
        float numero;

        do {
            System.out.println("Introduce dato: ");
            numero = dato.nextFloat();
            if (numero < 0) {
                System.out.println("Intoduce numero positivo");
            }
        } while (numero < 0);

        return numero;
    }

    /**
     * Calcula area del rectangulo
     *
     * @param b base del rectangulo
     * @param a altura del rectangulo
     */
    public void area(float b, float a) {
        System.out.println(b * a);

    }

}
