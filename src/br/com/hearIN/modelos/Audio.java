//Regras de Negócio do Exercício
//"Áudio" com título, duração, total de reproduções, curtidas e classificação,
// além de métodos encapsulados para curtir, reproduzir
// e assim por diante, impedindo que a classe Principal tenha acesso a esses atributos.
package br.com.hearIN.modelos;
import calculos.Classificavel;
public class Audio implements Classificavel {
    private String titulo;
    private int anoDeLancamento;
    private int duracaoEmSegundos;
    private double duracaoEmMinutos;
    private int totalCurtidas;
    private int classificacao;
    private int totalReproducoes;

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void curteAudio(){
        totalCurtidas++;
    }
    public void reproduzAudio(){
        totalReproducoes++;
    }
    public void calculaDuracao(){
        int minutos = (int) this.getDuracaoEmMinutos();
        int segundos = this.getDuracaoEmSegundos();
        int segundosConvertidos = segundos/60;
        int minutosConvertidos = minutos/60;
        if (getDuracaoEmSegundos() > 0){ //se o audio tiver só segundos de duracao e o que ocorreria se estivesse em minutos e horas.
            System.out.println("Tempo para escutar (segundos): "+segundos);
            System.out.println("Tempo para escutar (minutos): "+ segundosConvertidos);
        }else if(duracaoEmMinutos > 0 & duracaoEmMinutos < 60){
            System.out.println("Tempo para escutar (minutos): "+ minutos);
        }else if (duracaoEmMinutos>60){
            System.out.println("Tempo para escutar (horas): "+ minutosConvertidos);
        }
    }
    public void ExibeFichaTecnica(){
        System.out.println("Nome do áudio: "+titulo);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        this.calculaDuracao();
        System.out.println("Reproduções: "+ totalReproducoes);
        System.out.println("Curtidas: "+totalCurtidas);
        System.out.println("Classificação: "+getClassificacao());
    }

}
