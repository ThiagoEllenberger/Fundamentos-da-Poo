package Exercicio1;

public class Serie extends ConteudoNetflix {

    public Serie(String titulo, int duracaoMin) {
        super(titulo, duracaoMin);
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo série: " + titulo + " - " + duracaoMin + " min.");
    }
}
