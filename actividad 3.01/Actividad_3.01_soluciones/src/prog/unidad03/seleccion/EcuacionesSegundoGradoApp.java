package prog.unidad03.seleccion;

import java.util.Scanner;

public class EcuacionesSegundoGradoApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Mostramos cabecera
    System.out.println("PROGRAMA DE CÁLCULO DE ECUACIONES DE SEGUNDO GRADO");
    
    // Solicitamos los tres coeficientes
    System.out.print("Introduce el valor del coeficiente a: ");
    double a = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce el valor del coeficiente b: ");
    double b = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce el valor del coeficiente c: ");
    double c = Double.parseDouble(scan.nextLine());
    
    // Calcula el determinante de la ecuación
    double determinante = (b * b) - (4 * a * c);
    
    // Si el determinante es positivo
    if (determinante > 0) {
      // Tenemos dos raices. Las calcula y muestra
      double raiz1 = (-b + Math.sqrt(determinante)) / (2 * a);
      double raiz2 = (-b - Math.sqrt(determinante)) / (2 * a);
      System.out.println("La ecuación tiene dos soluciones reales. La primera vale " +  raiz1 + " y la segunda vale " + raiz2);
    } else {
      // Si el determinante no es positivo
      // Es cero?
      if (determinante == 0) {
        // Si es cero, calculamos usando la fórmula simple
        double raiz = (-b) / (2 * a);
        System.out.println("La ecuación tiene sólo una solución real y vale " + raiz);
      } else {
        // Si se llega aqui es que el determinante es negativo y por tanto NO hay soluciones reales
        System.out.println("La ecuación no tiene soluciones reales");
      }
    }
  }

}
