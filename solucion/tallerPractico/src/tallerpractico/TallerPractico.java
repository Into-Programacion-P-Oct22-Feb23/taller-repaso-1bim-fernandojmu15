/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerpractico;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class TallerPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador = 1;
        String ciudad;
        String nombre;
        int cedula;
        double horasMatutinas;
        double horasNocturnas;
        double valorDia = 10;
        double valorNoche = 15;
        double seguroSocial = 18;
        boolean bandera = true;
        String mensaje = "";
        double adicional = 10;
        double total1;
        double total2;
        double subTotal;
        String opcion;
        double totalCancelar;
        while (bandera == true) {
            System.out.println("Ingrese la ciudad de la empresa");
            ciudad = entrada.nextLine();
            System.out.println("Ingrese el nombre del empleado");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el número de cédula del empleado");
            cedula = entrada.nextInt();
            System.out.println("Ingrese el número de horas trabajadas");
            horasMatutinas = entrada.nextInt();
            System.out.println("Ingrese el número de horas nocturnas trabajadas");
            horasNocturnas = entrada.nextInt();
            if (contador >= 10) {
                total1 = horasMatutinas * valorDia;
                total2 = horasNocturnas * valorNoche;
                subTotal = total2 + total1;
                seguroSocial = (seguroSocial * subTotal) / 100;
                totalCancelar = subTotal - seguroSocial;
                mensaje = String.format("""
                                        Rol del trabajador de nombre %s y cedula %d
                                        Horas matutinas trabajadas:%.0f
                                        Horas nocturnas trabajadas:%.0f
                                        Subtotal:$%.1f
                                        Seguro Social:$%.1f
                                        Total a cancelar:$%.1f""", nombre,
                        cedula, horasMatutinas, horasNocturnas, subTotal,
                        seguroSocial, totalCancelar);
            } else {
                if (horasNocturnas >= 10) {
                    adicional = (adicional * horasNocturnas) / 100;
                    total1 = horasMatutinas * valorDia;
                    total2 = (int) (horasNocturnas * valorNoche + adicional);
                    subTotal = total2 + total1;
                    seguroSocial = (seguroSocial * subTotal) / 100;
                    totalCancelar = subTotal - seguroSocial;
                    mensaje = String.format("""
                                        Rol del trabajador de nombre %s y cedula %d
                                        Horas matutinas:%.1f
                                        Horas nocturnas trabajadas:%.1f
                                        Subtotal:$%.1f
                                        Seguro Social:$%.1f
                                        Total a cancelar:$%1.f""", nombre,
                            cedula, horasMatutinas, horasNocturnas, subTotal,
                            seguroSocial, totalCancelar);
                }
                
                System.out.println("Ingrese s si desea salir del programa");
                opcion = entrada.nextLine();
                if (opcion.equals("s")) {
                    bandera = false;
                }
                contador = contador + 1;

            }
            PrintStream printf = System.out.printf("""
                                                   Nomina de trabajadores:%s
                                                   Numero de empleadores""", mensaje, contador);

        }
    }

}
