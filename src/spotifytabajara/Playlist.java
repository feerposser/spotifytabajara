package spotifytabajara;

import java.util.ArrayList;

public abstract class Playlist {

	protected ArrayList<Musica> playlist;
	private String nome, decricao;
	protected Musica musicaAtual;
	private Genero genero;
	
	public Playlist() {}

	public Playlist(String nome, String decricao, Genero genero) {
		this.playlist = new ArrayList<Musica>();
		this.nome = nome;
		this.decricao = decricao;
		this.genero = genero;
	}
	
	public final void mostrarPLaylist() {
		for (Musica musica : this.playlist) {
			System.out.println(musica);
		}
	}
	
	public final void tocarMusica(int index) {
		try {
			if (!this.playlist.isEmpty()) {
				setMusicaAtual(this.playlist.get(index));
				this.musicaAtual.tocando();
			} else {
				throw new Exception("PLaylist vazia");
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Index inexistente");
		} catch (Exception e) {
			System.err.println("Erro desconhecido");
			e.printStackTrace();
		}
	}
	
	public final boolean musicaExiste(int index) {
		try {
			this.playlist.get(index);
			return true;
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
	}
	
	public final int getIndexMusicaAtual() {
		return this.playlist.indexOf(this.musicaAtual);
	}

	public ArrayList<Musica> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<Musica> playlist) {
		this.playlist = playlist;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Musica getMusicaAtual() {
		return musicaAtual;
	}

	public void setMusicaAtual(Musica musicaAtual) {
		this.musicaAtual = musicaAtual;
	}

}
