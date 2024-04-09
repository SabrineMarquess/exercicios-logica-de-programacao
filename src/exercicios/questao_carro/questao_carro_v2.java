package src.exercicios.questao_carro;

public class questao_carro_v2 {
    public static void main(String[] args) {
        // Cria uma instância da classe QuestaoC_Carro com um consumo de 5 km/l
        questao_carro_v1 ferrari = new questao_carro_v1(5);

        // Abastece o tanque da Ferrari com 50 litros de gasolina
        ferrari.adicionarGasolina(50);

        // Simula a condução da Ferrari por 10 km
        ferrari.andar(10);

        // Exibe o nível atual de gasolina no tanque da Ferrari
        System.out.println("Tanque Ferrari: " + ferrari.obterGasolina() + " litros");
    }
}
