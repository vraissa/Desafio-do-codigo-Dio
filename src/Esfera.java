import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio = entrada.nextDouble();
        double pi = 3.14159;
        double resultado = (4/3.0) * (pi * raio * raio * raio);
        System.out.println("Volume = " + resultado);

    }

}
