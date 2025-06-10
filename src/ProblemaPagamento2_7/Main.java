package ProblemaPagamento2_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Valor por hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        Pagamento funcionario = new Pagamento(nome, valorHora, horasTrabalhadas);
        double pagamento = funcionario.calcularPagamento();

        System.out.printf("O pagamento para %s deve ser R$ %.2f%n", funcionario.getNome(), pagamento);

        entrada.close();
    }
}
