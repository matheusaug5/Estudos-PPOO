public class Casa extends Imovel {
    private boolean Condominio; // se true esta em condominio, se false não esta em condominio

    public Casa(double tamanho, boolean Condominio) {
        super(tamanho);
        this.Condominio = Condominio;
    }

    @Override
    public double calcularPremio() {
        if (Condominio) {
            return getTamanho() * 5;
        } else {
            return getTamanho() * 7;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Condominio= " + Condominio;
    }
}
