package ProblemaTroco2_5;

public class Troco {

    private final double precoUnitario;
    private final int quantidadeComprada;

    public Troco(double precoUnitario, int quantidadeComprada) {
        this.precoUnitario = precoUnitario;
        this.quantidadeComprada = quantidadeComprada;
    }

    public double calcularTotal(){
        return precoUnitario * quantidadeComprada;
    }

    public double calcularTroco(double dinheiroRecebido){
        return dinheiroRecebido - calcularTotal();
    }
}
