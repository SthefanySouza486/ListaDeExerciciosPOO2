package ProblemaSoma2_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = entrada.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = entrada.nextInt();

        Soma calculadora = new Soma(x, y);
        int resultado = calculadora.somar();

        System.out.println("Soma = " + resultado);

        entrada.close();
    }
}
