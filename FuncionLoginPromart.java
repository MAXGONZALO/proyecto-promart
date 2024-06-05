import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class FuncionLoginPromart {
    public String fEDAD (){
        Scanner PROMART = new Scanner(System.in);
        System.out.println("----BIENVENIDO A PROMART HOMECENTER");
        System.out.println("Para la compra de promart, coloque su fecha de nacimiento");
        System.out.println("Ingrese el día de su nacimiento (DD): ");
        int dia = PROMART.nextInt();
        System.out.println("Ingrese el mes de su nacimiento (MM): ");
        int mes = PROMART.nextInt();
        System.out.println("Ingrese el año de su nacimiento (YYYY): ");
        int anio = PROMART.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        PROMART.nextLine();
        if (edad>=18){
            System.out.println("proceda a llenar sus datos");
            this.fDatosCliente();

        }
        else if(edad<=18){
            System.out.println("No cumple con los requisitos para la compra");

        }
        return null;

    }

    public String fDatosCliente() {
        String apodo,dni, correo, contraseña, correo_in,contraseña_in;
        Scanner alok= new Scanner(System.in);
        System.out.println("----Registrar Cuenta----");
        System.out.println("Ingrese su apodo");
        apodo=alok.nextLine();
        System.out.println("Ingrese su numero de DNI");
        dni=alok.nextLine();
        System.out.println("Ingrese su correo");
        correo= alok.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña= alok.nextLine();
        System.out.println("----Iniciar sesión----");
        System.out.println("Ingrese su correo");
        correo_in= alok.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña_in= alok.nextLine();
        if(correo_in.equals(correo)&&contraseña_in.equals(contraseña)){
            System.out.println("Bienvenido: "+apodo);
            String genero="";
            System.out.println("¿Cual es su genero?");
            genero=alok.nextLine();
            switch(genero){
                case "Mujer":
                    System.out.println("¡Bienvenida! ¿Que esta buscando?");
                    break;

                case "Varón":
                    System.out.println("¡Bienvenido! ¿Que esta buscando?");


                    break;
                default:
                    System.out.println("Ese género no existe");
            }

        }
        else {
            System.out.println("Datos no válidos");

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("----Promart----");

        FuncionLoginPromart PROMART = new FuncionLoginPromart();
        PROMART.fEDAD();



    }
}