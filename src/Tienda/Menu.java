package Tienda;
import Productos.Electrodomesticos;
import Productos.alimentos;
import Productos.belleza;
import Productos.limpieza;
import java.util.Scanner;


public class Menu {
    static public void menu(){
        Electrodomesticos electrodomesticos = new Electrodomesticos("", 0, "", 0, 0,"");
        limpieza limpieza=new limpieza("", 0, "", 0, 0,"");
        belleza belleza=new belleza("", 0, "", 0, 0,"");
        alimentos alimentos=new alimentos("", 0, "", 0, 0,"");
        String pass="";Boolean band=true;
        Scanner Scan=new Scanner(System.in);
        while (!pass.equals("pass")) {
            System.out.print("Introduzca la contraseña:");
            System.out.println();
            pass=Scan.nextLine();
        }
        while(band) {
            System.out.println("1 Registrar Electrodomestico");
            System.out.println("2 Listar Productos.Electrodomesticos registrados");
            System.out.println("3 Eliminar stock electrodomestico");
            System.out.println("4 Agregar stock electrodomestico");
            System.out.println("5 Registrar limpieza");
            System.out.println("6 Listar Productos limpieza registrados");
            System.out.println("7 Eliminar stock limpieza");
            System.out.println("8 Agregar stock limpieza");
            System.out.println("9 Registrar alimento");
            System.out.println("10 Listar Productos alimento registrados");
            System.out.println("11 Eliminar stock alimento");
            System.out.println("12 Agregar stock alimento");
            System.out.println("13 Registrar belleza");
            System.out.println("14 Listar Productos belleza registrados");
            System.out.println("15 Eliminar stock belleza");
            System.out.println("16 Agregar stock belleza");
            System.out.println("17 comprar electrodmestico");
            System.out.println("18 comprar limpieza");
            System.out.println("19 comprar alimento");
            System.out.println("20 comprar belleza");
            System.out.println("0 Salir del programa");
            System.out.print("Ingrese la opcion:");
            int opcion=Scan.nextInt();
            Scan.nextLine();
            System.out.println();
            switch(opcion) {
                case 1:
                    electrodomesticos.registrarElectrodomestico();
                    break;
                case 2:
                    electrodomesticos.listarElectrodomesticos();
                    break;
                case 3:
                    electrodomesticos.eliminarstock();
                    break;
                case 4:
                    electrodomesticos.agregarStock();
                    break;
                case 5:
                    limpieza.registrarLimpieza();
                    break;
                case 6:
                    limpieza.listarLimpieza();
                    break;
                case 7:
                    limpieza.eliminarstock();
                    break;
                case 8:
                    limpieza.agregarStock();
                    break;
                case 9:
                    alimentos.registrarLimpieza();
                    break;
                case 10:
                    alimentos.listarLimpieza();
                    break;
                case 11:
                    alimentos.eliminarstock();
                    break;
                case 12:
                    alimentos.agregarStock();
                    break;
                case 13:
                    belleza.registrarBelleza();
                    break;
                case 14:
                    belleza.listarLimpieza();
                    break;
                case 15:
                    belleza.eliminarstock();
                    break;
                case 16:
                    belleza.agregarStock();
                    break;
                case 17:
                    electrodomesticos.comprarElectrodomesticos();
                    break;
                case 18:
                    limpieza.comprarLimpieza();
                    break;
                case 19:
                    alimentos.compraralimento();
                    break;
                case 20:
                    belleza.comprarLimpieza();
                    break;
                case 0:
                    band=false;
                    break;
            }


        }



    }
}
