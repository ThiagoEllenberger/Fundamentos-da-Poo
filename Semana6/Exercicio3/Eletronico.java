package Exercicio3;

public class Eletronico extends Produto {
    private String tipo;
    private String cor;

    public Eletronico(String nome, float preco, String tipo, String cor) {
        super(nome, preco);
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }
    public String getCor() {
        return cor;
    }
    @Override
    public void imprimir() {
        System.out.println(getTipo()+" "+getNome()+", "+getCor()+"\nR$"+getPreco());

    }
}
