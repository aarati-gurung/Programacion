package prog.unidad03.seleccion;

import java.util.Scanner;

public class NombreMesesApp {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("NOMBRES DE MES");
    
    // Solicita el numero del mes
    System.out.print("Introduce un número entero del 1 al 12 y te diré que mes ocupa esa posición: ");
    int posicionMes = Integer.parseInt(sc.nextLine());
    
    // Iniciamos el nombre del mes a la cadena vacía (se cambiará dentro del switch)
    String nombreMes = "";
    
    // Según el número de mes, obtiene el nombre correspondiente
    switch (posicionMes) {
      case 1: nombreMes = "Enero";
      break;
      case 2: nombreMes = "Febrero";
      break;
      case 3: nombreMes = "Marzo";
      break;
      case 4: nombreMes = "Abril";
      break;
      case 5: nombreMes = "Mayo";
      break;
      case 6: nombreMes = "Junio";
      break;
      case 7: nombreMes = "Julio";
      break;
      case 8: nombreMes = "Agosto";
      break;
      case 9: nombreMes = "Septiembre";
      break;
      case 10: nombreMes = "Octubre";
      break;
      case 11: nombreMes = "Noviembre";
      break;
      case 12: nombreMes = "Diciembre";
      break;
    }
    
    // IMprime el nombre del mes
    System.out.println("El mes con posición " + posicionMes + " tiene el nombre \"" + nombreMes + "\"");
  }

}
