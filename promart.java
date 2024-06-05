import java.util.Scanner;

public class promart {
    public static void main(String[] args) {
        Scanner invoker = new Scanner(System.in);
        System.out.println("BIENVENIDO A PROMAR HOME CENTER");
        String opcion;
        boolean salir = false;

        do {
            System.out.println("¿En qué categoría deseas buscar productos?");
            System.out.println("1. Muebles");
            System.out.println("2. Electricidad");
            System.out.println("3. Pinturas");
            System.out.println("4. Dormitorios");
            System.out.println("5. Herramientas");
            System.out.println("6. Salir");
            System.out.print("Ingresa una opción: ");
            opcion = invoker.nextLine();

            switch (opcion) {
                case "1":
                    muebles();
                    break;
                case "2":
                    electricidad();
                    break;
                case "3":
                    pinturas();
                    break;
                case "4":
                    dormitorios();
                    break;
                case "5":
                    herramientas();
                    break;
                case "6":
                    System.out.println("Gracias por visitar Promar Home Center. ¡Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingresa una opción válida.");
            }
        } while (salir);
    }

    private static void muebles() {
        System.out.println("CATEGORÍA: MUEBLES");
        System.out.println("1. Sofá de 1 cuerpos- s/749");
        System.out.println("2. Mesa de comedor- s/229");
        System.out.println("3. Mueble despensedero de cocina- s/349");

    }

    private static void electricidad() {
        System.out.println("CATEGORÍA: ELECTRICIDAD");
        System.out.println("1. Focos LED smart wifi- s/119");
        System.out.println("2. Interruptores- s/10");
        System.out.println("3. Tomacorrientes- s/15");

    }

    private static void pinturas() {
        System.out.println("CATEGORÍA: PINTURAS Y ACCESORIOS");
        System.out.println("1. Pintura látex para interiores- s/105");
        System.out.println("2. banqueta de aluminio - s/76");
        System.out.println("3. rrodillo mas badeja - s/31");

    }

    private static void dormitorios() {
        System.out.println("CATEGORÍA: DORMITORIO");
        System.out.println("1. Juego de dormitorio- s/1010");
        System.out.println("2. Cama individual- s/779");
        System.out.println("3. Veladores kaia- s/ 319");

    }

    private static void herramientas() {
        System.out.println("CATEGORÍA: HERRAMIENTAS");
        System.out.println("1. Martillo- s/40");
        System.out.println("2. Destornillador Bosh- s/199 ");
        System.out.println("3. Alicates- s/228");

    }
}