package src.exercicios;

public class questao_28 {
    public static void main(String[] args) throws InterruptedException {
//      Desenvolver uma espécie de temporizador, quando você roda a aplicação ele começa a contar
//      Exibindo horas, minutos, e segundos, nos 60 segundos ele recomeça a contagem, da mesma forma com
//      minutos e horas até 24

        int minutos = 0, horas = 0;

        for (int segundos = 0; segundos < 61; segundos++) {

            Thread.sleep(1000);
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            System.out.printf("%02d:%02d:%02d \n", horas, minutos, segundos);

        }
    }
}
