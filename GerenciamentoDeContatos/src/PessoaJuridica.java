public class PessoaJuridica extends Contato {
    private String cnpj;
    private int inscracaoEstadual;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj,
        String inscracaoEstadual) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscracaoEstadual = inscracaoEstadual;
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getRazaoSocial(){
        return inscracaoEstadual;
    }

    public boolean getIdentificador() {
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica\n" 
        + super.toString() 
        + "\nCNPJ: " + cnpj 
        + "\nRazão Social: " 
        + inscracaoEstadual;
    }
}