public class App {
    public static void main(String[] args) throws Exception {
    // Objeto com String
        Trio<String> trioString = new Trio<>("Java", "Generics", "Classes");

        // Objeto com Double
        Trio<Double> trioDouble = new Trio<>(1.5, 2.5, 3.5);

        // Alterando valores com set
        trioString.setAtributo2("Genéricos");
        trioDouble.setAtributo3(9.9);

        // Imprimindo todos os atributos
        System.out.println("Trio<String>:");
        System.out.println(trioString.getAtributo1());
        System.out.println(trioString.getAtributo2());
        System.out.println(trioString.getAtributo3());

        System.out.println("\nTrio<Double>:");
        System.out.println(trioDouble.getAtributo1());
        System.out.println(trioDouble.getAtributo2());
        System.out.println(trioDouble.getAtributo3());
    }
}