package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculaImporteApp {

  // Nota de aprobado
  public static final double PORCENTAJE_DESCUENTO = 20.0 / 100.0;
  public static final double IMPORTE_MINIMO_DESCUENTO = 100.0;
  

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    // Muestra cabecera
    System.out.println("DESCUENTOS AL COMPRAR");
    
    // Solicitamos el importe de la compra
    System.out.print("Introduce el importe de la compra en euros: ");
    double importeInicial = Double.parseDouble(scan.nextLine());
    
    // Si es superior al importe que tiene descuento
    if (importeInicial > IMPORTE_MINIMO_DESCUENTO) {
      // Calculamos el importe con descuento y se imprime
      double importeConDescuento = importeInicial - (importeInicial * PORCENTAJE_DESCUENTO);
      System.out.println("Como la compra es superior a " + IMPORTE_MINIMO_DESCUENTO + " la compra tiene un descuento del " + (PORCENTAJE_DESCUENTO * 100) + "% de descuento. El importe a pagar es de " + importeConDescuento);
    } else {
      // No tiene descuento. El importe queda tal cual
      System.out.println("Como la compra no es superior a " + IMPORTE_MINIMO_DESCUENTO + " la compra no tiene descuento. El importe a pagar es de " + importeInicial);
    }
  }

}
