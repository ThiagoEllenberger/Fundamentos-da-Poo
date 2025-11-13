package Exercicio2;

public class Podcast implements Midia {

    public void play() {
        System.out.println("Reproduzindo Podcast: ");
    }
    public void pause() {
        System.out.println("Podcast parado");
    }
    public void next() {
        System.out.println("Próximo episódio");
    }
    public void previous() {
        System.out.println("Episódio anterior");
    }
}
