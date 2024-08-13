package Lista1Exercicio1;

public class Filme extends Publicacao {
	
	private String diretor;
	private String atorPrincipal;
	private String sinopse;
	private int tempoDuracao;
	
	// Construtor que inicializa todos os atributos da publicação usando o construtor da superclasse
	public Filme (String titulo, String autor, int publicar, String genero, 
			String editora, int disponivel, String diretor, 
			String atorPrincipal, String sinopse, int tempoDuracao) {
		super(titulo, autor, publicar, genero, editora, disponivel);
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.sinopse = sinopse;
		this.tempoDuracao = tempoDuracao;
	}
	
	// Implementação do método abstrato para imprimir os dados específicos de um livro
	public void imprimirDados() {
		System.out.println("Filme");
		System.out.println("Título: " + getTitulo());
		System.out.println("Diretor: " + diretor);
		System.out.println("Ator principal: " + atorPrincipal);
		System.out.println("Ano de Publicação:  " + getPublicar());
		System.out.println("Gênero: " + getGenero());
		System.out.println("Produtora: " + getEditora());
		System.out.println("Quantidade disponível: " + getDisponivel());
		System.out.println("Sinopse: " + sinopse);
		System.out.println("Tempo de duração: " + tempoDuracao + " minutos");
	}
}