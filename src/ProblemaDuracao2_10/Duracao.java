package ProblemaDuracao2_10;

public class Duracao {
        private final int totalSegundos;

        public Duracao(int totalSegundos) {
            this.totalSegundos = totalSegundos;
        }

        public  String formatarDuracao() {
            int horas = totalSegundos / 3600;
            int minutos = (totalSegundos % 3600) / 60;
            int segundos = totalSegundos % 60;

            return horas + ":" + minutos + ":" + segundos;
        }
}
