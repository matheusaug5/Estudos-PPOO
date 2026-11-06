public class Carro extends Veiculo {

    private int capacidadePortaMalas;
    private int numeroPortas;

    public Carro(String marca, String ano, String cor, int capacidadePortaMalas, int numeroPortas) {
        super(marca, ano, cor);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.numeroPortas = numeroPortas;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String getInformacoes() {
        return "Marca: " + getMarca() + "\n" +
               "Ano: " + getAno() + "\n" +
               "Cor: " + getCor() + "\n" +
               "Capacidade do Porta Malas: " + capacidadePortaMalas + "\n" +
               "Número de Portas: " + numeroPortas + "\n";
    }
}
