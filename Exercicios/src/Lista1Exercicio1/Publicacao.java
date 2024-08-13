package Lista1Exercicio1;

public abstract class Publicacao {
		
		private String titulo;
		private String autor;
		private int publicar;
		private String genero;
		private String editora;
		private int disponivel;

	public Publicacao (String titulo, String autor, int publicar, String genero, 
			String editora, int disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.publicar = publicar;
		this.genero = genero;
		this.editora = editora;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}
	
	public int getPublicar() {
        return publicar;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }
    
    public int getDisponivel() {
    	return disponivel;
    }

    public abstract void imprimirDados();
	
}
	
