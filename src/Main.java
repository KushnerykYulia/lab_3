/**
 * Клас Main демонструє створення та декорування графічного елемента, в даному випадку, кола.
 */
public class Main {
    /**
     * Основний метод, який демонструє створення червоного кола з додаванням рамки та тіні.
     */
    public static void main(String[] args) {

        Graphic redCircle = new Circle(10, 20, 25, "червоного");

        redCircle = new BorderDecorator(redCircle, 2);
        redCircle = new ShadowDecorator(redCircle, 3);

        redCircle.display();
        System.out.println(redCircle.getDescription());
    }
}