public class NewtonRapshon {
    private double valorRaiz;

    public NewtonRapshon(double valorRaiz) {
        this.valorRaiz = valorRaiz;
    }

    public double xProximo(double xAtual, double valorRaiz) {
        return (xAtual + valorRaiz / xAtual) / 2;
    }
    
    public double erro(double xAtual, double xProximo) {
        return Math.abs(xProximo - xAtual);
    }

    public double calcularRaiz(){
        double tolerancia = 0.0001; 
        double xAtual = valorRaiz/2;
        double xProximo = xProximo(xAtual, valorRaiz);

        while (erro(xAtual, xProximo) > tolerancia) {
            xAtual = xProximo;
            xProximo = xProximo(xAtual, valorRaiz);
        }

        return xProximo;
    }
}