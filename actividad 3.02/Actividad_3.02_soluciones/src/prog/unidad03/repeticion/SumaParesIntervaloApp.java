package prog.unidad03.repeticion;

import java.util.Scanner;

public class SumaParesIntervaloApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Muestra la cabecera
    System.out.println("SUMA DE PARES EN UN INTERVALO");

    // Números de inicio y fin de intervalo (se declaran aqui porque se necesitan después del do-while
    int numeroInicio;
    int numeroFin;
    // Solicita los dos números (lo hace en bucle hasta que los números sean correctos)
    do {
      System.out.print("Introduce el número de comienzo del intervalo: ");
      numeroInicio = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      numeroFin = Integer.parseInt(sc.nextLine());
      if (numeroInicio > numeroFin) {
        System.out.println("Error. El número de inicio (" + numeroInicio + ") debe ser menor o igual al de final (" + numeroFin + "). Inténtelo de nuevo.");  
      }
    } while (numeroInicio > numeroFin);
    
    // Inicializa la suma
    int suma = 0;
    
    // Para cada número del intervalo
    for (int i = numeroInicio; i <= numeroFin; i++) {
      // Si es par
      if (i % 2 == 0) {
        // Lo añade a la suma
        suma += i;
      }
    }

    // Muestra el resultado
    System.out.println("La suma de los números pares comprendidos entre " + numeroInicio + " y " + numeroFin + " vale " + suma);
  }
}
