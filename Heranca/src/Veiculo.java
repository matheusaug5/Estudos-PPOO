public abstract class Veiculo {

    private String marca;
    private String ano;
    private String cor;

    public Veiculo(String marca, String ano, String cor) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    // Método abstrato: cada subclasse implementa sua própria forma de
    // montar a string com as informações (polimorfismo).
    public abstract String getInformacoes();
}
