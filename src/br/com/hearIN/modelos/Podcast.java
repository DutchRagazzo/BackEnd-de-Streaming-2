package br.com.hearIN.modelos;
import calculos.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String nomeDoCanal;
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public int getClassificacao(){
        if (getTotalCurtidas()>100){
            return 5;
        }else {
            return 3;
        }
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeDoCanal() {
        return nomeDoCanal;
    }

    public void setNomeDoCanal(String nomeDoCanal) {
        this.nomeDoCanal = nomeDoCanal;
    }
    @Override
    public void ExibeFichaTecnica() {
        super.ExibeFichaTecnica();
        System.out.println("Tipo do Áudio: Podcast");
        System.out.println("Host: "+this.nomeDoCanal);
        System.out.println("Apresentador: "+this.apresentador);
        System.out.println("Descrição: "+this.descricao);
    }
}
