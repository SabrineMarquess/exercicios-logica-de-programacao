package src.exercicios.questao_livro;

public class QuestaoC_Livro {
    private String titulo;
    private int anoPublicacao;
    private String autor;

    // Construtor
    public QuestaoC_Livro(String titulo, int anoPublicacao, String autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    // Método para mostrar detalhes do QuestaoC_Livro
    public void mostrarDetalhes() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao);
    }
}
