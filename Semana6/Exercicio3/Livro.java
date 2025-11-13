package Exercicio3;

public class Livro extends Produto {
    private String autor;
    private int edicao;

    public Livro(String nome, float preco, String autor, int edicao) {
        super(nome, preco);
        this.autor = autor;
        this.edicao = edicao;
    }

    public String getAutor() {
        return autor;
    }
    public int getEdicao() {
        return edicao;
    }
    @Override
    public void imprimir() {
        System.out.println("Livro: "+getNome()+"\nAutor: "+getAutor()+"\nEdição: "+getEdicao()+"º"+"\nR$ "+getPreco());
    }

}
