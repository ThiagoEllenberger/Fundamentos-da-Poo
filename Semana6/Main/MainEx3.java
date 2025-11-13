import Exercicio3.*;

public static void main(String[] args) {

    Livro livro1 = new Livro("O Senhor dos Anéis", 109.90f, "J.R.R.Tolkien", 6);
    Eletronico eletronico1 = new Eletronico("New Star Ciclone", 199.99f,"Aspirador de pó", "Cinza e preto");

    livro1.imprimir();
    eletronico1.imprimir();

}
