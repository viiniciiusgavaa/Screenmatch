package br.com.alura.screenmatch.modelos;

public class Titulo       {

private String nome;
private int anoDeLancamento;
private boolean incluidoNoPlano;
private double somaAvaliacao;
private int totalAvaliacoes;
private int duracaoEmMinutos;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
    System.out.println("Nome do filme: " + nome );
    System.out.println("Lancamento: " + anoDeLancamento );
}
public void avalia(double nota){

    somaAvaliacao += nota;
    totalAvaliacoes++;
}

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

public double pegaMedia (){
    return somaAvaliacao/totalAvaliacoes;

    }

   }
