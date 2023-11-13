package prog.unidad03.seleccion;

import java.util.Scanner;

public class SituacionAlumnoApp {

  // Nota de aprobado
  public static final double CALIFICACION_APROBADO = 5;

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // Mostramos la cabecera
    System.out.println("PROMOCIONA O NO PROMOCIONA");

    // Solicitamos las dos calificaciones
    System.out.print("Introduce la calificación de Matemáticas: ");
    double calificacionMatematicas = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la calificación de Lengua: ");
    double calificacionLengua = Double.parseDouble(scan.nextLine());
    
    
    // Si no ha suspendido ninguna
    if ((calificacionMatematicas >= CALIFICACION_APROBADO) && (calificacionLengua >= CALIFICACION_APROBADO)) {
      // Mostramos el mensaje de promocion
      System.out.println("EL alumno promociona sin asignaturas pendientes");
      // Si no ha suspendido ninguna. Ha suspendido solo una?
    } else  if (((calificacionMatematicas >= CALIFICACION_APROBADO) && (calificacionLengua < CALIFICACION_APROBADO))
            || ((calificacionMatematicas < CALIFICACION_APROBADO) && (calificacionLengua >= CALIFICACION_APROBADO))) {
        // Si esto es asi, promociona pero con una asignatura
        System.out.println("El alumno promociona con una asignatura pendiente");
    } else {
      // Si llegamos aqui es que ha suspendido más de una
      System.out.println("El alumno repite");
    }
  }

}
