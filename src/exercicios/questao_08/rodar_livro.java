package src.exercicios.questao_08;

public class rodar_livro {
    public static void main(String[] args) {
        // Criando instâncias da classe QuestaoC_Livro
        service_livro QuestaoC_Livro1 = new service_livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");
        service_livro QuestaoC_Livro2 = new service_livro("1984", 1949, "George Orwell");
        service_livro QuestaoC_Livro3 = new service_livro("Dom Quixote", 1605, "Miguel de Cervantes");

        // Utilizando o método mostrarDetalhes para exibir as informações de cada QuestaoC_Livro
        QuestaoC_Livro1.mostrarDetalhes();
        QuestaoC_Livro2.mostrarDetalhes();
        QuestaoC_Livro3.mostrarDetalhes();
    }
}
