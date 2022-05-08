public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.add(10);
        fila.add(20);
        fila.add(30);
        fila.add(40);
        fila.add(50);
        fila.add(60);
        fila.add(70);

        fila.remove();
        fila.remove();
        fila.remove();



        fila.printFila();
        fila.add(70);
        fila.add(70);
        fila.add(70);
        fila.add(70);
        
        fila.printFila();

    }
}
