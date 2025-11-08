public class HolaMundo {

    public String saludar() {
        return "¡Hola, Mundo!";
    }

    public static void main(String[] args) {
        // Imprime "¡Hola, Mundo!" en la consola
        HolaMundo holaMundo = new HolaMundo();
        System.out.println(holaMundo.saludar());
    }
}
