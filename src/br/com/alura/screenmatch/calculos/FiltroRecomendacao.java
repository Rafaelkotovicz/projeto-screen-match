package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("preferido do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("bem avaliado");
        } else {
            System.out.println("assista depois");
        }
    }
}
