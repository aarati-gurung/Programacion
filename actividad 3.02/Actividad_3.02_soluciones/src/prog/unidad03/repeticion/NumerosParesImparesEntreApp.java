package prog.unidad03.repeticion;

import java.util.Scanner;

public class NumerosParesImparesEntreApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Muestra la cabecera
    System.out.println("PARES O IMPARES EN UN INTERVALO");
    
    // Solicita los dos números
    System.out.print("Introduce el número de comienzo del intervalo: ");
    int numeroInicio = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el número de fin del intervalo: ");
    int numeroFin = Integer.parseInt(sc.nextLine());
    
    // Si el número de inicio es menor o igual al de fin
    if (numeroInicio <= numeroFin) {
      // Para cada número del intervalo
      for (int i = numeroInicio; i <= numeroFin; i++) {
        // Si es par o impar imprime el mensaje correspondiente
        if (i % 2 == 0) {
          System.out.println("El número " + i + " es par");
        } else {
          System.out.println("El número " + i + " es impar");
        }
      }
    } else {
      // El numero de inicio del intervalo no es menor o igual al de fin
      // Muestra mensaje de error
      System.out.println("Error. El número de inicio (" + numeroInicio + ") debe ser menor o igual al de final (" + numeroFin + ")");
    }
  }
}
