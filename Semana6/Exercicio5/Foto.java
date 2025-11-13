package Exercicio5;

import java.util.Date;

public class Foto extends PublicacaoInstagram {
    float resolucaoImg;

    public Foto(String autor, String data, float resolucaoImg) {
        super(autor, data);
        this.resolucaoImg = resolucaoImg;
    }

    @Override
    public void renderizar() {
        float tamanhoArquivo = this.resolucaoImg * 0.01f;
        System.out.println("Foto pronta para postar com "+tamanhoArquivo+"Mb");
    }
}
