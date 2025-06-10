package ProblemaTroco2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double precoUnitario = entrada.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = entrada.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = entrada.nextDouble();

        Troco produto = new Troco(precoUnitario, quantidadeComprada);

        double troco = produto.calcularTroco(dinheiroRecebido);

        System.out.printf("Troco = %.2f%n", troco);

        entrada.close();
    }
}
