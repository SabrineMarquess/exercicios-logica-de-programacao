package src.exercicios.questao_livro;

public class QuestaoS_Livro {
    public static void main(String[] args) {
        // Criando instâncias da classe QuestaoC_Livro
        QuestaoC_Livro QuestaoC_Livro1 = new QuestaoC_Livro("O Senhor dos Anéis", 1954, "J.R.R. Tolkien");
        QuestaoC_Livro QuestaoC_Livro2 = new QuestaoC_Livro("1984", 1949, "George Orwell");
        QuestaoC_Livro QuestaoC_Livro3 = new QuestaoC_Livro("Dom Quixote", 1605, "Miguel de Cervantes");

        // Utilizando o método mostrarDetalhes para exibir as informações de cada QuestaoC_Livro
        QuestaoC_Livro1.mostrarDetalhes();
        QuestaoC_Livro2.mostrarDetalhes();
        QuestaoC_Livro3.mostrarDetalhes();
    }
}
