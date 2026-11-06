public abstract class Imovel implements Segurado {
    private double tamanho;

    public Imovel(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "premio= " + calcularPremio() +
                ",\n" +
                "Tamanho= " + tamanho +
                "m²\n";
    }
}