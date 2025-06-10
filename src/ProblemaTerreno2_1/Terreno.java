package ProblemaTerreno2_1;

public class Terreno {
    private final double largura;
    private final double comprimento;
    private final double valorMetroQuadrado;

    public Terreno(double largura, double comprimento, double valorMetroQuadrado) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.valorMetroQuadrado = valorMetroQuadrado;
    }

    public double calcularArea(){
        return largura * comprimento;
    }

    public double calcularPreco(){
        return calcularArea() * valorMetroQuadrado;
    }

    public void exibirResumo(){
        System.out.printf("Area do terreno = %.1f%n", calcularArea());
        System.out.printf("Preco do terreno = %.2f%n", calcularPreco());
    }
}
