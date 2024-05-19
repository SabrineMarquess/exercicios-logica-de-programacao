package src.exercicios.questao_08;

public class service_livro {
    private String titulo;
    private int anoPublicacao;
    private String autor;

    // Construtor
    public service_livro(String titulo, int anoPublicacao, String autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    // Método para mostrar detalhes do QuestaoC_Livro
    public void mostrarDetalhes() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao);
    }
}
