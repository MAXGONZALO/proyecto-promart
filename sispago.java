import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class BoletaDePagoApp {
    private static final String[] METODOS_PAGO = {"tarjeta", "efectivo"};

    public static void main(String[] args) {
        double total = 1000.0;
        String metodoPago = "tarjeta";
        String numeroTarjeta = "1234567890";
        String nombreTitular = "Juan Pérez";

        String resultado = procesarPago(total, metodoPago, numeroTarjeta, nombreTitular);
        System.out.println(resultado);
    }

    public static String procesarPago(double total, String metodoPago, String numeroTarjeta, String nombreTitular) {
        if (total <= 0) {
            return "El total a pagar debe ser mayor a 0.";
        }

        if (!esMetodoPagoValido(metodoPago)) {
            return "Método de pago no válido.";
        }

        String resultado = procesarPagoSegunMetodo(metodoPago, total, numeroTarjeta, nombreTitular);
        imprimirBoleta(total);
        exportarBoletaAPDF("C:\\Boleta de Pago.txt", LocalDate.now().toString(), "001", "Juan Pérez", "Calle 123, 45678", total, 150.0, 850.0, 0.0, 1150.0);
        return resultado;
    }

    private static boolean esMetodoPagoValido(String metodoPago) {
        for (String metodo : METODOS_PAGO) {
            if (metodo.equals(metodoPago)) {
                return true;
            }
        }
        return false;
    }

    private static String procesarPagoSegunMetodo(String metodoPago, double total, String numeroTarjeta, String nombreTitular) {
        if (metodoPago.equals("tarjeta")) {
            return procesarPagoTarjeta(total, numeroTarjeta, nombreTitular);
        } else if (metodoPago.equals("efectivo")) {
            return procesarPagoEfectivo(total);
        } else {
            return "Método de pago no válido.";
        }
    }

    private static String procesarPagoTarjeta(double total, String numeroTarjeta, String nombreTitular) {
        return "Pago con tarjeta procesado exitosamente.";
    }

    private static String procesarPagoEfectivo(double total) {
        return "Pago en efectivo procesado exitosamente.";
    }

    private static void imprimirBoleta(double total) {
        double subtotal = 0.0;
        double igv = 0.0;
        double totalFinal = 0.0;

        subtotal = subtotal + total;
        igv = subtotal * 0.18;
        totalFinal = subtotal + igv;

        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║          █▄▄ █▀█ █░░ █▀▀ ▀█▀ ▄▀█           ║");
        System.out.println("║          █▄█ █▄█ █▄▄ ██▄ ░█░ █▀█           ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║                                            ║");
        System.out.println("║ OP. Exoneradas                  :  $ 00.00 ║");
        System.out.println("║                                            ║");
        System.out.println("║ OP. Gratuitas                   :  $ 00.00 ║");
        System.out.println("║                                            ║");
        System.out.println("║ OP. Inafectas                   :  $ 00.00 ║");
        System.out.println("║                                            ║");
        System.out.println("║ SUBTOTAL                       : $ "                       + subtotal);
        System.out.println("║                                            ║");
        System.out.println("║ IGV                            : $ "                       + igv);
        System.out.println("║                                            ║");
        System.out.println("║ TOTAL                          : $ "                       + totalFinal);
        System.out.println("║                                            ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("");
        System.out.println("¡PAGO REALIZADO CON EXITO!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("░██████╗░██████╗░░█████╗░░█████╗░██╗░█████╗░░██████╗  ██████╗░░█████╗░██████╗░");
        System.out.println("██╔════╝░██╔══██╗██╔══██╗██╔══██╗██║██╔══██╗██╔════╝  ██╔══██╗██╔══██╗██╔══██");
        System.out.println("██║░░██╗░██████╔╝███████║██║░░╚═╝██║███████║╚█████╗░  ██████╔╝██║░░██║██████╔╝");
        System.out.println("██║░░╚██╗██╔══██╗██╔══██║██║░░██╗██║██╔══██║░╚═══██╗  ██╔═══╝░██║░░██║██╔══██╗");
        System.out.println("╚██████╔╝██║░░██║██║░░██║╚█████╔╝██║██║░░██║██████╔╝  ██║░░░░░╚█████╔╝██║░░██║");
        System.out.println("╚╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝╚═╝░░╚═╝╚═════╝░  ╚═╝░░░░░░╚════╝░╚═╝░░╚═╝");
        System.out.println("");
        System.out.println("");
        System.out.println("██╗░░░██╗██╗░██████╗██╗████████╗░█████╗░██████╗░  ██████╗░██████╗░░█████╗░███╗░░░███╗░█████╗░██████╗░████████");
        System.out.println("██║░░░██║██║██╔════╝██║╚══██╔══╝██╔══██╗██╔══██╗  ██╔══██╗██╔══██╗██╔══██╗████╗░████║██╔══██╗██╔══██╗╚══██╔══╝");
        System.out.println("╚██╗░██╔╝██║╚█████╗░██║░░░██║░░░███████║██████╔╝  ██████╔╝██████╔╝██║░░██║██╔████╔██║███████║██████╔╝░░░██║░░");
        System.out.println("░╚████╔╝░██║░╚═══██╗██║░░░██║░░░██╔══██║██╔══██╗  ██╔═══╝░██╔══██╗██║░░██║██║╚██╔╝██║██╔══██║██╔══██╗░░░██║░░░");
        System.out.println("░░╚██╔╝░░██║██████╔╝██║░░░██║░░░██║░░██║██║░░██║  ██║░░░░░██║░░██║╚█████╔╝██║░╚═╝░██║██║░░██║██║░░██║░░░██║░░");
        System.out.println("░░░╚═╝░░░╚═╝╚═════╝░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝  ╚═╝░░░░░╚═╝░░╚═╝░╚════╝░╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░");
    }

    private static void exportarBoletaAPDF(String rutaArchivo, String fechaEmision, String numeroBoleta, String nombreCliente, String direccionCliente, double total, double impuestos, double subtotal, double descuento, double totalConImpuestos) {
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            // Escribir la boleta de pago en el archivo de texto
            writer.write("╔══════════════════════════════════════════╗\n");
            writer.write("║        Boleta de Pago                    ║\n");
            writer.write("╠══════════════════════════════════════════╣\n");
            writer.write("║ Fecha de emisión: " + fechaEmision + "             ║\n");
            writer.write("║ Número de boleta: " + numeroBoleta + "                    ║\n");
            writer.write("║ Nombre del cliente: " + nombreCliente +"           ║\n");
            writer.write("║ Dirección del cliente: " + direccionCliente +"  ║\n");
            writer.write("╚══════════════════════════════════════════╝\n");
            writer.write("\n");

            writer.write("╔══════════════════════════════════════════╗\n");
            writer.write("║           Productos                      ║\n");
            writer.write("╠══════════════════════════════════════════╣\n");
            writer.write("║ Subtotal: " + subtotal + "                          ║\n");
            writer.write("║ Descuento: " + descuento + "                           ║\n");
            writer.write("║ Total con impuestos: " + totalConImpuestos + "              ║\n");
            writer.write("╚══════════════════════════════════════════╝\n");
            writer.write("\n");

            writer.write("╔══════════════════════════════════════════╗\n");
            writer.write("║            Impuestos                     ║\n");
            writer.write("╠══════════════════════════════════════════╣\n");
            writer.write("║ Total de impuestos: " + impuestos + "                ║\n");
            writer.write("╚══════════════════════════════════════════╝\n");
            writer.write("\n");

            writer.write("╔══════════════════════════════════════════╗\n");
            writer.write("║             Pagos                        ║\n");
            writer.write("╠══════════════════════════════════════════╣\n");
            writer.write("║ Total a pagar: " + totalConImpuestos + "                    ║\n");
            writer.write("╚══════════════════════════════════════════╝\n");
            writer.write("\n");

            System.out.println("Boleta de pago exportada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al exportar la boleta de pago: " + e.getMessage());
        }
    }
}


}
