package prog.unidad03.seleccion;

import java.util.Scanner;

public class AlumnoApruebaApp {

  // Nota de aprobado
  public static final double CALIFICACION_APROBADO = 5;

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // Muestra la cabecera
    System.out.println("APROBADOS Y SUSPENSOS");
    
    // Solicitamos las calificaciones de las tres evaluaciones
    System.out.print("Introduce la calificación de la primera evaluación: ");
    double calificacionEvaluacion1 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la calificación de la segunda evaluación: ");
    double calificacionEvaluacion2 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la calificación de la tercera evaluación: ");
    double calificacionEvaluacion3 = Double.parseDouble(scan.nextLine());
    
    // Calculamos la media
    double media = (calificacionEvaluacion1 + calificacionEvaluacion2 +  calificacionEvaluacion3) / 3;
    
    // Si es superior o igual a la calificación de aprobado
    if (media >= CALIFICACION_APROBADO) {
      // Mostramos el mensaje de aprobado
      System.out.println("El alumno ha aprobado con una media de " + media);
    } else {
      // O el de suspenso
      System.out.println("El alumno ha suspendido con una media de " + media);
    }
  }

}
