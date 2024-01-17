package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo{
    private int temporada;
    private int epPorTemp;
    private boolean ativa;
    private int minPorEp;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpPorTemp() {
        return epPorTemp;
    }

    public void setEpPorTemp(int epPorTemp) {
        this.epPorTemp = epPorTemp;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinPorEp() {
        return minPorEp;
    }

    public void setMinPorEp(int minPorEp) {
        this.minPorEp = minPorEp;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * epPorTemp * minPorEp;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
