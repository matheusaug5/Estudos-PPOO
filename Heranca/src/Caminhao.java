public class Caminhao extends Veiculo {

    private int numeroEixos;
    private int capacidadeCarga;

    public Caminhao(String marca, String ano, String cor, int numeroEixos, int capacidadeCarga) {
        super(marca, ano, cor);
        this.numeroEixos = numeroEixos;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String getInformacoes() {
        return "Marca: " + getMarca() + "\n" +
               "Ano: " + getAno() + "\n" +
               "Cor: " + getCor() + "\n" +
               "Número de Eixos: " + numeroEixos + "\n" +
               "Capacidade de Carga: " + capacidadeCarga + "\n";
    }
}
