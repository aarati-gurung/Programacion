package prog.unidad03.repeticion;

import java.util.Scanner;

public class MayorMenorMediaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Cabecera
    System.out.println("MAYOR, MENOR Y MEDIA");

    // Solicita la cantidad de números a introducir
    System.out.print("¿Cuántos números deseas introducir?: ");
    int numeros = Integer.parseInt(sc.nextLine());

    // La cantidad debe ser al menos 1
    if (numeros > 0) {
      // Solicita el primer número
      // Lo hacemos aparte porque hay que inicializar el minimo y el máximo a este valor
      System.out.print("Introduce el número 1: ");
      double numero = Double.parseDouble(sc.nextLine());
      
      // Inicializa el mayor, menor y suma
      double mayor = numero;
      double menor = numero;
      double suma = numero;
      
      // Después leemos los siguients números
      // Para tantos números como se haya especificado menos el primero
      for (int i = 2; i <= numeros; i++) {
        // Solicita el numero i-esimo
        System.out.print("Introduce el número " + i + ": ");
        numero = Double.parseDouble(sc.nextLine());
        
        // Si es mayor que el maximo actual
        if (numero > mayor) {
          // Ahora es el nuevo maximo
          mayor = numero;
        }
        // Si es menor que el minimo actual
        if (numero < menor) {
          // Ahora es el nuevo minimo
          menor = numero;
        }
        // En cualquier caso lo añade a la suma
        suma += numero;
      }
      
      // Muestra los resultados
      System.out.println("El mayor de los números introducidos ha sido: " + mayor);
      System.out.println("El menor de los números introducidos ha sido: " + menor);
      System.out.println("La media de todos los números vale: " + (suma / numeros));
    } else {
      // Muestra mensaje de error
      System.out.println("La cantidad de números a introducir debe ser al menos uno");
    }
  }

}
