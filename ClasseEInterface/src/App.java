import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Segurado> segurados = new ArrayList<>();

        segurados.add(new Casa(100, true));
        segurados.add(new Casa(150, false));
        segurados.add(new Apatamento(80, 3));
        segurados.add(new Apatamento(120, 5));
        segurados.add(new Pessoa('M', 30));
        segurados.add(new Pessoa('F', 65));
        for (Segurado segurado : segurados) {
            System.out.println(segurado.toString());
            System.out.println("-------------------------");
        }
    }
}
