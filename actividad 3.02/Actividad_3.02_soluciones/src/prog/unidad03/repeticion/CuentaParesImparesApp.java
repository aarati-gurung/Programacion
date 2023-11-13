package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesImparesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Cabecera
    System.out.println("CUENTA PARES O IMPARES");
    
    // Solicita la cantidad de números a introducir
    System.out.print("¿Cuántos números deseas introducir?: ");
    int numeros = Integer.parseInt(sc.nextLine());
    
    // Contadores inicializados a cero
    int contadorPares = 0;
    int contadorImpares = 0;
    
    // Para tantos números como se haya especificado
    for (int i = 1; i <= numeros; i++) {
      // Solicita el número
      System.out.print("Introduce el número " + i + ": ");
      int numero = Integer.parseInt(sc.nextLine());
      
      // Si es par o impar imprime el mensaje correspondiente
      if (numero % 2 == 0) {
        System.out.println("El número " + numero + " es par");
        contadorPares++;
      } else {
        System.out.println("El número " + numero + " es impar");
        contadorImpares++;
      }
    }
    
    // Muestra los resultados
    System.out.println("Se han introducido " + contadorPares + " números pares y " + contadorImpares + " números impares");
    System.out.println("Fin del programa");
  }

}
