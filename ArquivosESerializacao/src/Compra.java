import java.io.Serializable;

public class Compra implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String cpf;
    private final String data;
    private final String produto;
    private final double preco;

    public Compra(String cpf, String data, String produto, double preco) {
        this.cpf = cpf;
        this.data = data;
        this.produto = produto;
        this.preco = preco;
    }

    public Compra(Cliente cliente, String data, Produto produto) {
        this(cliente.getCpf(), data, produto.getNome(), produto.getPreco());
    }

    public Cliente getCliente() {
        return new Cliente(cpf);
    }

    public String getData() {
        return data;
    }

    public Produto getProduto() {
        return new Produto(produto, preco);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "cpf=" + cpf + "\n" + 
        "data=" + data + "\n" + 
        "produto=" + produto + "\n" + 
        "preco=" + preco + "\n" +
        "========================";
    }
}
