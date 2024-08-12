public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public void descricao() {
        System.out.println("Nome do produto: "+nome+" Preco: "+preco+" Quantidade: "+quantidade);
    }
}