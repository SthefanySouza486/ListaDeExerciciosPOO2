package ProblemaDuracao2_10;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a duracao em segundos: ");
            int totalSegundos = entrada.nextInt();


            Duracao duracao = new Duracao(totalSegundos);

            System.out.println(duracao.formatarDuracao());

            entrada.close();
        }
    }
