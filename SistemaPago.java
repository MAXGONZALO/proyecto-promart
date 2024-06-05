import java.util.Scanner;
public class SistemaPago {
    static Scanner pago = new Scanner(System.in);
    static final String nombre = "usuario";
    static final String contr = "contraseña";
    public static void main(String[] args) {
        boolean log = login();
        if (log) {
            procesarPago();
        } else {
            System.out.println("------ DATOS INCORRECTOS ------.");
        }
        pago.close();
    }
    public static boolean login() {
        System.out.print("Ingrese su nombre de usuario: ");
        String nombre = pago.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contr = pago.nextLine();
        return nombre.equals(nombre) && contr.equals(contr);
    }
    public static void procesarPago() {
        final double IGV_PORCENTAJE = 18.0;
        System.out.println("Bienvenido al sistema de pago de Promart");
        System.out.print("Ingrese el monto del pago: ");
        double montoPago = pago.nextDouble();
        double igv = calcularIGV(montoPago, IGV_PORCENTAJE);
        double montoTotal = calcularTotal(montoPago, IGV_PORCENTAJE);
        System.out.println("Monto del IGV (" + IGV_PORCENTAJE + "%): $" + igv);
        System.out.println("Monto total a pagar: $" + montoTotal);
        System.out.println("Seleccione su método de pago:");
        System.out.println("1. Tarjeta de crédito");
        System.out.println("2. Tarjeta de débito");
        int metodopago = pago.nextInt();
        if (metodopago == 1 || metodopago == 2) {
            System.out.println("Ingrese los datos de la tarjeta:");
            System.out.print("Número de tarjeta: ");
            String numerotarj = pago.next();
            System.out.print("Fecha de vencimiento (MM/YY): ");
            String fechavenc = pago.next();
            System.out.print("CVV: ");
            int cvv = pago.nextInt();
            System.out.println("Procesando el pago...");
            System.out.println("¡Pago exitoso!");
        } else {
            System.out.println("Método de pago no válido.");
        }
    }
    public static double calcularIGV(double monto, double igvPorcentaje) {
        return monto * (igvPorcentaje / 100);
    }
    public static double calcularTotal(double monto, double igvPorcentaje) {
        return monto + calcularIGV(monto, igvPorcentaje);
    }
}