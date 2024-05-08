import java.io.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        try {
            int result = 10 / 0; // División por cero
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
        //////////////////////////////////////////////
        String str = null;
        try {
            int length = str.length(); // Intento de acceder a un objeto null
        } catch (NullPointerException e) {
            System.out.println("Objeto no inicializado: " + e.getMessage());
        }
        /////////////////////////////////////
        int[] numbers = {1, 2, 3};
        try {
            int value = numbers[5]; // Acceso a un índice fuera del rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango: " + e.getMessage());
        }
        //////////////////////////////////////
        try {
            int number = Integer.parseInt("abc"); // Conversión de una cadena no numérica
        } catch (NumberFormatException e) {
            System.out.println("Formato numérico incorrecto: " + e.getMessage());
        }
        ////////////////////////////////////////
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String line = reader.readLine(); // Lectura de archivo que no existe
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        }
        ////////////////////////////////////
        try {
            FileInputStream fis = new FileInputStream("archivo.txt"); // Intento de acceder a un archivo inexistente
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
        //////////////////////////////////////
        try {
            Class<?> clazz = Class.forName("ClaseNoExistente"); // Intento de cargar una clase inexistente
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + e.getMessage());
        }
        //////////////////////////////////////
        Thread.sleep(1000);
        try {
            Thread.currentThread().interrupt(); // Interrupción del hilo actual
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido: " + e.getMessage());
        }
        ////////////////////////////////////
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "user", "password");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tabla"); // Operación de base de datos inválida
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        ////////////////////////////////////////
        try {
            int[] array = new int[3];
            int value = array[4]; // Acceso a un índice fuera del rango
        } catch (RuntimeException e) {
            System.out.println("Excepción en tiempo de ejecución: " + e.getMessage());
        }









    }
}