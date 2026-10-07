package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

class Principal {
    static void main(String[] args) {

        Filme newFilme = new Filme("O Poderoso Chefao", 1970);
        newFilme.setDuracaoEmMinutos(180);
        newFilme.exibeFichaTecnica();
        newFilme.avalia(8);
        newFilme.avalia(5);
        newFilme.avalia(10);

        // System.out.println("Total de avaliacoes:"+ newFilme.getTotalAvaliacoes());
        // System.out.println(newFilme.pegaMedia());
        // System.out.println("Duracao do filme:" + newFilme.getDuracaoEmMinutos());

        Serie lost = new Serie ("Game Of Thrones", 2016);
        lost.exibeFichaTecnica();
        lost.setTemporadas(20);
        lost.setEpisodiosPorTemporada(8);
        lost.setMinutosPorEpisodio(50);

        //System.out.println("Duracao para maratonar lost:" + lost.getDuracaoEmMinutos());

        Filme newFilme2 = new Filme("Vingadores", 1970);
        newFilme2.setDuracaoEmMinutos(180);

        Filme newFilme3 = new Filme("Spider Man", 2026);
        newFilme3.setDuracaoEmMinutos(160);
        newFilme3.avalia(10);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(newFilme);
        calculadora.inclui(newFilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(newFilme);

        Episodio epsodio = new Episodio();
        epsodio.setNumero(1);
        epsodio.setSerie(lost);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(newFilme);
        listaDeFilmes.add(newFilme2);
        listaDeFilmes.add(newFilme3);

        System.out.println("Tamanho da lista: " +listaDeFilmes.size());
        System.out.println("Primeiro Filme: " +listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}
