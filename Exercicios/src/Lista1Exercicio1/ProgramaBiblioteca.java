package Lista1Exercicio1;

public class ProgramaBiblioteca {
	public static void main(String[] args) {

	Livro livro = new Livro(
			"O Senhor dos Anéis", // Título
			"J.R.R. Tolkien", // Autor
            1954, // Ano de Publicação
            "Fantasia", // Gênero
            "HarperCollins", // Editora
            10, // Quantidade Disponível
            1, // Edição
            "978-0261103573" // ISBN
			);
	
    Filme filme = new Filme(
            "O Senhor dos Anéis: A Sociedade do Anel", // Título do Filme
            "J.R.R. Tolkien", // Autor (ou poderia ser o Diretor)
            2001, // Ano de Publicação
            "Fantasia", // Gênero
            "New Line Cinema", // Produtora
            5, // Quantidade Disponível
            "Peter Jackson", // Diretor
            "Elijah Wood", // Ator Principal
            "A primeira parte da adaptação da famosa trilogia de J.R.R. Tolkien.", // Sinopse
            178 // Tempo de Duração (em minutos)
        );
    
    // III. Crie um array de duas posições para objetos Publicação e adicione nele os objetos instanciados nos itens I e II
    Publicacao[] publicacoes = new Publicacao[2];
    publicacoes[0] = livro;
    publicacoes[1] = filme;
    
 // IV. Faça um loop para percorrer o array de objetos Publicação executando o método imprimeDados()
    for (Publicacao pub : publicacoes) {
        pub.imprimirDados();
        System.out.println(); // Linha em branco para separar as impressões
    }
    
	}
}
