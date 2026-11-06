public class TagPedagio{
    private String placa;
    private double saldo;

    //dois contrutores um com placa e saldo o outro somento com saldo, saldo deve ser >=10
    public TagPedagio(String placa, double saldo) {
        this.placa = placa;
        this.saldo = saldo + 10;
    }

    public TagPedagio(String placa){
        this("placa", 0.0);
    }

    /*conter Metedo atualizar saldo, modificar o valor, receber por parametro um valor
    a ser acrecentado*/
    public void atualizarSaldo(Double valor) {
        saldo += valor;
    }

    /* Metodo passarNoPedagio, comprar o saldo com o valor do pedagio e se for suficiente
    o valor do saldo e atualizado e aparece a mensagem, se for insuficiente,  */
    public void passarNoPedagio(double valorPedagio){
        if(saldo >= valorPedagio){
            saldo -= valorPedagio;
            System.out.printf("Passagem liberada para %s. Novo saldo: %.2f.%n", placa,saldo);
        } else {
            System.out.printf("Passagem bloqueada para %s. Saldo insuficiente!%n", placa); 
        }
        
    
    }

}