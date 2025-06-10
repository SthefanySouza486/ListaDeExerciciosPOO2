package ProblemaIdades2_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("===== Dados da primeira pessoa =====");
        System.out.print("Nome: ");
        String nome1 = entrada.nextLine();
        System.out.println("Idade: ");
        int idade1 = entrada.nextInt();
        entrada.nextLine();

        System.out.println("===== Dados da segunda pessoa =====");
        System.out.print("Nome: ");
        String nome2 = entrada.nextLine();
        System.out.println("Idade: ");
        int idade2 = entrada.nextInt();

        Idade pessoa1 = new Idade(nome1, idade1);
        Idade pessoa2 = new Idade(nome2, idade2);

        double media = (pessoa1.getIdade()+pessoa2.getIdade())/2.0;

        System.out.printf("A idade média de %s e %s é de %.1f anos%n", pessoa1.getNome(), pessoa2.getNome(), media);

        entrada.close();
    }
}
