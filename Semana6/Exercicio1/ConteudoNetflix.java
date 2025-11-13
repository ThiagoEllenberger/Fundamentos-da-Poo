package Exercicio1;

public abstract class ConteudoNetflix {
    protected String titulo;
    protected int duracaoMin;

    public ConteudoNetflix (String titulo, int duracaoMin) {
        this.titulo = titulo;
        this.duracaoMin = duracaoMin;
    }

    public abstract void reproduzir();

}
