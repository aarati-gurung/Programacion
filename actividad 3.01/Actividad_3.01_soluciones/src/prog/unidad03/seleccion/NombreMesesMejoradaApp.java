package prog.unidad03.seleccion;

import java.util.Scanner;

public class NombreMesesMejoradaApp {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    // Mostramos la cabecera
    System.out.println("NOMBRES DE MES II");
    
    // Solicitamos la posición del mes
    System.out.print("Introduce un número entero del 1 al 12 y te diré que mes ocupa esa posición: ");
    int posicionMes = Integer.parseInt(sc.nextLine());

    // Iniciamos el mensaje a blanco para que se pueda usar después del switch
    String mensaje;
    
    // Según la posición, calculamos el mensaje idóneo. Ahora no podemos usar el mismo comienzo porque el caso default nos lo fastidia
    switch (posicionMes) {
      case 1: mensaje = "El nombre del mes con posición 1 es \"Enero\"";
      break;
      case 2: mensaje = "El nombre del mes con posición 2 es \"Febrero\"";
      break;
      case 3: mensaje = "El nombre del mes con posición 3 es \"Marzo\"";
      break;
      case 4: mensaje = "El nombre del mes con posición 4 es \"Abril\"";
      break;
      case 5: mensaje = "El nombre del mes con posición 5 es \"Mayo\"";
      break;
      case 6: mensaje = "El nombre del mes con posición 6 es \"Junio\"";
      break;
      case 7: mensaje = "El nombre del mes con posición 7 es \"Julio\"";
      break;
      case 8: mensaje = "El nombre del mes con posición 8 es \"Agosto\"";
      break;
      case 9: mensaje = "El nombre del mes con posición 9 es \"Septiembre\"";
      break;
      case 10: mensaje = "El nombre del mes con posición 10 es \"Octubre\"";
      break;
      case 11: mensaje = "El nombre del mes con posición 11 es \"Noviembre\"";
      break;
      case 12: mensaje = "El nombre del mes con posición 12 es \"Diciembre\"";
      break;
      default: mensaje = "Introdujiste una posición no válida. Debe ser un número entre 1 y 12, ambos inclusive";
      break;
    }
    
    // Imprimimos el mensaje
    System.out.println(mensaje);
  }

}
