package spotifytabajara;

public class Playlist2 extends Playlist implements GerenciadorPlaylist {

	public Playlist2() {}

	public Playlist2(String nome, String descricao, Genero genero) {
		super(nome, descricao, genero);
	}

	@Override
	public String toString() {
		return "Playlist2 [playlist=" + playlist + ", musicaAtual=" + musicaAtual + ", getPlaylist()=" + getPlaylist()
				+ ", getNome()=" + getNome() + ", getDecricao()=" + getDecricao() + ", getGenero()=" + getGenero()
				+ ", getMusicaAtual()=" + getMusicaAtual() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void addMUsica(Musica musica) {
		this.playlist.add(musica);
	}

	@Override
	public void proxima() {
		int index = this.getIndexMusicaAtual() + 1;

		if (this.musicaExiste(index)) {
			this.tocarMusica(index);
		} else {
			this.tocarMusica(0);
		}
	}

	@Override
	public void anterior() {
		int index = this.getIndexMusicaAtual() - 1;

		if (this.musicaExiste(index)) {
			this.tocarMusica(index);
		} else {
			this.tocarMusica(this.playlist.size() - 1);
		}
	}

}
