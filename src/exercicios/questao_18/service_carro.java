package src.exercicios.questao_18;

public class service_carro {
    // Variáveis de instância para armazenar o consumo e o nível de combustível
    private double consumo;
    private double nivelCombustivel;

    // Construtor da classe, recebe o consumo do carro como parâmetro
    public service_carro(double consumo) {
        this.consumo = consumo; // Inicializa o consumo do carro
        this.nivelCombustivel = 0; // Inicializa o nível de combustível como 0
    }

    // Método para simular o ato de dirigir o carro por uma certa distância
    public void andar(double distancia) {
        // Calcula a quantidade de combustível necessária para a distância especificada
        double combustivelNecessario = distancia / consumo;

        // Verifica se há combustível suficiente para percorrer a distância
        if (nivelCombustivel >= combustivelNecessario) {
            // Se houver combustível suficiente, reduz o nível de combustível e exibe uma mensagem
            nivelCombustivel -= combustivelNecessario;
            System.out.println("Você dirigiu " + distancia + " km.");
        } else {
            // Se não houver combustível suficiente, exibe uma mensagem de aviso
            System.out.println("Combustível insuficiente para andar " + distancia + " km.");
        }
    }

    // Método para adicionar combustível ao tanque do carro
    public void adicionarGasolina(double quantidade) {
        nivelCombustivel += quantidade; // Adiciona a quantidade especificada ao nível de combustível
    }

    // Método para obter o nível atual de combustível do carro
    public double obterGasolina() {
        return nivelCombustivel; // Retorna o nível de combustível atual
    }
}
