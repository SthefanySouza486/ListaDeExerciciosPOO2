package ProblemaCirculo2_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do raio do círculo: ");
        double raio = entrada.nextDouble();

        Circulo circulo = new Circulo(raio);
        double area = circulo.CalcularArea();

        System.out.printf("Area = %.3f%n", area);

        entrada.close();
    }
}
