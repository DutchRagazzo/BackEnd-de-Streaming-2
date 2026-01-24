import br.com.hearIN.modelos.Music;
import br.com.hearIN.modelos.Playlist;
import br.com.hearIN.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Music mymusic = new Music();
        mymusic.setTitulo("Não Espero Mais");
        mymusic.setArtista("O Terno");
        mymusic.setAlbum("Melhor Do Que Parece");
        mymusic.setGenero("Indie Rock");
        mymusic.setCompositor("Martim Bernardes Pereira");
        mymusic.setAnoDeLancamento(2016);
        mymusic.setDuracaoEmMinutos(4);
        for (int i = 0; i < 5000 ; i++) {
            mymusic.reproduzAudio();
        }
        mymusic.ExibeFichaTecnica();

        Podcast mypodcast = new Podcast();
        mypodcast.setAnoDeLancamento(2026);
        mypodcast.setNomeDoCanal("Flow");
        mypodcast.setTitulo("Ao Vivo com BRKSEdu");
        mypodcast.setDescricao("Bate papo ao vivo sobre Games e um pouco de Geometria :)");
        mypodcast.setApresentador("Igor 3K");
        mypodcast.setDuracaoEmMinutos(120);
        for (int i = 0; i < 1000; i++) {
            mypodcast.curteAudio();
        }
        mypodcast.ExibeFichaTecnica();

        Playlist novaplaylist = new Playlist();
        novaplaylist.adicionaNaPlaylist(mymusic);
        novaplaylist.adicionaNaPlaylist(mypodcast);
    }
}
