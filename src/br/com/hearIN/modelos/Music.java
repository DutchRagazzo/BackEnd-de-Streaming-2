package br.com.hearIN.modelos;
import calculos.Classificavel;

public class Music extends Audio implements Classificavel {
    private String artista;
    private String compositor;
    private String album;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    @Override
    public int getClassificacao(){
        if (getTotalReproducoes()>1000){
         return 5;
        }else {
            return 2;
        }
    }
    @Override
    public void ExibeFichaTecnica() {
        super.ExibeFichaTecnica();
        System.out.println("Tipo do Áudio: Música");
        System.out.println("Artista: "+this.artista);
        System.out.println("Compositor: "+this.compositor);
        System.out.println("Álbum: "+this.album);
        System.out.println("Gênero: "+this.genero);
    }
}
