package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraBasicaApp {

  // Las opciones, tanto en mayusculas como en minusculas
  public static final char OPCION_SUMA_MAYUSCULAS = 'S';
  public static final char OPCION_SUMA_MINUSCULAS = 's';
  public static final char OPCION_RESTA_MAYUSCULAS = 'R';
  public static final char OPCION_RESTA_MINUSCULAS = 'r';
  public static final char OPCION_PRODUCTO_MAYUSCULAS = 'P';
  public static final char OPCION_PRODUCTO_MINUSCULAS = 'p';
  public static final char OPCION_DIVISION_MAYUSCULAS = 'D';
  public static final char OPCION_DIVISION_MINUSCULAS = 'd';
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // Mostramos la cabecera
    System.out.println("PROGRAMA CALCULADORA BÁSICA");
    
    // Solicitamos la operación
    System.out.print("Introduce la operación a realizar (" + OPCION_SUMA_MAYUSCULAS
        + " para suma, " + OPCION_RESTA_MAYUSCULAS + " para resta, "
        + OPCION_PRODUCTO_MAYUSCULAS + " para producto y "
        + OPCION_DIVISION_MAYUSCULAS + " para división: ");
    char operacion = scan.nextLine().charAt(0);
    
    // Y ahora los operandos
    System.out.print("Introduce el primer operando: ");
    double operando1 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce el segundo operando: ");
    double operando2 = Double.parseDouble(scan.nextLine());
    
    // Según la operacion, la realiza e imprime el resultado
    switch (operacion) {
      case OPCION_SUMA_MAYUSCULAS:
      case OPCION_SUMA_MINUSCULAS: System.out.println("El resultado de sumar " + operando1 + " y " +  operando2 + " vale " + (operando1 + operando2));
        break;
      case OPCION_RESTA_MAYUSCULAS:
      case OPCION_RESTA_MINUSCULAS: System.out.println("El resultado de restar " + operando1 + " de " +  operando2 + " vale " + (operando1 - operando2));
        break;
      case OPCION_PRODUCTO_MAYUSCULAS:
      case OPCION_PRODUCTO_MINUSCULAS: System.out.println("El resultado de multiplicar " + operando1 + " por " +  operando2 + " vale " + (operando1 * operando2));
        break;
      case OPCION_DIVISION_MAYUSCULAS:
      case OPCION_DIVISION_MINUSCULAS: System.out.println("El resultado de dividir " + operando1 + " entre " +  operando2 + " vale " + (operando1 / operando2));
        break;
      // Si se llega aqui es que la operación no es válida (carácter incorrecto)
      default:  System.out.println("Operación Inválida (" + operacion + ")");
    }
  }

}
