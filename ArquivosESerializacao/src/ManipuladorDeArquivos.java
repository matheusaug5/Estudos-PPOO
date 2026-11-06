import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Writer;

public class ManipuladorDeArquivos {

    public HistoricoCompras lerArquivoTexto(String nomeArquivo) throws IOException {
        HistoricoCompras historico = new HistoricoCompras();

        try (BufferedReader arquivo = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int numeroLinha = 0;
            while ((linha = arquivo.readLine()) != null) {
                numeroLinha++;
                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] campos = linha.split(",", 4);
                if (campos.length != 4) {
                    throw new IOException("Registro invalido na linha " + numeroLinha + ".");
                }

                try {
                    historico.adicionarCompra(new Compra(
                            campos[0].trim(),
                            campos[1].trim(),
                            campos[2].trim(),
                            Double.parseDouble(campos[3].trim())));
                } catch (NumberFormatException e) {
                    throw new IOException("Preco invalido na linha " + numeroLinha + ".", e);
                }
            }
        }

        return historico;
    }

    public HistoricoCompras lerArquivoBinario(String nomeArquivo)
            throws IOException, ClassNotFoundException {
        try (ObjectInputStream arquivo =
                     new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            Object objeto = arquivo.readObject();
            if (!(objeto instanceof HistoricoCompras)) {
                throw new IOException("O arquivo nao contem um historico de compras.");
            }
            return (HistoricoCompras) objeto;
        }
    }

    public void salvarRelatorioTexto(String nomeArquivo, String relatorio) throws IOException {
        try (Writer arquivo = new BufferedWriter(new FileWriter(nomeArquivo))) {
            arquivo.write(relatorio);
        }
    }
}
