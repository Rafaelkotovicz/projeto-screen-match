package Principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Clube da Luta", 1999);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.fichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.media());


        Serie bb = new Serie("Breaking Bad", 2013);
        bb.setEpPorTemp(20);
        bb.setTemporada(5);
        bb.fichaTecnica();
        bb.setMinPorEp(50);
        System.out.println("Duração: " + bb.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("drive", 2011);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(bb);
        System.out.println(calculadora.getTempoTotal());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        ArrayList<Filme> listeDeFilme = new ArrayList<>();
        listeDeFilme.add(meuFilme);
        listeDeFilme.add(outroFilme);
        System.out.println(listeDeFilme.get(1).getNome());
        System.out.println(listeDeFilme.get(1).toString());
        System.out.println(listeDeFilme);
    }
}