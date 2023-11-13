package prog.unidad03.repeticion;

import java.util.Scanner;

public class SumaIntervaloApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Cabecera
    System.out.println("SUMA DE UN INTERVALO");

    // Números de inicio y fin. Se declaran aqui porque se usan después del do-while
    int numeroInicio;
    int numeroFin;
    // Solicita los dos números (lo hace en bucle hasta que los números sean correctos)
    do {
      System.out.print("Introduce el número de comienzo del intervalo: ");
      numeroInicio = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      numeroFin = Integer.parseInt(sc.nextLine());
      // Si los números no son correctos muestra un mensaje
      if (numeroInicio > numeroFin) {
        System.out.println("Error. El número de inicio (" + numeroInicio + ") debe ser menor o igual al de final (" + numeroFin + "). Inténtelo de nuevo.");  
      }
    } while (numeroInicio > numeroFin);
 
    // Aqui se va almacenando la suma
    int suma = 0;
    // Para cada número del intervalo
    for (int i = numeroInicio; i <= numeroFin; i++) {
      // Añade el número a la suma
      suma += i;
    }
    
    // Muestra el resultado
    System.out.println("La suma de los números desde el " + numeroInicio + " hasta " + numeroFin + " vale " + suma);
  }

}
