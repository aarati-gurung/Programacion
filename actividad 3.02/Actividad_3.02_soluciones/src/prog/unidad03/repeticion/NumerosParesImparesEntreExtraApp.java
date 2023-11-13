package prog.unidad03.repeticion;

import java.util.Scanner;

public class NumerosParesImparesEntreExtraApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Muestra la cabecera
    System.out.println("PARES O IMPARES EN UN INTERVALO");

    // Números de inicio y fin. Hay que declararlos aqui porque se van a usar despues del
    // ciclo do-while y por lo tanto no se pueden declarar dentro
    int numeroInicio;
    int numeroFin;
    // Solicita los dos números (lo hace en bucle mientras los números sean incorrectos
    do {
      // Solicita los números
      System.out.print("Introduce el número de comienzo del intervalo: ");
      numeroInicio = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      numeroFin = Integer.parseInt(sc.nextLine());
      // Si los números no son válidos
      if (numeroInicio > numeroFin) {
        // Muestra un mensaje para que el usuario sepa que está ocurriendo
        System.out.println("Error. El número de inicio (" + numeroInicio + ") debe ser menor o igual al de final (" + numeroFin + "). Inténtelo de nuevo.");  
      }
    } while (numeroInicio > numeroFin);
    
    // Esta parte es igual a la del programa original
    // Para cada número del intervalo
    for (int i = numeroInicio; i <= numeroFin; i++) {
      // Si es par o impar imprime el mensaje correspondiente
      if (i % 2 == 0) {
        System.out.println("El número " + i + " es par");
      } else {
        System.out.println("El número " + i + " es impar");
      }
    }
  }

}
