import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class promartfin {

    public void fEDAD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----BIENVENIDO A PROMART HOMECENTER----");
        System.out.println("Para la compra en Promart, coloque su fecha de nacimiento");
        System.out.print("Ingrese el día de su nacimiento (DD): ");
        int dia = scanner.nextInt();
        System.out.print("Ingrese el mes de su nacimiento (MM): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año de su nacimiento (YYYY): ");
        int anio = scanner.nextInt();

        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();

        if (edad >= 18) {
            System.out.println("Proceda a llenar sus datos");
            fDatosCliente();
        } else {
            System.out.println("No cumple con los requisitos para la compra");
        }
    }

    public void fDatosCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Registrar Cuenta----");
        System.out.print("Ingrese su apodo: ");
        String apodo = scanner.nextLine();
        System.out.print("Ingrese su número de DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese su correo: ");
        String correo = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();

        System.out.println("----Iniciar sesión----");
        System.out.print("Ingrese su correo: ");
        String correoIn = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseñaIn = scanner.nextLine();

        if (correoIn.equals(correo) && contraseñaIn.equals(contraseña)) {
            System.out.println("Bienvenido: " + apodo);
            System.out.print("¿Cuál es su género (Mujer/Varón)? ");
            String genero = scanner.nextLine();

            switch (genero.toLowerCase()) {
                case "mujer":
                    System.out.println("¡Bienvenida! ¿Qué está buscando?");
                    break;
                case "varón":
                    System.out.println("¡Bienvenido! ¿Qué está buscando?");
                    break;
                default:
                    System.out.println("Ese género no existe");
            }

            promartfin1 tienda = new promartfin1();
            tienda.Categorias();

        }
    }

    public static void main(String[] args) {
        promart tienda = new promart();
        tienda.fEDAD();
    }
}

class promartfin1 {

    Scanner grinch = new Scanner(System.in);
    String[] tecnologia = {"Tv y video", "Cómputo", "Telefonía"};
    String[][] marcasTecnologia = {
            {"Samsung", "LG", "Sony"},
            {"HP", "Dell", "Apple"},
            {"Apple", "Samsung", "Huawei"}
    };
    String[][][] subMarcasTecnologia = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}
    };
    double[][][] preciosTecnologia = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}
    };
    String[] servicios = {"Pisos", "Electricidad", "Puertas", "Pintura"};
    String[] productos = {"celulares", "cocinas", "sofa", "herramientas"};
    Random random = new Random();
    int s = random.nextInt(productos.length);
    double[] precio = {1000, 0.18, 500, 300, 250, 320};
    double[] subtotal_extra = {0, 0, 0, 0};
    double igv, subtotal, totalpagar;
    int[] carrito = new int[tecnologia.length];
    int[] carrito_extra = new int[servicios.length];
    int[] marcasSeleccionadas = new int[tecnologia.length];
    int[] subMarcasSeleccionadas = new int[tecnologia.length];
    String respuesta;
    int opcion, cantidad;

    public String Categorias() {
        System.out.println("---------▁ ▂ ▄ ▅ ▆ ▇ █ BIENVENIDO A PROMART HOMECENTER █ ▇ ▆ ▅ ▄ ▂ ▁-----------");
        System.out.println(" = \"\"\"\n" +
                " ██████ █████  ██████ ███  ███ ██████ █████  ▄▄▄▄▄▄\n" +
                " ██  ██ ██  ██ ██  ██ ████████ ██  ██ ██  ██   ██  \n" +
                " ██████ █████  ██  ██ ██ ██ ██ ██████ █████    ██  \n" +
                " ██     ██  ██ ██  ██ ██    ██ ██  ██ ██  ██   ██  \n" +
                " ██     ██  ██ ██████ ██    ██ ██  ██ ██  ██   ██  \n" +
                "\n" +
                " P      R      O      M      A      R      T\n" +
                "\"\"\"\n" +
                "\n" +
                "");
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- Tecnologia");
        System.out.println(" 2.- Servicios");
        System.out.println(" 3.- Ofertas especiales");
        opcion = grinch.nextInt();
        grinch.nextLine();
        switch (opcion) {
            case 1:
                this.ComprarProducto();
                break;
            case 2:
                this.ComprarExtra();
                break;
            case 3:
                // Código para ofertas especiales
                break;
            default:
                System.out.println("Opcion no válida");
                this.Categorias();
                break;
        }
        return null;
    }

    public String ComprarProducto() {
        System.out.println("------TECNOLOGIA------------");
        System.out.println("Productos en oferta: " + productos[s]);
        System.out.println("Seleccione el producto a comprar");
        for (int i = 0; i < tecnologia.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + tecnologia[i]);
        }
        opcion = grinch.nextInt();
        grinch.nextLine();
        if (opcion >= 1 && opcion <= tecnologia.length) {
            int productoSeleccionado = opcion - 1;
            System.out.println("Seleccione la marca del producto");
            for (int i = 0; i < marcasTecnologia[productoSeleccionado].length; i++) {
                System.out.println("Opcion " + (i + 1) + " : " + marcasTecnologia[productoSeleccionado][i]);
            }
            int marcaSeleccionada = grinch.nextInt();
            grinch.nextLine();
            if (marcaSeleccionada >= 1 && marcaSeleccionada <= marcasTecnologia[productoSeleccionado].length) {
                int marcaIndex = marcaSeleccionada - 1;
                System.out.println("Seleccione el modelo de la marca");
                for (int i = 0; i < subMarcasTecnologia[productoSeleccionado][marcaIndex].length; i++) {
                    System.out.println("Opcion " + (i + 1) + " : " + subMarcasTecnologia[productoSeleccionado][marcaIndex][i] + " - Precio: S/ " + preciosTecnologia[productoSeleccionado][marcaIndex][i]);
                }
                int subMarcaSeleccionada = grinch.nextInt();
                grinch.nextLine();
                if (subMarcaSeleccionada >= 1 && subMarcaSeleccionada <= subMarcasTecnologia[productoSeleccionado][marcaIndex].length) {
                    System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                    cantidad = grinch.nextInt();
                    grinch.nextLine();
                    carrito[productoSeleccionado] += cantidad;
                    marcasSeleccionadas[productoSeleccionado] = marcaIndex;
                    subMarcasSeleccionadas[productoSeleccionado] = subMarcaSeleccionada - 1;
                    System.out.println("Producto añadido al carrito.");
                    System.out.println("¿Desea seguir comprando? (si/no)");
                    respuesta = grinch.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        this.Categorias();
                    } else {
                        this.finalizarCompra();
                    }
                } else {
                    System.out.println("Opcion no válida");
                    this.ComprarProducto();
                }
            } else {
                System.out.println("Opcion no válida");
                this.ComprarProducto();
            }
        } else {
            System.out.println("Opcion no válida");
            this.ComprarProducto();
        }
        return null;
    }

    public String ComprarExtra() {
        System.out.println("Servicios disponibles: ");
        for (int i = 0; i < servicios.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + servicios[i]);
        }
        System.out.println("Elija un servicio");
        opcion = grinch.nextInt();
        grinch.nextLine();
        if (opcion >= 1 && opcion <= servicios.length) {
            int servicioSeleccionado = opcion - 1;
            switch (servicioSeleccionado) {
                case 0: // Pisos
                    System.out.println("Opcion 1: Instalación de pisos laminados - Precio: S/ 60");
                    System.out.println("Opcion 2: Instalación de pisos cerámicos - Precio: S/ 60");
                    break;
                case 1: // Electricidad
                    System.out.println("Opcion 1: Instalación de cámaras de seguridad - Precio: S/ 100");
                    System.out.println("Opcion 2: Instalación de alarmas - Precio: S/ 50");
                    break;
                case 2: // Puertas
                    System.out.println("Opcion 1: Instalación de puertas - Precio: S/ 150");
                    System.out.println("Opcion 2: Instalación de cerraduras - Precio: S/ 60");
                    break;
                case 3: // Pintura
                    System.out.println("Opcion 1: Servicio de pintado");
                    break;
                default:
                    System.out.println("Opcion no válida");
                    this.ComprarExtra();
                    return null;
            }
            int opcionExtra = grinch.nextInt();
            grinch.nextLine();
            double precioExtra;
            switch (servicioSeleccionado) {
                case 0: // Pisos
                    if (opcionExtra == 1 || opcionExtra == 2) {
                        precioExtra = 60;
                    } else {
                        System.out.println("Opcion no válida");
                        this.ComprarExtra();
                        return null;
                    }
                    break;
                case 1: // Electricidad
                    if (opcionExtra == 1) {
                        precioExtra = 100;
                    } else if (opcionExtra == 2) {
                        precioExtra = 50;
                    } else {
                        System.out.println("Opcion no válida");
                        this.ComprarExtra();
                        return null;
                    }
                    break;
                case 2: // Puertas
                    if (opcionExtra == 1) {
                        precioExtra = 150;
                    } else if (opcionExtra == 2) {
                        precioExtra = 60;
                    } else {
                        System.out.println("Opcion no válida");
                        this.ComprarExtra();
                        return null;
                    }
                    break;
                case 3: // Pintura
                    if (opcionExtra == 1) {
                        precioExtra = 80;
                    } else {
                        System.out.println("Opcion no válida");
                        this.ComprarExtra();
                        return null;
                    }
                    break;
                default:
                    System.out.println("Opcion no válida");
                    this.ComprarExtra();
                    return null;
            }
            System.out.println("¿Cuántos servicios necesita?");
            cantidad = grinch.nextInt();
            grinch.nextLine();
            carrito_extra[servicioSeleccionado] += cantidad;
            subtotal_extra[servicioSeleccionado] += precioExtra * cantidad;
            System.out.println("Servicio añadido al carrito.");
            System.out.println("¿Desea seguir comprando? (si/no)");
            respuesta = grinch.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                this.Categorias();
            } else {
                this.finalizarCompra();
            }
        } else {
            System.out.println("Opcion no válida");
            this.ComprarExtra();
        }
        return null;
    }

    public void finalizarCompra() {
        System.out.println("-----FINALIZAR COMPRA-----");
        subtotal = 0;
        System.out.println("Productos comprados:");
        for (int i = 0; i < carrito.length; i++) {
            if (carrito[i] > 0) {
                int marcaIndex = marcasSeleccionadas[i];
                int subMarcaIndex = subMarcasSeleccionadas[i];
                double precioProducto = preciosTecnologia[i][marcaIndex][subMarcaIndex];
                double costo = precioProducto * carrito[i];
                subtotal += costo;
                System.out.println(tecnologia[i] + " - " + marcasTecnologia[i][marcaIndex] + " - " + subMarcasTecnologia[i][marcaIndex][subMarcaIndex] + " x " + carrito[i] + " = S/ " + costo);
            }
        }
        for (int i = 0; i < carrito_extra.length; i++) {
            if (carrito_extra[i] > 0) {
                double costo = subtotal_extra[i];
                subtotal += costo;
                System.out.println(servicios[i] + " x " + carrito_extra[i] + " = S/ " + costo);
            }
        }
        igv = subtotal * precio[1];
        totalpagar = subtotal + igv;
        System.out.println("Subtotal: S/ " + subtotal);
        System.out.println("IGV (18%): S/ " + igv);
        System.out.println("Total a pagar: S/ " + totalpagar);
        System.out.println("¡Gracias por su compra!");
    }
}