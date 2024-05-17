package src.exercicios.questao_18;

public class funcoes_carro {
    public static void main(String[] args) {
        // Cria uma instância da classe QuestaoC_Carro com um consumo de 5 km/l
        service_carro ferrari = new service_carro(5);

        // Abastece o tanque da Ferrari com 50 litros de gasolina
        ferrari.adicionarGasolina(50);

        // Simula a condução da Ferrari por 10 km
        ferrari.andar(10);

        // Exibe o nível atual de gasolina no tanque da Ferrari
        System.out.println("Tanque Ferrari: " + ferrari.obterGasolina() + " litros");
    }
}
