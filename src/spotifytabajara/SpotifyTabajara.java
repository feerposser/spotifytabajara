package spotifytabajara;

public class SpotifyTabajara {

	public static void main(String[] args) {

		Musica ohJaJa = new Musica("Oh Jah Jah", "Eddie Murphy", 400);
		Musica voandoAlto = new Musica("Tá voando alto", "MC Poze", 300);
		Musica numb = new Musica("Numb", "LInkin Park", 400);
		Musica fundoGrota = new Musica("Fundo da Grota", "Baitaca", 500);
		Musica mTcha = new Musica("Maria Tcha tcha tcha", "Terceira DImensão", 200);

		Playlist2 playlistRandom = new Playlist2("PLaylist de loco", "Só doido pra ouvir essa playlist",
				Genero.valueOf("ROCK"));

		System.out.println(playlistRandom);

		playlistRandom.addMUsica(ohJaJa);
		playlistRandom.addMUsica(voandoAlto);
		playlistRandom.addMUsica(numb);
		playlistRandom.addMUsica(fundoGrota);
		playlistRandom.addMUsica(mTcha);
		
		playlistRandom.mostrarPLaylist();
		
		System.out.println("------------------------------------");
		
		playlistRandom.tocarMusica(0);
		playlistRandom.proxima();
		playlistRandom.proxima();
		playlistRandom.anterior();
		playlistRandom.anterior();
		playlistRandom.anterior();

	}

}
