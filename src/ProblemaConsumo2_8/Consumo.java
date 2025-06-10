package ProblemaConsumo2_8;

public class Consumo {
    private final double distaciaPercorrida;
    private final double combustivelGasto;

    public Consumo(double distaciaPercorrida, double combustivelGasto) {
        this.distaciaPercorrida = distaciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumoMedio(){
        return distaciaPercorrida / combustivelGasto;
    }
}
