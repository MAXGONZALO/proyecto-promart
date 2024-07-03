import java.util.Scanner;
public class Sistemapago {
    static Scanner pago = new Scanner(System.in);
    public static void main(String[] args) {
        procesarPago();
        pago.close();
    }
    public static void procesarPago() {
        final double IGV_PORCENTAJE = 18.0;
        System.out.println("Bienvenido al sistema de pago de Promart");
        System.out.print("Ingrese el monto del pago: ");
        double montoPago = Double.parseDouble(pago.nextLine());
        double igv = calcularIGV(montoPago, IGV_PORCENTAJE);
        double montoTotal = calcularTotal(montoPago, IGV_PORCENTAJE);
        System.out.println("Monto del IGV (" + IGV_PORCENTAJE + "%): $" + igv);
        System.out.println("Monto total a pagar: $" + montoTotal);
        System.out.println("Seleccione su método de pago:");
        System.out.println("1. Tarjeta de débito");
        System.out.println("2. Pago en efectivo");
        int metodoPago = Integer.parseInt(pago.nextLine());
        switch (metodoPago) {
            case 1:
                pagarConTarjeta();
                break;
            case 2:
                pagarEnEfectivo();
                break;
            default:
                System.out.println("Método de pago no válido.");
        }
        imprimirBoleta(montoPago, igv, montoTotal);
    }
    public static void pagarConTarjeta() {
        System.out.print("Ingrese el nombre del titular de la tarjeta: ");
        String Titular = pago.nextLine();
        System.out.print("Ingrese el número de tarjeta: ");
        String Tarjeta = pago.nextLine();
        System.out.print("Ingrese la fecha de vencimiento (MM/YY): ");
        String Vencimiento = pago.nextLine();
        System.out.print("Ingrese el código de seguridad: ");
        int Seguridad = Integer.parseInt(pago.nextLine());
        System.out.println("Procesando pago con tarjeta...");
        System.out.println("¡Pago exitoso!");
    }
    public static void pagarEnEfectivo() {
        System.out.print("Ingrese el monto con el que va a pagar: ");
        double monto = Double.parseDouble(pago.nextLine());
        System.out.println("Pagando en efectivo...");
        System.out.println("¡Pago exitoso!");
    }
    public static void imprimirBoleta(double montoPago, double igv, double montoTotal) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║          █▄▄ █▀█ █░░ █▀▀ ▀█▀ ▄▀█        ║");
        System.out.println("║          █▄█ █▄█ █▄▄ ██▄ ░█░ █▀█        ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║                                            ║");
        System.out.println("║ OP. Exoneradas                     $ 00.00 ║");
        System.out.println("║                                            ║");
        System.out.println("║ OP. Gratuitas                      $ 00.00 ║");
        System.out.println("║                                            ║");
        System.out.println("║ OP. Inafectas                      $ 00.00 ║");
        System.out.println("║                                            ║");
        System.out.println("║ Monto del pago:                  $" + redondear(montoPago) + "   ║");
        System.out.println("║                                            ║");
        System.out.println("║ Monto del IGV:                   $" + redondear(igv) + "    ║");
        System.out.println("║                                            ║");
        System.out.println("║ Monto total a pagar:             $" + redondear(montoTotal) +  "  ║");
        System.out.println("║                                            ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println("");
        System.out.println("¡PAGO REALIZADO CON EXITO!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("░██████╗░██████╗░░█████╗░░█████╗░██╗░█████╗░░██████╗  ██████╗░░█████╗░██████╗░");
        System.out.println("██╔════╝░██╔══██╗██╔══██╗██╔══██╗██║██╔══██╗██╔════╝  ██╔══██╗██╔══██╗██╔══██");
        System.out.println("██║░░██╗░██████╔╝███████║██║░░╚═╝██║███████║╚█████╗░  ██████╔╝██║░░██║██████╔╝");
        System.out.println("██║░░╚██╗██╔══██╗██╔══██║██║░░██╗██║██╔══██║░╚═══██╗  ██╔═══╝░██║░░██║██╔══██╗");
        System.out.println("╚██████╔╝██║░░██║██║░░██║╚█████╔╝██║██║░░██║██████╔╝  ██║░░░░░╚█████╔╝██║░░██║");
        System.out.println("╚╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝╚═╝░░╚═╝╚═════╝░  ╚═╝░░░░░░╚════╝░╚═╝░░╚═╝");
        System.out.println("");
        System.out.println("");
        System.out.println("██╗░░░██╗██╗░██████╗██╗████████╗░█████╗░██████╗░  ██████╗░██████╗░░█████╗░███╗░░░███╗░█████╗░██████╗░████████");
        System.out.println("██║░░░██║██║██╔════╝██║╚══██╔══╝██╔══██╗██╔══██╗  ██╔══██╗██╔══██╗██╔══██╗████╗░████║██╔══██╗██╔══██╗╚══██╔══╝");
        System.out.println("╚██╗░██╔╝██║╚█████╗░██║░░░██║░░░███████║██████╔╝  ██████╔╝██████╔╝██║░░██║██╔████╔██║███████║██████╔╝░░░██║░░");
        System.out.println("░╚████╔╝░██║░╚═══██╗██║░░░██║░░░██╔══██║██╔══██╗  ██╔═══╝░██╔══██╗██║░░██║██║╚██╔╝██║██╔══██║██╔══██╗░░░██║░░░");
        System.out.println("░░╚██╔╝░░██║██████╔╝██║░░░██║░░░██║░░██║██║░░██║  ██║░░░░░██║░░██║╚█████╔╝██║░╚═╝░██║██║░░██║██║░░██║░░░██║░░");
        System.out.println("░░░╚═╝░░░╚═╝╚═════╝░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝  ╚═╝░░░░░╚═╝░░╚═╝░╚════╝░╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░");

    }
    public static double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }
    public static double calcularIGV(double monto, double igvPorcentaje) {
        return monto * (igvPorcentaje / 100);
    }
    public static double calcularTotal(double monto, double igvPorcentaje) {
        return monto + calcularIGV(monto, igvPorcentaje);
    }
}
