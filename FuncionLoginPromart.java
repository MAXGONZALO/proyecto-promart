import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Promart {

    static class Usuario {
        String nombre;
        String apellido;
        String dni;
        LocalDate fechaNacimiento;
        String usuario;
        String contrasena;

        public Usuario(String nombre, String apellido, String dni, LocalDate fechaNacimiento, String usuario, String contrasena) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.dni = dni;
            this.fechaNacimiento = fechaNacimiento;
            this.usuario = usuario;
            this.contrasena = contrasena;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Usuario[] usuariosRegistrados = new Usuario[10]; // Array para almacenar hasta 10 usuarios
        int totalUsuarios = 0;

        // Mensaje de bienvenida
        System.out.println("Bienvenido a Promart Home Center");

        // Proceso de registro
        while (totalUsuarios < usuariosRegistrados.length) {
            System.out.println("\nPor favor, completa tu registro:");

            System.out.print("Nombre: ");
            String nombreUsuario = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellidoUsuario = scanner.nextLine();

            System.out.print("Número de DNI: ");
            String dniUsuario = scanner.nextLine();

            System.out.print("Fecha de Nacimiento (DD/MM/AAAA): ");
            String fechaNacimientoStr = scanner.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);

            // Verificar edad para restricción de registro
            LocalDate fechaActual = LocalDate.now();
            int edad = fechaActual.getYear() - fechaNacimiento.getYear();

            if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue() ||
                    (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue() &&
                            fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
                edad--;
            }

            if (edad < 18) {
                System.out.println("Lo siento, no puedes registrarte. Debes ser mayor de 18 años.");
                continue; // Volver a solicitar el registro si no cumple con la edad mínima
            }

            System.out.print("Nombre de usuario: ");
            String usuarioRegistrado = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasenaRegistrada = scanner.nextLine();

            // Crear un nuevo usuario y agregarlo al array
            usuariosRegistrados[totalUsuarios] = new Usuario(nombreUsuario, apellidoUsuario, dniUsuario, fechaNacimiento, usuarioRegistrado, contrasenaRegistrada);
            totalUsuarios++;

            // Mostrar mensaje de registro exitoso
            System.out.println("\nRegistro exitoso. Ahora puedes iniciar sesión.");

            // Preguntar al usuario si desea registrar otro usuario
            System.out.print("¿Deseas registrar otro usuario? (s/n): ");
            String opcion = scanner.nextLine();
            if (!opcion.equalsIgnoreCase("s")) {
                break; // Salir del bucle si la respuesta no es 's'
            }
        }

        // Inicio de sesión
        System.out.print("\nInicia sesión:\nUsuario: ");
        String usuarioInput = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasenaInput = scanner.nextLine();

        // Verificar el inicio de sesión
        boolean loginExitoso = false;
        Usuario usuarioLogueado = null;
        for (int i = 0; i < totalUsuarios; i++) {
            if (usuarioInput.equals(usuariosRegistrados[i].usuario) && contrasenaInput.equals(usuariosRegistrados[i].contrasena)) {
                loginExitoso = true;
                usuarioLogueado = usuariosRegistrados[i];
                break;
            }
        }

        if (loginExitoso) {
            // Mostrar mensaje de bienvenida al usuario logueado
            System.out.println("\n¡Login exitoso! Bienvenido a Promart Home Center, " + usuarioLogueado.nombre + " " + usuarioLogueado.apellido + ".");
            System.out.println("Número de DNI: " + usuarioLogueado.dni);
            System.out.println("Fecha de Nacimiento: " + usuarioLogueado.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            // Mostrar categorías de productos disponibles
            System.out.println("\nCategorías disponibles:");
            System.out.println("1. Herramientas");
            System.out.println("2. Pinturas");
            System.out.println("3. Muebles para dormitorio");
            System.out.println("4. Tecnología");

            // Selección de categoría
            System.out.print("\nSeleccione la categoría de productos que desea explorar (1-4): ");
            int opcionCategoria = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            // Procesar la selección de categoría
            switch (opcionCategoria) {
                case 1:
                    System.out.println("\nExplorando la categoría de Herramientas...");
                    // Aquí puedes agregar la lógica para mostrar productos de Herramientas
                    break;
                case 2:
                    System.out.println("\nExplorando la categoría de Pinturas...");
                    // Aquí puedes agregar la lógica para mostrar productos de Pinturas
                    break;
                case 3:
                    System.out.println("\nExplorando la categoría de Muebles para dormitorio...");
                    // Aquí puedes agregar la lógica para mostrar productos de Muebles para dormitorio
                    break;
                case 4:
                    System.out.println("\nExplorando la categoría de Tecnología...");
                    // Aquí puedes agregar la lógica para mostrar productos de Tecnología
                    break;
                default:
                    System.out.println("\nOpción de categoría no válida.");
                    break;
            }

        } else {
            System.out.println("\nUsuario o contraseña incorrectos. Por favor, intenta de nuevo.");
        }

        scanner.close();
    }
}
