import java.util.Scanner;

    public class Ejercicio4 {
    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);
        
        System.out.println("Introduzca sus nombres: ");
        var nombres = entrada.nextLine();
        
        System.out.println("Introduzca sus apellidos: ");
        var apellidos = entrada.nextLine();
        
        System.out.println("Introduzca su edad: ");
        var edad = entrada.nextInt();
        entrada.nextLine(); 
        
        // Pedir las tres palabras
        System.out.print("Introduzca palabra 1: ");
        String palabra1 = entrada.nextLine();
        
        System.out.print("Introduzca palabra 2: ");
        String palabra2 = entrada.nextLine();
        
        System.out.print("Introduzca palabra 3: ");
        String palabra3 = entrada.nextLine();
        
        // Mostrar la información
        System.out.println("\nInformación del usuario:");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Palabras: " + palabra1 + " " + palabra2 + " " + palabra3);

        entrada.close();
    }
}
