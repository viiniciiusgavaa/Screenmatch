package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {

    static void main(String[] args) {

        Filme newFilme = new Filme("O Poderoso Chefao", 1970);
        newFilme.avalia(8.9);
        Filme newFilme2 = new Filme("Vingadores", 1970);
        newFilme2.avalia(9.9);
        Filme newFilme3 = new Filme("Spider Man", 2026);
        newFilme3.avalia(9.8);
        Serie lost = new Serie ("Game Of Thrones", 2016);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(newFilme);
        lista.add(newFilme2);
        lista.add(newFilme3);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao: " + filme.getClassificacao() + " Estrelas");
            }
        }

        ArrayList <String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da Ordenacao");
        System.out.println(buscaPorArtista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
