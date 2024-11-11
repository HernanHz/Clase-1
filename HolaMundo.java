import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // Imprimir datos en pantalla / consola / terminal
        System.out.println("Hola Armando");
        System.out.println("x:10");

        System.out.print("Como van las cosas");
        System.out.print(1:10);
        System.out.print(d:10.5);
        System.out.print(c:'A');
        System.out.println();

        System.out.printf("Aquí va una cadena: %s%n", "Cesar");
        System.out.printf("Aquí va un entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Cesar Diaz", 15);

        var entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese su nombre: ");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }
}