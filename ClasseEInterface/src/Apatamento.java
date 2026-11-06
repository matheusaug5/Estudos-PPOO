public class Apatamento extends Imovel {
    private int Andares;

    public Apatamento(double tamanho, int Andares) {
        super(tamanho);
        this.Andares = Andares;
    }

    @Override
    public double calcularPremio() {
        if (Andares < 4) {
            return getTamanho() * 3;
        } else {
            return getTamanho() * 4;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Andares= " + Andares;
    }
}
