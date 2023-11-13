package prog.unidad03.seleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

  public static final int INFERIOR_UNA_CIFRA = 0;
  public static final int INFERIOR_DOS_CIFRAS = 10;
  public static final int INFERIOR_TRES_CIFRAS = 100;
  public static final int INFERIOR_MAS_DE_TRES_CIFRAS = 1000;

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("CIFRAS DE UN NÚMERO");
    
    // Solicitamos el número entero
    System.out.print("Introduce un número entero y te diré cuantas cifras tiene: ");
    int numero = Integer.parseInt(scan.nextLine());
    
    // Si está entre 1 y 10
    if ((numero >= INFERIOR_UNA_CIFRA) && (numero < INFERIOR_DOS_CIFRAS) ) {
      // Tiene una cifra
      System.out.println("El número " + numero + " tiene una cifra");
      // Si no tiene una cifra, tiene dos?
    } else if ((numero >= INFERIOR_DOS_CIFRAS) && (numero < INFERIOR_TRES_CIFRAS)) {
      System.out.println("El número " + numero + " tiene dos cifras");
      // Si no tiene ni una ni dos cifras, tiene tres?
    } else if ((numero >= INFERIOR_TRES_CIFRAS) && (numero < INFERIOR_MAS_DE_TRES_CIFRAS)) {
      System.out.println("El número " + numero + " tiene 3 cifras");
      // Si no tiene ni una, ni dos, ni tres debe tener cuatro o mas
    } else {
      System.out.println("El número " + numero + " tiene más de 3 cifras");
    }
  }

}
