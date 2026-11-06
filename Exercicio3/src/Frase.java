public class Frase {
    private String frase;

    public Frase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    private String[] separarPalavras() {
        return frase.split(" ");
    }

    public int contarVogais(String palavra) {
    int contador = 0;
    for (char c : palavra.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            contador++;
        }
    }
    return contador;
}

    public String encontrarPalavraComMaisVogais() {
        String[] palavras = separarPalavras();
        String maiorPalavra = "";
        int maxVogais = 0;

        for (int i = 0; i < palavras.length; i++) {

            int contadorVogais = contarVogais(palavras[i]);
            if (contadorVogais > maxVogais) {
                maxVogais = contadorVogais;
                maiorPalavra = palavras[i];
            }
        }
        return maiorPalavra;
    }
}
