package ProblemaPagamento2_7;

public class Pagamento {

    private String nome;
    private double valorPorHora;
    private int horasTrabalhadas;

    public Pagamento(String nome, double valorPorHora, int horasTrabalhadas) {
          this.nome = nome;
          this.valorPorHora = valorPorHora;
          this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularPagamento() {
        return valorPorHora * horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }
}
