import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Disciplina {
    private String codigo;
    private ArrayList<Aluno> alunos;

    public Disciplina(String codigo){
        this.codigo = codigo;
        alunos = new ArrayList<>();
    }

    public String getCodigo(){
        return codigo;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void ordenarDiario(){
        alunos.sort(getComparator());
    }

    public List<Aluno> getListaAlunos(){
        return Collections.unmodifiableList(alunos);
    }
    private Comparator<Aluno> getComparator(){
        Comparator<Aluno> comparator = new Comparator<>(){
            @Override
            public int compare(Aluno a1, Aluno a2){
                return (a1.getNota() - a2.getNota())*-1;
            }
        };
        return comparator;
    }

}
