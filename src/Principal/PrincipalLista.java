package Principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalLista {
    public static void main(String[] args) {
        Filme outroFilme = new Filme("drive", 2011);
        outroFilme.avalia(10);
        Filme meuFilme = new Filme("Clube da Luta", 1999);
        meuFilme.avalia(10);
        Serie bb = new Serie("Breaking Bad", 2013);
        bb.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(bb);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                //Filme item1 = (Filme) item;
                System.out.println(filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Rafael");
        buscaPorArtista.add("iasmin");
        buscaPorArtista.add("luiz victor");
        buscaPorArtista.add("Alan");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
