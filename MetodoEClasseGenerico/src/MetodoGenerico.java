public class MetodoGenerico {

    public <T, U, V> void souGenerico(T t, U u, V v) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println("-----");
    }

    public static void main(String[] args) {
        MetodoGenerico mg = new MetodoGenerico();
        mg.souGenerico("A", 1, 1.0);
        mg.souGenerico(1.0f, mg, 'c');
        mg.souGenerico(true, 10L, "texto");
    }
}