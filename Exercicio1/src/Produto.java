public class Produto {
    private int codigo;
    private int quantidade;

    public Produto(int codigo, int quantidade) {
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double precoUnitario() {
            if(codigo <= 10) {
                return 10.00;
            } else if(codigo <= 20) {
                return 15.00;
            } else if(codigo <= 30) {
                return 20.00;
            } else {
                return 30.00;
        }
    }

    public double calcularValorBruto() {
        return quantidade * precoUnitario();
    }

    public double calcularDesconto() {
        double valorBruto = calcularValorBruto();

        if(valorBruto < 250.00) {
            return valorBruto * 0.05;
        } else if(valorBruto <= 500.00) {
            return valorBruto * 0.10;
        } else {
            return valorBruto * 0.15;
        }
    }

    public double calcularValorFinal() {
        double valorBruto = calcularValorBruto();
        double desconto = calcularDesconto();
        return valorBruto - desconto;
    }
}
