package src.unifametro.questao_carro;

public class QuestaoS_Carro {
    public static void main(String[] args) {
    QuestaoC_Carro ferrari = new QuestaoC_Carro(5);
    ferrari.adicionarGasolina(50);
    ferrari.andar(10);
    System.out.println("Tanque Ferrari: " + ferrari.obterGasolina() + " litros");
    }
}
