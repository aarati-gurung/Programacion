package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Cabecera
    System.out.println("CUENTA PARES");
    
    // Solicita la cantidad de números pares a introducir
    System.out.print("¿Cuántos números pares deseas introducir?: ");
    int cantidadPares = Integer.parseInt(sc.nextLine());
    
    // Inicia la cuenta de los pares
    int paresHastaAhora = 0;
    
    // Mientras no se hayan introducido los pares especificados
    while (paresHastaAhora < cantidadPares) {
      // Solicita un número
      System.out.print("Introduce un número entero: ");
      int numero = Integer.parseInt(sc.nextLine());
      if (numero % 2 == 0) {
        paresHastaAhora++;
        if (paresHastaAhora < cantidadPares) {
          System.out.println("Te quedan " + (cantidadPares - paresHastaAhora) + " números pares por introducir");
        } else {
          System.out.println("¡Ya has introducido " + cantidadPares + " números pares!");
        }
      }
    }
  }

}
