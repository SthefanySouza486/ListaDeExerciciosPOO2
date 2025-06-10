package ProblemaConsumo2_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        double distancia = entrada.nextDouble();

        System.out.print("Combustível gasto: ");
        double combustivel = entrada.nextDouble();

        Consumo carro = new Consumo(distancia, combustivel);
        double consumoMedio = carro.calcularConsumoMedio();

        System.out.printf("Consumo medio: %.3f%n", consumoMedio);

        entrada.close();
    }
}
