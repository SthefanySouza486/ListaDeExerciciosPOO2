package ProblemaRetangulo2_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double base = entrada.nextDouble();

        System.out.print("Altura do retangulo: ");
        double altura = entrada.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);
        retangulo.exibirResumo();

        entrada.close();
    }
}
