import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class PROMARTHOMECENTER{

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

            iniciarCompra();
        } else {
            System.out.println("Datos no válidos");
        }
    }

    public void iniciarCompra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----BIENVENIDO A LA TIENDA DE PROMART HOMECENTER-----");
        System.out.print("Ingrese el departamento que desea visitar: TECNOLOGÍA/ELECTRICIDAD: ");
        String departamento = scanner.nextLine().toUpperCase();

        switch (departamento) {
            case "TECNOLOGÍA":
                tiendaTecnologia(scanner);
                break;
            case "ELECTRICIDAD":
                tiendaElectricidad(scanner);
                break;
            default:
                System.out.println("Departamento no disponible.");
        }
    }

    public void tiendaTecnologia(Scanner scanner) {
        System.out.print("Ingrese el producto que desea comprar: LAPTOP/SMARTPHONE: ");
        String servicio = scanner.nextLine().toUpperCase();

        switch (servicio) {
            case "LAPTOP":
                elegirLaptop(scanner);
                break;
            case "SMARTPHONE":
                elegirSmartphone(scanner);
                break;
            default:
                System.out.println("Producto no disponible.");
        }
    }

    public static void elegirLaptop(Scanner scanner) {
        System.out.print("Seleccione la marca de laptop que desea comprar: DELL/HP/LENOVO: ");
        String marcaLaptop = scanner.nextLine().toUpperCase();

        switch (marcaLaptop) {
            case "DELL":
                elegirModelo(scanner, "Dell", new String[]{"XPS 13", "Inspiron 15", "Alienware m15"});
                break;
            case "HP":
                elegirModelo(scanner, "HP", new String[]{"Spectre x360", "Pavilion 15", "Omen 15"});
                break;
            case "LENOVO":
                elegirModelo(scanner, "Lenovo", new String[]{"ThinkPad X1 Carbon", "Yoga C940", "Legion 5"});
                break;
            default:
                System.out.println("Marca no disponible.");
        }
    }

    public static void elegirSmartphone(Scanner scanner) {
        System.out.print("Seleccione la marca de smartphone que desea comprar: APPLE/SAMSUNG/XIAOMI: ");
        String marcaSmartphone = scanner.nextLine().toUpperCase();

        switch (marcaSmartphone) {
            case "APPLE":
                elegirModelo(scanner, "Apple", new String[]{"iPhone 13", "iPhone 12", "iPhone SE"});
                break;
            case "SAMSUNG":
                elegirModelo(scanner, "Samsung", new String[]{"Galaxy S21", "Galaxy Note 20", "Galaxy A52"});
                break;
            case "XIAOMI":
                elegirModelo(scanner, "Xiaomi", new String[]{"Mi 11", "Redmi Note 10", "Poco X3"});
                break;
            default:
                System.out.println("Marca no disponible.");
        }
    }

    public void tiendaElectricidad(Scanner scanner) {
        System.out.print("Ingrese el producto que desea comprar: LINTERNA/SEGURIDAD/EXTENSION: ");
        String servicio = scanner.nextLine().toUpperCase();

        switch (servicio) {
            case "LINTERNA":
                elegirLinterna(scanner);
                break;
            case "SEGURIDAD":
                elegirSeguridad(scanner);
                break;
            case "EXTENSION":
                elegirExtension(scanner);
                break;
            default:
                System.out.println("Producto no disponible.");
        }
    }

    public static void elegirLinterna(Scanner scanner) {
        System.out.print("Seleccione la marca de linterna que desea comprar: DURACELL/EVEREADY/MAGLITE: ");
        String marcaLinterna = scanner.nextLine().toUpperCase();

        switch (marcaLinterna) {
            case "DURACELL":
                elegirModelo(scanner, "Duracell", new String[]{"Compacta", "Ultra", "Pro"});
                break;
            case "EVEREADY":
                elegirModelo(scanner, "Eveready", new String[]{"Energizer", "Super Heavy Duty", "LED"});
                break;
            case "MAGLITE":
                elegirModelo(scanner, "Maglite", new String[]{"Mini", "ML300", "Solitaire"});
                break;
            default:
                System.out.println("Marca no disponible.");
        }
    }

    public static void elegirSeguridad(Scanner scanner) {
        System.out.print("Seleccione el tipo de producto de seguridad que desea comprar: CÁMARA/ALARMA/SENSOR: ");
        String tipoSeguridad = scanner.nextLine().toUpperCase();

        switch (tipoSeguridad) {
            case "CÁMARA":
                elegirModelo(scanner, "Cámara", new String[]{"Domo", "Bullet", "PTZ"});
                break;
            case "ALARMA":
                elegirModelo(scanner, "Alarma", new String[]{"Inalámbrica", "Con cable", "Automática"});
                break;
            case "SENSOR":
                elegirModelo(scanner, "Sensor", new String[]{"Movimiento", "Puerta/ventana", "Humo"});
                break;
            default:
                System.out.println("Tipo de producto no disponible.");
        }
    }

    public static void elegirExtension(Scanner scanner) {
        System.out.print("Seleccione la marca de extensión que desea comprar: PHILIPS/BELKIN/TRIPP-LITE: ");
        String marcaExtension = scanner.nextLine().toUpperCase();

        switch (marcaExtension) {
            case "PHILIPS":
                elegirModelo(scanner, "Philips", new String[]{"6 tomas", "8 tomas", "10 tomas"});
                break;
            case "BELKIN":
                elegirModelo(scanner, "Belkin", new String[]{"4 tomas", "6 tomas", "8 tomas"});
                break;
            case "TRIPP-LITE":
                elegirModelo(scanner, "Tripp-Lite", new String[]{"3 tomas", "6 tomas", "12 tomas"});
                break;
            default:
                System.out.println("Marca no disponible.");
        }
    }

    public static void elegirModelo(Scanner scanner, String marca, String[] modelos) {
        System.out.println("Seleccione el modelo de " + marca + " que desea comprar:");
        for (int i = 0; i < modelos.length; i++) {
            System.out.println((i + 1) + ". " + modelos[i]);
        }
        int seleccionModelo = scanner.nextInt();
        scanner.nextLine();

        if (seleccionModelo >= 1 && seleccionModelo <= modelos.length) {
            String modeloSeleccionado = modelos[seleccionModelo - 1];
            double precio = calcularPrecio(marca, modeloSeleccionado);
            procesarCompra(scanner, marca + " " + modeloSeleccionado, precio);
        } else {
            System.out.println("Modelo no disponible.");
        }
    }

    public static double calcularPrecio(String marca, String modelo) {
        switch (marca.toUpperCase()) {
            case "DELL":
                switch (modelo) {
                    case "XPS 13":
                        return 1000.00;
                    case "Inspiron 15":
                        return 800.00;
                    case "Alienware m15":
                        return 1500.00;
                }
                break;
            case "HP":
                switch (modelo) {
                    case "Spectre x360":
                        return 1200.00;
                    case "Pavilion 15":
                        return 750.00;
                    case "Omen 15":
                        return 1400.00;
                }
                break;
            case "LENOVO":
                switch (modelo) {
                    case "ThinkPad X1 Carbon":
                        return 1300.00;
                    case "Yoga C940":
                        return 900.00;
                    case "Legion 5":
                        return 1100.00;
                }
                break;
            case "APPLE":
                switch (modelo) {
                    case "iPhone 13":
                        return 999.00;
                    case "iPhone 12":
                        return 799.00;
                    case "iPhone SE":
                        return 399.00;
                }
                break;
            case "SAMSUNG":
                switch (modelo) {
                    case "Galaxy S21":
                        return 799.00;
                    case "Galaxy Note 20":
                        return 999.00;
                    case "Galaxy A52":
                        return 499.00;
                }
                break;
            case "XIAOMI":
                switch (modelo) {
                    case "Mi 11":
                        return 749.00;
                    case "Redmi Note 10":
                        return 199.00;
                    case "Poco X3":
                        return 299.00;
                }
                break;
            case "DURACELL":
                switch (modelo) {
                    case "Compacta":
                        return 10.00;
                    case "Ultra":
                        return 15.00;
                    case "Pro":
                        return 20.00;
                }
                break;
            case "EVEREADY":
                switch (modelo) {
                    case "Energizer":
                        return 12.00;
                    case "Super Heavy Duty":
                        return 8.00;
                    case "LED":
                        return 18.00;
                }
                break;
            case "MAGLITE":
                switch (modelo) {
                    case "Mini":
                        return 25.00;
                    case "ML300":
                        return 50.00;
                    case "Solitaire":
                        return 30.00;
                }
                break;
            case "CÁMARA":
                switch (modelo) {
                    case "Domo":
                        return 150.00;
                    case "Bullet":
                        return 200.00;
                    case "PTZ":
                        return 300.00;
                }
                break;
            case "ALARMA":
                switch (modelo) {
                    case "Inalámbrica":
                        return 100.00;
                    case "Con cable":
                        return 80.00;
                    case "Automática":
                        return 120.00;
                }
                break;
            case "SENSOR":
                switch (modelo) {
                    case "Movimiento":
                        return 50.00;
                    case "Puerta/ventana":
                        return 30.00;
                    case "Humo":
                        return 70.00;
                }
                break;
            case "PHILIPS":
                switch (modelo) {
                    case "6 tomas":
                        return 25.00;
                    case "8 tomas":
                        return 35.00;
                    case "10 tomas":
                        return 45.00;
                }
                break;
            case "BELKIN":
                switch (modelo) {
                    case "4 tomas":
                        return 15.00;
                    case "6 tomas":
                        return 25.00;
                    case "8 tomas":
                        return 35.00;
                }
                break;
            case "TRIPP-LITE":
                switch (modelo) {
                    case "3 tomas":
                        return 10.00;
                    case "6 tomas":
                        return 20.00;
                    case "12 tomas":
                        return 40.00;
                }
                break;
        }
        return 0.0;
    }

    public static void procesarCompra(Scanner pago, String producto, double precioUnitario) {
        System.out.println("El precio de " + producto + " es $" + precioUnitario);
        System.out.print("¿Cuántas unidades desea comprar? ");
        int unidades = pago.nextInt();
        pago.nextLine();

        double precioTotal = unidades * precioUnitario;
        System.out.println("El total a pagar es: $" + precioTotal);

        procesarPago(precioTotal);
    }

    public static void procesarPago(double precioTotal) {
        final double IGV_PORCENTAJE = 18.0;
        Scanner pago = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de pago de Promart");
        double igv = calcularIGV(precioTotal, IGV_PORCENTAJE);
        double montoTotal = calcularTotal(precioTotal, IGV_PORCENTAJE);
        System.out.println("Monto del IGV (" + IGV_PORCENTAJE + "%): $" + redondear(igv));
        System.out.println("Monto total a pagar: $" + redondear(montoTotal));
        System.out.println("Seleccione su método de pago:");
        System.out.println("1. Tarjeta de débito");
        System.out.println("2. Pago en efectivo");
        int metodoPago = Integer.parseInt(pago.nextLine());
        switch (metodoPago) {
            case 1:
                pagarConTarjeta(pago);
                break;
            case 2:
                pagarEnEfectivo(pago);
                break;
            default:
                System.out.println("Método de pago no válido.");
        }
        imprimirBoleta(precioTotal, igv, montoTotal);
    }

    public static double calcularIGV(double precioTotal, double igvPorcentaje) {
        return precioTotal * igvPorcentaje / 100;
    }

    public static double calcularTotal(double precioTotal, double igvPorcentaje) {
        return precioTotal + calcularIGV(precioTotal, igvPorcentaje);
    }

    public static double redondear(double valor) {
        return Math.round(valor * 100.0) / 100.0;
    }

    public static void pagarConTarjeta(Scanner pago) {
        System.out.print("Ingrese el nombre del titular de la tarjeta: ");
        String titular = pago.nextLine();
        System.out.print("Ingrese el número de tarjeta: ");
        String tarjeta = pago.nextLine();
        System.out.print("Ingrese la fecha de vencimiento (MM/YY): ");
        String vencimiento = pago.nextLine();
        System.out.print("Ingrese el código de seguridad: ");
        int seguridad = Integer.parseInt(pago.nextLine());
        System.out.println("Procesando pago con tarjeta...");
        System.out.println("¡Pago exitoso!");
    }

    public static void pagarEnEfectivo(Scanner pago) {
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

    public static void main(String[] args) {
        PROMARTHOMECENTER promar = new PROMARTHOMECENTER();
        promar.fEDAD();
    }
} 
