import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class SISPROMART {

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


        System.out.println("Bienvenido a Promart Home Center");

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


            LocalDate fechaActual = LocalDate.now();
            int edad = fechaActual.getYear() - fechaNacimiento.getYear();

            if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue() ||
                    (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue() &&
                            fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
                edad--;
            }

            if (edad < 18) {
                System.out.println("Lo siento, no puedes registrarte. Debes ser mayor de 18 años.");
                continue;
            }

            System.out.print("Nombre de usuario: ");
            String usuarioRegistrado = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasenaRegistrada = scanner.nextLine();

            usuariosRegistrados[totalUsuarios] = new Usuario(nombreUsuario, apellidoUsuario, dniUsuario, fechaNacimiento, usuarioRegistrado, contrasenaRegistrada);
            totalUsuarios++;


            System.out.println("\nRegistro exitoso. Ahora puedes iniciar sesión.");


            System.out.print("¿Deseas registrar otro usuario? (s/n): ");
            String opcion = scanner.nextLine();
            if (!opcion.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.print("\nInicia sesión:\nUsuario: ");
        String usuarioInput = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasenaInput = scanner.nextLine();

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
            System.out.println("\n¡Login exitoso! Bienvenido a Promart Home Center, " + usuarioLogueado.nombre + " " + usuarioLogueado.apellido + ".");
            System.out.println("Número de DNI: " + usuarioLogueado.dni);
            System.out.println("Fecha de Nacimiento: " + usuarioLogueado.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        } else {
            System.out.println("\nUsuario o contraseña incorrectos. Por favor, intenta de nuevo.");
        }

        scanner.close();
    }
}






class promartfin1 {

    Scanner grinch = new Scanner(System.in);
    String[]categorias = {"Tecnologia", "ElectroHogar", "Muebles" , "Baño" , "Cocina" , "Dormitorio" , "Herramientas" , "Electricidad"};
    String[]tecnologia = {"computo" , "tv y video" , "telefonia" , "casa inteligente" , "audio" , "video juegos"};
    String[]ElectroHogar = {"refrigeracion" , "lavadoras" , "cuidado personal" , "electrodomesticos de cocina" , "termas" };
    String[]Muebles = {"Muebles de dormitorio" , "muebles de oficina" , "muebles de sala"};
    String[]Baño = {"combos de baño", "inodoro" , "muebles para baño"};
    String[]cocina = {"muebles para cocina" , "organizadores de cocina" , "utesilios de cocina"};
    String[]Dormitorio = {"Ropas de Cama" , "camas" , "colchones"};
    String[]Herramientas = {"Herramientas electricas portatiles" , "herramientas estacionarias" , "herramientas inalambricas"};
    String[]Electricidad = {"cables electricos" , "interruptores" , "seguridad"};
    String[]Jardinería = {"Riego", "Maquinas para jardineria" , "Herramientas para jardin"};
    String[]Iluminacion= {"Lamparas decorativas" , "Focos" , "Ilumincacion interior"};
    String[]Infantil = {"Seguridad infantil" , "Baño infantil" , "juegos infantiles"};
    String[]Automotriz = {"Accesorios para autos" , "Llantas" , "Limpieza para auto"};
    String[]Mascotas = {"Perros" , "Gatos" , "Conejos y hamsters"};
    String[]Salud_y_Deportes = {"Cuidado de la salud" , "Maquinas de gimnasio" , "Salud infantil"};

  
    String[][] subproductoscomputo = {
            {"Samsung", "LG", "Sony"},
            {"HP", "Dell", "Apple"},
            {"Apple", "Samsung", "Huawei"},
    };
    String[][][] subMarcascomputo = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] precioscomputo = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][] subproductostvyvideo = {
            {"Samsung" , "LG" , "Blackline"},
            {"Cables HDMI, VGA y de audio"},
            {"Convertidores Smart TV",}

    };
    String[][][] subMarcastvyvideo = {
            {{"Smart Tv Samsung Crystal UHD 65´ ", "Smart TV Samsung Crystal 50´", "Smart Tv Samsung UHD 45´"}, {"LG Smart Tv LED 55¨", "LG Smart Tv QNED 65¨", "LG smart Tv ThinQ 75"}, {"Tv BLACKLINE LED 75¨", "Tv BLACKLINE LED 65 UHD", "Tv BLACKLINE LED 55"}},
            {{"PROLINK 1", "", "PROLINK 2"}, {"XTECH PRO", "XTECH UHD", "XTECH PLUS"}, {"Vention ABJ N", "Vention ABJ JN", "Vention ABJ BJ"}},
            {{"Dispositivo de Tv Fire", "Dispositivo de Tv Fire Tv Stick Lite Amazon", "Dispositivo de Streaming Onn Google TV 4K Streaming Box"}},

    };

    double[][][] preciostvyvideo = {
            {{1899, 1299, 1215}, {1499, 1899, 2249}, {2399, 1399, 950}},
            {{31, 39, 41}, {59, 65, 69}, {15, 25, 35}},
            {{250, 155, 199}},


    };
    String[][] subproductostelefonia = {
            {"Samsung" , "Xiaomi" , "Honor"},
            {"Samsung" , "Xiaomi" , "Apple"},
            {"Samsung" , "apple" , "Phillips"},



    };
    String[][][] subMarcasTelefonia = {
            {{"Samsung a22", "Samsung s21", "Samsung s22"}, {"Redmi note 10", "Redmi note 11", "Xiaomi 11t"}, {"Honor X8b", "Honor X6b", "Honor magic 6 lite"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosTelefonia = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][][] subproductosCasaInteligente = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasCasaInteligente = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosCasaInteligente = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][][] subproductosAudio = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };

    String[][][] subMarcasAudio= {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosAudio = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };





    String[][] subproductosVideoJuegos = {
            {"Samsung", "LG", "Sony"},
            {"HP", "Dell", "Apple"},
            {"Apple", "Samsung", "Huawei"},
    };
    String[][][] subMarcasVideoJuegos = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosVideoJuegos = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][] subproductosrefrigeracion = {
            {"Samsung" , "LG" , "Blackline"},
            {"Cable hdmi 2.0" , "cable hdmi 1.5" , "cable hdmi 8k"},
            {"dispositivo de tv 4k fire" , "dispositivo de tv fire lite amazon"},

    };
    String[][][] subMarcasrefrigeracion = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosrefrigeracion = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][][] subproductoslavadoras = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcaslavadoras = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] precioslavadoras = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][][] subproductosCuidadoPersonal = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasCuidadoPersonal = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosCuidadoPersonal = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][][] subproductosElectrodomesticosCocina= {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };

    String[][][] subMarcasElectrodomesticosCocina = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] precioselElectrodomesticosCocina = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };







    String[][] subproductostermas = {
            {"Samsung", "LG", "Sony"},
            {"HP", "Dell", "Apple"},
            {"Apple", "Samsung", "Huawei"},
    };
    String[][][] subMarcastermas = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciostermas = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][] subproductosMueblesDormitorio = {
            {"Samsung" , "LG" , "Blackline"},
            {"Cable hdmi 2.0" , "cable hdmi 1.5" , "cable hdmi 8k"},
            {"dispositivo de tv 4k fire" , "dispositivo de tv fire lite amazon"},

    };
    String[][][] subMarcasMueblesDormitorio = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosMueblesDormitorio = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][][] subproductosMueblesOficina = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasMueblesOficina = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosMueblesOficina = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };
    String[][][] subproductosMueblesSala = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasMueblesSala = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosMueblesSala = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };





    String[][][] subproductosCombosBaño = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasCombosBaño = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosCombosBaño = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };









    String[][][] subproductosinodoro = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasinodoro = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosinodoro = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };







    String[][][] subproductosMueblesBaño= {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasMueblesBaño = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosMueblesBaño = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };





    String[][][] subproductosMueblesCocina = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasMueblesCocina = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosMueblesCocina = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };






    String[][][] subproductosUtesiliosCocina = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasUtesiliosCocina = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosUtesiliosCocina = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };











    String[][][] subproductosRopasCama = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasRopasCama = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosRopasCama = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };








    String[][][] subproductoscamas= {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcascamas= {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] precioscamas = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductoscolchones = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcascolchones = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] precioscolchones = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };





    String[][][] subproductosHerramientasElectricasPortatiles = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasHerramientasElectricasPortatiles = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosHerramientasElectricasPortatiles = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };




    String[][][] subproductosHerramientasEstacionarias = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasHerramientasEstacionarias = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosHerramientasEstacionarias = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };





    String[][][] subproductosHerramientasInalambricas = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasHerramientasInalambricas = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosHerramientasInalambricas = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosCablesElectricos = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasCablesElectricos = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosCablesElectricos = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };




    String[][][] subproductosinterruptores = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasinterruptores = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosinterruptores = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosseguridad = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasseguridad = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosseguridad = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosRiego = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasRiego = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosRiego = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosMaquinasJardineria= {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasMaquinasJardineriaGatos = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosMaquinasJardineria = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };

    String[][][] subproductosHerramientasJardin = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasHerramientasJardin = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosHerramientasJardin = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosLamparasDecorativas = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasLamparasDecorativas = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosLamparasDecorativas = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };


    String[][][] subproductosFocos = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasFocos= {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosFocos= {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };


    String[][][] subproductosIlumincacionInterior = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasIlumincacionInterior = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosIlumincacionInterior = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };


    String[][][] subproductosSeguridadInfantil = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasSeguridadInfantil = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosSeguridadInfantil = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };


    String[][][] subproductosBañoinfantil = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasBañoinfantil = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosBañoinfantil = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };


    String[][][] subproductosjuegosInfantiles = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasMjuegosInfantiles = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosjuegosInfantiles = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };




    String[][][] subproductosAccesoriosAutos = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasAccesoriosAutos = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosAccesoriosAutos = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosLlantas = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasLlantas = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosLlantas = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };


    String[][][] subproductosLimpiezaAuto = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasLimpiezaAuto = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosLimpiezaAuto= {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosCuidadoSalud = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasCuidadoSalud = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosCuidadoSalud = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosMaquinasGimnasio = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasMaquinasGimnasio = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosMaquinasGimnasio = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };



    String[][][] subproductosSaludInfantil = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    String[][][] subMarcasSaludInfantil = {
            {{"Samsung Model A", "Samsung Model B", "Samsung Model C"}, {"LG Model X", "LG Model Y", "LG Model Z"}, {"Sony Model 1", "Sony Model 2", "Sony Model 3"}},
            {{"HP Pavilion", "HP Envy", "HP Spectre"}, {"Dell Inspiron", "Dell XPS", "Dell Latitude"}, {"Apple MacBook Air", "Apple MacBook Pro", "Apple iMac"}},
            {{"iPhone 12", "iPhone 13", "iPhone 14"}, {"Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23"}, {"Huawei P40", "Huawei P50", "Huawei P60"}}

    };
    double[][][] preciosSaludInfantil = {
            {{1500, 1600, 1700}, {1200, 1300, 1400}, {1000, 1100, 1200}},
            {{1200, 1300, 1400}, {1000, 1100, 1200}, {1400, 1500, 1600}},
            {{800, 900, 1000}, {750, 850, 950}, {700, 800, 900}}


    };






    String[] productos = {"celulares", "cocinas", "sofa", "herramientas"};
    Random random = new Random();
    int s = random.nextInt(productos.length);
    double[] precio = {1000, 0.18, 500, 300, 250, 320};
    double[] subtotal_extra = {0, 0, 0, 0};
    double igv, subtotal, totalpagar;
    int[] marcastecnologia = new int[subproductoscomputo.length];
    int[] carrito1 = new int[tecnologia.length];
    int[] carrito2 = new int[ElectroHogar.length];
    int[]marcasSeleccionadas = new int[categorias.length];
    int[] subMarcasSeleccionadas = new int[tecnologia.length];
    String[] servicios;
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
        System.out.println(" 1.- Categorias");
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
            for (int i = 0; i < subproductoscomputo[productoSeleccionado].length; i++) {
                System.out.println("Opcion " + (i + 1) + " : " + subproductoscomputo[productoSeleccionado][i]);
            }
            int marcaSeleccionada = grinch.nextInt();
            grinch.nextLine();
            if (marcaSeleccionada >= 1 && marcaSeleccionada <= subMarcascomputo[productoSeleccionado].length) {
                int marcaIndex = marcaSeleccionada - 1;
                System.out.println("Seleccione el modelo de la marca");
                for (int i = 0; i < subMarcascomputo[productoSeleccionado][marcaIndex].length; i++) {
                    System.out.println("Opcion " + (i + 1) + " : " + subMarcascomputo[productoSeleccionado][marcaIndex][i] + " - Precio: S/ " + precioscomputo[productoSeleccionado][marcaIndex][i]);
                }
                int subMarcaSeleccionada = grinch.nextInt();
                grinch.nextLine();
                if (subMarcaSeleccionada >= 1 && subMarcaSeleccionada <= subMarcascomputo[productoSeleccionado][marcaIndex].length) {
                    System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                    cantidad = grinch.nextInt();
                    grinch.nextLine();
                    carrito1[productoSeleccionado] += cantidad;
                    marcasSeleccionadas[productoSeleccionado] = marcaIndex;
                    subMarcasSeleccionadas[productoSeleccionado] = subMarcaSeleccionada - 1;
                    this.ComprarMas();
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

    public String ComprarMas() {
        System.out.println("¿Desea comprar más productos de tecnología? (S/N)");
        respuesta = grinch.nextLine();
        if (respuesta.equals("S") || respuesta.equals("s")) {
            this.ComprarProducto();
        } else if (respuesta.equals("N") || respuesta.equals("n")) {
            this.ResumenCompra();
        } else {
            System.out.println("Opcion no válida");
            this.ComprarMas();
        }
        return null;
    }

    public String ComprarExtra() {
        System.out.println("------SERVICIOS----------");
        for (int i = 0; i < servicios.length; i++) {
            System.out.println("Opcion " + (i + 1) + " : " + servicios[i] + " - Precio: S/ " + precio[i]);
        }
        opcion = grinch.nextInt();
        grinch.nextLine();
        if (opcion >= 1 && opcion <= servicios.length) {
            int servicioSeleccionado = opcion - 1;
            System.out.println("¿Cuantos comprará? Ingrese la cantidad");
            cantidad = grinch.nextInt();
            grinch.nextLine();
            carrito2[servicioSeleccionado] += cantidad;
        } else {
            System.out.println("Opcion no válida");
            this.ComprarExtra();
            this.ComprarMasExtra();
        }
        return null;
    }

    public String ComprarMasExtra() {
        System.out.println("¿Desea comprar más productos extra? (S/N)");
        respuesta = grinch.nextLine();
        if (respuesta.equals("S") || respuesta.equals("s")) {
            this.ComprarExtra();
        } else if (respuesta.equals("N") || respuesta.equals("n")) {
            this.ResumenCompraExtra();
        } else {
            System.out.println("Opcion no válida");
            this.ComprarMasExtra();
        }
        return null;
    }

    public String ResumenCompra() {
        subtotal = 0;
        igv = 0;
        totalpagar = 0;
        System.out.println("------Resumen de compra TECNOLOGIA------");
        for (int i = 0; i < tecnologia.length; i++) {
            if (carrito1[i] > 0) {
                System.out.println(tecnologia[i] + " - " + subproductoscomputo[i][marcasSeleccionadas[i]] + " - " +
                        subMarcascomputo[i][marcasSeleccionadas[i]][subMarcasSeleccionadas[i]] +
                        " - Cantidad: " + carrito1[i] + " - Subtotal: S/ " +
                        (precioscomputo[i][marcasSeleccionadas[i]][subMarcasSeleccionadas[i]] * carrito1[i]));
                subtotal += precioscomputo[i][marcasSeleccionadas[i]][subMarcasSeleccionadas[i]] * carrito1[i];
            }
        }
        igv = subtotal * 0.18;
        totalpagar = subtotal + igv;
        System.out.println("Subtotal: S/ " + subtotal);
        System.out.println("IGV (18%): S/ " + igv);
        System.out.println("TOTAL A PAGAR: S/ " + totalpagar);
        this.Pago();
        return null;
    }

    public String ResumenCompraExtra() {
        subtotal_extra[0] = 0;
        subtotal_extra[1] = 0;
        subtotal_extra[2] = 0;
        subtotal_extra[3] = 0;
        System.out.println("------Resumen de compra SERVICIOS--------");
        for (int i = 0; i < servicios.length; i++) {
            if (carrito2[i] > 0) {
                System.out.println(servicios[i] + " - Cantidad: " + carrito2[i] + " - Subtotal: S/ " +
                        (precio[i] * carrito2[i]));
                subtotal_extra[i] += precio[i] * carrito2[i];
            }
        }
        subtotal = subtotal + subtotal_extra[0] + subtotal_extra[1] + subtotal_extra[2] + subtotal_extra[3];
        igv = subtotal * 0.18;
        totalpagar = subtotal + igv;
        System.out.println("Subtotal: S/ " + subtotal);
        System.out.println("IGV (18%): S/ " + igv);
        System.out.println("TOTAL A PAGAR: S/ " + totalpagar);
        return null;
    }

    public String Pago() {
        Scanner grinch = new Scanner(System.in);
        System.out.println("---------MÉTODOS DE PAGO-----------");
        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de crédito/débito");
        System.out.println("2. Efectivo");
        int metodoPago = grinch.nextInt();
        grinch.nextLine();

        switch (metodoPago) {
            case 1:
                System.out.println("Pagado con tarjeta de crédito/débito");
                System.out.println("Imprimiendo boleta de venta ESPERE POR FAVOR...");
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
                System.out.println("║ SUBTOTAL :"                       + subtotal);
                System.out.println("║ IGV :     "                       + igv);
                System.out.println("║ TOTAL :   "                       + totalpagar);
                System.out.println("║                                            ║");
                System.out.println("╚════════════════════════════════════════════╝");
                System.out.println("");
                System.out.println("¡PAGO REALIZADO CON EXITO!");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                break;
            default:
                System.out.println("Opción no válida. Seleccione nuevamente.");
                this.Pago();
                break;
        }
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
        this.exportarboleta();
        return null;

    }

    public void exportarboleta() {
        try {
            File archivo = new File("D:\\boleta de venta.txt");
            FileWriter escritor = null;
            try {
                escritor = new FileWriter(archivo);
                System.out.println("____________");
                escritor.write("-------BOLETA DE VENTA-------\n");
                System.out.println("____________");
                escritor.write("--SUBTOTAL--:\n" + subtotal);
                escritor.write("--IGV--:\n "     + igv);
                escritor.write("--TOTAL--:\n"   + totalpagar);
                System.out.println("_____________");
                escritor.close();
            } catch (IOException e) {
                System.out.println("ERROR AL EXPORTAR LA BOLETA");
                throw new RuntimeException(e);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);

        }

    }
}

