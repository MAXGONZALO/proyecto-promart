import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;


public class pr {
    Scanner GRINCH= new Scanner(System.in);
    String nombre,correo_in,contrasenia_in,apellido,dni,correo,contrasenia,u;
    int biblias,ropas,cuadernos,variedad;
    int opcion, cantidad,productos,opci;
    double e;
    String[] tecnologia1 = {"iPhone 12", "iPhone 13", "iPhone 14", "Samsung Galaxy S21", "Samsung Galaxy S22", "Samsung Galaxy S23", "Huawei P40", "Huawei P50", "Huawei P60"};
    String[] genero = {"telefonia"};
    Random random = new Random();
    int g = random.nextInt(genero.length);
    double[] precio = {20, 0.18, 5, 10, 15, 8};
    double[] subtotal_accesorio = {0, 0, 0, 0};
    double igvmini, subtotalmini, totalpagar;
    double IGV, SUBTOTAL,TOTALPAGAR;
    int[] carrito = new int[tecnologia1.length];
    public String Datos(){
        System.out.println("---PROMARTHOMECENTER---");
        System.out.println("¿CREAR CUENTA?");
        System.out.println("---REGISTRATE---");
        do {
            System.out.print("E-mail: ");
            correo = GRINCH.nextLine();
            if (correo.indexOf("@gmail.com") == -1) {
                System.out.println("El correo debe contener '@gmail.com'.");
            } else {
                System.out.println("...");
            }
        }while (correo.indexOf("@gmail.com") == -1);
        System.out.print("Crea una contraseña: ");
        contrasenia=GRINCH.nextLine();
        String[] usuario= {""+correo};
        String[] contra = {""+contrasenia};
        System.out.println("Cuenta registrada");
        System.out.print("Nombres: ");
        nombre= GRINCH.nextLine();
        System.out.print("Apellidos: ");
        apellido= GRINCH.nextLine();
        do {
            System.out.print("Documento de identidad (8 dígitos): ");
            dni = GRINCH.nextLine();
        } while (dni.length() != 8);

        do {
            boolean autenticacion = false;
            for (int i = 0; i < usuario.length; i++) {
                System.out.println("INICIAR SESION");
                System.out.print("Correo electrónico: ");
                correo_in = GRINCH.nextLine();
                System.out.print("Contraseña: ");
                contrasenia_in = GRINCH.nextLine();
                if (usuario[i].equals(correo_in) && contra[i].equals(contrasenia_in)) {
                    autenticacion = true;
                    break;
                }
            }

            if (autenticacion) {
                System.out.println("----¡INICIO DE SESION EXITOSA!----" +
                        "BIENVENIDO");
                this.Menu();
            } else {
                System.out.println("Correo y/o contraseña incorrectos.");
            }
        }while(correo!=correo_in||contrasenia!=contrasenia_in);
        return null;
    }
    //case1//;
    String[] tecnologia = {"..Laptop LENOVO IDEAPAD SLIM..", "..Laptop Lenovo LOQ..", "..Laptop Lenovo ThinkPad X1 Yoga..", "..Laptop HP 15-fd0002la..", "Laptop HP 250 G10", "Laptop HP PAVILION 15", "Laptop Asus tuf AMD R5", "Laptop ASUS TUF A15","volver atras"};
    double [] tecnologia_precio={1799.0,2499.0,2249.0,1499.0,1530.0,2499.0,2700.0,3100.0};
    String [] joven={"BIBLIA JÓVENES - TURQUESA-----S/152.0","BIBLIA JÓVENES - VERDE-----S/152.0","Biblia Reina Valera 1960 Letra Grande Funda Cremallera-----S/124.0","----Volver Atras-----"};
    double [] joven_precio={152.0,152.0,124.0};
    String [] estudio={"BIBLIA DE LA ESPERANZA-----S/120.0","BIBLIA DE ESTUDIO SPURGEON-----S/179.0","BIBLIA ILUSTRADA DE LA TIERRA SANTA-----S/290.0","BIBLIA DE ESTUDIO ANDREWS - CUERO GENUINO-----S/450.0","----Volver Atras-----"};
    double [] estudio_precio={120.0,179.0,290.0,450.0};
    //case2//
    String [] profecias={"El camino a Cristo TD - Azul-----S/25.0","CRISTO EN SU SANTUARIO-----S/26.0","CARTAS A JOVENES ENAMORADOS - TD - AZUL, UNI-----S/26.0","FE Y OBRAS-----S/26.0","EL DISCURSO MAESTRO DE JESUCRISTO - TD-----S/26.0","----Volver Atras-----"};
    double [] profecias_precio={25.0,26.0,26.0,26.0,26.0};
    String [] himnarios={"HIMNARIO ADVENTISTA NUEVO BOLSILLO - AMARILLO-----S/19.0","HIMNARIO ADVENTISTA NUEVO BOLSILLO - TURQUESA-----S/19.5","HIMNARIO ADVENTISTA NUEVO BOLSILLO - MORADO-----S/19.5","HIMNARIO ADVENTISTA CON MUSICA GRANDE-----S/67.0","HIMNARIO ADVENTISTA LETRA GIGANTE - INSTRUMENTOS-----S/67.0","----Volver Atras-----"};
    double [] himnarios_precio={19.0,19.5,19.5,67.0,67.0};
    //Case3//
    String [] hogar={"REPOSO DIVINO PARA LA INQUIETUD HUMANA-----S/50.0","ALEGRIAS Y DESAFIOS DE LA FAMILIA PASTORAL-----S/15.0","EL DELICADO ARTE DE CONVIVIR-----S/19.0","EDUCAR A LOS HIJOS UN ACTO DE AMOR-----S/22.5","OBEDIENCIA FÁCIL-----S/30.0","----Volver Atras-----"};
    double [] hogar_precio={50.0,15.0,19.0,22.5,30.0};
    String [] saludable={"CÓMO SUPERAR LAS CRISIS-----S/24.0","SUPERALIMENTOS-----S/29.0","RECETAS DE MI ABUELA - 2° EDICION-----S/35.0","HABITOS DE LA GENTE FELIZ-----S/35.0","COCINA VEGETARIANA-----S/40.0","----Volver Atras-----"};
    double [] saludable_precio={29.0,35.0,35.0,40.0};
    String [] lecciones={"LECCION JOVEN 2024-----S/13.0","LECCION INFANTES 2024-----S/13.0","LECCION CUNA 2024-----S/13.0","LECCION INTERMEDIARIOS 2024-----S/13.0","LECCIÓN ADULTO MAESTRO ANILLADO - EDIC. BOLSILLO 2024-----S/13.0","----Volver Atras-----"};
    double [] lecciones_precio={13.0,13.0,13.0,13.0,13.0};
    String [] matinales={"MATINAL ADULTOS TAPA DURA-----S/46.0","MATINAL JÓVENES 2024-----S/46.0","MATINAL ADOLESCENTES 2024-----S/46.0","MATINAL DAMAS 2024-----S/46.0","MATINAL NIÑOS PEQUEÑOS 2024------S/46.0","----Volver Atras-----"};
    double [] matinales_precio={46.0,46.0,46.0,46.0,46.0};
    //Case4//
    String [] buzo={"BUZO TALLA 4 UNISEX-----S/113.0","BUZO TALLA 6 UNISEX-----S/117.0","BUZO TALLA 8 UNISEX-----S/117.0","BUZO TALLA 12 UNISEX-----S/123.0","BUZO TALLA 10 UNISEX-----S/123.0","----Volver Atras-----"};
    double [] buzo_precio={113.0,117.0,117.0,123.0,123.0};
    String [] polos={"POLO BIVIDÍ TALLA 4 UNISEX-----S/27.0","POLO BIVIDÍ TALLA 6 UNISEX-----S/27.0","POLO BIVIDÍ TALLA 8 UNISEX-----S/27.0","POLO BIVIDÍ TALLA 10 UNISEX-----S/31.0","POLO BIVIDÍ TALLA 12 UNISEX-----S/31.0","----Volver Atras-----"};
    double [] polos_precio={27.0,27.0,27.0,31.0,31.0};
    String [] cuaderno={"CUADERNO ESCOLAR (UNIDAD)-----S/7.0","KIT CUADERNOS ESCOLARES-----S/35.0","----Volver Atras-----"};
    double [] cuaderno_precio={7.0,35.0};
    String [] lecturas={"CONSEJOS PARA LOS MAESTROS, PADRES Y ALUMNOS ACERCA DE LA EDUCACIÓN CRISTIANA-----S/12.0","DIVINAS MARAVILLAS- EVIDENCIAS DE DISEÑO Y PLANIFICACIÓN-----S/20.0","FILOSOFÍA Y EDUCACIÓN - GEORGE R KNIGHT-----S/25.0","OBEDIENCIA FÁCIL-----S/30.0","LA EDUCACÍON-----S/36.0","----Volver Atras-----"};
    double [] lecturas_precio={12.0,20.0,25.0,30.0,36.0};


    String [] MenuPrincipal={"--Tecnologia--","--ElectroHogar--","--Muebles--","--Baño--","--Cocina--","--Dormitorio--","--Herramientas--","Electricidad"};
    String [] menu1 ={"computo" , "tv y video" , "telefonia" , "casa inteligente" , "audio" , "video juegos","volver Atras"};
    String [] menu2 ={"Espiritu de Profecia-","Himnarios------------","----Volver Atras-----"};
    String [] menu3 ={"Lecturas--------------","Lecciones y Matinales-","----Volver Atras-----"};
    String [] menu4 ={"Familia y educacion de hijos","Salud y vida sana","----Volver Atras-----"};
    String [] menu5 ={"Lecciones","Matinales","----Volver Atras-----"};
    String [] menu6 ={"Uniformes","Variedad","----Volver Atras-----"};
    String [] menu7 ={"Buzo (casaca y pantalon)","Polos Inicial y Primaria","----Volver Atras-----"};
    String [] menu8 ={"Cuadernos","Lecturas","----Volver Atras-----"};

    int Opc,opc_1,opc_2,opc_3,opc_4,opc_6;
    int[] carritos = new int[MenuPrincipal.length];
    double[] subtotal = new double[80];



    public double Menu(){
        System.out.println("💁‍♀️¡BIENVENIDO A PROMARTHOMECENTER! "+nombre+"--------");
        for (int i=0; i<MenuPrincipal.length;i++){
            System.out.println((i+1)+ " .- " +MenuPrincipal[i]);
        }
        System.out.print("Opcion: ");
        Opc = GRINCH.nextInt();
        switch (Opc){
            case 1:
                this.Tecnologia();
                break;
            case 2:
                this.ElectroHogar();
                break;
            case 3:
                this.Muebles();
                break;
            case 4:
                this.Baño();
                break;
            case 5:
                this.cocina();
                break;
            case 6:
                this.dormitorio();
                break;
            case 7:
                this.Herramientas();
                break;
            case 8:
                this.Electricidad();
                break;

        }
        return 0;
    }

    public double Tecnologia(){
        for (int i=0; i<menu1.length;i++){
            System.out.println((i+1)+ " : " + menu1[i]);
        }
        System.out.print("Opcion: ");
        opc_1= GRINCH.nextInt();
        switch (opc_1){
            case 1:
                System.out.println("BIBLIA PARA NIÑOS");
                for (int i=0; i<tecnologia.length;i++){
                    System.out.println((i+1)+ " : " +tecnologia[i]);
                }
                System.out.print("Opcion: ");
                productos= GRINCH.nextInt();
                if (productos > 0 && productos <= tecnologia.length) {
                    System.out.println("> " +tecnologia[productos-1]);
                    System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                    opci=GRINCH.nextInt();
                    switch (opci) {
                        case 1: System.out.println("Cantidad: ");
                            cantidad = GRINCH.nextInt();
                            GRINCH.nextLine();
                            carrito[productos - 1] += cantidad;
                            subtotal[productos - 1] = carrito[productos - 1] * tecnologia_precio[productos - 1];
                            System.out.println("Producto agregado \n "
                                    + tecnologia[productos - 1] + "\n"
                                    + "Cantidad: " + carrito[productos - 1]);
                            u=tecnologia[productos-1];
                            e=tecnologia_precio[productos - 1];
                            System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                            opcion = GRINCH.nextInt();
                            if (opcion == 1) {
                                this.Tecnologia();
                            } else if (opcion == 2) {
                                this.Carrito();
                            } else if (opcion == 3) {
                                this.Menu();
                            } else {
                                System.out.println("Opcion no válida");
                            }
                            break;
                        case 2:
                            this.Tecnologia();
                            break;
                        case 3:
                            this.Menu();
                            break;
                        default:
                            System.out.println("No disponible");
                    }
                }else {
                    System.out.println("Opcion no válida");
                    this.Tecnologia();
                }
                break;
            case 2:
                System.out.println("BIBLIA JOVEN");
                for (int i=0; i<joven.length;i++){
                    System.out.println((i+1)+ " : " +joven[i]);
                }
                System.out.print("Opcion: ");
                productos= GRINCH.nextInt();
                if (productos > 0 && productos <= joven.length) {
                    System.out.println("> " +joven[productos-1]);
                    System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                    opci=GRINCH.nextInt();
                    switch (opci) {
                        case 1: System.out.println("Cantidad: ");
                            cantidad = GRINCH.nextInt();
                            GRINCH.nextLine();
                            carrito[productos - 1] += cantidad;
                            subtotal[productos - 1] = carrito[productos - 1] * joven_precio[productos - 1];
                            System.out.println("Producto agregado \n "
                                    + joven[productos - 1] + "\n"
                                    + "Cantidad: " + carrito[productos - 1]);
                            u=joven[productos-1];
                            e=joven_precio[productos - 1];
                            System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                            opcion = GRINCH.nextInt();
                            if (opcion == 1) {
                                this.Tecnologia();
                            } else if (opcion == 2) {
                                this.Carrito();
                            } else if (opcion == 3) {
                                this.Menu();
                            } else {
                                System.out.println("Opcion no válida");
                            }
                            break;
                        case 2:
                            this.Tecnologia();
                            break;
                        case 3:
                            this.Menu();
                            break;
                        default:
                            System.out.println("No disponible");
                    }
                }else {
                    System.out.println("Opcion no válida");
                    this.Tecnologia();
                }
                break;
            case 3:
                System.out.println("BIBLIA DEL ESTUDIO");
                for (int i=0; i<estudio.length;i++){
                    System.out.println((i+1)+ " : " +estudio[i]);
                }
                System.out.print("Opcion: ");
                productos= GRINCH.nextInt();
                if (productos > 0 && productos <= estudio.length) {
                    System.out.println("> " +estudio[productos-1]);
                    System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                    opci=GRINCH.nextInt();
                    switch (opci) {
                        case 1: System.out.println("Cantidad: ");
                            cantidad = GRINCH.nextInt();
                            GRINCH.nextLine();
                            carrito[productos - 1] += cantidad;
                            subtotal[productos - 1] = carrito[productos - 1] * estudio_precio[productos - 1];
                            System.out.println("Producto agregado \n "
                                    + estudio[productos - 1] + "\n"
                                    + "Cantidad: " + carrito[productos - 1]);
                            u=estudio[productos-1];
                            e=estudio_precio[productos - 1];
                            System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                            opcion = GRINCH.nextInt();
                            if (opcion == 1) {
                                this.Tecnologia();
                            } else if (opcion == 2) {
                                this.Carrito();
                            } else if (opcion == 3) {
                                this.Menu();
                            } else {
                                System.out.println("Opcion no válida");
                            }
                            break;
                        case 2:
                            this.Tecnologia();
                            break;
                        case 3:
                            this.Menu();
                            break;
                        default:
                            System.out.println("No disponible");
                    }
                }else {
                    System.out.println("Opcion no válida");
                    this.Tecnologia();
                }
                break;
            default:
                System.out.println("No disponible");
        }
        return opcion;
    }

    public double ElectroHogar(){
        for (int i=0; i<menu2.length;i++){
            System.out.println((i+1)+ " : " + menu2[i]);
        }
        System.out.print("Opcion: ");
        opc_2= GRINCH.nextInt();
        switch (opc_2){
            case 1:
                System.out.println("ESPIRITU DE PROFECIAS");
                for (int i=0; i<profecias.length;i++){
                    System.out.println((i+1)+ " : " +profecias[i]);
                }
                System.out.print("Opcion: ");
                productos= GRINCH.nextInt();
                if (productos > 0 && productos <= profecias.length) {
                    System.out.println("> " +profecias[productos-1]);
                    System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                    opci=GRINCH.nextInt();
                    switch (opci) {
                        case 1: System.out.println("Cantidad: ");
                            cantidad = GRINCH.nextInt();
                            GRINCH.nextLine();
                            carrito[productos - 1] += cantidad;
                            subtotal[productos - 1] = carrito[productos - 1] * profecias_precio[productos - 1];
                            System.out.println("Producto agregado \n "
                                    + profecias[productos - 1] + "\n"
                                    + "Cantidad: " + carrito[productos - 1]);
                            u=profecias[productos-1];
                            e=profecias_precio[productos - 1];
                            System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                            opcion = GRINCH.nextInt();
                            if (opcion == 1) {
                                this.ElectroHogar();
                            } else if (opcion == 2) {
                                this.Carrito();
                            } else if (opcion == 3) {
                                this.Menu();
                            } else {
                                System.out.println("Opcion no válida");
                            }
                            break;
                        case 2:
                            this.ElectroHogar();
                            break;
                        case 3:
                            this.Menu();
                            break;
                        default:
                            System.out.println("No disponible");
                    }
                }else {
                    System.out.println("Opcion no válida");
                    this.ElectroHogar();
                }
                break;
            case 2:
                System.out.println("HIMNARIO");
                for (int i=0; i<himnarios.length;i++){
                    System.out.println((i+1)+ " : " +himnarios[i]);
                }
                System.out.print("Opcion: ");
                productos= GRINCH.nextInt();
                if (productos > 0 && productos <= himnarios.length) {
                    System.out.println("> " +himnarios[productos-1]);
                    System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                    opci=GRINCH.nextInt();
                    switch (opci) {
                        case 1: System.out.println("Cantidad: ");
                            cantidad = GRINCH.nextInt();
                            GRINCH.nextLine();
                            carrito[productos - 1] += cantidad;
                            subtotal[productos - 1] = carrito[productos - 1] * himnarios_precio[productos - 1];
                            System.out.println("Producto agregado \n "
                                    + himnarios[productos - 1] + "\n"
                                    + "Cantidad: " + carrito[productos - 1]);
                            u=himnarios[productos-1];
                            e=himnarios_precio[productos - 1];
                            System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                            opcion = GRINCH.nextInt();
                            if (opcion == 1) {
                                this.ElectroHogar();
                            } else if (opcion == 2) {
                                this.Carrito();
                            } else if (opcion == 3) {
                                this.Menu();
                            } else {
                                System.out.println("Opcion no válida");
                            }
                            break;
                        case 2:
                            this.ElectroHogar();
                            break;
                        case 3:
                            this.Menu();
                            break;
                        default:
                            System.out.println("No disponible");
                    }
                }else {
                    System.out.println("Opcion no válida");
                    this.ElectroHogar();
                }
                break;
            default:
                System.out.println("No disponible");
        }
        return 0;
    }
    public double Muebles(){
        for (int i=0; i<menu3.length;i++){
            System.out.println((i+1)+ " .- " + menu3[i]);
        }
        System.out.print("Opcion: ");
        opc_3= GRINCH.nextInt();
        switch (opc_3){
            case 1:
                for (int i=0; i<menu4.length;i++){
                    System.out.println((i+1)+ " .- " + menu4[i]);
                }
                System.out.print("Opcion: ");
                opc_3= GRINCH.nextInt();
                switch (opc_3){
                    case 1:
                        System.out.println("HOGAR Y FAMILIA");
                        for (int i=0; i<hogar.length;i++){
                            System.out.println((i+1)+ " : " +hogar[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= hogar.length) {
                            System.out.println("> " +hogar[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * hogar_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + hogar[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=hogar[productos-1];
                                    e=hogar_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Muebles();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Muebles();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Muebles();
                        }
                        break;
                    case 2:
                        System.out.println("VIDA SALUDABLE");
                        for (int i=0; i<saludable.length;i++){
                            System.out.println((i+1)+ " : " +saludable[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= saludable.length) {
                            System.out.println("> " +saludable[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * saludable_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + saludable[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=saludable[productos-1];
                                    e=saludable_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Muebles();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Muebles();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Muebles();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            case 2:
                for (int i=0; i<menu5.length;i++){
                    System.out.println((i+1)+ " .- " + menu5[i]);
                }
                System.out.print("Opcion: ");
                opc_3= GRINCH.nextInt();
                switch (opc_3){
                    case 1:
                        System.out.println("LECCIONES IV TRIMESTRE 2024");
                        for (int i=0; i<lecciones.length;i++){
                            System.out.println((i+1)+ " : " +lecciones[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= lecciones.length) {
                            System.out.println("> " +lecciones[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * lecciones_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + lecciones[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=lecciones[productos-1];
                                    e=lecciones_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Muebles();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Muebles();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Muebles();
                        }
                        break;
                    case 2:
                        System.out.println("MATINALES");
                        for (int i=0; i<matinales.length;i++){
                            System.out.println((i+1)+ " : " +matinales[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= matinales.length) {
                            System.out.println("> " +matinales[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * matinales_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + matinales[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=matinales[productos-1];
                                    e=matinales_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Muebles();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Muebles();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Muebles();
                        }
                        break;
                    default:
                        System.out.println("No disponible: ");
                }
                break;
            default:
                System.out.println("No disponible");
        }
        return 0;
    }
    public double Baño(){
        for (int i=0; i<menu6.length;i++){
            System.out.println((i+1)+ " .- " + menu6[i]);
        }
        System.out.print("Opcion: ");
        opc_4= GRINCH.nextInt();
        switch (opc_4){
            case 1:
                for (int i=0; i<menu7.length;i++){
                    System.out.println((i+1)+ " .- " + menu7[i]);
                }
                System.out.print("Opcion: ");
                ropas= GRINCH.nextInt();
                switch (ropas){
                    case 1:
                        System.out.println("BUZO (CASACA Y PANTALON)");
                        for (int i=0; i<buzo.length;i++){
                            System.out.println((i+1)+ " : " +buzo[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= buzo.length) {
                            System.out.println("> " +buzo[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * buzo_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + buzo[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=buzo[productos-1];
                                    e=buzo_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Baño();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Baño();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Baño();
                        }
                        break;
                    case 2:
                        System.out.println("POLOS INICILA Y PRIMARIA");
                        for (int i=0; i<polos.length;i++){
                            System.out.println((i+1)+ " : " +polos[i]);
                        }
                        System.out.print("Opcion: ");
                        productos = GRINCH.nextInt();
                        if (productos > 0 && productos <= polos.length) {
                            System.out.println("> " +polos[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * polos_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + polos[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=polos[productos-1];
                                    e=polos_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Baño();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Baño();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Baño();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            case 2:
                for (int i=0; i<menu8.length;i++){
                    System.out.println((i+1)+ " : " + menu8[i]);
                }
                System.out.print("Opcion: ");
                cuadernos= GRINCH.nextInt();
                switch (cuadernos){
                    case 1:
                        System.out.println("CUADERNOS");
                        for (int i=0; i<cuaderno.length;i++){
                            System.out.println((i+1)+ " : " +cuaderno[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= cuaderno.length) {
                            System.out.println("> " +cuaderno[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * cuaderno_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + cuaderno[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=cuaderno[productos-1];
                                    e=cuaderno_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Baño();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Baño();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Baño();
                        }
                        break;
                    case 2:
                        System.out.println("LECTURAS");
                        for (int i=0; i<lecturas.length;i++){
                            System.out.println((i+1)+ " : " +lecturas[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= lecturas.length) {
                            System.out.println("> " +lecturas[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * lecturas_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + lecturas[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=lecturas[productos-1];
                                    e=lecturas_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Baño();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Baño();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Baño();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            default:
                System.out.println("No disponible");
        }

        return 0;
    }
    public double cocina(){
            for (int i=0; i<menu6.length;i++){
                System.out.println((i+1)+ " .- " + menu6[i]);
            }
            System.out.print("Opcion: ");
            opc_4= GRINCH.nextInt();
            switch (opc_4){
                case 1:
                    for (int i=0; i<menu7.length;i++){
                        System.out.println((i+1)+ " .- " + menu7[i]);
                    }
                    System.out.print("Opcion: ");
                    ropas= GRINCH.nextInt();
                    switch (ropas){
                        case 1:
                            System.out.println("BUZO (CASACA Y PANTALON)");
                            for (int i=0; i<buzo.length;i++){
                                System.out.println((i+1)+ " : " +buzo[i]);
                            }
                            System.out.print("Opcion: ");
                            productos= GRINCH.nextInt();
                            if (productos > 0 && productos <= buzo.length) {
                                System.out.println("> " +buzo[productos-1]);
                                System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                                opci=GRINCH.nextInt();
                                switch (opci) {
                                    case 1: System.out.println("Cantidad: ");
                                        cantidad = GRINCH.nextInt();
                                        GRINCH.nextLine();
                                        carrito[productos - 1] += cantidad;
                                        subtotal[productos - 1] = carrito[productos - 1] * buzo_precio[productos - 1];
                                        System.out.println("Producto agregado \n "
                                                + buzo[productos - 1] + "\n"
                                                + "Cantidad: " + carrito[productos - 1]);
                                        u=buzo[productos-1];
                                        e=buzo_precio[productos - 1];
                                        System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                        opcion = GRINCH.nextInt();
                                        if (opcion == 1) {
                                            this.cocina();
                                        } else if (opcion == 2) {
                                            this.Carrito();
                                        } else if (opcion == 3) {
                                            this.Menu();
                                        } else {
                                            System.out.println("Opcion no válida");
                                        }
                                        break;
                                    case 2:
                                        this.cocina();
                                        break;
                                    case 3:
                                        this.Menu();
                                        break;
                                    default:
                                        System.out.println("No disponible");
                                }
                            }else {
                                System.out.println("Opcion no válida");
                                this.Baño();
                            }
                            break;
                        case 2:
                            System.out.println("POLOS INICILA Y PRIMARIA");
                            for (int i=0; i<polos.length;i++){
                                System.out.println((i+1)+ " : " +polos[i]);
                            }
                            System.out.print("Opcion: ");
                            productos = GRINCH.nextInt();
                            if (productos > 0 && productos <= polos.length) {
                                System.out.println("> " +polos[productos-1]);
                                System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                                opci=GRINCH.nextInt();
                                switch (opci) {
                                    case 1: System.out.println("Cantidad: ");
                                        cantidad = GRINCH.nextInt();
                                        GRINCH.nextLine();
                                        carrito[productos - 1] += cantidad;
                                        subtotal[productos - 1] = carrito[productos - 1] * polos_precio[productos - 1];
                                        System.out.println("Producto agregado \n "
                                                + polos[productos - 1] + "\n"
                                                + "Cantidad: " + carrito[productos - 1]);
                                        u=polos[productos-1];
                                        e=polos_precio[productos - 1];
                                        System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                        opcion = GRINCH.nextInt();
                                        if (opcion == 1) {
                                            this.cocina();
                                        } else if (opcion == 2) {
                                            this.Carrito();
                                        } else if (opcion == 3) {
                                            this.Menu();
                                        } else {
                                            System.out.println("Opcion no válida");
                                        }
                                        break;
                                    case 2:
                                        this.cocina();
                                        break;
                                    case 3:
                                        this.Menu();
                                        break;
                                    default:
                                        System.out.println("No disponible");
                                }
                            }else {
                                System.out.println("Opcion no válida");
                                this.cocina();
                            }
                            break;
                        default:
                            System.out.println("No disponible");
                    }
                    break;
                case 2:
                    for (int i=0; i<menu8.length;i++){
                        System.out.println((i+1)+ " : " + menu8[i]);
                    }
                    System.out.print("Opcion: ");
                    cuadernos= GRINCH.nextInt();
                    switch (cuadernos){
                        case 1:
                            System.out.println("CUADERNOS");
                            for (int i=0; i<cuaderno.length;i++){
                                System.out.println((i+1)+ " : " +cuaderno[i]);
                            }
                            System.out.print("Opcion: ");
                            productos= GRINCH.nextInt();
                            if (productos > 0 && productos <= cuaderno.length) {
                                System.out.println("> " +cuaderno[productos-1]);
                                System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                                opci=GRINCH.nextInt();
                                switch (opci) {
                                    case 1: System.out.println("Cantidad: ");
                                        cantidad = GRINCH.nextInt();
                                        GRINCH.nextLine();
                                        carrito[productos - 1] += cantidad;
                                        subtotal[productos - 1] = carrito[productos - 1] * cuaderno_precio[productos - 1];
                                        System.out.println("Producto agregado \n "
                                                + cuaderno[productos - 1] + "\n"
                                                + "Cantidad: " + carrito[productos - 1]);
                                        u=cuaderno[productos-1];
                                        e=cuaderno_precio[productos - 1];
                                        System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                        opcion = GRINCH.nextInt();
                                        if (opcion == 1) {
                                            this.cocina();
                                        } else if (opcion == 2) {
                                            this.Carrito();
                                        } else if (opcion == 3) {
                                            this.Menu();
                                        } else {
                                            System.out.println("Opcion no válida");
                                        }
                                        break;
                                    case 2:
                                        this.cocina();
                                        break;
                                    case 3:
                                        this.Menu();
                                        break;
                                    default:
                                        System.out.println("No disponible");
                                }
                            }else {
                                System.out.println("Opcion no válida");
                                this.cocina();
                            }
                            break;
                        case 2:
                            System.out.println("LECTURAS");
                            for (int i=0; i<lecturas.length;i++){
                                System.out.println((i+1)+ " : " +lecturas[i]);
                            }
                            System.out.print("Opcion: ");
                            productos= GRINCH.nextInt();
                            if (productos > 0 && productos <= lecturas.length) {
                                System.out.println("> " +lecturas[productos-1]);
                                System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                                opci=GRINCH.nextInt();
                                switch (opci) {
                                    case 1: System.out.println("Cantidad: ");
                                        cantidad = GRINCH.nextInt();
                                        GRINCH.nextLine();
                                        carrito[productos - 1] += cantidad;
                                        subtotal[productos - 1] = carrito[productos - 1] * lecturas_precio[productos - 1];
                                        System.out.println("Producto agregado \n "
                                                + lecturas[productos - 1] + "\n"
                                                + "Cantidad: " + carrito[productos - 1]);
                                        u=lecturas[productos-1];
                                        e=lecturas_precio[productos - 1];
                                        System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                        opcion = GRINCH.nextInt();
                                        if (opcion == 1) {
                                            this.cocina();
                                        } else if (opcion == 2) {
                                            this.Carrito();
                                        } else if (opcion == 3) {
                                            this.Menu();
                                        } else {
                                            System.out.println("Opcion no válida");
                                        }
                                        break;
                                    case 2:
                                        this.cocina();
                                        break;
                                    case 3:
                                        this.Menu();
                                        break;
                                    default:
                                        System.out.println("No disponible");
                                }
                            }else {
                                System.out.println("Opcion no válida");
                                this.cocina();
                            }
                            break;
                        default:
                            System.out.println("No disponible");
                    }
                    break;
                default:
                    System.out.println("No disponible");
            }

            return 0;
        }


    public double dormitorio(){
        for (int i=0; i<menu6.length;i++){
            System.out.println((i+1)+ " .- " + menu6[i]);
        }
        System.out.print("Opcion: ");
        opc_4= GRINCH.nextInt();
        switch (opc_4){
            case 1:
                for (int i=0; i<menu7.length;i++){
                    System.out.println((i+1)+ " .- " + menu7[i]);
                }
                System.out.print("Opcion: ");
                ropas= GRINCH.nextInt();
                switch (ropas){
                    case 1:
                        System.out.println("BUZO (CASACA Y PANTALON)");
                        for (int i=0; i<buzo.length;i++){
                            System.out.println((i+1)+ " : " +buzo[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= buzo.length) {
                            System.out.println("> " +buzo[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * buzo_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + buzo[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=buzo[productos-1];
                                    e=buzo_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.dormitorio();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.dormitorio();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.dormitorio();
                        }
                        break;
                    case 2:
                        System.out.println("POLOS INICILA Y PRIMARIA");
                        for (int i=0; i<polos.length;i++){
                            System.out.println((i+1)+ " : " +polos[i]);
                        }
                        System.out.print("Opcion: ");
                        productos = GRINCH.nextInt();
                        if (productos > 0 && productos <= polos.length) {
                            System.out.println("> " +polos[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * polos_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + polos[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=polos[productos-1];
                                    e=polos_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.dormitorio();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.dormitorio();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.dormitorio();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            case 2:
                for (int i=0; i<menu8.length;i++){
                    System.out.println((i+1)+ " : " + menu8[i]);
                }
                System.out.print("Opcion: ");
                cuadernos= GRINCH.nextInt();
                switch (cuadernos){
                    case 1:
                        System.out.println("CUADERNOS");
                        for (int i=0; i<cuaderno.length;i++){
                            System.out.println((i+1)+ " : " +cuaderno[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= cuaderno.length) {
                            System.out.println("> " +cuaderno[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * cuaderno_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + cuaderno[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=cuaderno[productos-1];
                                    e=cuaderno_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Baño();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.dormitorio();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.dormitorio();
                        }
                        break;
                    case 2:
                        System.out.println("LECTURAS");
                        for (int i=0; i<lecturas.length;i++){
                            System.out.println((i+1)+ " : " +lecturas[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= lecturas.length) {
                            System.out.println("> " +lecturas[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * lecturas_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + lecturas[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=lecturas[productos-1];
                                    e=lecturas_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.dormitorio();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.dormitorio();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.dormitorio();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            default:
                System.out.println("No disponible");
        }

        return 0;
    }

    public double Herramientas(){
        for (int i=0; i<menu6.length;i++){
            System.out.println((i+1)+ " .- " + menu6[i]);
        }
        System.out.print("Opcion: ");
        opc_4= GRINCH.nextInt();
        switch (opc_4){
            case 1:
                for (int i=0; i<menu7.length;i++){
                    System.out.println((i+1)+ " .- " + menu7[i]);
                }
                System.out.print("Opcion: ");
                ropas= GRINCH.nextInt();
                switch (ropas){
                    case 1:
                        System.out.println("BUZO (CASACA Y PANTALON)");
                        for (int i=0; i<buzo.length;i++){
                            System.out.println((i+1)+ " : " +buzo[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= buzo.length) {
                            System.out.println("> " +buzo[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * buzo_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + buzo[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=buzo[productos-1];
                                    e=buzo_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.dormitorio();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.dormitorio();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.dormitorio();
                        }
                        break;
                    case 2:
                        System.out.println("POLOS INICILA Y PRIMARIA");
                        for (int i=0; i<polos.length;i++){
                            System.out.println((i+1)+ " : " +polos[i]);
                        }
                        System.out.print("Opcion: ");
                        productos = GRINCH.nextInt();
                        if (productos > 0 && productos <= polos.length) {
                            System.out.println("> " +polos[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * polos_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + polos[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=polos[productos-1];
                                    e=polos_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Herramientas();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Herramientas();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Herramientas();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            case 2:
                for (int i=0; i<menu8.length;i++){
                    System.out.println((i+1)+ " : " + menu8[i]);
                }
                System.out.print("Opcion: ");
                cuadernos= GRINCH.nextInt();
                switch (cuadernos){
                    case 1:
                        System.out.println("CUADERNOS");
                        for (int i=0; i<cuaderno.length;i++){
                            System.out.println((i+1)+ " : " +cuaderno[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= cuaderno.length) {
                            System.out.println("> " +cuaderno[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * cuaderno_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + cuaderno[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=cuaderno[productos-1];
                                    e=cuaderno_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Herramientas();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Herramientas();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Herramientas();
                        }
                        break;
                    case 2:
                        System.out.println("LECTURAS");
                        for (int i=0; i<lecturas.length;i++){
                            System.out.println((i+1)+ " : " +lecturas[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= lecturas.length) {
                            System.out.println("> " +lecturas[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * lecturas_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + lecturas[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=lecturas[productos-1];
                                    e=lecturas_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Herramientas();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Herramientas();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.dormitorio();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            default:
                System.out.println("No disponible");
        }

        return 0;
    }



    public double Electricidad(){
        for (int i=0; i<menu6.length;i++){
            System.out.println((i+1)+ " .- " + menu6[i]);
        }
        System.out.print("Opcion: ");
        opc_4= GRINCH.nextInt();
        switch (opc_4){
            case 1:
                for (int i=0; i<menu7.length;i++){
                    System.out.println((i+1)+ " .- " + menu7[i]);
                }
                System.out.print("Opcion: ");
                ropas= GRINCH.nextInt();
                switch (ropas){
                    case 1:
                        System.out.println("BUZO (CASACA Y PANTALON)");
                        for (int i=0; i<buzo.length;i++){
                            System.out.println((i+1)+ " : " +buzo[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= buzo.length) {
                            System.out.println("> " +buzo[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * buzo_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + buzo[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=buzo[productos-1];
                                    e=buzo_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Electricidad();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Electricidad();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.dormitorio();
                        }
                        break;
                    case 2:
                        System.out.println("POLOS INICILA Y PRIMARIA");
                        for (int i=0; i<polos.length;i++){
                            System.out.println((i+1)+ " : " +polos[i]);
                        }
                        System.out.print("Opcion: ");
                        productos = GRINCH.nextInt();
                        if (productos > 0 && productos <= polos.length) {
                            System.out.println("> " +polos[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * polos_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + polos[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=polos[productos-1];
                                    e=polos_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Electricidad();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Electricidad();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Electricidad();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            case 2:
                for (int i=0; i<menu8.length;i++){
                    System.out.println((i+1)+ " : " + menu8[i]);
                }
                System.out.print("Opcion: ");
                cuadernos= GRINCH.nextInt();
                switch (cuadernos){
                    case 1:
                        System.out.println("CUADERNOS");
                        for (int i=0; i<cuaderno.length;i++){
                            System.out.println((i+1)+ " : " +cuaderno[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= cuaderno.length) {
                            System.out.println("> " +cuaderno[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * cuaderno_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + cuaderno[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=cuaderno[productos-1];
                                    e=cuaderno_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Electricidad();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Electricidad();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Electricidad();
                        }
                        break;
                    case 2:
                        System.out.println("LECTURAS");
                        for (int i=0; i<lecturas.length;i++){
                            System.out.println((i+1)+ " : " +lecturas[i]);
                        }
                        System.out.print("Opcion: ");
                        productos= GRINCH.nextInt();
                        if (productos > 0 && productos <= lecturas.length) {
                            System.out.println("> " +lecturas[productos-1]);
                            System.out.println("1 Agregar al carrito    2 Volver     3 Menú principal");
                            opci=GRINCH.nextInt();
                            switch (opci) {
                                case 1: System.out.println("Cantidad: ");
                                    cantidad = GRINCH.nextInt();
                                    GRINCH.nextLine();
                                    carrito[productos - 1] += cantidad;
                                    subtotal[productos - 1] = carrito[productos - 1] * lecturas_precio[productos - 1];
                                    System.out.println("Producto agregado \n "
                                            + lecturas[productos - 1] + "\n"
                                            + "Cantidad: " + carrito[productos - 1]);
                                    u=lecturas[productos-1];
                                    e=lecturas_precio[productos - 1];
                                    System.out.println("1 Seguir comprando/ 2 Ver mi carrito / 3 Menú Principal");
                                    opcion = GRINCH.nextInt();
                                    if (opcion == 1) {
                                        this.Electricidad();
                                    } else if (opcion == 2) {
                                        this.Carrito();
                                    } else if (opcion == 3) {
                                        this.Menu();
                                    } else {
                                        System.out.println("Opcion no válida");
                                    }
                                    break;
                                case 2:
                                    this.Electricidad();
                                    break;
                                case 3:
                                    this.Menu();
                                    break;
                                default:
                                    System.out.println("No disponible");
                            }
                        }else {
                            System.out.println("Opcion no válida");
                            this.Electricidad();
                        }
                        break;
                    default:
                        System.out.println("No disponible");
                }
                break;
            default:
                System.out.println("No disponible");
        }

        return 0;
    }

    public String Carrito(){
        System.out.println("Descripción: "+u);
        int cantidadtotal=Arrays.stream(carrito).sum();
        double subtotalex=Arrays.stream(subtotal).sum();
        switch (cantidadtotal) {
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
                System.out.println("║ IGV :     "                       + igvmini);
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
                this.Carrito();
                break;
        }
        GRINCH.nextLine();
        int resp=GRINCH.nextInt();
        GRINCH.nextLine();
        switch (resp) {
            case 1:
                String  mediopago;
                System.out.println("Información de contacto: ");
                System.out.println("Nombre: " + nombre+ "  Apellidos: "+apellido+"   DNI: "+dni);
                System.out.println("Selecciona medio de pago: Efectivo/Tarjeta");
                mediopago = GRINCH.nextLine();
                switch (mediopago) {
                    case "Efectivo":
                        int dep;
                        double deposito;
                        System.out.println("Realice el deposito del total del producto: ");
                        System.out.println("Transferencia Bancaría\n" +
                                "Nombre: ASOCIACION SERVICIO EDUCACIONAL HOGAR Y SALUD DEL NORTE // Ruc: 20518185552\n" +
                                "Banco: Nacion // N° Cta. cta cte: 0068281482");
                        do {
                            System.out.println("Producto: "+u+"     Cantidad: "+cantidadtotal+"     Costo: "+subtotalex);
                            System.out.println("Digite el monto del deposito: ");
                            deposito = GRINCH.nextInt();
                            if (deposito == subtotalex) {
                                double igvmini=subtotalex*0.18;

                                System.out.println("Procesando...");
                                System.out.println("Compra exitosa. Boleta: ");
                                System.out.println("---BOLETA DE VENTA ELETRÓNICA---");
                                System.out.println("Emisión: 4-07-2024");
                                System.out.println("CLIENTE: " + nombre+" " + apellido);
                                System.out.println("DNI: "+dni);
                                System.out.println("DESCRIPCIÓN                               CANTIDAD    PRECIO UNIT.    TOTAL\n" +
                                        u+"       " +cantidadtotal+"          "+e+"        "+subtotalex);
                                System.out.println("SUBTOTAL: "+ (subtotalex-igvmini));
                                System.out.println("GRAVADA:  "+subtotalex);
                                System.out.println("IGV 18%:  "+igvmini);
                                System.out.println("TOTAL:    "+subtotalex);

                            } else {
                                System.out.println("Compra cancelada");
                            }


                        }
                        while (deposito != subtotalex);
                        break;
                    case "Tarjeta":
                        double igv=subtotalex*0.18;
                        String NTarjeta, Vencimiento, CodSeg;
                        do {
                            System.out.print("Número de tarjeta (**** **** **** ****): ");
                            NTarjeta = GRINCH.nextLine();
                        } while (NTarjeta.length() != 16);
                        boolean Valido = false;
                        do {
                            System.out.print("Introduce la fecha de caducidad de la tarjeta (MM/YY): ");
                            Vencimiento = GRINCH.nextLine();
                            if (Vencimiento.matches("(0[1-9]|1[0-2])/\\d{2}")) {
                                Valido = true;
                            } else {
                                System.out.println("Fecha fuera de rango...");
                            }
                        } while (!Valido);
                        do {
                            System.out.print("Código ed seguridad (***) ");
                            CodSeg = GRINCH.nextLine();
                        } while (CodSeg.length() != 3);
                        System.out.println("Procesando...");
                        System.out.println("Compra exitosa. Boleta: ");
                        System.out.println("---BOLETA DE VENTA ELETRÓNICA---");
                        System.out.println("Emisión: 4-07-2024");
                        System.out.println("CLIENTE: " + nombre+" " + apellido);
                        System.out.println("DNI: "+dni);
                        System.out.println("DESCRIPCIÓN                               CANTIDAD    PRECIO UNIT.    TOTAL\n" +
                                u+"       " +cantidadtotal+"          "+e+"        "+subtotalex);
                        System.out.println("SUBTOTAL: "+ (subtotalex-igv));
                        System.out.println("GRAVADA:  "+subtotalex);
                        System.out.println("IGV 18%:  "+igv);
                        System.out.println("TOTAL:    "+subtotalex);
                        break;
                    default:
                        System.out.println("No disponible");
                        break;
                }
                break;
            case 2:
                System.out.println("Ok, volviendo el menú principal");
                this.Menu();
                break;
            default:
                System.out.println("No disponible");
        }

        return null;
    }



    public void PagoLibros() {
        double cantidadtotalLibros = Arrays.stream(carrito).sum();
        double subtotalAccesorios = Arrays.stream(subtotal_accesorio).sum();
        double subtotal0 = (cantidadtotalLibros * precio[0]) + subtotalAccesorios;
        igvmini = subtotal0 * precio[1];
        subtotalmini = subtotal0 - igvmini;
        totalpagar = subtotalmini + igvmini;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :" + subtotalmini);
        System.out.println(" IGV :" + igvmini);
        System.out.println(" TOTAL :" + totalpagar);
        this.ExportarBoleta();
    }
    public void ExportarBoleta() {
        try {
            File archivo = new File("D:\\boleta de venta.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------\n");
            escritor.write(" SUBTOTAL :" + subtotalmini + "\n");
            escritor.write(" IGV :" + igvmini + "\n");
            escritor.write(" TOTAL :" + totalpagar + "\n");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al exportar la boleta.");
            e.printStackTrace();
        }
    }


    public static void main(String[]args){
        pr promart=new pr();
        promart.Datos();

    }
}