import java.util.ArrayList;
import java.util.List;

public class Frota {

    private List<Carro> carros;
    private List<Caminhao> caminhoes;

    public Frota() {
        this.carros = new ArrayList<>();
        this.caminhoes = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void adicionarCaminhao(Caminhao caminhao) {
        caminhoes.add(caminhao);
    }

    // Percorre carros e caminhões chamando o mesmo método getInformacoes(),
    // cada um executando sua própria versão (polimorfismo).
    public void exibirInformacoesVeiculos() {
        for (Carro carro : carros) {
            System.out.println(carro.getInformacoes());
        }
        for (Caminhao caminhao : caminhoes) {
            System.out.println(caminhao.getInformacoes());
        }
    }
}
