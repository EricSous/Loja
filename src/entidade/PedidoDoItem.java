package entidade;

public class PedidoDoItem {

    private int quantidade;
    private double preco;

    private Produto produto;


    public PedidoDoItem(int quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double totalPorItem(){
        return this.quantidade * this.preco;
    }

    @Override
    public String toString() {
        return "quantidade= " + quantidade
                + "\npreco= " + preco
                + "\nproduto= " + produto.getNome() +
                "\nTotal por item $ " + totalPorItem();
    }
}
