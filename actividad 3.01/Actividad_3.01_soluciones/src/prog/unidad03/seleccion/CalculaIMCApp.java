package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculaIMCApp {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // Mostramos cabecera
    System.out.println("PROGRAMA DE CÁLCULO DE ÍNDICE DE MASA CORPORAL");
    
    // Solicitamos peso y altura
    System.out.print("Introduce tu peso (en kg): ");
    double peso = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce tu altura (en metros): ");
    double altura = Double.parseDouble(scan.nextLine());
    
    // Calculamos el imc
    double imc = peso / (altura * altura);
    
    // Obtenemos el mensaje según el IMC
    String mensaje = "";
    if (imc < 16) {
      mensaje = "Ingreso en hospital por infrapeso";
    } else {
      if ((imc >= 16) && (imc < 17)) {
        mensaje = "Infrapeso";
      } else {
        if ((imc >= 17) && (imc < 18)) {
          mensaje = "Bajo peso";
        } else {
          if ((imc >= 18) && (imc < 25)) {
            mensaje = "Peso normal (saludable)";
          } else {
            if ((imc >= 25) && (imc < 30)) {
              mensaje = "Sobrepeso (obesidad de grado I)";
            } else {
              if ((imc >= 30) && (imc < 35)) {
                mensaje = "Sobrepeso crónico (obesidad de grado II)";
              } else {
                if ((imc >= 35) && (imc <= 40)) {
                  mensaje = "Obesidad premórbida (obesidad de grado III)";
                } else {
                  mensaje = "Obesidad mórbida (obesidad de grado IV)";
                }
              }
            }
          }
        }
      }
    }
    
    // Imprimimos el mensaje obtenido
    System.out.println("Su IMC es de " + imc + ", con un diagnóstico de " + mensaje);
  }

}
