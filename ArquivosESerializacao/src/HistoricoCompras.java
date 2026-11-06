import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HistoricoCompras implements Serializable {
    private static final long serialVersionUID = 1L;

    private final List<Compra> compras = new ArrayList<>();

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
    }

    public List<Compra> getCompras() {
        return new ArrayList<>(compras);
    }

    public Comparator<Compra> getComparadorPorPreco() {
        return Comparator.comparingDouble(Compra::getPreco);
    }

    public String gerarRelatorio(String cpf) {
        List<Compra> comprasDoCliente = compras.stream()
                .filter(compra -> compra.getCpf().equals(cpf))
                .sorted(getComparadorPorPreco())
                .collect(Collectors.toList());

        StringBuilder relatorio = new StringBuilder("Relatorio de compras - CPF: ")
                .append(cpf)
                .append(System.lineSeparator());

        if (comprasDoCliente.isEmpty()) {
            return relatorio.append("Nenhuma compra encontrada.")
                    .append(System.lineSeparator())
                    .toString();
        }

        for (Compra compra : comprasDoCliente) {
            relatorio.append(compra).append(System.lineSeparator());
        }
        return relatorio.toString();
    }

    @Override
    public String toString() {
        return "HistoricoDeCompras{compras=" + compras + '}';
    }
}
