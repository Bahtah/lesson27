package dom27;

public class Main {
    /**
     * Box деген generic класс тузунуз.
     * Ичинде Box деген объектти кайтарган статический generic метод болсун.
     * @param args
     */

    public static void main(String[] args) {
        Box box1 = new Box(12, 34, 56);
        System.out.println(Box.ret(box1));
    }
}
