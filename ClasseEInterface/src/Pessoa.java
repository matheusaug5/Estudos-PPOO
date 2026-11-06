public class Pessoa implements Segurado {
    private char genero;// M ou F
    private int idade;

    public Pessoa(char genero, int idade) {
        this.genero = genero;
        this.idade = idade;
    }

    @Override
    public double calcularPremio() {
        if (idade < 60) {
            return (idade / 10 + 1) * 100;
        } else if (genero == 'M') {
            return 800;
        } else {
            return 700;
        }
    }

    @Override
    public String toString() {
        return "premio= " + calcularPremio() +
                ",\n" +
                "Genero= " + genero
                + ",\nIdade= " + idade;
    }

}
