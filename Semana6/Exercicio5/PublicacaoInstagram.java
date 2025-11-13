package Exercicio5;

import java.util.Date;

public abstract class PublicacaoInstagram {
    protected String autor;
    protected String data;
    protected float tamanhoArquivo;

    public PublicacaoInstagram(String autor, String data) {
        this.autor = autor;
        this.data = data;
    }

    public abstract void renderizar();

}
