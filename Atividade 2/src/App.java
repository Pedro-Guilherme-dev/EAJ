public class App {
    public static void main(String [] args) {
        
        lampada l1 = new lampada();
        System.out.println("----------------------------");
        System.out.println("Lampada 1:");
        l1.setTipo("LED");
        l1.setCor("Branco");
        l1.setPotencia(5);
        l1.setEstado(false);
        l1.status();

        System.out.println("----------------------------");

        lampada l2 = new lampada();
        System.out.println("Lampada 2:");
        l2.setTipo("Incandescente");
        l2.setCor("Laranja");
        l2.setPotencia(10);
        l2.setEstado(false);
        l2.status();

        System.out.println("----------------------------");
        l1.trocarLampada(l2.getPotencia());
    }
}
