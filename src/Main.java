public class Main {

    public static void main(String[] args) {

        Kronometre kronometre = new Kronometre("a");
        Kronometre kronometre1 = new Kronometre("b");
        Kronometre kronometre2 = new Kronometre("c");

        kronometre.start();
        kronometre1.start();
        kronometre2.start();
    }
}
