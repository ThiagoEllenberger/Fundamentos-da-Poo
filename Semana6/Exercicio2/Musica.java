package Exercicio2;

public class Musica implements Midia {

    public void play() {
        System.out.println("Reproduzindo música: ");
    }
    public void pause() {
        System.out.println("Música parada");
    }
    public void next() {
        System.out.println("Próxima música");
    }
    public void previous() {
        System.out.println("Música anterior");
    }
}
