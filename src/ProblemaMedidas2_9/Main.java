package ProblemaMedidas2_9;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a medida A: ");
            double a = entrada.nextDouble();
            System.out.print("Digite a medida B: ");
            double b = entrada.nextDouble();
            System.out.print("Digite a medida C: ");
            double c = entrada.nextDouble();

            Medidas medidas = new Medidas(a, b, c);

            System.out.printf("AREA DO QUADRADO = %.4f%n", medidas.areaQuadrado());
            System.out.printf("AREA DO TRIANGULO = %.4f%n", medidas.areaTriangulo());
            System.out.printf("AREA DO TRAPEZIO = %.4f%n", medidas.areaTrapezio());

            entrada.close();
        }
    }

