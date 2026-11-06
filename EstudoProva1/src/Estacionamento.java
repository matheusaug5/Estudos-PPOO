import java.util.ArrayList;
import java.util.Interator;
public class Estacionamento {
    private String nome;
    private ArrayList<Carros> carros;

    public Estacionamento(String nome){
        this.nome = nome;
        carros = new ArrayList<Carros>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarCarro(String marca, String modelo, String placa){
        Carro carro = new Carro(marca, modelo, placa)

        carros.add(carro)
    }

    public void removerCarrosPorPlaca(String trecho){
    Interator<Carro> it = carros.Interator;

        while(it.hasNext()){
            Carro carro = in.next();

            if(carro.getplaca().contais(trecho)){
                it.remove();
            }
        }
    }

    public void listarCarros(){
        for(Carro carro : carros){
            System.out.println(
                "Carro: "   
                + carro.getNome 
                + " " 
                + carro.getModelo 
                + " Placa: " 
                + carr.getLlaca)
        }
    }
}
