package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculadoraSalarioApp {

  // Horas "normales" que tiene la semana
  public static final int HORAS_SEMANA = 40;
  // Precio de una hora normal
  public static final double PRECIO_HORA_NORMAL = 16;
  // Precio de una hora extra
  public static final double PRECIO_HORA_EXTRA = 20;


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // Muestra la cabecera
    System.out.println("PROGRAMA CALCULADOR DE SALARIOS");
    
    // Solicita el número de horas
    System.out.print("Introduce las horas trabajadas esta semana: ");
    int horas = Integer.parseInt(scan.nextLine());
    
    // Si el número de horas supera el número de horas "normales"
    if (horas > HORAS_SEMANA) {
      // Calculamos cuantas horas son extra (las que pasan de 40)
      int horasExtra = horas - HORAS_SEMANA;
      // Calcula el salario
      double salario = HORAS_SEMANA * PRECIO_HORA_NORMAL + horasExtra * PRECIO_HORA_EXTRA;
      // Y lo imprime
      System.out.println("El salario por trabajar " +  HORAS_SEMANA + " horas normales y " + horasExtra + " horas extra es de " + salario);
    } else {
      // NO hay horas extra
      // Calcula el salario
      double salario = horas * PRECIO_HORA_NORMAL;
      // Y lo imprime
      System.out.println("El salario por trabajar " +  horas + " horas normales sin horas extra es de " + salario);
    }
  }

}
