import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class promart {
    Scanner grinch= new Scanner(System.in);
    String [] tecnologia={"Tv y video","Compúto", "telefonia"};
    String [] servicios={"Pisos", "Electricidad", "Puertas ", "Pintura"};
    String [] productos={"celulares, cocinas, sofa, herramientas"};
    Random random = new Random();
    int s= random.nextInt(productos.length);
    double [] precio={1000,0.18,500,300,250,320};
    double[] subtotal_extra={0,0,0,0};
    double igv, subtotal,totalpagar;
    int [] carrito =new int[tecnologia.length];
    int [] carrito_extra=new int[servicios.length];
    String respuesta;
    int opcion, cantidad;
    public String Categorias(){
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
        opcion=grinch.nextInt();
        grinch.nextLine();
        switch (opcion){
            case 1:
                this.ComprarProducto();
                break;

            case 2:
                this.ComprarExtra();
                break;

            case 3:

                break;

            default:
                System.out.println("Opcion no válida");
                this.Categorias();
                break;

        }

        return null;
    }

    public String ComprarProducto(){
        System.out.println("------TECNOLOGIA------------");
        System.out.println("Productos en oferta:"+productos[s]);
        System.out.println( "Seleccione el producto a comprar");
        for (int i=0; i<tecnologia.length;i++){
            System.out.println("Opcion "+(i+1)+ " : " +tecnologia[i]);
        }
        opcion= grinch.nextInt();
        grinch.nextLine();
        switch (opcion){
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido " +carrito[0]+ "productos de"+tecnologia[0]);
                System.out.println("¿Desea elegir un servicio ?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarExtra();
                }
                else if (opcion==2){
                    this.PagoCategoria();
                }
                else if (opcion==3){
                    this.Categorias();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito[1]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[1]+ "productos de "+tecnologia[1]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarExtra();
                }
                else if (opcion==2){
                    this.PagoCategoria();
                }
                else if (opcion==3){
                    this.Categorias();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();

                carrito[2]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[2]+ "productos de "+tecnologia[2]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarExtra();
                }
                else if (opcion==2){
                    this.PagoCategoria();
                }
                else if (opcion==3){
                    this.Categorias();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.Categorias();
                break;


        }





        return null;
    }
    public double PagoCategoria(){
        double cantidadtotalmenus=Arrays.stream(carrito).sum();
        double subtotalextra=Arrays.stream(subtotal_extra).sum();
        double subtotal0= (cantidadtotalmenus*precio[0])+subtotalextra;
        igv= subtotal0*precio[1];
        subtotal=subtotal0-igv;
        totalpagar=subtotal+igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :"+subtotal);
        System.out.println(" IGV :"+igv);
        System.out.println(" TOTAL :"+totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }
    public String ComprarExtra(){
        System.out.println("------ SERVICIOS------------");
        System.out.println( "Seleccione su servicio a adquirir");
        for (int i=0; i<servicios.length;i++){
            System.out.println("Opcion "+(i+1)+ " : " +servicios[i]);
        }
        opcion= grinch.nextInt();
        grinch.nextLine();
        switch (opcion){
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito_extra[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[0]+ "este servicio de "+servicios[0]);
                subtotal_extra[0]=carrito_extra[0]*precio[2];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarProducto();
                }
                else if (opcion==2){
                    this.PagoCategoria();
                }
                else if (opcion==3){
                    this.Categorias();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito_extra[1]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[1]+ "servicio "+servicios[1]);
                subtotal_extra[1]=carrito_extra[1]*precio[3];
                System.out.println("¿Desea elegir otro servicio más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarProducto();
                }
                else if (opcion==2){
                    this.PagoCategoria();
                }
                else if (opcion==3){
                    this.Categorias();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:
                System.out.println("¿Cuantas veces adquirira el servicio ? Ingrese la cantidad");
                cantidad=grinch.nextInt();

                carrito_extra[2]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[2] + " servicio "+ servicios[2]);
                subtotal_extra[2]=carrito_extra[2]*precio[4];
                System.out.println("¿Desea elegir otro servicio más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarProducto();
                }
                else if (opcion==2){
                    this.PagoCategoria();
                }
                else if (opcion==3){
                    this.Categorias();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;
            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();

                carrito_extra[3]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[2]+ "platos de "+servicios[3]);
                subtotal_extra[3]=carrito_extra[3]*precio[5];
                System.out.println("¿Desea elegir otro servicio más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarProducto();
                }
                else if (opcion==2){
                    this.PagoCategoria();
                }
                else if (opcion==3){
                    this.Categorias();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;


            default:
                System.out.println("Opcion no válida");
                this.Categorias();
                break;


        }





        return null;
    }

    public String ExportarBoleta(){
        try{
            File archivo= new File("D:\\boleta.txt");
            FileWriter escritor=new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------");
            escritor.write(" SUBTOTAL :"+subtotal);
            escritor.write(" IGV :"+igv);
            escritor.write(" TOTAL :"+totalpagar);
            escritor.close();

        }
        catch (IOException e){
            System.out.println("Error al exportar la factura.");
            e.printStackTrace();

        }
        return null;
    }

    public static void main(String [] args){
        promart papanoel= new promart();
        papanoel.Categorias();




    }
}
