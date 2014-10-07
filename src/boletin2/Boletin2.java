
package boletin2;

import java.util.Scanner;


public class Boletin2 {

  
    public static void main(String[] args) {
    float euros, dolares;
    System.out.println("euros");
    Scanner dato = new Scanner (System.in);
    euros=dato.nextFloat();
    dolares = (float) (euros*1.448);
    System.out.println("el cambio en dolares es igual a" +dolares);
    }
    
}
Gay