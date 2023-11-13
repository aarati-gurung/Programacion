package prog.unidad03.seleccion;

import java.util.Scanner;

public class ClasificaTriangulosApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // Muestra la cabecera
    System.out.println("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");

    // Solicita las longitudes de los tres lados
    System.out.print("Introduce la longitud del primer lado: ");
    double lado1 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la longitud del segundo lado: ");
    double lado2 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la longitud del tercer lado: ");
    double lado3 = Double.parseDouble(scan.nextLine());
    
    // Si es equilátero
    if ((lado1 == lado2) && (lado1 == lado3)) {
      System.out.println("El triángulo es equilátero");
    } else {
      // Si es isósceles
      if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
        System.out.println("El triángulo es isósceles");
      } else {
        // Si no es ni equilatero ni isosceles debe ser escaleno
        System.out.println("El triángulo es escaleno");
      }
    }
  }

}
