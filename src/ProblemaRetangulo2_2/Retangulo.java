package ProblemaRetangulo2_2;

public class Retangulo {

    public final double base;
    public final double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }

    public double calcularDiagonal(){
        return Math.sqrt(base*base + altura*altura);
    }

    public void exibirResumo(){
        System.out.printf("Area = %.4f%n", calcularArea());
        System.out.printf("Perimetro = %.4f%n", calcularPerimetro());
        System.out.printf("Diagonal = %.4f%n", calcularDiagonal());
    }
}
