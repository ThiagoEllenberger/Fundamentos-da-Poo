package Exercicio1;

public class Filme extends ConteudoNetflix {

    public Filme(String titulo, int duracaoMin) {
        super(titulo, duracaoMin);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo filme: " + titulo + " - " + duracaoMin + " min.");
    }
}
