package spotifytabajara;

public class Musica {

	private String nome, artista;
	private int duracao;

	public Musica(String nome, String artista, int duracao) {
		this.nome = nome;
		this.artista = artista;
		this.duracao = duracao;
	}
	
	public void tocando() {
		System.out.println("Tocando: \n" + this.toString());
	}
	
	@Override
	public String toString() {
		return "Música: " + this.nome + "\nBy: " + this.artista;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

}
