import java.io.Serializable;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String cpf;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{cpf='" + cpf + "'}";
    }
}
