public class Correcao {
    private int numeroQuestao;
    private String situacao;
    private int numeroTentativa;

    public Correcao(int numeroQuestao, String situacao, int numeroTentativa){
        this.numeroQuestao = numeroQuestao;
        this.situacao = situacao;
        this.numeroTentativa = numeroTentativa;
    }

    public int getNumeroQuestao(){
        return numeroQuestao;
    }

    public String getSituacao(){
        return situacao;
    }

    public int getNumeroTentativa(){
        return numeroTentativa;
    }

}
