/*
 * 3-Implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado . 
 * Asegurate que estos valores sexan positivos , para eso valida os datos .
 */
package boletin9.pkg3;


public class Boletin93 {

    
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        float base, altura;
        
        base=rectangulo1.validarFloat();
        altura=rectangulo1.validarFloat();
        
        rectangulo1.area(base, altura);
    }
    
}
