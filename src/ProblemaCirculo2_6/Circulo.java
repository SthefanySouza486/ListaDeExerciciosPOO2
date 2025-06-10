package ProblemaCirculo2_6;

public class Circulo {

    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double CalcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
