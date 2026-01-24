package br.com.hearIN.modelos;

public class Playlist {
    public void adicionaNaPlaylist(Audio audio){
        if (audio.getClassificacao()== 5){
            System.out.println(audio.getTitulo() + " está na sua playlist");
        }
    }
}
