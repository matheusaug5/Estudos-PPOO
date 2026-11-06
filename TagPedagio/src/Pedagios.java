public class Pedagios {
    public static void main(String[] args) throws Exception {

    /*I. Crie uma tag informando apenas a placa "ABC1D23". Em seguida, utilize essa tag para
    tentar passar em um pedágio que custa R$ 15,00.
    II. Crie uma outra tag informando a placa "EFG4H56" e um valor de crédito de R$ 20,00. Em
    seguida, atualize o saldo dessa tag colocando mais R$ 15,00 de crédito. Por fim, utilize essa
    tag para tentar passar em um pedágio que custa R$ 23,00.
    Obs.: Não usar inferência de tipo nem expressão lambda na sua implementação. */

        TagPedagio tag1 = new TagPedagio("ABC1D23");
        tag1.passarNoPedagio(15.0);

        TagPedagio tag2 = new TagPedagio("EFG4H56", 20.0);
        tag2.atualizarSaldo(15.0);
        tag2.passarNoPedagio(23.0);

    }
}
