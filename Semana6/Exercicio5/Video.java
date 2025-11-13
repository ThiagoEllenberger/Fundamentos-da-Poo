package Exercicio5;

import java.util.Date;

public class Video extends PublicacaoInstagram {
    float duracaoVideoMin;

    public Video(String autor, String data, float duracaoVideoMin) {
        super(autor, data);
        this.duracaoVideoMin = duracaoVideoMin;
    }

    @Override
    public void renderizar() {
        tamanhoArquivo = this.duracaoVideoMin * 100f;
        System.out.println("Vídeo pronto para postar com "+tamanhoArquivo+"Mb");
    }
}
