/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package formatosstring;

/**
 *
 * @author juan bonilla
 */
public class FormatosString {

    public static void main(String[] args) {
        
        int edad= 25;
        float altura= 1.80f;
        double valorDePi= 3.141592221212211;
        long distanciaAlSol= 7278228282828828282L;
        boolean isDay=false;
        char miInicial='e';
        
        System.out.println(String.format("mi edad es %d %d",edad,70));// aqui podemos observar un formato de impresion en java
        
        System.out.println("Mi altura es " + altura);
        
        System.out.println(String.format("mi altura es %.2",altura));// metodo usado para imprimir solo dos decimales
        
        System.out.println(String.format("mi altura es %.5",valorDePi));
        
        
    }
}
