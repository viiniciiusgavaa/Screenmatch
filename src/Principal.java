import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

class Principal {
    static void main(String[] args) {

        Filme newFilme = new Filme();
        newFilme.setNome("O Poderoso Chefao");
        newFilme.setDuracaoEmMinutos(180);
        newFilme.setAnoDeLancamento(1970);
        newFilme.exibeFichaTecnica();
        newFilme.avalia(8);
        newFilme.avalia(5);
        newFilme.avalia(10);

        // System.out.println("Total de avaliacoes:"+ newFilme.getTotalAvaliacoes());
        // System.out.println(newFilme.pegaMedia());
        // System.out.println("Duracao do filme:" + newFilme.getDuracaoEmMinutos());

        Serie lost = new Serie ();
        lost.setNome("Game Of Thrones");
        lost.setAnoDeLancamento(2016);
        lost.exibeFichaTecnica();
        lost.setTemporadas(20);
        lost.setEpisodiosPorTemporada(8);
        lost.setMinutosPorEpisodio(50);

        //System.out.println("Duracao para maratonar lost:" + lost.getDuracaoEmMinutos());

        Filme newFilme2 = new Filme();
        newFilme2.setNome("Vingadores");
        newFilme2.setDuracaoEmMinutos(180);
        newFilme2.setAnoDeLancamento(1970);

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



    }
}
