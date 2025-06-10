package ProblemaTerreno2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a largura do terreno: ");
        double largura = entrada.nextDouble();

        System.out.print("Digite a comprimento do terreno: ");
        double comprimento = entrada.nextDouble();

        System.out.print("Digite a valor do terreno: ");
        double valorMetroQuadrado = entrada.nextDouble();

        Terreno terreno = new Terreno(largura, comprimento, valorMetroQuadrado);
        terreno.exibirResumo();

        entrada.close();
    }
}
