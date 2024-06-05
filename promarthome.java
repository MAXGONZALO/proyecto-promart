import java.util.Scanner;

public class promarthome {
    public static void main(String[] args) {
        Scanner bot = new Scanner(System.in);
        boolean salir = false;
        System.out.println("---BIENVENIDO SERE TU ASESOR DE VENTAS VIRTUAL, GRACIAS POR USAR NUESTRO SERVICIO---");
        while (!salir) {
            mostrarMenuPrincipal();
            String opcion = bot.nextLine();

            switch (opcion) {
                case "1":
                    manejarCompras(bot);
                    break;
                case "2":
                    manejarconsultas(bot);
                    break;
                case "3":
                    System.out.println("--Gracias por utilizar nuestro servicio. ¡Hasta luego!--");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                    break;
            }
        }

    }private static void mostrarMenuPrincipal() {
        System.out.println("Descubre nuestras opciones");
        System.out.println("1. Realizar una compra");
        System.out.println("2. otras consultas y gestiones");
        System.out.println("3. Salir");
        System.out.println("---Qué opción desea---");

    }private static void manejarCompras(Scanner bot) {
        System.out.println("--puedes elegir entre muebles y tecnologia :)--");
        System.out.println("1. Muebles ");
        System.out.println("2. tecnologia");
        System.out.println("3. Regresar al menú principal");
        String planes = bot.nextLine();

        switch (planes) {

            case "1":
                System.out.println("Has seleccionado muebles.");
                System.out.println("1.cama");
                System.out.println("ropero");
                break;
            case "2":
                System.out.println("Has seleccionado tecnologia.");
                System.out.println("1.laptops");
                System.out.println("2.impresora ");
                break;
            case "3":
                System.out.println("Regresando al menú principal...");
                break;
            default:
                System.out.println("Opción no válida. Regresando al menú principal.");
                break;
        }

    }private static void manejarconsultas(Scanner bot) {
        System.out.println("---Seleccione 2 para consultas y gestiones---");
        System.out.println("1. obtener el comprobante de pago");
        System.out.println("2. conocer el stock o precio de un producto");
        System.out.println("3. Regresar al menú anterior");
        String pago = bot.nextLine();

        switch (pago) {
            case "1":
                System.out.println("Has seleccionado Comprobante de pagos.");
                System.out.println("1.boleta de venta");
                System.out.println("2.factura electronica");
                break;
            case "2":
                System.out.println("conocer el stock o precio de un producto.");
                break;
            case "3":
                System.out.println("Regresando al menú anterior...");
                break;
            default:
                System.out.println("Opción no válida. Regresando al menú anterior.");
                break;
        }
    }


}





