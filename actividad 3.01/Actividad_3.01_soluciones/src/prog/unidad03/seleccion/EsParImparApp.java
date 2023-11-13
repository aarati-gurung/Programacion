package prog.unidad03.seleccion;

import java.util.Scanner;

public class EsParImparApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("¿PAR o IMPAR?");
    
    // Solicitamos el número
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    
    // Imprimimos la primera parte
    System.out.print("El número " + numero + " es ");
    
    // Calculamos la segunda
    // Si el numero es par
    if (numero % 2 == 0) {
      // Imprimimos par
      System.out.println("par");
    } else {
      // Si no imprimimos impar
      System.out.println("impar");
    }
    
    // Todo esto se podría haber hecho también usando
    // System.out.println("El número " + numero + " es " + ((numero % 2 == 0) ? "par" : "impar"));
  }

}
