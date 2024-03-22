package src.unifametro.questao_carro;

public class QuestaoC_Carro {private double consumo;
    private double nivelCombustivel;

    public QuestaoC_Carro(double consumo) {
        this.consumo = consumo;
        this.nivelCombustivel = 0;
    }

    public void andar(double distancia) {
        double combustivelNecessario = distancia / consumo;
        if (nivelCombustivel >= combustivelNecessario) {
            nivelCombustivel -= combustivelNecessario;
            System.out.println("Você dirigiu " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente para andar " + distancia + " km.");
        }
    }

    public void adicionarGasolina(double quantidade) {
        nivelCombustivel += quantidade;
    }

    public double obterGasolina() {
        return nivelCombustivel;
    }
}

