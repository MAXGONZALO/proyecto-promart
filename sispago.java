import java.util.Scanner;
public class sispago {
    public static double calcularIGV(double monto, double igvPorcentaje) {
        return monto * (igvPorcentaje / 100);
    }
    public static double calcularTotal(double monto, double igvPorcentaje) {
        return monto + calcularIGV(monto, igvPorcentaje);
    }
    public static void main(String[] args) {
        Scanner pago = new Scanner(System.in);
        final double IGV_PORCENTAJE = 18.0;
        System.out.println("Bienvenido al sistema de pago de Promart");
        System.out.print("Ingrese el monto del pago: ");
        double montoPago = pago.nextDouble();
        double igv = calcularIGV(montoPago, IGV_PORCENTAJE);
        double montoTotal = calcularTotal(montoPago, IGV_PORCENTAJE);
        System.out.println("Monto del IGV (" + IGV_PORCENTAJE + "%): $" + igv);
        System.out.println("Monto total a pagar: $" + montoTotal);

        pago.close();
    }
}
