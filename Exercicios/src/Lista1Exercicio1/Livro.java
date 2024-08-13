package Lista1Exercicio1;

public class Livro extends Publicacao {
	
	private int edicao;
	private String isbn;
	
    // Construtor que inicializa todos os atributos da publicação usando o construtor da superclasse
	public Livro (String titulo, String autor, int publicar, String genero,
			String editora, int disponivel, int edicao, String isbn) {
		super(titulo, autor, publicar, genero, editora, disponivel);
		this.edicao = edicao;
		this.isbn = isbn;
	}

    // Implementação do método abstrato para imprimir os dados específicos de um livro
	public void imprimirDados() {
		System.out.println("Livro");
		System.out.println("Título: " + getTitulo());
		System.out.println("Autor: " + getAutor());
		System.out.println("Ano de Publicação:  " + getPublicar());
		System.out.println("Gênero: " + getGenero());
		System.out.println("Editora: " + getEditora());
		System.out.println("Quantidade disponível: " + getDisponivel());
		System.out.println("Edição: " + edicao);
		System.out.println("ISBN: " + isbn);
	}
}