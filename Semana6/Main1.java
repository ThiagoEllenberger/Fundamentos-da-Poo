import Exercicio1.ConteudoNetflix;
import Exercicio1.Filme;
import Exercicio1.Serie;

void main(String[] args) {

    Filme filme1 = new Filme("E o Vento Levou", 120);
    Serie serie1 = new Serie("Breaking Bad", 30);

    ArrayList<ConteudoNetflix> conteudosNetflix = new ArrayList<>();
    conteudosNetflix.add(filme1);
    conteudosNetflix.add(serie1);

    for (ConteudoNetflix conteudo : conteudosNetflix) {
        conteudo.reproduzir();
    }

}
