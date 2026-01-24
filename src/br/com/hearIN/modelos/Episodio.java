package br.com.hearIN.modelos;
import calculos.Classificavel;

public class Episodio extends Podcast implements Classificavel {
    private String nomeDoEpisodio;
    private int numerodoEpisodio;

    public String getNomeDoEpisodio() {
        return nomeDoEpisodio;
    }

    public void setNomeDoEpisodio(String nomeDoEpisodio) {
        this.nomeDoEpisodio = nomeDoEpisodio;
    }

    public int getNumerodoEpisodio() {
        return numerodoEpisodio;
    }

    public void setNumerodoEpisodio(int numerodoEpisodio) {
        this.numerodoEpisodio = numerodoEpisodio;
    }
    @Override
    public int getClassificacao(){
        if (getTotalReproducoes()>1000){
            return 5;
        }else {
            return 2;
        }
}
}
