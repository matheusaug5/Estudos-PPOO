public class Carro {
    private String nome;
    private String modelo;
    private String placa;

    public Carro(String nome, String modelo, String placa){
        this.nome = nome;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getNome(){
        return nome;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;
    }
}
