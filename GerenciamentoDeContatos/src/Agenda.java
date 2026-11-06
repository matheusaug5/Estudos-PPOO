import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Agenda{
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    
    public void adicionarContato(String nome,
        String endereco, 
        String email, 
        String cpf, 
        String estadoCivil) {
            PessoaFisica pessoaFisica = new PessoaFisica(nome, endereco, email, cpf, estadoCivil);
            contatos.add(pessoaFisica);
    }

    public void adicionarContato(String nome, 
        String endereço, 
        String email, 
        String cnpj,
        int inscricaoEstadual){
            PessoaJuridica pessaoJuridica = new PessoaJuridica(nome, endereco, email, cnpj, inscricaoEstadual);
            contatos.add(pessoaJuridica);
        }

    public Contato buscarContato(String identificador){
        for (Contato contato : contatos){
            if (contato.getIdentificador().equals(identificador))
                return contato;
        }
        return NULL;
    }

    public boolean removerContato(String identificador){
            if(contatos.remove(buscarContato(identificador)))
                return true;
        return false;
    }

    public List<Contatos> getContatos(){
        return Colections.unmodifaibleList(contatos)
    }
}
