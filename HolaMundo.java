import java.util.Scanner
/**
 * HolaMundo
 */
public class HolaMundo {
public static void main(String[] args) {
    System.out.println("Hola Armando");

    System.out.println("como van las cosas");

    var entrada = new Scanner(System.in);

    System.out.println("por favor ingrese un numero entero: ");

    var entero = entrada.nextLine();
    System.out.println(entero);
    
    entrada.close();


  }

}